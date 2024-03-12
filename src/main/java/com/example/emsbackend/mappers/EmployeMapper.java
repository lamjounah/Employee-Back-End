package com.example.emsbackend.mappers;


import com.example.emsbackend.dto.EmployeDto;
import com.example.emsbackend.entity.Employe;
import com.example.emsbackend.entity.PersonalInfo;
import com.example.emsbackend.entity.ProfessionalInfo;
import org.springframework.stereotype.Service;

@Service
public class EmployeMapper {

    public static EmployeDto employeToDto(Employe employe) {
        EmployeDto employeDto = new EmployeDto();
        employeDto.setId(employe.getId());
        employeDto.setFirstName(employe.getFirstName());
        employeDto.setLastName(employe.getLastName());
        if (employe.getPersonalInfo() != null) {
            employeDto.setPersonalInfoId(employe.getPersonalInfo().getIdPersonalInfo());
        }
        if (employe.getProfessionalInfo() != null) {
            employeDto.setProfessionalInfoId(employe.getProfessionalInfo().getIdProfessionalInfo());
        }
        return employeDto;
    }

    public static Employe dtoToEmploye(EmployeDto employeDto) {
        Employe employe = new Employe();
        employe.setId(employeDto.getId());
        employe.setFirstName(employeDto.getFirstName());
        employe.setLastName(employeDto.getLastName());
        // Mapping inverse pour les informations personnelles
        PersonalInfo personalInfo = new PersonalInfo();
        personalInfo.setIdPersonalInfo(employeDto.getPersonalInfoId());
        employe.setPersonalInfo(personalInfo);

        // Mapping inverse pour les informations professionnelles
        ProfessionalInfo professionalInfo = new ProfessionalInfo();
        professionalInfo.setIdProfessionalInfo(employeDto.getProfessionalInfoId());
        employe.setProfessionalInfo(professionalInfo);
        return employe;
    }
}
