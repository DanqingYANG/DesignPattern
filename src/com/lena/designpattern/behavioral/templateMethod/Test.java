package com.lena.designpattern.behavioral.templateMethod;

public class Test {
    public static void main(String[] args) {
        new StandardComputerBuilder()
                .buildComputer().getComputerParts()
                .forEach((k, v) -> System.out.println("Part : " + k + " Value : " + v));

        new HighEndComputerBuilder()
                .buildComputer().getComputerParts()
                .forEach((k, v) -> System.out.println("Part : " + k + " Value : " + v));

    }
}
