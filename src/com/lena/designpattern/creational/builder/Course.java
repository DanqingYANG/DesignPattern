package com.lena.designpattern.creational.builder;

public class Course {
    private String courceName;
    private String coursePPT;
    private String courseArticle;
    private String couseVideo;
    //Q & A
    private String courseQA;

    public String getCourceName() {
        return courceName;
    }

    public void setCourceName(String courceName) {
        this.courceName = courceName;
    }

    public String getCoursePPT() {
        return coursePPT;
    }

    public void setCoursePPT(String coursePPT) {
        this.coursePPT = coursePPT;
    }

    public String getCourseArticle() {
        return courseArticle;
    }

    public void setCourseArticle(String courseArticle) {
        this.courseArticle = courseArticle;
    }

    public String getCouseVideo() {
        return couseVideo;
    }

    public void setCouseVideo(String couseVideo) {
        this.couseVideo = couseVideo;
    }

    public String getCourseQA() {
        return courseQA;
    }

    public void setCourseQA(String courseQA) {
        this.courseQA = courseQA;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courceName='" + courceName + '\'' +
                ", coursePPT='" + coursePPT + '\'' +
                ", courseArticle='" + courseArticle + '\'' +
                ", couseVideo='" + couseVideo + '\'' +
                ", courseQA='" + courseQA + '\'' +
                '}';
    }
}
