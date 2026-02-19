package com.airtribe.ui;

import com.airtribe.constants.MenuOptions;
import com.airtribe.entity.Course;
import com.airtribe.entity.Enrollment;
import com.airtribe.entity.Student;
import com.airtribe.exception.CustomException;
import com.airtribe.repository.StudentRepository;
import com.airtribe.service.CourseService;
import com.airtribe.service.EnrollmentService;
import com.airtribe.service.StudentService;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 1. Initialize Repositories (The new Data Layer)

        StudentRepository studentRepo = new StudentRepository();

        // 2. Initialize Services (Injecting Repositories via Composition)
        // Note: You'll need to update your Service constructors to accept these!
        StudentService studentService = new StudentService(studentRepo);
//        Student s1 = new Student("Akash", "Sharma", "Male", "test@gmail.com", "Java18", true);
//        Student s2 = new Student("Vishwas", "Basotra", "Male","rest@gmail.com", "Java18", true);
//        Student s3 = new Student("Chander", "Kumar", "Male","hello@gmail.com", "Java18", true);
//        Student s4 = new Student("Ridhima", "Sharma", "Female","yoo@gmail.com", "JS18", true);
//        Student s5 = new Student("Sakshi", "Sharma", "Female","sakshi@gmail.com", "JS18", true);
//
//        studentList.add(s1);
//        studentList.add(s2);
//        studentList.add(s3);
//        studentList.add(s4);
//        studentList.add(s5);

//        Course c1 = new Course("DSA", "NA", 60, true);
//        Course c2 = new Course("DBMS", "NA", 60,true);
//        Course c3 = new Course("OS", "NA", 60,true);
//        courseList.add(c1);
//        courseList.add(c2);
//        courseList.add(c3);
//
//        Enrollment e1 = new Enrollment(s1, "23/12/2026", "Active");
//        Enrollment e2 = new Enrollment(s2, "11/12/2026", "Active");
//        Enrollment e3 = new Enrollment(s3, "27/12/2026", "Cancelled");
//
//        enrollmentList.add(e1);
//        enrollmentList.add(e2);
//        enrollmentList.add(e3);

        boolean running = true;
        while(running){
            int choice = MenuOptions.displayMainMenu();
            switch (choice){
                case 1:
                    for (int i = 0; i < 50; i++)    System.out.println();//Print 50 new lines
                    System.out.println("-------Student Management-------\n");
                    StudentService.studentManagement(MenuOptions.displayStudentMenu());
                    break;
                case 2:
                    for (int i = 0; i < 50; i++)    System.out.println(); //Print 50 new lines
                    System.out.println("-------Course Management-------\n");
                    CourseService.courseManagement(MenuOptions.displayCourseMenu());
                    break;
                case 3:
                    for (int i = 0; i < 50; i++)    System.out.println(); //Print 50 new lines
                    System.out.println("-------Enrollment Management-------\n");
                    EnrollmentService.enrollmentManagement(MenuOptions.displayEnrollmentMenu());
                    break;
                case 4:
                    System.out.println("Exiting LearnTrack. Goodbye!");
                    running = false; // Graceful exit
                    break;
                default:
                    System.out.println("Invalid Option. Try again.");
            }
        }
    }
}
