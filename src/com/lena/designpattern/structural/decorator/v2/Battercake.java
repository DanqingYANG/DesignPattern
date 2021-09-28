package com.lena.designpattern.structural.decorator.v2;

public class Battercake extends ABattercake{
    @Override
    public String getDesc() {
        return "Battercake";
    }

    @Override
    public int cost() {
        return 8;
    }
}
