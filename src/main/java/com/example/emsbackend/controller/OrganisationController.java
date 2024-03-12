//package com.example.emsbackend.controller;
//
//import com.example.emsbackend.entity.Organisation;
//import com.example.emsbackend.service.OrganisationService;
//import lombok.AllArgsConstructor;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@CrossOrigin("*")
//@RestController
//@RequestMapping("/api/organisations")
//public class OrganisationController {
//
//
//    private final OrganisationService organisationService;
//
//    public OrganisationController(OrganisationService organisationService) {
//        this.organisationService = organisationService;
//    }
//
//    @PostMapping
//    public ResponseEntity<Organisation> createOrganisation(@RequestBody Organisation organisation) {
//        Organisation createdOrganisation = organisationService.createOrganisation(organisation);
//        return new ResponseEntity<>(createdOrganisation, HttpStatus.CREATED);
//    }
//}
