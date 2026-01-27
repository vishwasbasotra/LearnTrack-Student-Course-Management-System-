package com.vishwas.ui;

import com.vishwas.constants.MenuOptions;
import com.vishwas.entity.Course;
import com.vishwas.entity.Enrollment;
import com.vishwas.entity.Person;
import com.vishwas.entity.Student;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    static void main(String[] args) {
        int selectedMainMenuOption, selectedStudentMenuOption, selectedCourseMenuOption, selectedEnrollmentMenuOption;
        ArrayList<Student> studentList = new ArrayList<>();
        Student s1 = new Student("Akash", "Sharma", "Male", "test@gmail.com", "Java18", true);
        Student s2 = new Student("Vishwas", "Basotra", "Male","rest@gmail.com", "Java18", true);
        Student s3 = new Student("Chander", "Kumar", "Male","hello@gmail.com", "Java18", true);
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        //studentList.add(new Student("Vishwas", "Basotra", "rest@gmail.com", "Java18", true));
        
        for(Student s: studentList){
            s.displayStudentDetails();
        }

        Person.getPopulation();
        ArrayList<Course> courseList = new ArrayList<>();
        Course c1 = new Course("DSA", "NA", 60, true);
        Course c2 = new Course("DBMS", "NA", 60,true);
        Course c3 = new Course("OS", "NA", 60,true);
        courseList.add(c1);
        courseList.add(c2);
        courseList.add(c3);
        for(Course s: courseList){
            s.displayCourseDetails();
        }

        ArrayList<Enrollment> enrollmentList = new ArrayList<>();
        Enrollment e1 = new Enrollment(s1, "12/12/2026", true);
        Enrollment e2 = new Enrollment(s2, "12/12/2026", true);
        Enrollment e3 = new Enrollment(s3, "12/12/2026", true);
        enrollmentList.add(e1);
        enrollmentList.add(e2);
        enrollmentList.add(e3);
        //studentList.add(new Student("Vishwas", "Basotra", "rest@gmail.com", "Java18", true));

        for(Enrollment e: enrollmentList){
            e.displayEnrollmentDetails();
        }
        //        while(true){
//            selectedMainMenuOption = MenuOptions.displayMainMenu();
//            switch (selectedMainMenuOption){
//                case 1:
//
//                case 2:
//
//                case 3:
//
//                case 4:
//                    System.out.println("Thank You!!!");
//                    return;
//                default:
//                    System.out.println("\nSelected option is invalid.");
//                    MenuOptions.tryAgain();
//                    for (int i = 0; i < 50; i++)    System.out.println(); //Print 50 new lines
//                    //CustomExceptions.invalidInput();
//            }
//        }
    }
}
