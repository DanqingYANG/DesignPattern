package com.lena.designpattern.creational.singelton;

import com.lena.designpattern.creational.singelton.enumsingleton.EnumInstance;
import com.lena.designpattern.creational.singelton.lazysingelton.Lazysingleton;

public class T implements Runnable{

    @Override
    public void run() {
//        Lazysingleton lazysingleton = Lazysingleton.getInstance();
        EnumInstance enumInstance = EnumInstance.getInstance();
        System.out.println(Thread.currentThread().getName());
    }
}
