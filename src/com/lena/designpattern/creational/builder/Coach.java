package com.lena.designpattern.creational.builder;

public class Coach {
    // owns a CourseBuilder
    private CourseBuilder courseBuilder;

    public void setCourseBuilder(CourseBuilder courseBuilder) {
        this.courseBuilder = courseBuilder;
    }

    public Course makeCourse(String courseName, String coursePPT, String courseVideo,
                             String courseQA, String courseArticle)
    {
        courseBuilder.buildCourseArticle(courseArticle);
        courseBuilder.buildCourseName(courseName);
        courseBuilder.buildCoursePPT(coursePPT);
        courseBuilder.buildCourseQA(courseQA);
        courseBuilder.buildCourseVideo(courseVideo);
        return this.courseBuilder.makeCourse();
    }
}
