package com.vishwas;

import com.vishwas.entity.Student;

public class Main {
    static void main(String[] args) {
        Student s = new Student("Akash", "Sharma", "test@gmail.com", "Java18", true);
        s.displayStudentDetails();
    }
}
