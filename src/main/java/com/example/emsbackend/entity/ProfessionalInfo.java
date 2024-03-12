package com.example.emsbackend.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "professional_info")
public class ProfessionalInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProfessionalInfo;

    @JoinColumn(name = "employee_id" , referencedColumnName = "id")
    private Long idEmploye ;
    @OneToOne(cascade = CascadeType.ALL ,fetch = FetchType.LAZY)
    @JsonIgnore
    private Employe employe;


    //Employee Info
    @Column(name = "employee_status") private String employeeStatus;
    @Column(name = "employee_type") private String employeeType;
    @Column(name = "employee_sub_type") private String employeeSubType;
    @Column(name = "time_type") private String timeType;


    //job info
    // @ManyToOne
    //@JoinColumn(name = "position_id")
    //private Position position; // Utilisation d'une référence à l'entité Position
    @Column(name = "manager")         private String manager;

     //contract info
    @Column(name = "start_date")      private Date startDate;
    @Column(name = "end_date")        private Date endDate;
    @Column(name = "contract_type")   private String contractType;
    @Column(name = "contract_nature") private String contractNature;
    @Column(name = "notice_period")   private int noticePeriod;
    @Column(name = "trial_period")    private int trialPeriod;


    //time info
    @Column(name = "weekly_working_hours") private int weeklyWorkingHours;
    @Column(name = "monthly_working_hours") private int monthlyWorkingHours;
    @Column(name = "yearly_working_days") private int yearlyWorkingDays;
    @Column(name = "time_profile") private String timeProfile;


    //payroll info
    @Column(name = "payroll_area") private String payrollArea;
    @Column(name = "pay_group") private String payGroup;
    @Column(name = "pay_grade") private String payGrade;
    @Column(name = "basic_pay") private double basicPay;

//    @ManyToOne
//    @JoinColumn(name = "organisation_id")
//
//    private Organisation organisation;


}
