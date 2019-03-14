package com.ltf.design.pattern.singleton;

/**
 * 枚举单例 推荐使用
 */
public enum  EnumSingle {
    SINGLE{
        @Override
        public void say() {
            System.out.println("你好呀");
        }
    };
    private Object data;
    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    abstract void say();

    public EnumSingle getInstance() {
        return SINGLE;
    }
}
