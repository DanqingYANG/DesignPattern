package com.lena.designpattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class EmployeeFactory {
    // use hashmap
    private static final Map<String,Employee> EMPLOYEE_MAP  = new HashMap<String,Employee>();

    // get manager in hashmap, if none is found new one.
    public static Employee getManager(String department)
    {
        Manager manager = (Manager) EMPLOYEE_MAP.get(department);
        if(manager == null)
        {
            manager = new Manager(department);
            manager.setReportContent("reportContent is ...");
            EMPLOYEE_MAP.put(department,manager);
            System.out.println("create new department manager: " +  department);

        }
        return manager;
    }

}
