package com.lena.designpattern.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

public class Teacher implements Observer {
    String name;

    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        Course course = (Course)o;
        Question question = (Question) arg; // from Course notifyObservers(question);
        System.out.println(name +" teaching " +course.getCourseName()+ " get a question from " + question.getUserName() + "\"" + question.getQuestionContent() + "\"");
    }
}
