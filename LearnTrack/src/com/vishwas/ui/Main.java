package com.vishwas.ui;

import com.vishwas.constants.MenuOptions;
import com.vishwas.entity.Student;

public class Main {
    static void main(String[] args) {
        int selectedMainMenuOption, selectedStudentMenuOption, selectedCourseMenuOption, selectedEnrollmentMenuOption;
        Student s = new Student("Akash", "Sharma", "test@gmail.com", "Java18", true);

        selectedMainMenuOption = MenuOptions.displayMainMenu();
        while(true){
            switch (selectedMainMenuOption){
                case 1:

                case 2:

                case 3:

                case 4:
                    System.out.println("Thank You!!!");
                    return;
                default:
                    System.out.println("\nSelected option is invalid, please select again");
                    System.out.flush();

                    MenuOptions.displayMainMenu();
                    //throw new IllegalArgumentException("Invalid option selected");
            }
        }
    }
}
