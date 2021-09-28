package com.lena.designpattern.behavioral.chainofresibonsibility;

public class VideoApprover extends Approver{
    @Override
    public void deploy(Course course) {
        if(course.getVideo().isEmpty())
        {
            System.out.println("Video is empty.");
        }
        else
        {
            System.out.println("Has video" + course.getVideo());
            if(approver != null)
            {
                approver.deploy(course);
            }
        }
    }
}
