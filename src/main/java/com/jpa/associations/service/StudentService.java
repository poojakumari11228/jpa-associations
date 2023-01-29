package com.jpa.associations.service;

import com.jpa.associations.entity.Course;
import com.jpa.associations.entity.Student;

import java.util.List;

public interface StudentService {
     List<Course> getCoursesByStudentName(String name);

     List<Student> findByGpaGreaterThanEqual(double gpa);

     List<Student> findByCourseProgramAndGpaLessThan(String program, double gpa);
}
