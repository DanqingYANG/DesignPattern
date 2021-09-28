package com.lena.designpattern.general.dependenceinversion;

public class JavaCourse implements ICourse{

    @Override
    public void studyCourse() {
        System.out.println("Geely is learning Java.");
    }
}
