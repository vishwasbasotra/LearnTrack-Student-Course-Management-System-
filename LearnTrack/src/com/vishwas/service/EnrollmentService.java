package com.vishwas.service;

import com.vishwas.entity.Enrollment;
import com.vishwas.entity.Student;
import com.vishwas.exception.EntityNotFoundException;
import com.vishwas.ui.Main;
import com.vishwas.exception.CustomException;
import com.vishwas.util.Inputvalidator;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class EnrollmentService extends Main {
    static Scanner sc = new Scanner(System.in);
    static int studentID, id;
    static String status, enrollmentDate;
    static boolean flag;
    public static void enrollmentManagement(int option){
        switch (option){
            case 1:
                for (int i = 0; i < 50; i++) System.out.println(); //Print 50 new lines
                enrollmentList.add(enrollStudent());
                System.out.println("\n-------Student Enrolled Successfully-------");
                enrollmentList.getLast().displayEnrollmentDetails();
                return;
            case 2:
                for (int i = 0; i < 50; i++) System.out.println(); //Print 50 new lines
                System.out.println("-------List of Enrolled Students-------\n");
                for(Enrollment e: enrollmentList){
                    e.displayEnrollmentDetails();
                }
                return;
            case 3:
                for (int i = 0; i < 50; i++) System.out.println(); //Print 50 new lines
                System.out.println("\n-------Change Enrollment Status Student by Enrollment ID-------");
                System.out.print("Enter Enrollment ID Starting 10001 to ... : ");
                id = Inputvalidator.validateEnrollmentID(sc.nextInt());
                flag = false;
                for(Enrollment e: enrollmentList){
                    if(e.getEnrollmentID() == id){
                        System.out.print("Enter Enrollment Status? (Active/Completed/Cancelled): ");
                        status = Inputvalidator.setEnrollmentStatus(sc.next());
                        e.setEnrollmentStatus(status);
                        e.displayEnrollmentDetails();
                        flag = true;
                    }
                }
                if(!flag) EntityNotFoundException.enrollmentDoesNotExist();
                System.out.println("\n-------Student Enrolled Successfully-------");
                return;
            case 4:
                System.out.println("Thank You!!!");
                return;
            default:
                CustomException.invalidInput();
        }
    }

    public static Enrollment enrollStudent(){
        System.out.println("-------Enter Student Details-------\n");
        System.out.print("Enter Student ID from 1001 which is not enrolled yet: ");
        studentID = Inputvalidator.validateStudentID(sc.nextInt());
        flag = false;
        for(Enrollment e: enrollmentList){
            if (e.getStudentID() == studentID) {
                flag = true;
                break;
            }
        }
        if(flag) EntityNotFoundException.alreadyEnrolled();

        System.out.print("Enter Date in dd/MM/yyyy format: ");
        enrollmentDate = sc.next();
        Inputvalidator.setEnrollmentDate(enrollmentDate);

        System.out.print("Enter Enrollment Status? (Active/Completed/Cancelled): ");
        status = sc.next();

        return new Enrollment(studentID, enrollmentDate , status);
    }

}

