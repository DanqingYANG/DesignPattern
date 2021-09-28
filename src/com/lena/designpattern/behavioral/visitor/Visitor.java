package com.lena.designpattern.behavioral.visitor;

public class Visitor implements IVisitor{
    @Override
    public void visit(CodingCourse codingCourse) {
        System.out.println("codingCourse " + codingCourse.getName());
    }

    @Override
    public void visit(FreeCourse freeCourse) {
        System.out.println("freeCourse " + freeCourse.getName());
    }
}
