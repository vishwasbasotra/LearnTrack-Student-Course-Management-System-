package com.airtribe.exception;

public class CustomException {

    public static void invalidInput(){
        throw new IllegalAccessError("Invalid Input");
    }

    public static String invalidSex(){
        throw new IllegalAccessError("Invalid Sex");
    }

    public static String invalidFirstName(){
        throw new IllegalAccessError("First Name is not provided");
    }

    public static String invalidLastName(){
        throw new IllegalAccessError("Last Name is not provided");
    }

    public static String invalidCourseName(){
        throw new IllegalAccessError("Course Name is not provided");
    }

    public static String invalidEmail(){
        throw new IllegalAccessError("Invalid Email");
    }

    public static String invalidBatch(){
        throw new IllegalAccessError("Batch is not provided");
    }

    public static String invalidActiveStatus(){
        throw new IllegalAccessError("Active Status is not provided");
    }

    public static int emptyInput(){
        throw new IllegalAccessError("Empty Input");
    }

    public static int invalidDuration(){
        throw new IllegalAccessError("Invalid Duration");
    }

    public static void invalidStudentID(){
        throw new IllegalAccessError("Enter StudentID Starting from 1001");
    }

    public static void invalidCourseID(){
        throw new IllegalAccessError("Enter CourseID Starting from 101");
    }
    public static void invalidEnrollmentID(){
        throw new IllegalAccessError("Enter EnrollmentID Starting from 10001");
    }
    public static void invalidDate(){
        throw new IllegalAccessError("Invalid date format. Please use dd/MM/yyyy.");
    }
    public static void invalidEnrollmentStatus(){
        throw new IllegalAccessError("Invalid Enrollment Status, Please Enter e.g., 'ACTIVE', 'COMPLETED', 'CANCELLED '");
    }

}
