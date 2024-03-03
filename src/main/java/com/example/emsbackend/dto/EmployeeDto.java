package com.example.emsbackend.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;

import javax.validation.constraints.Size;
import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {
    private  Long id ;
    private  String firstName;
    private  String lastName;
    private  String email;
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;
    private String socialSecurityCode;
    private String gender;
    private String socialStatus;
    private String address;
    private String country;
    private String region;
    private String city;
    private String numberRoute;
    private String postalCode;
    private String phoneNumber;
    private String postalAddress;
    private String bankName;
    private String accountNumber;
    @Temporal(TemporalType.DATE)
    private Date expirationDate;
    @Size(min = 3, max = 4)
    private String cvv;
}
