package com.example.emsbackend.service;

import com.example.emsbackend.dto.PersonalInfoDto;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface PersonalInfoService {

    PersonalInfoDto createPersonalInfo(PersonalInfoDto personalInfoDto);

    PersonalInfoDto getEmployeeById(Long employeeId);
    List<PersonalInfoDto> getAllEmployee();
    //PersonalInfoDto updateEmployee(Long employeeId , PersonalInfoDto updateEmployee);

    PersonalInfoDto updatePersonalInfo(Long employeeId, PersonalInfoDto updateEmployee);

    void deleteEmployee(Long employeeId);

   // List<PersonalInfoDto> findByOrganisationId(Long organisationId);
}
