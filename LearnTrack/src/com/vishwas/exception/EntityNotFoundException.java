package com.vishwas.exception;

public class EntityNotFoundException {
    public static void invalidInput(){
        throw new IllegalArgumentException("Invalid Input !!!");
    }

    public static void studentNotFound(){
        throw new IllegalArgumentException("Student is not found !!!");
    }

    public static void courseNotFound(){
        throw new IllegalArgumentException("Course is not found !!!");
    }

    public static void enrollmentNotFound(){
        throw new IllegalArgumentException("Enrollment is not found !!!");
    }
}
