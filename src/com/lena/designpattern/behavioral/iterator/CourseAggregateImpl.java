package com.lena.designpattern.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class CourseAggregateImpl implements CourseAggregate {
    private List courseList;

    public CourseAggregateImpl() {
        this.courseList = new ArrayList();
    }

    @Override
    public void addCourse(Course course) {
        System.out.println(course.getName()+" added.");
        courseList.add(course);
    }

    public CourseAggregateImpl(List courseList) {
        this.courseList = courseList;
    }

    @Override
    public void removeCourse(Course course) {
        System.out.println(course.getName()+" removed.");
        courseList.remove(course);
    }

    @Override
    public CourseIterator getCourseIterator() {
        return new CourseIteratorImpl(courseList);
    }
}
