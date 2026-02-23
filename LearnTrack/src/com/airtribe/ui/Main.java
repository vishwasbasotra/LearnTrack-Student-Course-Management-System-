package com.airtribe.ui;

import com.airtribe.constants.MenuOptions;
//import com.airtribe.entity.Enrollment;
import com.airtribe.entity.Course;
import com.airtribe.entity.Enrollment;
import com.airtribe.entity.Student;
import com.airtribe.enums.EnrollmentStatus;
import com.airtribe.repository.EnrollmentRepository;
import com.airtribe.repository.StudentRepository;
import com.airtribe.repository.CourseRepository;
import com.airtribe.service.CourseService;
//import com.airtribe.service.EnrollmentService;
import com.airtribe.service.EnrollmentService;
import com.airtribe.service.StudentService;

public class Main {
    public static void main(String[] args) {
        // 1. Initialize Repositories (The new Data Layer)

        StudentRepository studentRepo = new StudentRepository();
        CourseRepository courseRepo = new CourseRepository();
        EnrollmentRepository enrollmentRepo = new EnrollmentRepository();

        // 2. Seed Data (Pre-loading records)
        studentRepo.save(new Student("Akash", "Sharma", "Male", "test@gmail.com", "Java18", true));
        studentRepo.save(new Student("Vishwas", "Basotra", "Male", "rest@gmail.com", "Java18", true));
        studentRepo.save(new Student("Chander", "Kumar", "Male", "hello@gmail.com", "Java18", true));
        studentRepo.save(new Student("Ridhima", "Sharma", "Female", "yoo@gmail.com", "JS18", true));
        studentRepo.save(new Student("Sakshi", "Sharma", "Female", "sakshi@gmail.com", "JS18", true));

        courseRepo.save(new Course("DSA", "NA", 60, true));
        courseRepo.save(new Course("DBMS", "NA", 60,true));
        courseRepo.save(new Course("OS", "NA", 60,true));

        enrollmentRepo.save(new Enrollment(studentRepo.findAll().get(0), "23/12/2026", EnrollmentStatus.fromString("Active")));
        enrollmentRepo.save(new Enrollment(studentRepo.findAll().get(1), "11/12/2026", EnrollmentStatus.fromString("Active")));
        enrollmentRepo.save(new Enrollment(studentRepo.findAll().get(2), "27/12/2026", EnrollmentStatus.fromString("Cancelled")));

        // 3. Initialize Services with the repositories that now have data
        StudentService studentService = new StudentService(studentRepo);
        CourseService courseService = new CourseService(courseRepo);
        EnrollmentService enrollmentService = new EnrollmentService(enrollmentRepo);

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
