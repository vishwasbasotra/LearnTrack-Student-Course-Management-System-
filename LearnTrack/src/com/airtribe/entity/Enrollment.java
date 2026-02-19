package com.airtribe.entity;

import com.airtribe.util.Inputvalidator;

import java.time.LocalDate;

public class Enrollment {
    //id, studentId, courseId, enrollmentDate, status (e.g., "ACTIVE", "COMPLETED", "CANCELLED" as String or simple enum if you want slightly advanced)
    private static int nextID = 10001;
    final int enrollmentID;
    int studentID;
    private final LocalDate enrollmentDate;
    private String enrollmentStatus;

    public Enrollment(Student s, String enrollmentDate, String status) {
        this.enrollmentID = nextID++;
        this.studentID = s.studentID;
        this.enrollmentDate = Inputvalidator.setEnrollmentDate(enrollmentDate);
        this.enrollmentStatus = Inputvalidator.setEnrollmentStatus(status);
    }
    public Enrollment(int studentID,String enrollmentDate, String status) {
        this.enrollmentID = nextID++;
        this.studentID = studentID;
        this.enrollmentDate = Inputvalidator.setEnrollmentDate(enrollmentDate);
        this.enrollmentStatus = Inputvalidator.setEnrollmentStatus(status);
    }

    public void displayEnrollmentDetails(){
        System.out.println("\nEnrollment ID: "+this.enrollmentID);
        System.out.println("Student ID: "+this.studentID);
        System.out.println("Enrollment Date: "+this.enrollmentDate);
        System.out.println("Enrollment Status: "+this.enrollmentStatus);
    }

    public int getEnrollmentID() {
        return enrollmentID;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setEnrollmentStatus(String enrollmentStatus) {
        this.enrollmentStatus = enrollmentStatus;
    }
}
