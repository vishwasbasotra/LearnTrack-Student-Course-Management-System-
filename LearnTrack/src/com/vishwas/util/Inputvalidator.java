package com.vishwas.util;

public class Inputvalidator {
    public static String emailValidator(String email){
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[a-z]{2,6}$";
        if (!email.matches(emailRegex)) System.out.println("Invalid email");
        return email;
    }
}
