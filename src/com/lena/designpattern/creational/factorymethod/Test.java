package com.lena.designpattern.creational.factorymethod;

public class Test {
    public static void main(String[] args) {
        VideoFactory videoFactory = new JavaVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();

        VideoFactory videoFactory1 = new PythonVideoFactory();
        Video video1 = videoFactory1.getVideo();
        video1.produce();
    }
    /*
    public static void main(String[] args)
    {
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo(JavaVideo.class);
        if(video == null) {
            return;
        }
        video.produce();
    }

    public static void main(String[] args) {
         VideoFactory videoFactory = new VideoFactory();
         Video video = videoFactory.getVideo("java");
         if(video == null) {
             return;
         }
         video.produce();
    }

     */
}
