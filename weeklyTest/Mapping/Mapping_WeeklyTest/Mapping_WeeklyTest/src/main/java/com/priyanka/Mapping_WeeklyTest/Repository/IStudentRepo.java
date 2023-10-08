package com.priyanka.Mapping_WeeklyTest.Repository;

import com.priyanka.Mapping_WeeklyTest.Model.Student;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepo extends JpaRepository<Student,Long> {
    @Transactional
    @Modifying
    @Query("delete from Student where studentId=:studentId")
    public void deleteStudent(@Param("studentId") Long studentId);

    @Transactional
    @Modifying
    @Query("update Student set studentAge =:studentAge where studentId = :studentId")
    public void updateStudentAge(@Param("studentAge") String studentAge, @Param("studentId") Long studentId);
}
