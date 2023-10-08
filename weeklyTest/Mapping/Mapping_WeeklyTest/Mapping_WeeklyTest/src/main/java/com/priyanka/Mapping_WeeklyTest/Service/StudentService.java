package com.priyanka.Mapping_WeeklyTest.Service;


import com.priyanka.Mapping_WeeklyTest.Model.Student;
import com.priyanka.Mapping_WeeklyTest.Repository.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentService {

    @Autowired
    IStudentRepo studentRepo;

    public Iterable<Student> getAllStudent(){

        return studentRepo.findAll();
    }
    public void addStudent(Student student) {
        studentRepo.save(student);

    }

    public String updateStudentAge(Long studentId, String studentAge) {

        if(studentRepo.existsById(studentId)){
            studentRepo.updateStudentAge(studentAge,studentId);
            return "student Age  is Updated";
        }
        else{
            return "student Id does not exist";
        }
    }

    public String deleteStudent(Long studentId){
        if (studentRepo.existsById(studentId)){
            studentRepo.deleteStudent(studentId);
            return "student is deleted";
        }
        else{
            return "student Id does not exists";
        }
    }
}