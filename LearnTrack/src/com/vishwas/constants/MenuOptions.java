package com.vishwas.constants;

import java.util.Scanner;

public class MenuOptions {
    static Scanner sc = new Scanner(System.in);

//    public static void tryAgain(){
//        System.out.println("You want to try again? Enter y for 'Yes' and n for 'No'");
//        char input = sc.next().charAt(0);
//        if(input == 'y' || input == 'Y')    displayMainMenu();
//        else return 0;
//    }
    public static int displayMainMenu(){
        System.out.println("Learner Track: Student & Course Management");
        System.out.println("------------------Menu--------------------");
        System.out.println("1. Student Management");
        System.out.println("2. Course Management");
        System.out.println("3. Enrollment Management");
        System.out.println("4. Exit");
        System.out.print("\nEnter 1-4 to select: ");
        return sc.nextInt();
    }

    public static int displayStudentMenu() {
        System.out.println("1. Add new student");
        System.out.println("2. View all students");
        System.out.println("3. Search student by ID");
        System.out.println("4. Deactivate a student");
        System.out.print("\nEnter 1-4 to select: ");
        return sc.nextInt();
    }

    public static int displayCourseMenu() {
        System.out.println("1. Add new course");
        System.out.println("2. View all courses");
        System.out.println("3. Activate/Deactivate a course");
        System.out.print("\nEnter 1-3 to select: ");
        return sc.nextInt();
    }

    public static int displayEnrollmentMenu() {
        System.out.println("1. Enroll a student in a course");
        System.out.println("2. View enrollments for a student");
        System.out.println("3. Mark enrollment as completed/cancelled");
        System.out.print("\nEnter 1-3 to select: ");
        return sc.nextInt();
    }
}
