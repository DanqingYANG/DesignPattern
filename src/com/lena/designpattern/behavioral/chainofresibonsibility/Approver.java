package com.lena.designpattern.behavioral.chainofresibonsibility;

public abstract class Approver {
    protected Approver approver;

    public void setNextApprover(Approver approver)
    {
        this.approver = approver;
    }

    public abstract void deploy(Course course);
}
