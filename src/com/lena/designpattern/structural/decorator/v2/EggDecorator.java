package com.lena.designpattern.structural.decorator.v2;

public class EggDecorator extends AbstractDecorator{
    public EggDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    public String getDesc() {
        return String.format("%s+ Egg. ", super.getDesc());
    }

    @Override
    public int cost() {
        return super.cost()+1;
    }
}
