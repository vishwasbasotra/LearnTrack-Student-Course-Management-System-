package com.airtribe.service;

import com.airtribe.entity.Student;
import com.airtribe.exception.EntityNotFoundException;
import com.airtribe.repository.StudentRepository;
import com.airtribe.ui.Main;
import com.airtribe.exception.CustomException;
import com.airtribe.util.Inputvalidator;

import java.util.Optional;
import java.util.Scanner;

public class StudentService extends Main {
    private static StudentRepository studentRepo = new StudentRepository();
    private static final Scanner sc = new Scanner(System.in);

    // Constructor: Dependency Injection
    public StudentService(StudentRepository studentRepo){
        StudentService.studentRepo = studentRepo;
    }

    public static void studentManagement(int option){
        switch (option){
            case 1:
                for (int i = 0; i < 50; i++) System.out.println(); //Print 50 new lines
                Student newStudent = addStudent();
                studentRepo.save(newStudent);
                System.out.println("\n-------Student Enrolled Successfully-------");
                newStudent.displayStudentDetails();
                break;
            case 2:
                for (int i = 0; i < 50; i++) System.out.println(); //Print 50 new lines
                System.out.println("-------List of all Students-------\n");
                studentRepo.findAll().forEach(Student::displayStudentDetails);
                break;
            case 3:
                for (int i = 0; i < 50; i++) System.out.println(); //Print 50 new lines
                System.out.println("\n-------Search Student by ID-------");
                System.out.print("Enter Student ID Starting 1001 to ... : ");
                boolean flag = false;
                int searchId = Inputvalidator.validateStudentID(sc.nextInt());
                for(Student s: studentRepo.findAll()){
                    if(s.getStudentID() == searchId){
                        s.displayStudentDetails();
                        flag = true;
                        break;
                    }
                }
                if(!flag) EntityNotFoundException.studentNotFound();
                break;
            case 4:
                for (int i = 0; i < 50; i++) System.out.println(); //Print 50 new lines
                System.out.println("\n-------Deactivation Student by ID-------");
                System.out.print("\nEnter StudentID: ");
                int deactId = Inputvalidator.validateStudentID(sc.nextInt());
                flag = false;

                // Call .findAll() so the loop has an actual list to go through
                for (Student s : studentRepo.findAll()) {
                    if (s.getStudentID() == deactId) {
                        s.displayStudentDetails();
                        flag = true;
                        break; // Optimization: Stop looking once you find the student
                    }
                }

                if (!flag) {
                    EntityNotFoundException.studentNotFound();
                }
                break;
            case 5:
                return; // Returns to Main menu loop
        }
    }

    public static Student addStudent(){
        System.out.println("-------Enter Student Details-------\n");
        System.out.print("Enter First Name: ");
        String firstName = Inputvalidator.setName(sc.next());

        System.out.print("Enter Last Name: ");
        String lastName = Inputvalidator.setName(sc.next());

        System.out.print("Enter Sex: ");
        String sex = Inputvalidator.setSex(sc.next());

        System.out.print("Enter Email: ");
        String email = Inputvalidator.emailValidator(sc.next());

        System.out.print("Enter Batch: ");
        String batch = Inputvalidator.setBatch(sc.next());

        System.out.print("Is the student currently Active? (yes/no): ");
        String active = sc.next();

        // Logical Conversion: If they type "yes", status becomes true
        boolean status = active.equalsIgnoreCase("yes");
        return new Student(firstName, lastName, sex, email, batch, status);
    }

}
