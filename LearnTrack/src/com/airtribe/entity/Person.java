package com.airtribe.entity;

import com.airtribe.util.Inputvalidator;

public class Person {
    String firstName, lastName, sex;
    static int population = 0;

    public Person(String firstName, String lastName, String sex) {
        this.sex = Inputvalidator.setSex(sex);
        this.firstName = Inputvalidator.setName(firstName);
        this.lastName = Inputvalidator.setName(lastName);
        Person.population += 1;
    }

    public static void getPopulation() {
        System.out.println("Total Students: "+population); ;
    }
}
