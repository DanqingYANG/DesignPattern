package com.lena.designpattern.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args)
    {
        List<Course> courseList = new ArrayList<Course>();

        CodingCourse codingCourse = new CodingCourse();
        codingCourse.name = "coding course";
        FreeCourse freeCourse = new FreeCourse();
        freeCourse.name = "free course";

        courseList.add(codingCourse);
        courseList.add(freeCourse);

        for(Course course: courseList)
        {
            course.accept(new Visitor());
        }
    }
}
