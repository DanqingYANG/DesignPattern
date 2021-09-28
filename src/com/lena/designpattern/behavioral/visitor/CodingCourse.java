package com.lena.designpattern.behavioral.visitor;

public class CodingCourse extends Course{
    // has price
    public int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
