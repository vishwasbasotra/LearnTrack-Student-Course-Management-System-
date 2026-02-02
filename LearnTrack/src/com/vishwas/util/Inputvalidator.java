package com.vishwas.util;

import com.vishwas.exception.CustomException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public  class Inputvalidator {
    static LocalDate date = null;
    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public static String emailValidator(String email){
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[a-z]{2,6}$";
        if (email != null && email.matches(emailRegex)) return email;
        return CustomException.invalidEmail();
    }

    public static String setCourseName(String courseName){
        if(courseName != null && !courseName.isBlank()) return courseName;
        return CustomException.invalidCourseName();
    }
    public static String setName(String firstName){
        if(firstName != null && !firstName.isBlank()) return firstName;
        return CustomException.invalidFirstName();
    }

    public static String setSex(String sex){
        if((!sex.isBlank()) && (sex.equals("Male") || sex.equals("male") || sex.equals("Female") || sex.equals("female")) ) return sex;
        return CustomException.invalidSex();
    }

    public static String setBatch(String batch){
        if(batch != null && !batch.isBlank()) return batch;
        return CustomException.invalidBatch();
    }
    public static Boolean setActiveStatus(Boolean active){
        if(active == null) CustomException.invalidActiveStatus();
        return active;
    }
    public static String setDescription(String description){
        if(description != null && !description.isBlank())   return description;
        return CustomException.invalidActiveStatus();
    }
    public static int setDuration(int duration){
        if(duration > 0)   return duration;
        return CustomException.invalidDuration();
    }

    public static int validateStudentID(int input){
        if(input < 1000)   CustomException.invalidStudentID();
        return input;
    }
    public static int validateCourseID(int input){
        if(input < 100)   CustomException.invalidCourseID();
        return input;
    }
    public static int validateEnrollmentID(int input){
        if(input < 10000)   CustomException.invalidEnrollmentID();
        return input;
    }
    public static LocalDate setEnrollmentDate(String input){
        try {
            // Attempt to parse the input string into a LocalDate object
            date = LocalDate.parse(input, formatter);
        } catch (DateTimeParseException e) {
            // Handle the exception if the format is invalid
            CustomException.invalidDate();
        }
        return date;
    }
    public static String setEnrollmentStatus(String input){
        if(!input.equals("Active") && !input.equals("Completed") && !input.equals("Cancelled") )   CustomException.invalidEnrollmentStatus();
        return input;
    }

}
