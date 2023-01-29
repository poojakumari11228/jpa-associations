package com.jpa.associations.service.impl;

import com.jpa.associations.entity.Course;
import com.jpa.associations.entity.Student;
import com.jpa.associations.repo.StudentRepo;
import com.jpa.associations.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepo studentRepo;

    @Override
    public List<Course> getCoursesByStudentName(String name) {

        List<Student> student = studentRepo.findByName(name);
        List<Course> result = new ArrayList<>();
        for (Student s : student) {
            result.addAll(s.getCourses());
        }

        return result;
    }

    @Override
    public List<Student> findByGpaGreaterThanEqual(double gpa) {
        return studentRepo.findByGpaGreaterThanEqual(gpa);
    }

    @Override
    public List<Student> findByCourseProgramAndGpaLessThan(String program, double gpa) {
        return studentRepo.findByCoursesCourseDetailsProgramAndGpaLessThan(program, gpa);
    }
}
