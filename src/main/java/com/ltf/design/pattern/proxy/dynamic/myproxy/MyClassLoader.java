package com.ltf.design.pattern.proxy.dynamic.myproxy;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class MyClassLoader extends ClassLoader {
    private File baseFile;

    public MyClassLoader() {
        String path = MyClassLoader.class.getResource("").getPath();
        baseFile = new File(path);
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        String className = MyClassLoader.class.getPackage().getName()+"."+name;
        File file = new File(baseFile,name+".class");
        if (file.exists()) {
            FileInputStream fileInputStream = null;
            ByteArrayOutputStream byteArrayOutputStream = null;
            try {
                fileInputStream = new FileInputStream(file);
                byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bytes = new byte[1024];
                int len;
                while ((len = fileInputStream.read(bytes)) != -1) {
                    byteArrayOutputStream.write(bytes,0,len);
                }
                return super.defineClass(className,byteArrayOutputStream.toByteArray(),0,byteArrayOutputStream.size());
            } catch (Exception e) {
                e.printStackTrace();
            }finally {
                try {
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    if (byteArrayOutputStream != null) {
                        byteArrayOutputStream.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
        return null;
    }
}
