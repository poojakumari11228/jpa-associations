package com.jpa.associations.repo;

import com.jpa.associations.entity.Course;
import com.jpa.associations.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {

//    @Query("Select s.courses from Student s where s.name=:name")
//    List<Course> findCoursesByName(@Param("name") String name);

//    @Query("SELECT s.courses FROM Student s WHERE s.name=:name")
//    List<Course> findCoursesByName(@Param("name") String name);


    List<Student> findByName(String name);
    List<Student> findByGpaGreaterThanEqual(double gpa);

    List<Student> findByCoursesCourseDetailsProgramAndGpaLessThan(String program, double gpa);
}
