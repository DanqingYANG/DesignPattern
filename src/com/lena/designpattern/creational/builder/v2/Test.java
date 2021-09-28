package com.lena.designpattern.creational.builder.v2;

public class Test {
    public static void main(String[] args) {
        Course course = new Course.CourseBuilder().buildCourseName("javaCourse").buildCoursePPT("JavaPPT").buildCourseVideo("aVideo").buildCourseQA("qa").buildCourseArticle("article").course();
        System.out.println(course);
    }
}
