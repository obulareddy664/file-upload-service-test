package com.file.uploader.controller;

import com.file.uploader.entity.Employee;
import com.file.uploader.exception.EmployeeNotFoundException;
import com.file.uploader.exception.ListOfEmployeeNotFoundException;
import com.file.uploader.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/employee")
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
        Employee employee1=employeeService.saveEmployee(employee);
        return new ResponseEntity(employee1, HttpStatus.CREATED);
    }

    @GetMapping("/employee/{employeeId}")
    public ResponseEntity<?> getEmployee(@PathVariable Integer employeeId )  {
        Employee employee= null;

            employee = employeeService.getEmployee(employeeId);

        return  new ResponseEntity<Employee>(employee,HttpStatus.OK);
    }

    @GetMapping("/employees")
    public ResponseEntity getAllEmployees(){
        List<Employee> employees=null;
            employees = employeeService.getALlEmployees();
      return new ResponseEntity<>(employees,HttpStatus.OK);
    }

    @PutMapping("/employee")
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee){
     Employee employee1=   employeeService.updateEmployee(employee);
     return  new ResponseEntity<>(employee1,HttpStatus.OK);

    }

    @DeleteMapping("/employee/{employeeId}")
    public ResponseEntity deleteEmployee(@PathVariable Integer employeeId){
        employeeService.deleteEmployeeById(employeeId);
        return  new ResponseEntity<>(HttpStatus.OK);
    }
}
