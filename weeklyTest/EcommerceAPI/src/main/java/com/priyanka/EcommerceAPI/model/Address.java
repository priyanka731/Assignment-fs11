package com.priyanka.EcommerceAPI.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer addressId;
    private String  addressName;
    private String addressLandmark;
    private String  addressZipCode;
    private String  addressPhoneNumber;
    private String  addressState;

   @ManyToOne
   @JoinColumn(name = "fk_userId")
   Users users;

}