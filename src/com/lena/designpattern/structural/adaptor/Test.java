package com.lena.designpattern.structural.adaptor;
// class adaptor
//import com.lena.designpattern.structural.adaptor.classadaptor.Adapter;

// object adaptor

import com.lena.designpattern.structural.adaptor.classadaptor.ClassAdapter;

public class Test {

    public static void main(String[] args) {
        ConcreteTarget concreteTarget = new ConcreteTarget();
        concreteTarget.request();
        // change "import from" change the Adapter() between class and object
        ClassAdapter adapter = new ClassAdapter();
        adapter.request();
    }

}
