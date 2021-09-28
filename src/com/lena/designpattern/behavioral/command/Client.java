package com.lena.designpattern.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private List<Command> commandList = new ArrayList<Command>();

    public void addCommand(Command command)
    {
        commandList.add(command);
    }

    public void executeCommands()
    {
        for(Command command : commandList)
        {
            command.execute();
        }
        commandList.clear();
    }

}
