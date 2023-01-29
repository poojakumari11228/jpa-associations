package com.jpa.associations.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "course_details")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CourseDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long descriptionId;
    private String name;

    private String program;

    @OneToOne
    @JoinColumn(name = "course_id")
    @JsonIgnore
    Course course;




}
