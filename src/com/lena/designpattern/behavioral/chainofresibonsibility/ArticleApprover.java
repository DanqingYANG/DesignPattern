package com.lena.designpattern.behavioral.chainofresibonsibility;

public class ArticleApprover extends Approver{
    @Override
    public void deploy(Course course) {
        if(course.getArticle().isEmpty())
        {
           System.out.println("Article is empty.");
        }
        else
        {
            System.out.println("Has article" + course.getArticle());
            if(approver != null)
            {
                approver.deploy(course);
            }
        }
    }
}
