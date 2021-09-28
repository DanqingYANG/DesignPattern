package com.lena.designpattern.structural.flyweight;

public class Test {
    private static final String departments[] = {"RD", "QA", "PM"};

    public static void main(String[] arg)
    {
        for(int i = 0; i< 10; i++)
        {
            String department = departments[(int) (Math.random()* departments.length)];
            Manager manager = (Manager)EmployeeFactory.getManager(department);
            manager.report();
        }
    }
}
