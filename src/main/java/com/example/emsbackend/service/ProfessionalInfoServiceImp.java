package com.example.emsbackend.service;

import com.example.emsbackend.dto.PofessionalInfoDto;
import com.example.emsbackend.entity.ProfessionalInfo;
import com.example.emsbackend.exception.ResourceNotFoundExeption;
import com.example.emsbackend.mappers.ProfessionalInfoMapper;
import com.example.emsbackend.repository.ProfessionalInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProfessionalInfoServiceImp implements ProfessionalInfoService{

    @Autowired
    private ProfessionalInfoRepository professionalInfoRepository;

    @Override
    public PofessionalInfoDto createProfessionalInfo(PofessionalInfoDto professionalInfoDto) {

        ProfessionalInfo professionalInfo = ProfessionalInfoMapper.mapToProfessionalInfo(professionalInfoDto);
        ProfessionalInfo savedProfessionalInfo = professionalInfoRepository.save(professionalInfo);
        return ProfessionalInfoMapper.mapToProfessionalInfoDto(savedProfessionalInfo);

    }

    @Override
    public PofessionalInfoDto getProfessionalInfoById(Long professionalInfoId) {
        ProfessionalInfo professionalInfo = professionalInfoRepository.findById(professionalInfoId)
                .orElseThrow(() -> new ResourceNotFoundExeption("ProfessionalInfo not found with id: " + professionalInfoId));
        return ProfessionalInfoMapper.mapToProfessionalInfoDto(professionalInfo);
    }

    @Override
    public List<PofessionalInfoDto> getAllProfessionalInfo() {
        List<ProfessionalInfo> professionalInfos = professionalInfoRepository.findAll();
        return professionalInfos.stream()
                .map(ProfessionalInfoMapper::mapToProfessionalInfoDto)
                .collect(Collectors.toList());
    }

    @Override
    public PofessionalInfoDto updateProfessionalInfo(Long professionalInfoId, PofessionalInfoDto updateProfessionalInfoDto) {
        ProfessionalInfo professionalInfo = professionalInfoRepository.findById(professionalInfoId)
                .orElseThrow(() -> new ResourceNotFoundExeption("ProfessionalInfo not found with id: " + professionalInfoId));

        professionalInfo.setEmployeeStatus(updateProfessionalInfoDto.getEmployeeStatus());
        professionalInfo.setEmployeeType(updateProfessionalInfoDto.getEmployeeType());
        professionalInfo.setEmployeeSubType(updateProfessionalInfoDto.getEmployeeSubType());
        professionalInfo.setTimeType(updateProfessionalInfoDto.getTimeType());
        professionalInfo.setManager(updateProfessionalInfoDto.getManager());
        professionalInfo.setStartDate(updateProfessionalInfoDto.getStartDate());
        professionalInfo.setEndDate(updateProfessionalInfoDto.getEndDate());
        professionalInfo.setContractType(updateProfessionalInfoDto.getContractType());
        professionalInfo.setContractNature(updateProfessionalInfoDto.getContractNature());
        professionalInfo.setNoticePeriod(updateProfessionalInfoDto.getNoticePeriod());
        professionalInfo.setTrialPeriod(updateProfessionalInfoDto.getTrialPeriod());
        professionalInfo.setWeeklyWorkingHours(updateProfessionalInfoDto.getWeeklyWorkingHours());
        professionalInfo.setMonthlyWorkingHours(updateProfessionalInfoDto.getMonthlyWorkingHours());
        professionalInfo.setYearlyWorkingDays(updateProfessionalInfoDto.getYearlyWorkingDays());
        professionalInfo.setTimeProfile(updateProfessionalInfoDto.getTimeProfile());
        professionalInfo.setPayrollArea(updateProfessionalInfoDto.getPayrollArea());
        professionalInfo.setPayGroup(updateProfessionalInfoDto.getPayGroup());
        professionalInfo.setPayGrade(updateProfessionalInfoDto.getPayGrade());
        professionalInfo.setBasicPay(updateProfessionalInfoDto.getBasicPay());

        ProfessionalInfo updatedProfessionalInfo = professionalInfoRepository.save(professionalInfo);
        return ProfessionalInfoMapper.mapToProfessionalInfoDto(updatedProfessionalInfo);
    }

    @Override
    public void deleteProfessionalInfo(Long professionalInfoId) {
        ProfessionalInfo professionalInfo = professionalInfoRepository.findById(professionalInfoId)
                .orElseThrow(() -> new ResourceNotFoundExeption("ProfessionalInfo not found with id: " + professionalInfoId));
        professionalInfoRepository.delete(professionalInfo);

    }
}
