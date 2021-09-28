package com.lena.designpattern.behavioral.state;

public abstract class CourseVideoState {
    protected CourseVideoContext courseVideoContext;

    public void setCourseVideoContext(CourseVideoContext courseVideoContext) {
        this.courseVideoContext = courseVideoContext;
    }

    public abstract void play();
    public abstract void stop();
    public abstract void speed();
    public abstract void pause();
}
