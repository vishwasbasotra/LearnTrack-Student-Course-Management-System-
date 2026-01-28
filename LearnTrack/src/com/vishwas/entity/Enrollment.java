package com.vishwas.entity;

public class Enrollment {
    //id, studentId, courseId, enrollmentDate, status (e.g., "ACTIVE", "COMPLETED", "CANCELLED" as String or simple enum if you want slightly advanced)
    private static int nextID = 10001;
    private final int enrollmentID;
    private int studentID;
    private final String enrollmentDate;
    private boolean status;

    public Enrollment(Student s, String enrollmentDate, boolean status) {
        this.enrollmentID = nextID++;
        this.studentID = s.getStudentID();
        this.enrollmentDate = enrollmentDate;
        this.status = status;
    }

    public void displayEnrollmentDetails(){
        System.out.println("\nEnrollment ID: "+this.enrollmentID);
        System.out.println("Student ID: "+this.studentID);
        System.out.println("Enrollment Date: "+this.enrollmentDate);
        if(this.status) System.out.println("Status: Active\n");
        else  System.out.println("Status: Not-Active\n");
    }
}
