package com.lena.designpattern.behavioral.command;

public class OpenCommand implements Command{
    public Target target;

    public OpenCommand(Target target) {
        this.target = target;
    }

    @Override
    public void execute() {
        target.open();
    }
}
