package com.lena.designpattern.behavioral.visitor;

public abstract class Course {
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // visitor
    public abstract void accept(IVisitor iVisitor);
}
