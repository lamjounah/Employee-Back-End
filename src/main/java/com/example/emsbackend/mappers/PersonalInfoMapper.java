package com.example.emsbackend.mappers;

import com.example.emsbackend.dto.PersonalInfoDto;
import com.example.emsbackend.entity.PersonalInfo;
import com.sun.management.GcInfo;
import org.springframework.stereotype.Service;

//import com.example.emsbackend.entity.Organisation;
@Service
public class PersonalInfoMapper {

    public static PersonalInfoDto mapToPersonalInfoDto(PersonalInfo personalInfo) {

        PersonalInfoDto personalInfoDto = new PersonalInfoDto();
        personalInfoDto.setIdPer(personalInfo.getIdPersonalInfo());
        personalInfoDto.setIdEmploye(personalInfo.getEmploye().getId());
        personalInfoDto.setMiddleName(personalInfo.getMiddleName());
        personalInfoDto.setGender(personalInfo.getGender());
        personalInfoDto.setMaritalStatus(personalInfo.getMaritalStatus());
        personalInfoDto.setDateOfBirth(personalInfo.getDateOfBirth());
        personalInfoDto.setNationality1(personalInfo.getNationality1());
        personalInfoDto.setNationality2(personalInfo.getNationality2());
        personalInfoDto.setSocialSecurityNumber(personalInfo.getSocialSecurityNumber());

        personalInfoDto.setAddressType(personalInfo.getAddressType());
        personalInfoDto.setAddressLine1(personalInfo.getAddressLine1());
        personalInfoDto.setAddressLine2(personalInfo.getAddressLine2());
        personalInfoDto.setPostalCode(personalInfo.getPostalCode());
        personalInfoDto.setCity(personalInfo.getCity());
        personalInfoDto.setRegion(personalInfo.getRegion());
        personalInfoDto.setCountry(personalInfo.getCountry());

        personalInfoDto.setPhoneType(personalInfo.getPhoneType());
        personalInfoDto.setPhoneCountryCode(personalInfo.getPhoneCountryCode());
        personalInfoDto.setPhoneNumber(personalInfo.getPhoneNumber());
        personalInfoDto.setEmailType(personalInfo.getEmailType());
        personalInfoDto.setEmail(personalInfo.getEmail());

        personalInfoDto.setBankAccountType(personalInfo.getBankAccountType());
        personalInfoDto.setBankName(personalInfo.getBankName());
        personalInfoDto.setAgency(personalInfo.getAgency());
        personalInfoDto.setIban(personalInfo.getIban());
        personalInfoDto.setBic(personalInfo.getBic());

        personalInfoDto.setEmergencyContactFullName(personalInfo.getEmergencyContactFullName());
        personalInfoDto.setEmergencyContactPhoneNumber(personalInfo.getEmergencyContactPhoneNumber());
        personalInfoDto.setEmergencyContactRelationshipType(personalInfo.getEmergencyContactRelationshipType());



        return personalInfoDto;
    }

    public static PersonalInfo mapToPersonalInfo(PersonalInfoDto personalInfoDto) {
        PersonalInfo personalInfo = new PersonalInfo();

        personalInfo.setIdPersonalInfo(personalInfoDto.getIdPer());
        personalInfo.setIdEmploye(personalInfoDto.getEmploye().getId());
        personalInfo.setMiddleName(personalInfoDto.getMiddleName());
        personalInfo.setGender(personalInfoDto.getGender());
        personalInfo.setMaritalStatus(personalInfoDto.getMaritalStatus());
        personalInfo.setDateOfBirth(personalInfoDto.getDateOfBirth());
        personalInfo.setNationality1(personalInfoDto.getNationality1());
        personalInfo.setNationality2(personalInfoDto.getNationality2());
        personalInfo.setSocialSecurityNumber(personalInfoDto.getSocialSecurityNumber());

        personalInfo.setAddressType(personalInfoDto.getAddressType());
        personalInfo.setAddressLine1(personalInfoDto.getAddressLine1());
        personalInfo.setAddressLine2(personalInfoDto.getAddressLine2());
        personalInfo.setPostalCode(personalInfoDto.getPostalCode());
        personalInfo.setCity(personalInfoDto.getCity());
        personalInfo.setRegion(personalInfoDto.getRegion());
        personalInfo.setCountry(personalInfoDto.getCountry());

        personalInfo.setPhoneType(personalInfoDto.getPhoneType());
        personalInfo.setPhoneCountryCode(personalInfoDto.getPhoneCountryCode());
        personalInfo.setPhoneNumber(personalInfoDto.getPhoneNumber());
        personalInfo.setEmailType(personalInfoDto.getEmailType());
        personalInfo.setEmail(personalInfoDto.getEmail());

        personalInfo.setBankAccountType(personalInfoDto.getBankAccountType());
        personalInfo.setBankName(personalInfoDto.getBankName());
        personalInfo.setAgency(personalInfoDto.getAgency());
        personalInfo.setIban(personalInfoDto.getIban());
        personalInfo.setBic(personalInfoDto.getBic());

        personalInfo.setEmergencyContactFullName(personalInfoDto.getEmergencyContactFullName());
        personalInfo.setEmergencyContactPhoneNumber(personalInfoDto.getEmergencyContactPhoneNumber());
        personalInfo.setEmergencyContactRelationshipType(personalInfoDto.getEmergencyContactRelationshipType());

        return personalInfo;
    }
}
