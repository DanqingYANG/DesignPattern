package com.lena.designpattern.creational.builder;

public class CourseActualBuilder extends CourseBuilder{
    // composite, owns a course
    private Course course = new Course();

    @Override
    public void buildCourseName(String courseName) {
        course.setCourceName(courseName);
    }

    @Override
    public void buildCoursePPT(String coursePPT) {
        course.setCoursePPT(coursePPT);
    }

    @Override
    public void buildCourseArticle(String courseArticle) {
        course.setCourseArticle(courseArticle);
    }

    @Override
    public void buildCourseVideo(String couseVideo) {
        course.setCouseVideo(couseVideo);
    }

    @Override
    public void buildCourseQA(String courseQA) {
        course.setCourseQA(courseQA);
    }

    @Override
    public Course makeCourse() {
        return course;
    }
}
