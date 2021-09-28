package com.lena.designpattern.creational.singelton.lazysingelton;

public class Lazysingleton {
    private volatile static Lazysingleton lazysingleton;

    private Lazysingleton() {
    }

    // problem when meet with multi-thread
    public static Lazysingleton getInstance()
    {
//        if(lazysingleton == null)
//        {
//            lazysingleton = new Lazysingleton();
//        }
        if(lazysingleton == null)
        {
            synchronized (Lazysingleton.class)
            {
                if(lazysingleton == null)
                    lazysingleton = new Lazysingleton();
            }
        }
        return lazysingleton;
    }

}
