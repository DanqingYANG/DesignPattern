package com.lena.designpattern.creational.singelton.enumsingleton;

public enum EnumInstance {
    INSTANCE;
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumInstance getInstance()
    {
        return INSTANCE;
    }
}
