package com.jpa.associations.controller;

import com.jpa.associations.entity.Course;
import com.jpa.associations.entity.Student;
import com.jpa.associations.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api/v1/student")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/{name}/courses")
    public List<Course> getCoursesByStudentName(@PathVariable String name) {
        return studentService.getCoursesByStudentName(name);
    }

    @GetMapping("/filter")
    public List<Student> findByGpaGreaterThanEqual(@RequestParam("gpa") double gpa) {
        return studentService.findByGpaGreaterThanEqual(gpa);
    }

    @GetMapping("/course/{program}/{gpa}")
    public List<Student> findByCourseProgramGpaLessThanEqual(@PathVariable("program") String program, @PathVariable("gpa") double gpa) {
        return studentService.findByCourseProgramAndGpaLessThan(program, gpa);
    }
}