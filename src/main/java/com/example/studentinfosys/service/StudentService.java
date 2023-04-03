package com.example.studentinfosys.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.studentinfosys.model.Student;

@Service
public class StudentService {
    List<Student> studentList = new ArrayList<Student>();

    public List<Student> getStudentList() {
        return studentList;
    }

    public void addStudent(Student student) {
        student.setId(studentList.size() + 1);
        studentList.add(student);
    }
}