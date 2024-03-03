package com.example.emsbackend.mappers;

import com.example.emsbackend.dto.EmployeeDto;
import com.example.emsbackend.entity.Employee;

public class EmployeeMapper {
    public static EmployeeDto mapToEmployeeDto(Employee employee){
        return new EmployeeDto(

                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail(),
                employee.getDateOfBirth(),
                employee.getSocialSecurityCode(),
                employee.getGender(),
                employee.getSocialStatus(),
                employee.getAddress(),
                employee.getCountry(),
                employee.getRegion(),
                employee.getCity(),
                employee.getNumberRoute(),
                employee.getPostalCode(),
                employee.getPhoneNumber(),
                employee.getPostalAddress(),
                employee.getBankName(),
                employee.getAccountNumber(),
                employee.getExpirationDate(),
                employee.getCvv()
        );

    }
    public static Employee mapToEmployee(EmployeeDto employeeDto){
        return new Employee(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmail(),
                employeeDto.getDateOfBirth(),
                employeeDto.getSocialSecurityCode(),
                employeeDto.getGender(),
                employeeDto.getSocialStatus(),
                employeeDto.getAddress(),
                employeeDto.getCountry(),
                employeeDto.getRegion(),
                employeeDto.getCity(),
                employeeDto.getNumberRoute(),
                employeeDto.getPostalCode(),
                employeeDto.getPhoneNumber(),
                employeeDto.getPostalAddress(),
                employeeDto.getBankName(),
                employeeDto.getAccountNumber(),
                employeeDto.getExpirationDate(),
                employeeDto.getCvv()
        );
    }
}
