package com.vishwas.util;

public  class Inputvalidator {
    public static String emailValidator(String email){
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[a-z]{2,6}$";
        if (email != null && email.matches(emailRegex)) return email;
        else {
            throw new IllegalArgumentException("Invalid Email: "+ email);
        }
    }

    public static String setCourseName(String courseName){
        if(courseName != null && !courseName.isBlank()) return courseName;
        else throw new IllegalArgumentException("Enter a course name");
    }
    public static String setFirstName(String firstName){
        if(firstName != null && !firstName.isBlank()) return firstName;
        else throw new IllegalArgumentException("Enter a first name");
    }
    public static String setLastName(String lastName){
        if(lastName != null && !lastName.isBlank()) return lastName;
        else throw new IllegalArgumentException("Enter a last name");
    }
    public static String setBatch(String batch){
        if(batch != null && !batch.isBlank()) return batch;
        else throw new IllegalArgumentException("Enter a batch");
    }
    public static Boolean setActiveStatus(Boolean active){
        if(active == null) throw new IllegalArgumentException("Active Status Empty");
        else return active;
    }

//    public static String emailValidator(String email){
//        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[a-z]{2,6}$";
//        if (!email.matches(emailRegex)) System.out.println("Invalid email");
//        return email;
//    }
//
//    public static String emailValidator(String email){
//        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[a-z]{2,6}$";
//        if (!email.matches(emailRegex)) System.out.println("Invalid email");
//        return email;
//    }
}
