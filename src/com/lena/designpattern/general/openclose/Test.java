package com.lena.designpattern.general.openclose;

public class Test {
    public static void main(String[] args) {
        ICourse iCourse = new Javadiscountcourse(12,"Java",100d);
        double p = iCourse.getPrice();
        System.out.println(p);

        Javadiscountcourse javaCourse = (Javadiscountcourse) iCourse;
        double o = javaCourse.getOriginalPrice();
        System.out.println(o);
    }
}
