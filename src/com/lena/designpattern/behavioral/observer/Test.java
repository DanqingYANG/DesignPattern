package com.lena.designpattern.behavioral.observer;

public class Test {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Lena");
        Teacher teacher2 = new Teacher("Liustein");
        Teacher teacher3 = new Teacher("Diudiu");

        Course course = new Course("Design Pattern");

        Question question = new Question();
        question.setUserName("Einstein");
        question.setQuestionContent("What is it?");

        course.addObserver(teacher1);
        course.addObserver(teacher2);
        course.addObserver(teacher3);

        course.produceQuestion(course, question);
    }
}
