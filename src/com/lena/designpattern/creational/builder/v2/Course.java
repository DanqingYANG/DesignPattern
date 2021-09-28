package com.lena.designpattern.creational.builder.v2;

public class Course {
    private String courseName;
    private String coursePPT;
    private String courseArticle;
    private String couseVideo;
    //Q & A
    private String courseQA;

    //
    public Course(CourseBuilder coursebuider)
    {
        this.courseName = coursebuider.courseName;
        this.courseArticle = coursebuider.courseArticle;
        this.coursePPT = coursebuider.coursePPT;
        this.couseVideo = coursebuider.courseVideo;
        this.courseQA = coursebuider.courseQA;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courceName='" + courseName + '\'' +
                ", coursePPT='" + coursePPT + '\'' +
                ", courseArticle='" + courseArticle + '\'' +
                ", couseVideo='" + couseVideo + '\'' +
                ", courseQA='" + courseQA + '\'' +
                '}';
    }

    public static class CourseBuilder{
        String courseName;
        String coursePPT;
        String courseArticle;
        String courseVideo;
        //Q & A
        String courseQA;

        public CourseBuilder buildCourseName(String courseName)
        {
            this.courseName = courseName;
            return this;
        }

        public CourseBuilder buildCoursePPT(String coursePPT)
        {
            this.coursePPT = coursePPT;
            return this;
        }

        public CourseBuilder buildCourseArticle(String courseArticle)
        {
            this.courseArticle = courseArticle;
            return this;
        }

        public CourseBuilder buildCourseVideo(String courseVideo)
        {
            this.courseVideo = courseVideo;
            return this;
        }
        public CourseBuilder buildCourseQA(String courseQA)
        {
            this.courseQA = courseQA;
            return this;
        }

        public Course course()
        {
            return new Course(this);
        }
    }
}
