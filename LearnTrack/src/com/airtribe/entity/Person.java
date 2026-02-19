package com.airtribe.entity;

import com.airtribe.util.Inputvalidator;

public class Person {
    private String firstName, lastName, sex;
    private static int population = 0;

    public Person(String firstName, String lastName, String sex) {
        this.sex = Inputvalidator.setSex(sex);
        this.firstName = Inputvalidator.setName(firstName);
        this.lastName = Inputvalidator.setName(lastName);
        Person.population++;
    }

    //Getters for child classes and UI


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSex() {
        return sex;
    }

    public static void getPopulation() {
        System.out.println("Total Students: "+population); ;
    }
}
