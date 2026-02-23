package com.airtribe.entity;

import com.airtribe.util.Inputvalidator;

public class Student extends Person {
    private static int nextID = 1001;
    private final int studentID;    // ID should usually be private and final
    private String batch;
    private final String email;
    private boolean active;

    public Student(String firstName, String lastName,String sex, String email, String batch, boolean active) {
        super(firstName, lastName, sex);    // Initializes Person fields
        this.studentID = nextID++;
        this.email = Inputvalidator.emailValidator(email);
        this.batch = Inputvalidator.setBatch(batch);
        this.active = Inputvalidator.setActiveStatus(active);
    }

    public Student(String firstName, String lastName,String sex, String batch, boolean active) {
        super(firstName, lastName, sex);
        this.studentID = nextID++;
        this.email = "NA";
        this.batch = Inputvalidator.setBatch(batch);
        this.active = Inputvalidator.setActiveStatus(active);
    }

    public void displayStudentDetails(){
        // Use getters from Parent class
        System.out.println("\nStudent Name: "+ getFirstName()+" "+ getLastName());
        System.out.println("Sex: "+this.getSex());
        System.out.println("ID: "+this.studentID);
        System.out.println("Email: "+this.email);
        System.out.println("Batch : "+this.batch);
        if(this.active) System.out.println("Status: Active\n");
        else  System.out.println("Status: Not-Active\n");
    }


    // --- Getters & Setters ---
    public String fullName(){
        return this.getFirstName() +" "+ this.getLastName();
    }
    public String getBatch() {
        return batch;
    }
    public boolean isActive() {
        return this.active;
    }
    public String getEmail() {
        return email;
    }
    public int getStudentID() {
        return studentID;
    }


    public void setFirstName(String firstName) {
        if(firstName != null) setFirstName(firstName);
        else System.out.println("Empty");
    }

    public void setLastName(String lastName) {
        if(lastName != null) setLastName(lastName);
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
