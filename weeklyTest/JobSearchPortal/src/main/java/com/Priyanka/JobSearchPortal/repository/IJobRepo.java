package com.Priyanka.JobSearchPortal.repository;

import com.Priyanka.JobSearchPortal.entity.Job;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IJobRepo extends CrudRepository<Job,Long> {


    // using Custom Finder for get jos by title and description
    Iterable<Job> getJobsByTitle(String title); //Custom finder for Get Jobs By Title

    Iterable<Job> getJobsByDescription(String description); //Custom finder for Get Jobs By Description

    Iterable<Job> getJobsByLocation(String location); //Custom finder for Get Jobs By Location


    // using Query for Update and delete

    @Transactional
    @Modifying
    @Query("delete from Job where jobId=:jobId")
    public void deleteJob(@Param("jobId") Long jobId);

    @Transactional
    @Modifying
//    @Query(value = "update Job set salary = ? where jobId = ?", nativeQuery = true)
    @Query("update Job set salary = :salary where jobId = :jobId")
    public void updateJobSalary( @Param("salary") Double salary,@Param("jobId") Long jobId);



}