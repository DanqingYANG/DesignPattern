package com.lena.designpattern.structural.adaptor.classadaptor;
import com.lena.designpattern.structural.adaptor.Adaptee;
import com.lena.designpattern.structural.adaptor.ITarget;

public class ClassAdapter extends Adaptee implements ITarget{
    @Override
    public void request() {
        //... add code
        System.out.println("class adaptor");
        super.adapteeRequest();
        //... add code
    }
}
