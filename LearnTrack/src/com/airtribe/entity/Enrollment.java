package com.airtribe.entity;

import com.airtribe.enums.EnrollmentStatus;
import com.airtribe.util.Inputvalidator;

import java.time.LocalDate;

public class Enrollment {
    //id, studentId, courseId, enrollmentDate, status (e.g., "ACTIVE", "COMPLETED", "CANCELLED" as String or simple enum if you want slightly advanced)
    private static int nextID = 10001;
    final int enrollmentID;
    int studentID;
    private final LocalDate enrollmentDate;
    private EnrollmentStatus status;

    public Enrollment(Student s, String enrollmentDate, EnrollmentStatus status) {
        this.enrollmentID = nextID++;
        this.studentID = s.getStudentID();
        this.enrollmentDate = Inputvalidator.setEnrollmentDate(enrollmentDate);
        this.status = status;
    }
    public Enrollment(int studentID,String enrollmentDate, EnrollmentStatus status) {
        this.enrollmentID = nextID++;
        this.studentID = studentID;
        this.enrollmentDate = Inputvalidator.setEnrollmentDate(enrollmentDate);
        this.status = status;
    }

    public void displayEnrollmentDetails(){
        System.out.println("\nEnrollment ID: "+this.enrollmentID);
        System.out.println("Student ID: "+this.studentID);
        System.out.println("Enrollment Date: "+this.enrollmentDate);
        System.out.println("Enrollment Status: "+this.status);
    }

    public int getEnrollmentID() {
        return enrollmentID;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStatus(EnrollmentStatus status) {
        this.status = status;
    }
}
