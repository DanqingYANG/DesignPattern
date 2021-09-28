package com.lena.designpattern.general.openclose;

public class Javadiscountcourse extends Javacourse {
    public Javadiscountcourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getOriginalPrice()
    {
        return super.getPrice();
    }

    @Override
    public Double getPrice() {
        return super.getPrice()*0.8;
    }
}
