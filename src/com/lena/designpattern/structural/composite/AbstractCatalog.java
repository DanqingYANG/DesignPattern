package com.lena.designpattern.structural.composite;

import com.lena.designpattern.structural.decorator.v2.AbstractDecorator;

public abstract class AbstractCatalog {
    public void add(AbstractCatalog abstractCatalog) {
        throw new UnsupportedOperationException("add option unsuported");
    }
    public void remove(AbstractCatalog abstractCatalog) {
        throw new UnsupportedOperationException("remove option unsuported");
    }

    public double getPrice(AbstractCatalog abstractCatalog) {
        throw new UnsupportedOperationException("getPrice option unsuported");
    }
    public String getName(AbstractCatalog abstractCatalog) {
        throw new UnsupportedOperationException("getName option unsuported");
    }

    public void print() {
        throw new UnsupportedOperationException("print option unsuported");
    }
}
