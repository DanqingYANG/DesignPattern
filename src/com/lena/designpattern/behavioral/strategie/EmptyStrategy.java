package com.lena.designpattern.behavioral.strategie;

public class EmptyStrategy implements IpromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("no Strategy");
    }
}
