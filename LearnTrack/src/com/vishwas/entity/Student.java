package com.vishwas.entity;

import com.vishwas.util.IDGenerator;
import com.vishwas.util.Inputvalidator;

public class Student {
    int StudentID;
    String firstName, lastName, batch;
    private final String email;
    private boolean active;

    public Student(String firstName, String lastName, String email, String batch, boolean active) {
        this.StudentID = IDGenerator.generateStudentID(firstName);
        this.firstName = Inputvalidator.setFirstName(firstName);
        this.lastName = Inputvalidator.setLastName(lastName);
        this.email = Inputvalidator.emailValidator(email);
        this.batch = Inputvalidator.setBatch(batch);
        this.active = Inputvalidator.setActiveStatus(active);
    }

    public void displayStudentDetails(){
        System.out.println("Student Name: "+this.firstName+" "+this.lastName);
        System.out.println("ID: "+this.StudentID);
        System.out.println("Email: "+this.email);
        System.out.println("Batch : "+this.batch);
        if(this.active) System.out.println("Status: Active");
        else  System.out.println("Status: Not-Active");


    }

    public String fullName(){
        return this.firstName+" "+this.lastName;
    }

    public String getBatch() {
        return batch;
    }

    public String isActive() {
        if(active)  return "Active";
        return "Not-Active";
    }

    public String getEmail() {
        return email;
    }


    public void setFirstName(String firstName) {
        if(firstName != null) this.firstName = firstName;
        else System.out.println("Empty");
    }

    public void setLastName(String lastName) {
        if(lastName != null) this.lastName = firstName;
        else System.out.println("Empty");
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setBatch(String batch) {
        if(batch != null) this.batch = batch;
        else System.out.println("Empty");
    }
}
