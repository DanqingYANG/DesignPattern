package com.lena.designpattern.behavioral.state;

public class Test {
    public static void main(String[] args) {
        CourseVideoContext courseVideoContext = new CourseVideoContext();

        courseVideoContext.setCourseVideoState(new PlayState());
        System.out.println("current " + courseVideoContext.getCourseVideoState());

        courseVideoContext.stop();
        System.out.println("current " + courseVideoContext.getCourseVideoState());

        courseVideoContext.plays();
        System.out.println("current " + courseVideoContext.getCourseVideoState());

        courseVideoContext.speed();
        System.out.println("current " + courseVideoContext.getCourseVideoState());

        courseVideoContext.pause();
        System.out.println("current " + courseVideoContext.getCourseVideoState());
    }
}
