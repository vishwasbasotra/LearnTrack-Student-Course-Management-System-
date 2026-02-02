package com.vishwas.service;

import com.vishwas.entity.Course;
import com.vishwas.entity.Student;
import com.vishwas.exception.EntityNotFoundException;
import com.vishwas.ui.Main;
import com.vishwas.exception.CustomException;
import com.vishwas.util.Inputvalidator;

import java.util.Scanner;

public class CourseService extends Main {
    static Scanner sc = new Scanner(System.in);
    static String courseName, description;
    private static String active;
    static int id, durationInWeeks;
    static boolean flag;

    public static void courseManagement(int option){
        switch (option){
            case 1:
                for (int i = 0; i < 50; i++) System.out.println(); //Print 50 new lines
                courseList.add(addCourse());
                System.out.println("\n-------Course Added Successfully-------");
                courseList.getLast().displayCourseDetails();
                return;
            case 2:
                for (int i = 0; i < 50; i++) System.out.println(); //Print 50 new lines
                for(Course c: courseList){
                    c.displayCourseDetails();
                }
                return;
            case 3:
                for (int i = 0; i < 50; i++) System.out.println(); //Print 50 new lines
                System.out.println("\n-------Activate/Deactivate a course by ID-------");
                System.out.print("Enter Course ID Starting 101 to ... : ");
                id = Inputvalidator.validateCourseID(sc.nextInt());
                flag = false;
                for(Course c: courseList){
                    if(c.getCourseID() == id){
                        c.setActive(false);
                        c.displayCourseDetails();
                        flag = true;
                    }
                }
                if(!flag) EntityNotFoundException.courseNotFound();
                return;
            case 4:
                System.out.println("Thank You!!!");
                return;
            default:
                CustomException.invalidInput();
        }
    }

    public static Course addCourse(){
        System.out.println("-------Enter Course Details-------\n");
        System.out.print("Enter Course Name: ");
        courseName = Inputvalidator.setCourseName(sc.next());

        System.out.print("Enter Description: ");
        description = Inputvalidator.setDescription(sc.next());

        System.out.print("Enter Duration in Weeks: ");
        durationInWeeks = Inputvalidator.setDuration(sc.nextInt());

        System.out.print("Is the course currently Active? (yes/no): ");
        active = sc.next();

        // Logical Conversion: If they type "yes", status becomes true
        boolean status = active.equalsIgnoreCase("yes");

        return new Course(courseName, description, durationInWeeks, status);
    }

}

