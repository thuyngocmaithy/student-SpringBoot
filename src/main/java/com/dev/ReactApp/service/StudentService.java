package com.dev.ReactApp.service;

import java.util.List;
import com.dev.ReactApp.model.Student;

public interface StudentService {
     public Student saveStudent(Student student);
    public List<Student> getAllStudents();
    
}
