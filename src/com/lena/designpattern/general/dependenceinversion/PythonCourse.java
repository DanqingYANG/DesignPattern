package com.lena.designpattern.general.dependenceinversion;

public class PythonCourse implements ICourse{

    @Override
    public void studyCourse() {
        System.out.println("Geely is learning FE.");
    }
}
