package com.lena.designpattern.structural.adaptor;

public class ConcreteTarget implements ITarget {
    @Override
    public void request() {
        System.out.println("Target Request ");
    }
}
