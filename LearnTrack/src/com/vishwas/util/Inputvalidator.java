package com.vishwas.util;

import com.vishwas.exception.CustomException;

public  class Inputvalidator {
    public static String emailValidator(String email){
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[a-z]{2,6}$";
        if (email != null && email.matches(emailRegex)) return email;
        return CustomException.invalidEmail();
    }

    public static String setCourseName(String courseName){
        if(courseName != null && !courseName.isBlank()) return courseName;
        return CustomException.invalidCourseName();
    }
    public static String setFirstName(String firstName){
        if(firstName != null && !firstName.isBlank()) return firstName;
        return CustomException.invalidFirstName();
    }
    public static String setLastName(String lastName){
        if(lastName != null && !lastName.isBlank()) return lastName;
        return CustomException.invalidLastName();
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

//    public static char setTryAgain(char input){
//        if(input != null && !input.isBlank())   return input;
//        else CustomException.invalidInput();
//    }
}
