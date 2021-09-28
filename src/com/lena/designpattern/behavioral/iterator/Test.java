package com.lena.designpattern.behavioral.iterator;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        Course course1 = new Course("Java1");
        Course course2 = new Course("Java2");

        CourseAggregate courseAggregate = new CourseAggregateImpl();
        courseAggregate.addCourse(course1);
        courseAggregate.addCourse(course2);
//        courseAggregate.removeCourse(course1);
//        courseAggregate.addCourse(course1);

        CourseIterator it = courseAggregate.getCourseIterator();
        System.out.println(it.isLastCourse());
        System.out.println(it.nextCourse());
        printCourses(courseAggregate);
    }

    public static void printCourses(CourseAggregate courseAggregate)
    {
        CourseIterator it = courseAggregate.getCourseIterator();

        while(!it.isLastCourse())
        {
            Course course = it.nextCourse();
            System.out.println(course.getName());
        }

        System.out.println();
    }
}
