package com.lena.designpattern.behavioral.chainofresibonsibility;

public class Test {
    public static void main(String[] args) {
        Course course = new Course();
        course.setName("CourseName:  Java");
        course.setArticle("....");
        course.setVideo(" *** ");

        Approver articleApprover = new ArticleApprover();
        Approver videoApprover = new VideoApprover();
        Approver articleApprover2 = new ArticleApprover();;

        // chain: article -> video -> article2
        articleApprover.setNextApprover(videoApprover);
        videoApprover.setNextApprover(articleApprover2);

        articleApprover.deploy(course);
    }
}
