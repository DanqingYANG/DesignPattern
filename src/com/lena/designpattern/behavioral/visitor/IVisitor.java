package com.lena.designpattern.behavioral.visitor;

public interface IVisitor {
    public void visit(FreeCourse freeCourse);
    public void visit(CodingCourse codingCourse);
}
