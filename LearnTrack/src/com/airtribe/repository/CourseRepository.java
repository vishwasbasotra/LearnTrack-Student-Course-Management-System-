package com.airtribe.repository;

import com.airtribe.entity.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseRepository {
    // The list is now private and encapsulated here
    private final List<Course> courses = new ArrayList<>();

    public void save(Course course){
        courses.add(course);
    }

    public List<Course> findAll(){
        return courses;
    }

    public Course findById(int id){
        return courses.stream().filter(c -> c.getCourseID() == id).findFirst().orElse(null);
    }
    public boolean deleteById(int id) {
        return courses.removeIf(c -> c.getCourseID() == id);
    }
}
