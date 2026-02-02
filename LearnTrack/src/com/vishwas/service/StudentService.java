package com.vishwas.service;

import com.vishwas.entity.Student;
import com.vishwas.ui.Main;
import com.vishwas.exception.CustomException;
import com.vishwas.util.Inputvalidator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService extends Main {
    static Scanner sc = new Scanner(System.in);
    static String firstName, lastName, sex;
    private static String batch, email, active;

    public static void studentManagement(int option){
        switch (option){
            case 1:
                for (int i = 0; i < 50; i++) System.out.println(); //Print 50 new lines
                studentList.add(addStudent());
                System.out.println("\n-------Student Enrolled Successfully-------");
                studentList.getLast().displayStudentDetails();
                return;
            case 2:
                for (int i = 0; i < 50; i++) System.out.println(); //Print 50 new lines
                for(Student s: studentList){
                    s.displayStudentDetails();
                }
                return;
            case 3:
                for (int i = 0; i < 50; i++) System.out.println(); //Print 50 new lines
                System.out.println("\n-------Search Student by ID-------");
                System.out.print("Enter Student ID Starting 1001 to ... : ");
                int id = sc.nextInt();
                for(Student s: studentList){
                    if(s.getStudentID() == id)  s.displayStudentDetails();
                }
                return;
            case 4:
                for (int i = 0; i < 50; i++) System.out.println(); //Print 50 new lines
                return;
            case 5:
                System.out.println("Thank You!!!");
                return;
            default:
                CustomException.invalidInput();
        }
    }

    public static Student addStudent(){
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

        System.out.print("Is the student currently Active? (yes/no): ");
        active = sc.next();

        // Logical Conversion: If they type "yes", status becomes true
        boolean status = active.equalsIgnoreCase("yes");
        return new Student(firstName, lastName, sex, email, batch, status);
    }

    static void displayStudentInfo(){
        for(Student s: studentList){
            s.displayStudentDetails();
        }
    }

}
