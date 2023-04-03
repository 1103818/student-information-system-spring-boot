package com.example.studentinfosys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.studentinfosys.model.Student;
import com.example.studentinfosys.service.StudentService;

import jakarta.validation.Valid;

@Controller
public class StudentController {

    @Autowired
    StudentService studentService;

    // To View All Students
    @GetMapping("/students")
    String viewStudents(Model model) {
        model.addAttribute("students", studentService.getStudentList());
        return "studentList";
    }

    @GetMapping("/new-student")
    String addStudent(Model model) {
        model.addAttribute("student", new Student());
        return "student-form";
    }

    @PostMapping("/students")
    String storeStudent(@Valid @ModelAttribute Student student, Errors errors) {
        if (errors.hasErrors()) {
            return "student-form";
        }
        studentService.addStudent(student);
        return "redirect:/students";
    }
}