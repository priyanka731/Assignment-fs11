package com.Priyanka.JobSearchPortal.service;

import com.Priyanka.JobSearchPortal.entity.Job;
import com.Priyanka.JobSearchPortal.repository.IJobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Scanner;
@Service
public class JobService {
    @Autowired
    IJobRepo jobRepo;

    // Using Crud Repo

    public Iterable<Job> getAllJobs() {
        return jobRepo.findAll();
    }

    public Job getJobsById(Long jobId) {
        Optional<Job> optional= jobRepo.findById(jobId);
        if(optional.isPresent()){
            return optional.get();
        }
        return null;
    }

    public String addJob(Job job) {
        jobRepo.save(job);
        return"Job Added";
    }

    // Custom Finder

    public Iterable<Job>  getJobsByTitle(String title) {
        return jobRepo.getJobsByTitle(title);
    }

    public Iterable<Job> getJobsByDescription (String description){
        return jobRepo.getJobsByDescription(description);
    }

    public Iterable<Job> getJobsByLocation(String location) {
        return jobRepo.getJobsByLocation(location);
    }

    // Custom Query for Update and Delete Apis

    public String updateJob(Long jobId, Double salary) {

        if(jobRepo.existsById(jobId)){
            jobRepo.updateJobSalary(salary,jobId);
            return "Job Salary is Updated";
        }
        else{
            return "Job Id does not exist";
        }
    }

    public String deleteJob(Long jobId) {
        if(jobRepo.existsById(jobId)){
            jobRepo.deleteJob(jobId);
            return "Job id deleted";
        }
        else{
            return "Job Id does not exist";
        }
    }


}