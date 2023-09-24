package com.Priyanka.JobSearchPortal.controller;

import com.Priyanka.JobSearchPortal.entity.Job;
import com.Priyanka.JobSearchPortal.service.JobService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class JobController {
    @Autowired
    JobService jobService;

    @GetMapping("jobs")
    public Iterable<Job> getAllJobs (){
        return jobService.getAllJobs();
    }
    @GetMapping("job/search")
    public Job getJobsById (@RequestParam("id") Long jobId){

        return jobService.getJobsById(jobId);
    }
    @PostMapping("job")
    public String addJob (@RequestBody @Valid Job job)
    {
        return jobService.addJob(job);
    }

    // Custom Finder
    @GetMapping("jobs/search/by")

    public Iterable<Job>  getJobsByTitle (@RequestParam("title") String title){
        return jobService.getJobsByTitle(title);
    }

    @GetMapping("jobs/search/with")
    public Iterable<Job> getJobsByDescription (@RequestParam("description") String description){
        return jobService.getJobsByDescription(description);
    }

    @GetMapping("jobs/search/on")
    public Iterable<Job> getJobsByLocation (@RequestParam("location") String location){
        return jobService.getJobsByLocation(location);
    }

    // Custom Query for Update and Delete Apis

    @PutMapping("job/update/of")
    public String updateJob ( @RequestParam("id") Long jobId ,@RequestParam("salary") Double salary){
        return jobService.updateJob(jobId,salary);
    }

    @DeleteMapping ("job/delete/of")
    public String deleteJob (@RequestParam("id") Long jobId ){
        return jobService.deleteJob(jobId);
    }



}