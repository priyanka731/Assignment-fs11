package com.priyanka.Mapping_WeeklyTest.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long courseId;
    private String courseTitle;
    private String courseDescription;
    private String courseDuration;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "fk_student_course_table",joinColumns = @JoinColumn(name = "fk_course_id"),
            inverseJoinColumns = @JoinColumn(name = "fk_student_id"))
    List<Student> studentList;
}