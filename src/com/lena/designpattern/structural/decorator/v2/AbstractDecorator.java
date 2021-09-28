package com.lena.designpattern.structural.decorator.v2;

public abstract class AbstractDecorator extends ABattercake {
    public ABattercake aBattercake;

    public AbstractDecorator(ABattercake aBattercake) {
        this.aBattercake = aBattercake;
    }
    @Override
    public String getDesc() {
        return this.aBattercake.getDesc();
    }

    @Override
    public int cost() {
        return this.aBattercake.cost();
    }
}
