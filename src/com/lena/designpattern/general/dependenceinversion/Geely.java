package com.lena.designpattern.general.dependenceinversion;

public class Geely {
    /*
    //v1
    public void studyJavaCourse()
    {
        System.out.println("Geely is learning Java.");
    }

    public void studyFECourse()
    {
        System.out.println("Geely is learning FE.");
    }

    public void studyPythonCourse()
    {
        System.out.println("Geely is learning FE.");
    }
    */

    /*
    //v2
    public void studyImoocCourse(ICourse iCourse)
    {
        iCourse.studyCourse();
    }
    */

    /*
    //v3
    ICourse iCourse;
    public Geely(ICourse iCourse)
    {
        this.iCourse = iCourse;
    }
    public void studyImoocCourse()
    {
        iCourse.studyCourse();
    }
     */

    private ICourse iCourse;

    public void setiCourse(ICourse iCourse)
    {
        this.iCourse = iCourse;
    }

    public void studyImoocCourse()
    {
        iCourse.studyCourse();
    }

}
