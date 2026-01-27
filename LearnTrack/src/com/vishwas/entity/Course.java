package com.vishwas.entity;

import com.vishwas.util.Inputvalidator;

public class Course {
    int id;
    String courseName, description;
    int durationInWeeks;
    boolean active;

    public Course(Student s, String courseName, String description, int durationInWeeks, boolean active) {
        super();
        this.id = s.id;
        this.courseName = Inputvalidator.setCourseName(courseName);
        this.description =Inputvalidator.setDescription(description);
        this.durationInWeeks = Inputvalidator.setDuration(durationInWeeks);
        this.active = Inputvalidator.setActiveStatus(active);
    }

    public void displayCourseDetails(){
        System.out.println("Course Name: "+this.courseName);
        System.out.println("ID: "+this.id);
        System.out.println("Description: "+this.description);
        System.out.println("Duration (in weeks) : "+this.durationInWeeks);
        if(this.active) System.out.println("Status: Active");
        else  System.out.println("Status: Not-Active");


    }

    public String getCourseName() {
        return courseName;
    }

    public String getDescription() {
        return description;
    }

    public int getDurationInWeeks() {
        return durationInWeeks;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDurationInWeeks(int durationInWeeks) {
        this.durationInWeeks = durationInWeeks;
    }
    public void setActive(boolean active) {
        this.active = active;
    }
}
