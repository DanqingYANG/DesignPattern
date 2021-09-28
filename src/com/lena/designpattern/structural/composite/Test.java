package com.lena.designpattern.structural.composite;

public class Test {
    public static void main(String[] args) {
        // two courses
        // one catalog contains two courses
        // one main catalog
        CourseCatalog mainCatalog = new CourseCatalog("MyCourseCatalog");
        CourseCatalog subCatalog = new CourseCatalog("subCourseCatalog");

        Course course1 = new Course("cource1", 50);
        Course course2 = new Course("cource2", 100);
        Course course3 = new Course("cource3", 150);
        Course course4 = new Course("cource4", 250);

        subCatalog.add(course3);
        subCatalog.add(course4);

        // add leafs
        mainCatalog.add(course1);
        mainCatalog.add(course2);
        // add list
        mainCatalog.add(subCatalog);

        mainCatalog.print();

    }
}
