package com.lena.designpattern.creational.singelton.hungrysingelton;

public class HungrySingleton {
    private static final HungrySingleton hungrySingleton;
    static {
        hungrySingleton = new HungrySingleton();
    }
    // above is the same as...
    //private static final HungrySingleton hungrySingleton = new HungrySingleton();
    public static HungrySingleton getInstance()
    {
        return hungrySingleton;
    }
}
