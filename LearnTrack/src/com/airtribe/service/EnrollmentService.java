package com.airtribe.service;

import com.airtribe.entity.Enrollment;
import com.airtribe.enums.EnrollmentStatus;
import com.airtribe.exception.EntityNotFoundException;
import com.airtribe.repository.EnrollmentRepository;
import com.airtribe.ui.Main;
import com.airtribe.exception.CustomException;
import com.airtribe.util.Inputvalidator;

import java.util.Scanner;

public class EnrollmentService extends Main {
    private static Scanner sc = new Scanner(System.in);
    private static EnrollmentRepository enrollmentRepo = new EnrollmentRepository();

    public EnrollmentService(EnrollmentRepository enrollmentRepo) {
        EnrollmentService.enrollmentRepo = enrollmentRepo;
    }

    public static void enrollmentManagement(int option){
        switch (option) {
            case 1:
                for (int i = 0; i < 50; i++) System.out.println(); //Print 50 new lines
                Enrollment newEnrollment = enrollStudent();
                enrollmentRepo.save(newEnrollment);
                System.out.println("\n-------Student Enrolled Successfully-------");
                newEnrollment.displayEnrollmentDetails();
                break;
            case 2:
                for (int i = 0; i < 50; i++) System.out.println(); //Print 50 new lines
                System.out.println("-------List of Enrolled Students-------\n");
                enrollmentRepo.findAll().forEach(Enrollment::displayEnrollmentDetails);
                break;
            case 3:
                for (int i = 0; i < 50; i++) System.out.println(); //Print 50 new lines
                System.out.println("\n-------Change Enrollment Status Student by Enrollment ID-------");
                System.out.print("Enter Enrollment ID Starting from 10001: ");
                int id = Inputvalidator.validateEnrollmentID(sc.nextInt());
                boolean flag = false;
                for (Enrollment e : enrollmentRepo.findAll()) {
                    if (e.getEnrollmentID() == id) {
                        System.out.print("Enter Enrollment Status? (Active/Completed/Cancelled): ");
                        EnrollmentStatus status = EnrollmentStatus.fromString(sc.next());
                        e.setStatus(status);
                        e.displayEnrollmentDetails();
                        flag = true;
                    }
                }
                if (!flag) EntityNotFoundException.enrollmentDoesNotExist();
                System.out.println("\n-------Student Enrolled Successfully-------");
                break;
            case 4:
                return;
        }
    }

    public static Enrollment enrollStudent(){
        System.out.println("-------Enter Student Details-------\n");
        System.out.print("Enter Student ID from 1001 which is not enrolled yet: ");
        int studentID = Inputvalidator.validateStudentID(sc.nextInt());
        boolean flag = false;
        for(Enrollment e: enrollmentRepo.findAll()){
            if (e.getStudentID() == studentID) {
                flag = true;
                break;
            }
        }
        if(flag) EntityNotFoundException.alreadyEnrolled();

        System.out.print("Enter Date in dd/MM/yyyy format: ");
        String enrollmentDate = sc.next();
        Inputvalidator.setEnrollmentDate(enrollmentDate);

        System.out.print("Enter Enrollment Status? (Active/Completed/Cancelled): ");
        EnrollmentStatus status = EnrollmentStatus.fromString(sc.next());

        return new Enrollment(studentID, enrollmentDate , status);
    }

}

