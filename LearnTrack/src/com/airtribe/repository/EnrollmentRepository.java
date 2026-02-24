package com.airtribe.repository;

import com.airtribe.entity.Enrollment;

import java.util.ArrayList;
import java.util.List;

public class EnrollmentRepository {
    // The list is now private and encapsulated here
    private final List<Enrollment> enrollments = new ArrayList<>();

    public void save(Enrollment enrollment){
        enrollments.add(enrollment);
    }

    public List<Enrollment> findAll(){
        return enrollments;
    }

    public Enrollment findById(int id){
        return enrollments.stream().filter(e -> e.getStudentID() == id).findFirst().orElse(null);
    }
    public boolean deleteById(int id) {
        return enrollments.removeIf(e -> e.getStudentID() == id);
    }
}
