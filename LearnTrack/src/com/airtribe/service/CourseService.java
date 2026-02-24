package com.airtribe.service;

import com.airtribe.entity.Course;
import com.airtribe.exception.EntityNotFoundException;
import com.airtribe.repository.CourseRepository;
import com.airtribe.ui.Main;
import com.airtribe.util.Inputvalidator;

import java.util.Scanner;

public class CourseService {
    private static Scanner sc = new Scanner(System.in);
    private static CourseRepository courseRepo = new CourseRepository();

    // Constructor: Dependency Injection
    public CourseService(CourseRepository courseRepo){
        CourseService.courseRepo = courseRepo;
    }

    public static void courseManagement(int option){
        switch (option){
            case 1:
                for (int i = 0; i < 50; i++) System.out.println(); //Print 50 new lines
                Course newCourse = addCourse();
                courseRepo.save(newCourse);
                System.out.println("\n-------Course Added Successfully-------");
                courseRepo.findAll().forEach(Course::displayCourseDetails);
                break;
            case 2:
                for (int i = 0; i < 50; i++) System.out.println(); //Print 50 new lines
                System.out.println("-------List of all the Courses-------\n");
                courseRepo.findAll().forEach(Course::displayCourseDetails);
                break;
            case 3:
                for (int i = 0; i < 50; i++) System.out.println(); //Print 50 new lines
                System.out.println("\n-------Activate/Deactivate a course by ID-------");
                System.out.print("\nEnter 'act' or 'deact' to activate/deactivate a course: ");
                String changeStatus = Inputvalidator.validateCourseStatus(sc.next());

                System.out.print("Enter Course ID starting from 101: ");
                int id = Inputvalidator.validateCourseID(sc.nextInt());
                boolean flag = false;

                for(Course c: courseRepo.findAll()){
                    if(c.getCourseID() == id){
                        if (changeStatus.equals("act")) c.setActive(true);
                        else c.setActive(false);
                        c.displayCourseDetails();
                        flag = true;
                        break; // Optimization: Stop looking once you find the course
                    }
                }
                if(!flag) EntityNotFoundException.courseNotFound();
                break;
            case 4:
                return;
        }
    }

    public static Course addCourse(){
        System.out.println("-------Enter Course Details-------\n");
        System.out.print("Enter Course Name: ");
        String courseName = Inputvalidator.setCourseName(sc.next());

        System.out.print("Enter Description: ");
        String description = Inputvalidator.setDescription(sc.next());

        System.out.print("Enter Duration in Weeks: ");
        int durationInWeeks = Inputvalidator.setDuration(sc.nextInt());

        System.out.print("Is the course currently Active? (yes/no): ");
        String active = sc.next();

        // Logical Conversion: If they type "yes", status becomes true
        boolean status = active.equalsIgnoreCase("yes");

        return new Course(courseName, description, durationInWeeks, status);
    }

}

