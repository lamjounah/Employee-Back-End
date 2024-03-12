//package com.example.emsbackend.service;
//
//import com.example.emsbackend.entity.Organisation;
//import com.example.emsbackend.repository.OrganisationRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class OrganisationServiceImp  implements  OrganisationService {
//    @Autowired
//    private OrganisationRepository organisationRepository;
//
//    @Override
//    public Organisation createOrganisation(Organisation organisation) {
//        if (organisation.getId() != null && organisationRepository.existsById(organisation.getId())) {
//            throw new RuntimeException("L'organisation avec l'identifiant " + organisation.getId() + " existe déjà.");
//        }
//
//        // Autres validations et logique métier peuvent être ajoutées ici
//
//        // Enregistrez l'organisation dans la base de données
//        return organisationRepository.save(organisation);    }
//}
