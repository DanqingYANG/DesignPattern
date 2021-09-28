package com.lena.designpattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CourseCatalog extends AbstractCatalog{
    private String name;
    private List<AbstractCatalog> items = new ArrayList<AbstractCatalog>();

    public CourseCatalog(String name) {
        this.name = name;
    }

    @Override
    public void add(AbstractCatalog abstractCatalog) {
        items.add(abstractCatalog);
    }

    @Override
    public void remove(AbstractCatalog abstractCatalog) {
        items.remove(abstractCatalog);
    }

    @Override
    public String getName(AbstractCatalog abstractCatalog) {
        return name;
    }

    @Override
    public void print() {
        // here we can use DFS to find out the deepest level.
        // ...not written

        System.out.println(this.name);
        for(AbstractCatalog item : items)
        {
            System.out.print("  ");
            item.print();
        }
    }
}
