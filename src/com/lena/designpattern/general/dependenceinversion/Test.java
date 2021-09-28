package com.lena.designpattern.general.dependenceinversion;

public class Test {
    //pvsm
    /*
    //v1
    public static void main(String[] args) {

        Geely geely = new Geely();
        geely.studyJavaCourse();
        geely.studyFECourse();
        geely.studyPythonCourse();

    }
  */
    /*
    //v2
    public static void main(String[] args) {
        Geely geely = new Geely();
        geely.studyImoocCourse(new JavaCourse());
        geely.studyImoocCourse(new FECourse());
    }
    */

    /*
    //v3
    public static void main(String[] args) {
        Geely geely = new Geely(new JavaCourse());
        geely.studyImoocCourse();
    }
    */

    public static void main(String[] args) {
        Geely geely = new Geely();

        geely.setiCourse(new JavaCourse());
        geely.studyImoocCourse();

        geely.setiCourse(new FECourse());
        geely.studyImoocCourse();
    }
}
