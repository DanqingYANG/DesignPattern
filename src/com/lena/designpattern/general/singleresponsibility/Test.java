package com.lena.designpattern.general.singleresponsibility;

public class Test {
    public static void main(String[] args) {
        // v1: classes
        // before
        Bird b = new Bird();
        b.mainbehavior("Pigeon");
        b.mainbehavior("Penguin");

        // after: use two classes to separate function
        Bird1 b1 = new Bird1();
        b1.mainbehavior("Pigeon");
        Bird2 b2 = new Bird2();
        b2.mainbehavior("Penguin");


        // v2: interfaces
        CourseImpl course = new CourseImpl();
        course.getCourseName();
        course.getCourseVideo(); // ...

        // v3: methods
        // get1, get2... if two functions can be separate.
    }
}
