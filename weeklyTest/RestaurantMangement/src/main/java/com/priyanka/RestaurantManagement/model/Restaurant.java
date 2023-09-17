package com.priyanka.RestaurantManagement.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Restaurant {
    @NonNull
    private Integer restaurantId;
    @NotBlank
    @Pattern(regexp = "^[a-zA-Z ]+$")
    private String restaurantName;

    private String restaurantAddress;
    @Size(min=12,max=12)
    @Pattern (regexp="91[0-9]+",message="Enter a valid Phone Number")
    private String restaurantContact;

    @Email(message ="Enter valid Email")
    private String restaurantEmail;
    private String restaurantSpecialty;

    private String restaurantStaffs;

}
