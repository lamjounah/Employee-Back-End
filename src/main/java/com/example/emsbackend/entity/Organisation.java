//package com.example.emsbackend.entity;
//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import java.util.List;
//@AllArgsConstructor
//@NoArgsConstructor
//@Data
//@Entity
//@Table (name = "Organisation")
//public class Organisation {
//
////    @Id
////    @GeneratedValue(strategy = GenerationType.IDENTITY)
////    private Long id;
//    private String name;
//
//    @OneToMany(mappedBy = "organisation", cascade = CascadeType.ALL)
//        private List<PersonalInfo> employes ;
//
//
//}
