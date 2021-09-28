package com.lena.designpattern.creational.singelton;

public class Test {
    public static void main(String[] args) {
        int a = 0;
        Thread t1  = new Thread(new T());
        Thread t2  = new Thread(new T());
        t1.start();
        t2.start();
        System.out.println(Thread.currentThread().getName()+ " Program end.");
    }
}
