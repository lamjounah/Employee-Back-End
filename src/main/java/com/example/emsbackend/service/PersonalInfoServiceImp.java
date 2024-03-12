package com.example.emsbackend.service;

import com.example.emsbackend.dto.PersonalInfoDto;
import com.example.emsbackend.entity.PersonalInfo;
import com.example.emsbackend.exception.ResourceNotFoundExeption;
import com.example.emsbackend.mappers.PersonalInfoMapper;
import com.example.emsbackend.repository.PersonalInfoRepository;
//import com.example.emsbackend.repository.OrganisationRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class PersonalInfoServiceImp implements PersonalInfoService {
    @Autowired
    private PersonalInfoRepository personalInfoRepository;

    @Override
    public PersonalInfoDto createPersonalInfo(PersonalInfoDto personalInfoDto) {
        PersonalInfo personalInfo = PersonalInfoMapper.mapToPersonalInfo(personalInfoDto);
        PersonalInfo savedPersonalInfo = personalInfoRepository.save(personalInfo);
        return PersonalInfoMapper.mapToPersonalInfoDto(savedPersonalInfo);
    }



    @Override
    public PersonalInfoDto getEmployeeById(Long personelinfId) {
        PersonalInfo personalInfo = personalInfoRepository.findById(personelinfId).orElseThrow(()->
        new ResourceNotFoundExeption("Employee is not exists whid givn id"+personelinfId));
        return  PersonalInfoMapper.mapToPersonalInfoDto(personalInfo);
    }

    @Override
    public List<PersonalInfoDto> getAllEmployee() {
        List<PersonalInfo> personalInfos = personalInfoRepository.findAll();
        //return employees.stream().map((employee) -> EmployeeMapper.mapToPersonalInfoDto(employee))
               // .collect(Collectors.toList());
        return personalInfos.stream().map(PersonalInfoMapper::mapToPersonalInfoDto)
                .collect(Collectors.toList());
    }

    @Override
    public PersonalInfoDto updatePersonalInfo(Long personalInfoId,
                                              PersonalInfoDto updatePersonalInfoDto) {
        PersonalInfo personalInfo = personalInfoRepository.findById(personalInfoId)
                .orElseThrow(() -> new ResourceNotFoundExeption(
                        "PersonalInfo not found with id: " + personalInfoId));

        personalInfo.setIdPersonalInfo(updatePersonalInfoDto.getIdPer());
        //personalInfo.setEmploye(updatePersonalInfoDto.getEmploye());
        personalInfo.setMiddleName(updatePersonalInfoDto.getMiddleName());
        personalInfo.setGender(updatePersonalInfoDto.getGender());
        personalInfo.setMaritalStatus(updatePersonalInfoDto.getMaritalStatus());
        personalInfo.setDateOfBirth(updatePersonalInfoDto.getDateOfBirth());
        personalInfo.setNationality1(updatePersonalInfoDto.getNationality1());
        personalInfo.setNationality2(updatePersonalInfoDto.getNationality2());
        personalInfo.setSocialSecurityNumber(updatePersonalInfoDto.getSocialSecurityNumber());

        personalInfo.setAddressType(updatePersonalInfoDto.getAddressType());
        personalInfo.setAddressLine1(updatePersonalInfoDto.getAddressLine1());
        personalInfo.setAddressLine2(updatePersonalInfoDto.getAddressLine2());
        personalInfo.setPostalCode(updatePersonalInfoDto.getPostalCode());
        personalInfo.setCity(updatePersonalInfoDto.getCity());
        personalInfo.setRegion(updatePersonalInfoDto.getRegion());
        personalInfo.setCountry(updatePersonalInfoDto.getCountry());

        personalInfo.setPhoneType(updatePersonalInfoDto.getPhoneType());
        personalInfo.setPhoneCountryCode(updatePersonalInfoDto.getPhoneCountryCode());
        personalInfo.setPhoneNumber(updatePersonalInfoDto.getPhoneNumber());
        personalInfo.setEmailType(updatePersonalInfoDto.getEmailType());
        personalInfo.setEmail(updatePersonalInfoDto.getEmail());

        personalInfo.setBankAccountType(updatePersonalInfoDto.getBankAccountType());
        personalInfo.setBankName(updatePersonalInfoDto.getBankName());
        personalInfo.setAgency(updatePersonalInfoDto.getAgency());
        personalInfo.setIban(updatePersonalInfoDto.getIban());
        personalInfo.setBic(updatePersonalInfoDto.getBic());

        personalInfo.setEmergencyContactFullName(updatePersonalInfoDto.getEmergencyContactFullName());
        personalInfo.setEmergencyContactPhoneNumber(updatePersonalInfoDto.getEmergencyContactPhoneNumber());
        personalInfo.setEmergencyContactRelationshipType(updatePersonalInfoDto.getEmergencyContactRelationshipType());

        PersonalInfo updatedPersonalInfo = personalInfoRepository.save(personalInfo);

        return PersonalInfoMapper.mapToPersonalInfoDto(updatedPersonalInfo);
    }

    @Override
    public void deleteEmployee(Long employeeId) {
        PersonalInfo personalInfo = personalInfoRepository.findById(employeeId).orElseThrow(()->
                new ResourceNotFoundExeption("Employee is not exists whid givn id"+employeeId));
        personalInfoRepository.delete(personalInfo);


    }

//    @Override
//    public List<PersonalInfoDto> findByOrganisationId(Long organisationId) {
//        List<PersonalInfo> personalInfos = personalInfoRepository.findByOrganisationId(organisationId);
//        return personalInfos.stream()
//                .map(PersonalInfoMapper::mapToPersonalInfoDto)
//                .collect(Collectors.toList());
//    }


}

