package com.lena.designpattern.behavioral.observer;

import java.util.Observable;

public class Course extends Observable {
    String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    //here
    public void produceQuestion(Course course, Question question)
    {
        System.out.println( question.getUserName() + " asked " + question.getQuestionContent());
        setChanged();
        notifyObservers(question);
    }

}
