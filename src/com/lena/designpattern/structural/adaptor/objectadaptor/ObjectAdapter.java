package com.lena.designpattern.structural.adaptor.objectadaptor;
import com.lena.designpattern.structural.adaptor.Adaptee;
import com.lena.designpattern.structural.adaptor.ITarget;

public class ObjectAdapter implements ITarget {
    // has Adaptee as an object
    Adaptee adaptee = new Adaptee();
    @Override
    public void request() {
        // ... add code
        System.out.println("object adaptor");
        adaptee.adapteeRequest();
        // ... add code
    }
}
