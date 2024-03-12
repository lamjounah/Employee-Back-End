//package com.example.emsbackend.controller;
//
//import com.example.emsbackend.dto.PersonalInfoDto;
//import com.example.emsbackend.service.PersonalInfoService;
//import lombok.AllArgsConstructor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//@CrossOrigin("*")
//@AllArgsConstructor
//@RestController
//@RequestMapping("/api/employees/pr")
//public class PersonalInfoController {
//   @Autowired
//   private PersonalInfoService personalInfoService;
//   //Build Add employee REST API
//   @PostMapping
//   public ResponseEntity<PersonalInfoDto>  createEmployee(@RequestBody PersonalInfoDto personalInfoDto){
//      PersonalInfoDto saveEmployee = personalInfoService.createPersonalInfo(personalInfoDto);
//      return new ResponseEntity<>(saveEmployee, HttpStatus.CREATED);
//   }
//
//   //Build Get Employee REST API
//   @GetMapping("{id}")
//   public  ResponseEntity<PersonalInfoDto> getEmployeeById(@PathVariable("id") Long employeeId){
//      PersonalInfoDto personalInfoDto = personalInfoService.getEmployeeById(employeeId);
//      return ResponseEntity.ok(personalInfoDto);
//   }
//
//   // Build Get All Employees REST API
//  @GetMapping
//   public  ResponseEntity<List<PersonalInfoDto>> getAllEmployees(){
//       List<PersonalInfoDto>  employees = personalInfoService.getAllEmployee();
//       return ResponseEntity.ok(employees);
//   }
//
//
//   // Build  Update Employee REST API
//    @PutMapping("{id}")
//   public ResponseEntity<PersonalInfoDto> updateEmployee(@PathVariable("id") Long employeeId ,
//                                                         @RequestBody PersonalInfoDto updateEmployee){
//            PersonalInfoDto personalInfoDto = personalInfoService.updatePersonalInfo(employeeId, updateEmployee);
//            return  ResponseEntity.ok(personalInfoDto);
//   }
//
//
//   //Build Delete Employe REST API
//   @DeleteMapping("{id}")
//    public  ResponseEntity<String> deleteEmployee(@PathVariable("id") Long employeeId){
//       personalInfoService.deleteEmployee(employeeId);
//       return ResponseEntity.ok("Empolyee deleted successfully !.");
//    }
//
//
////    @GetMapping("/organisation/{organisationId}")
////    public ResponseEntity<List<PersonalInfoDto>> getEmployeesByOrganisationId(@PathVariable("organisationId") Long organisationId) {
////        List<PersonalInfoDto> employees = personalInfoService.findByOrganisationId(organisationId);
////        return ResponseEntity.ok(employees);
////    }
//
//}
//
//
//
//
