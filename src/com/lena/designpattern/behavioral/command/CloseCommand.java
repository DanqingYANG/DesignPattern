package com.lena.designpattern.behavioral.command;

public class CloseCommand implements Command{
    public Target target;

    public CloseCommand(Target target) {
        this.target = target;
    }

    @Override
    public void execute() {
        target.close();
    }
}
