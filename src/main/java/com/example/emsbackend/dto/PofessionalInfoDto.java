package com.example.emsbackend.dto;

import com.example.emsbackend.entity.Employe;
import jakarta.persistence.CascadeType;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PofessionalInfoDto {
    private Long idProfessionalInfo;

    @OneToOne(cascade = CascadeType.ALL , fetch = FetchType.LAZY )
    private Employe employe;
    private Long idEmploye ;
    //Employee Info
    private String employeeStatus;
    private String employeeType;
    private String employeeSubType;
    private String timeType;

    //job info
    //private Position position;
    private String manager;

    //contart info
    private Date startDate;
    private Date endDate;
    private String contractType;
    private String contractNature;
    private int noticePeriod;
    private int trialPeriod;

    // temps travial
    private int weeklyWorkingHours;
    private int monthlyWorkingHours;
    private int yearlyWorkingDays;
    private String timeProfile;

    //area
    private String payrollArea;
    private String payGroup;
    private String payGrade;
    private double basicPay;


}
