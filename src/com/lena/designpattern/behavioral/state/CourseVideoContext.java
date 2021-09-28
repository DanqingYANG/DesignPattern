package com.lena.designpattern.behavioral.state;

public class CourseVideoContext {
    private CourseVideoState courseVideoState;

    public final static PlayState PLAY_STATE = new PlayState();
    public final static SpeedState SPEED_STATE = new SpeedState();
    public final static PauseState PAUSE_STATE = new PauseState();
    public final static StopState STOP_STATE = new StopState();

    public CourseVideoState getCourseVideoState() {
        return courseVideoState;
    }

    // courseVideoState and context is inited and set here.
    public void setCourseVideoState(CourseVideoState courseVideoState) {
        // set state
        this.courseVideoState = courseVideoState;
        // set context
        this.courseVideoState.setCourseVideoContext(this);
    }

    // can have a different name, playSound, playVideo and so on
    public void plays()
    {
        // current courseVideoState can be one of the four above ConcreteState
        // that is to say, if current state is a StopState STOP_STATE, play() in StopState will be called
        this.courseVideoState.play();
    }

    public void speed()
    {
        this.courseVideoState.speed();
    }

    public void stop()
    {
        this.courseVideoState.stop();
    }

    public void pause()
    {
        this.courseVideoState.pause();
    }
}
