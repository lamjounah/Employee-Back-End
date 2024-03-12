package com.example.emsbackend.repository;

import com.example.emsbackend.entity.PersonalInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface PersonalInfoRepository extends JpaRepository<PersonalInfo,Long> {


   // List<PersonalInfo> findByOrganisationId(Long organisationId);

}
