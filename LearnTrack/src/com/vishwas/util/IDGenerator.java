package com.vishwas.util;

public class IDGenerator {
    public static int generateStudentID(String name){
        if(name == null)    return 0;
        return name.hashCode();
    }
    public static int generateCourseID(String courseName){
        if(courseName == null)    return 0;
        return courseName.hashCode();
    }
    public static int generateEnrollmentID(String name){
        if(name == null)    return 0;
        return name.hashCode();
    }
}
