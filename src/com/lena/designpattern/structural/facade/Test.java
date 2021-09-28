package com.lena.designpattern.structural.facade;

public class Test {
    public static void main(String[] args) {
        Pointsgift pointsgift = new Pointsgift("LeetcodeT-shirt",5000);
        User user = new User();
        user.mypoints = 6000;
        FacadeGiftExchangeService fges = new FacadeGiftExchangeService();
        fges.Service(pointsgift,user);
    }
}
