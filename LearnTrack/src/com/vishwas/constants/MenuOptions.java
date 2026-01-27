package com.vishwas.constants;

import java.util.Scanner;

public class MenuOptions {
    static Scanner sc = new Scanner(System.in);
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

    public static void displayStudentMenu() {
    }

    public static void displayCourseMenu() {
    }

    public static void displayEnrollmentMenu() {
    }
}
