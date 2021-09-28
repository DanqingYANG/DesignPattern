package com.lena.designpattern.behavioral.mediator;

public class User {
    public String name;

    public User(String name){this.name = name;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    // here
    public void sendMessage(String message)
    {
        StudyGroup.showMessage(this,message);
    }
}
