package com.example.emsbackend.dto;

import com.example.emsbackend.entity.Employe;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonalInfoDto {

    //info pesonnel
    private Long idPer;
    private Long idEmploye ;
    @OneToOne(cascade = CascadeType.ALL , fetch = FetchType.LAZY )
    private Employe employe;
    private String middleName;
    private String gender;
    private String maritalStatus;
    private Date dateOfBirth;
    private String nationality1;
    private String nationality2;
    private String socialSecurityNumber;

    //info adress
    private String addressType;
    private String addressLine1;
    private String addressLine2;
    private String postalCode;
    private String city;
    private String region;
    private String country;

    //info  contact
    private String phoneType;
    private String phoneCountryCode;
    private String phoneNumber;
    private String emailType;
    private String email;

    //info banch
    private String bankAccountType;
    private String bankName;
    private String agency;
    private String iban;
    private String bic;

    // info urgence
    private String emergencyContactFullName;
    private String emergencyContactPhoneNumber;
    private String emergencyContactRelationshipType;

}
