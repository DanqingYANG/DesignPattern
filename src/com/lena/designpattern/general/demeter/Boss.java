package com.lena.designpattern.general.demeter;

/*
public class Boss {
    public void commandCheckNumber(TeamLeader teamLeader)
    {
        List<Course> courseList = new ArrayList<Course>();
        for(int i = 0; i < 20; i++)
        {
            courseList.add((new Course()));
        }
        teamLeader.checkNumberOfCourse(courseList);
    }
}
*/
public class Boss {
    public void commandCheckNumber(TeamLeader teamLeader)
    {
        teamLeader.checkNumberOfCourse();
    }
}
