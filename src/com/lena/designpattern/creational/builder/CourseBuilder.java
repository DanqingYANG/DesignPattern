package com.lena.designpattern.creational.builder;

public abstract class CourseBuilder
{
    public abstract void buildCourseName(String courseName);
    public abstract void buildCoursePPT(String coursePPT);
    public abstract void buildCourseArticle(String courseArticle);
    public abstract void buildCourseVideo(String couseVideo);
    public abstract void buildCourseQA(String courseQA);

    public abstract Course makeCourse();
}
