package com.example.emsbackend.service;

import com.example.emsbackend.dto.EmployeDto;
import com.example.emsbackend.dto.PersonalInfoDto;
import com.example.emsbackend.entity.Employe;
import com.example.emsbackend.entity.PersonalInfo;
import com.example.emsbackend.exception.ResourceNotFoundExeption;
import com.example.emsbackend.mappers.EmployeMapper;
import com.example.emsbackend.repository.EmployeRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class EmployeServiceImp implements EmployeService {

    @Autowired
     private EmployeRepository employeRepository;

    @Autowired
    private PersonalInfoService personalInfoService;
    @Override
    public EmployeDto saveEmploye(EmployeDto  employeDto) {
        Employe employe = EmployeMapper.dtoToEmploye(employeDto);
        Employe employesave =employeRepository.save(employe);
        return EmployeMapper.employeToDto(employesave);
    }

    @Override
    public Employe updateEmployeePersonalInfo(Long employeeId, PersonalInfoDto updatedPersonalInfoDto) {

        Employe employee = employeRepository.findById(employeeId)
                .orElseThrow(() -> new ResourceNotFoundExeption("Employee not found with id: " + employeeId));

        // Appeler la méthode de service pour mettre à jour les informations personnelles de l'employé
        PersonalInfo currentPersonalInfoDto = employee.getPersonalInfo();
        if (currentPersonalInfoDto != null) {
            personalInfoService.updatePersonalInfo(currentPersonalInfoDto.getIdPersonalInfo(), updatedPersonalInfoDto);
        }

        return employee;
    }
    @Override
    public Employe geEmployeById(Long idEmploye){
        return employeRepository.findById(idEmploye).orElseThrow(()->
                new ResourceNotFoundExeption("Employee is not exists whid givn id"+idEmploye));
    }

//    @Override
//    public void updateEmployeePersonalInfo(Long employeeId, PersonalInfoDto updatedPersonalInfoDto) {
//        Employe employee = employeRepository.findById(employeeId)
//                .orElseThrow(() -> new ResourceNotFoundExeption("Employee not found with id: " + employeeId));
//
//        // Appeler la méthode de service pour mettre à jour les informations personnelles
//        personalInfoService.updatePersonalInfo(employee.getPersonalInfo().getIdPersonalInfo(), updatedPersonalInfoDto);
//
//    }



}
