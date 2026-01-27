package com.vishwas.entity;

public class Person {
    String sex;
    static int population = 0;

    public Person(String sex) {
        this.sex = sex;
        Person.population += 1;
    }

    public static void getPopulation() {
        System.out.println("Total Students: "+population); ;
    }
}
