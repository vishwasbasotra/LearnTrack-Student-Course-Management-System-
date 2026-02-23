package com.airtribe.repository;

import com.airtribe.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    // The list is now private and encapsulated here
    private final List<Student> students = new ArrayList<>();

    public void save(Student student){
        students.add(student);
    }

    public List<Student> findAll(){
        return students;
    }

    public Student findById(int id){
        return students.stream().filter(s -> s.getStudentID() == id).findFirst().orElse(null);
    }
    public boolean deleteById(int id) {
        return students.removeIf(s -> s.getStudentID() == id);
    }
}
