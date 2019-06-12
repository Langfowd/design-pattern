package com.ltf.design.pattern.proxy.dynamic.myproxy;

import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * jdk的动态代理模仿，实际就是一下几个步骤
 * 1. 编写一个类实现所有需要代理类的接口
 * 2. 将这个编写好的java类编译成class文件
 * 3. 将class文件加载到jvm中来
 * 4. 返回这个class的实例对象
 *
 * 所以最终调的就是InvocationHandler中的invoke方法
 */
public class MyProxy {

    protected MyInvocationHandler h;

    public static Object newProxyInstance(MyClassLoader classLoader,Class<?>[] intefaces,MyInvocationHandler invocationHandler) {
        // 生成字节码文件
        String src = genSrcFile(intefaces);
        try {
            // 将文件输出到磁盘
            File f = new File(MyProxy.class.getResource("").getPath()+"$Proxy0.java");
            FileWriter fileWriter = new FileWriter(f);
            fileWriter.write(src);
            fileWriter.flush();
            fileWriter.close();

            // 将生成的java文件编译成class文件
            JavaCompiler systemJavaCompiler = ToolProvider.getSystemJavaCompiler();
            StandardJavaFileManager standardFileManager = systemJavaCompiler.getStandardFileManager(null, null, null);
            Iterable<? extends JavaFileObject> iterable = standardFileManager.getJavaFileObjects(f);
            JavaCompiler.CompilationTask task = systemJavaCompiler.getTask(null, standardFileManager, null, null, null, iterable);
            task.call();
            standardFileManager.close();
            // 删除生成的java文件
            f.delete();
            // 将class加载到jvm中来
            Class<?> aClass = classLoader.findClass("$Proxy0");
            Constructor<?> constructor = aClass.getConstructor(MyInvocationHandler.class);
            return constructor.newInstance(invocationHandler);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  null;
    }

    public MyProxy(MyInvocationHandler invocationHandler) {
        this.h = invocationHandler;
    }

    public MyProxy() {
    }

    private static String genSrcFile(Class<?>[] intefaces) {
        String[] intefacesNames = new String[intefaces.length];
        ArrayList<Method> methods = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        String ln = "\r\n";
        sb.append("package com.ltf.design.pattern.proxy.dynamic.myproxy;").append(ln);
        for (int i = 0, size = intefaces.length; i<size; i++) {
            Class<?> inteface = intefaces[i];
            intefacesNames[i] = inteface.getSimpleName();
            methods.addAll(Arrays.asList(inteface.getMethods()));
            sb.append("import ").append(inteface.getName()).append(";").append(ln);
        }
        sb.append("import java.lang.reflect.*;").append(ln);
        sb.append("public final class $Proxy0 extends MyProxy implements ").append(handlerInterfacesName(intefacesNames)).append(" {").append(ln);
        sb.append(" public $Proxy0(MyInvocationHandler h) {").append(ln).append(
                "super(h);").append(ln).append(
                "}").append(ln);

        for (Method method : methods) {
            StringBuilder parmsBuilder = new StringBuilder();
            StringBuilder parmsClassBuilder = new StringBuilder();
            Class<?>[] parameterTypes = method.getParameterTypes();
            StringBuilder paramValues = new StringBuilder();
            int i = 0;
            for (Class<?> parameterType : parameterTypes) {
                String parmaName = "var"+i;
                parmsBuilder.append(parameterType.getName()).append(" ").append(parmaName);
                parmsClassBuilder.append(parameterType.getName()).append(".class");
                paramValues.append(parmaName);
                if (i > 0 && i < parameterTypes.length - 1) {
                    parmsBuilder.append(",");
                    paramValues.append(",");
                    parmsClassBuilder.append(",");
                }
                i++;
            }
            sb.append("public final ").append(method.getReturnType().getName()).append(" ").append(method.getName()).append("(")
                    .append(parmsBuilder.toString()).append(") {").append(ln);
            sb.append("try {").append(ln);
            if (parmsClassBuilder.length() > 0) {
                sb.append("Method method = Class.forName(\"").append(method.getDeclaringClass().getName()).append("\")").append(".getMethod(\"").append(method.getName()).append("\",").append(parmsClassBuilder.toString())
                        .append(");").append(ln);
            } else {
                sb.append("Method method = Class.forName(\"").append(method.getDeclaringClass().getName()).append("\")").append(".getMethod(\"").append(method.getName()).append("\");").append(ln);
            }

            boolean flag = method.getReturnType() == void.class;
            if (flag) {
                sb.append(" super.h.invoke(this, method, new Object[]{").append(paramValues.
                        toString()).append("});").append(ln);
            } else {
                sb.append("return (").append(method.getReturnType().getName()).append(")")
                        .append(" super.h.invoke(this, method, new Object[]{").append(paramValues.
                        toString()).append("});").append(ln);
            }
            sb.append("} catch(Throwable e) {").append(ln);
            sb.append(flag ? "" : "return null;").append(ln);
            sb.append("}").append(ln).append("}").append(ln);

        }
        sb.append("}");
        return sb.toString();
    }

    /**
     * 连接接口名称
     * @param intefacesNames
     * @return 连接后的字符串
     */
    private static String handlerInterfacesName(String[] intefacesNames) {
        StringBuilder sb = new StringBuilder();
        for (String intefacesName : intefacesNames) {
            sb.append(intefacesName).append(",");
        }
        return sb.replace(sb.length()-1,sb.length(),"").toString();
    }
}
