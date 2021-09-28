package com.lena.designpattern.behavioral.command;

public class Test {
    public static void main(String[] args) {
        Client client = new Client();
        Target target = new Target();

        client.addCommand(new CloseCommand(target));
        client.addCommand(new OpenCommand(target));
        client.addCommand(new OpenCommand(target));
        client.addCommand(new OpenCommand(target));
        client.addCommand(new CloseCommand(target));

        client.executeCommands();
    }
}
