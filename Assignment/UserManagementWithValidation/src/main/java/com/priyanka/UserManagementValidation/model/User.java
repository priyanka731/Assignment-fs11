package com.priyanka.UserManagementValidation.model;


import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

@NotNull
    private Integer userId;

    @NotBlank
    private String userName;

    private LocalDateTime userDOB;

    @Email
    private String email;

    @Size(min=10,max=10)
    @Pattern(regexp = "^[0-9]+$", message = "contacts should be just numbers!!")
    private String phoneNumber;


    private LocalDate Date;

    private LocalTime Time;



}
