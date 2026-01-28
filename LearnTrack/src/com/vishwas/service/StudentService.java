package com.vishwas.service;

import com.vishwas.entity.Student;
import com.vishwas.ui.Main;
import com.vishwas.exception.CustomException;
import com.vishwas.util.Inputvalidator;

import java.util.Scanner;

public class StudentService {
    static Scanner sc = new Scanner(System.in);
    static String firstName, lastName, sex;
    private static String batch;
    private static String email;
    private static boolean active;

    public static void studentManagement(int option){
        switch (option){
            case 1:
                for (int i = 0; i < 50; i++) System.out.println(); //Print 50 new lines
                addStudent();
            case 2:
                for (int i = 0; i < 50; i++) System.out.println(); //Print 50 new lines

            case 3:
                for (int i = 0; i < 50; i++) System.out.println(); //Print 50 new lines

            case 4:
                for (int i = 0; i < 50; i++) System.out.println(); //Print 50 new lines

            case 5:
                System.out.println("Thank You!!!");
                return;
            default:
                CustomException.invalidInput();
        }
    }

    public static void addStudent(){
        System.out.println("-------Enter Student Details-------\n");
        System.out.print("Enter First Name: ");
        firstName = Inputvalidator.setName(sc.next());

        System.out.print("Enter Last Name: ");
        lastName = Inputvalidator.setName(sc.next());

        System.out.print("Enter Sex: ");
        sex = Inputvalidator.setSex(sc.next());

        System.out.print("Enter Email: ");
        email = Inputvalidator.emailValidator(sc.next());

        System.out.print("Enter Batch: ");
        batch = Inputvalidator.setBatch(sc.next());

        System.out.print("Enter Active Status: ");
        active = Inputvalidator.setActiveStatus(sc.nextBoolean());
        
    }

    public static void createStudentObject(){

    }
}
