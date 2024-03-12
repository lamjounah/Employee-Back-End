package com.example.emsbackend.controller;


import com.example.emsbackend.dto.EmployeDto;
import com.example.emsbackend.dto.PersonalInfoDto;
import com.example.emsbackend.entity.Employe;
import com.example.emsbackend.service.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employees")
public class EmployeController {

     @Autowired
     private  EmployeService employeService;
    @PostMapping
    public EmployeDto saveEmploye(@RequestBody EmployeDto employeDto) {

        return employeService.saveEmploye(employeDto);
    }

    @PutMapping("{id}")
    public ResponseEntity<String> updateEmployeePersonalInfo(
            @PathVariable ("id") Long employeeId,
            @RequestBody PersonalInfoDto updatedPersonalInfoDto) {
        employeService.updateEmployeePersonalInfo(employeeId, updatedPersonalInfoDto);
        return ResponseEntity.status(HttpStatus.OK).body("Employee personal info updated successfully.");
    }

    @GetMapping("{id}")
     public  Employe getEmployeeById(@PathVariable("id") Long employeeId){
     return    employeService.geEmployeById(employeeId);

   }

}
