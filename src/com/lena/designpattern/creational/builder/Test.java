package com.lena.designpattern.creational.builder;

public class Test {
    public static void main(String[] args) {
        // who build?
        Coach coach = new Coach();
        // which Builder?
        CourseBuilder courseBuilder = new CourseActualBuilder();

        //
        coach.setCourseBuilder(courseBuilder);
        // coach returns products
        Course course = coach.makeCourse("JavaDesignPatter",
                "JavaPPT",
                "JavaVideo",
                "JavaArticle",
                "JavaQ&A"
                );
        System.out.println(course);

    }
}
