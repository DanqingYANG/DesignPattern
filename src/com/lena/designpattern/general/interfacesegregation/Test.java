package com.lena.designpattern.general.interfacesegregation;

public class Test {
    public static void main(String[] args) {
        // v1: before segregation
        Bird bd = new Bird();
        bd.eat();
        bd.fly();
        bd.swim();

        // v2: after segregation
        Dog dg = new Dog();
        dg.eat();
        dg.swim();
    }

}
