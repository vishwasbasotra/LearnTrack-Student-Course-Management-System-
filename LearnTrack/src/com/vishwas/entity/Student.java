package com.vishwas.entity;

import com.vishwas.util.IDGenerator;
import com.vishwas.util.Inputvalidator;

public class Student {
    int id;
    String firstName, lastName, batch;
    private final String email;
    private boolean active;

    public Student(String firstName, String lastName, String email, String batch, boolean active) {
        this.id = IDGenerator.GenerateID(firstName);
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = Inputvalidator.emailValidator(email);
        this.batch = batch;
        this.active = active;
    }

    public String fullName(){
        return this.firstName+" "+this.lastName;
    }

    public String getBatch() {
        return batch;
    }

    public boolean isActive() {
        return active;
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
