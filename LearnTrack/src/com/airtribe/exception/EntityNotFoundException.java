package com.airtribe.exception;

public class EntityNotFoundException {

    public static void studentNotFound(){
        throw new IllegalArgumentException("Student not found !!!");
    }

    public static void courseNotFound(){
        throw new IllegalArgumentException("Course not found !!!");
    }

    public static void enrollmentNotFound(){
        throw new IllegalArgumentException("Enrollment not found !!!");
    }
    public static void enrollmentDoesNotExist(){
        throw new IllegalArgumentException("Enrollment ID does not exist !!!");
    }

    public static void alreadyEnrolled(){
        throw new IllegalArgumentException("Student Already Enrolled !!!");
    }

}
