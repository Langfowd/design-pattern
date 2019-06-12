package com.ltf.design.pattern.proxy.dynamic.myproxy;

import java.lang.reflect.Method;

public class MyProxyInit implements MyInvocationHandler {
    private Object target;

    public MyProxyInit(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        return MyProxy.newProxyInstance(new MyClassLoader(),target.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("我自己创造出来的高富帅");
        return method.invoke(target,args);
    }
}
