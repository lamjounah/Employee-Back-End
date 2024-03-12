package com.example.emsbackend.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "personal_info")
public class PersonalInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPersonalInfo;

    @JoinColumn(name = "employee_id" , referencedColumnName = "id")
    private Long idEmploye ;
    @OneToOne(cascade = CascadeType.ALL , fetch = FetchType.LAZY )
    @JsonIgnore
    private Employe employe;

    // Personal Data

    @Column(name = "middle_name") private String middleName;
    @Column(name = "gender") private String gender;
    @Column(name = "marital_status")@Temporal(TemporalType.DATE) private String maritalStatus;
    @Column(name = "date_of_birth") private Date dateOfBirth;
    @Column(name = "nationality_1") private String nationality1;
    @Column(name = "nationality_2") private String nationality2;
    @Column(name = "social_security_number") private String socialSecurityNumber;


    // Address Data
    @Column(name = "address_type") private String addressType;
    @Column(name = "address_line_1") private String addressLine1;
    @Column(name = "address_line_2") private String addressLine2;
    @Column(name = "postal_code") private String postalCode;
    @Column(name = "city") private String city;
    @Column(name = "region") private String region;
    @Column(name = "country") private String country;


    // Contact Data
    @Column(name = "phone_type") private String phoneType;
    @Column(name = "country_code") private String phoneCountryCode;
    @Column(name = "phone_number") private String phoneNumber;
    @Column(name = "email_type") private String emailType;
    @Column(name = "email") private String email;

    // Bank Account Data
    @Column(name = "bank_account_type") private String bankAccountType;
    @Column(name = "bank_name") private String bankName;
    @Column(name = "agency") private String agency;
    @Column(name = "iban") private String iban;
    @Column(name = "bic") private String bic;


    // Emergency Contact
    @Column(name = "emergency_contact_full_name") private String emergencyContactFullName;
    @Column(name = "emergency_contact_phone_number") private String emergencyContactPhoneNumber;
    @Column(name = "emergency_contact_relationship_type") private String emergencyContactRelationshipType;
}
