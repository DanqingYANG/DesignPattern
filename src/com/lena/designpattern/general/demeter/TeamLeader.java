package com.lena.designpattern.general.demeter;

import java.util.ArrayList;
import java.util.List;
/*
public class TeamLeader{
    public void checkNumberOfCourse(List<Course> courseList)
    {
        System.out.println("hahahaha" + courseList.size());
    }
}
*/

public class TeamLeader{
    public void checkNumberOfCourse()
    {
        List<Course> courseList = new ArrayList<Course>();
        for(int i = 0; i < 20; i++)
        {
            courseList.add((new Course()));
        }
        System.out.println("hahahaha" + courseList.size());
    }
}