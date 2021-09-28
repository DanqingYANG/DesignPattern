package com.lena.designpattern.behavioral.templateMethod;

import java.util.List;

public class ComputerParts {
    public List<String> colum1;
    public List<String> colum2;

    public void put(String part, String name)
    {
        colum1.add(part);
        colum2.add(name);
    }

}
