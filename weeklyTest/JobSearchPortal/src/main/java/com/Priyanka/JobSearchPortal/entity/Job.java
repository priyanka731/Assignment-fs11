package com.Priyanka.JobSearchPortal.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Job {

        @Id
        private long jobId;

        @NotBlank(message = "Title")
        private String title;

        @NotBlank(message = "Description")
        private String description;

        @NotBlank(message = "Location ")
        private String location;

        @Min(value = 20000)
        private Double salary;

        @Email
        private String companyEmail;

        @Pattern(regexp = "[A-Z][a-zA-z0-9 ]*")
        private String companyName;

        @Pattern(regexp = "[A-Z][a-zA-z0-9 ]*")
        private String employerName;

        @Enumerated(EnumType.STRING)
        private JobType jobType;
        private LocalDate appliedDate;
    }
