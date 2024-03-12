package com.example.emsbackend.service;

import com.example.emsbackend.dto.PofessionalInfoDto;

import java.util.List;

public interface ProfessionalInfoService {
    PofessionalInfoDto createProfessionalInfo(PofessionalInfoDto professionalInfoDto);

    PofessionalInfoDto getProfessionalInfoById(Long professionalInfoId);

    List<PofessionalInfoDto> getAllProfessionalInfo();

    PofessionalInfoDto updateProfessionalInfo(Long professionalInfoId, PofessionalInfoDto updateProfessionalInfoDto);

    void deleteProfessionalInfo(Long professionalInfoId);
}
