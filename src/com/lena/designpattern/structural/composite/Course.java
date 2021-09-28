package com.lena.designpattern.structural.composite;

public class Course extends AbstractCatalog{
    private String coursename;
    private double price;

    public Course(String coursename, int price) {
        this.coursename = coursename;
        this.price = price;
    }

    @Override
    public double getPrice(AbstractCatalog abstractCatalog) {
        
        return price;
    }

    @Override
    public String getName(AbstractCatalog abstractCatalog) {

        return coursename;
    }

    @Override
    public void print() {
        System.out.println("Course Name: " + coursename + " Price: " + price);
    }
}
