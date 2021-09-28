package com.lena.designpattern.behavioral.mediator;

public class Test {
    public static void main(String[] args) {
        User user = new User("Lena");
        User user2 = new User("Liustein");
        user.sendMessage("Hallo");
        user2.sendMessage("Hi");
    }
}
