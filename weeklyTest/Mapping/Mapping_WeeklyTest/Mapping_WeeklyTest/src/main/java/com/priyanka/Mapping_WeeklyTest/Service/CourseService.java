package com.priyanka.Mapping_WeeklyTest.Service;

import com.priyanka.Mapping_WeeklyTest.Model.Course;
import com.priyanka.Mapping_WeeklyTest.Repository.ICourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    ICourseRepo courseRepo;
    public Iterable<Course> getAllCourse(){

        return courseRepo.findAll();
    }
    public void addCourse(Course course) {
        courseRepo.save(course);

    }

    public String updateCourseTitle(Long courseId, String courseTitle) {

        if(courseRepo.existsById(courseId)){
            courseRepo.updateCourseTitle(courseTitle,courseId);
            return "course title  is Updated";
        }
        else{
            return "course Id does not exist";
        }
    }

    public String deleteCourse(Long courseId){
        if (courseRepo.existsById(courseId)){
            courseRepo.deleteCourse(courseId);
            return "course is deleted";
        }
        else{
            return "course Id does not exists";
        }
    }
}