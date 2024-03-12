package com.example.emsbackend.service;

import com.example.emsbackend.dto.EmployeDto;
import com.example.emsbackend.dto.PersonalInfoDto;
import com.example.emsbackend.entity.Employe;

public interface EmployeService {

    public EmployeDto saveEmploye(EmployeDto employeDto);
    //public void updateEmployeePersonalInfo(Long employeeId, PersonalInfoDto updatedPersonalInfoDto);

    public Employe updateEmployeePersonalInfo(Long employeeId, PersonalInfoDto updatedPersonalInfoDto);

    public Employe geEmployeById(Long idEmploye);

}
