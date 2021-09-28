package com.lena.designpattern.general.singleresponsibility;

public class Bird {
    public void mainbehavior(String birdName)
    {
        if(birdName == "Penguin")
        {
            System.out.println(birdName + " walk");
        }
        else
        {
            System.out.println(birdName + " fly");
        }
    }
}
