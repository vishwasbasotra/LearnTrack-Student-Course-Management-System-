package com.vishwas.entity;

public class Enrollment {
    //id, studentId, courseId, enrollmentDate, status (e.g., "ACTIVE", "COMPLETED", "CANCELLED" as String or simple enum if you want slightly advanced)
    static int nextID = 10001;
    final int enrollmentID;
    int studentID, courseID;
    String enrollmentDate;
    boolean status;

    public Enrollment(int enrollmentID, Student s, Course c, String enrollmentDate, boolean status) {
        this.enrollmentID = nextID++;
        this.studentID = s.studentID;
        this.courseID = c.courseID;
        this.enrollmentDate = enrollmentDate;
        this.status = status;
    }

    public void displayEnrollmentDetails(){
        System.out.println("Enrollment ID: "+this.enrollmentID);
        System.out.println("Enrollment Date: "+this.enrollmentDate);
        if(this.status) System.out.println("Status: Active");
        else  System.out.println("Status: Not-Active");
    }
}
