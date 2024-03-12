package com.example.emsbackend.repository;

import com.example.emsbackend.entity.PersonalInfo;
import com.example.emsbackend.entity.ProfessionalInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProfessionalInfoRepository extends JpaRepository<ProfessionalInfo,Long> {



}
