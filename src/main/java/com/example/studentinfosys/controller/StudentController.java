package com.example.studentinfosys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.studentinfosys.model.Student;
import com.example.studentinfosys.service.StudentService;

@Controller
public class StudentController {

    @Autowired
    StudentService studentService;

    // To View All Students
    @GetMapping("/viewStudents")
    ModelAndView viewStudents() {
        ModelAndView mav = new ModelAndView("studentList");
        mav.addObject("students", studentService.getStudentList());
        return mav;
    }

    @GetMapping("/addStudent")
    String addStudent(Model model) {
        model.addAttribute("studentDabba", new Student());
        return "student-form";
    }

    @PostMapping("/storeStudent")
    String storeStudent(@ModelAttribute Student student) {
        studentService.addStudent(student);
        return "redirect:studentList";
    }
}