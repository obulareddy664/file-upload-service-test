package com.file.uploader.service;

import com.file.uploader.entity.Employee;
import com.file.uploader.exception.EmployeeNotFoundException;
import com.file.uploader.exception.ListOfEmployeeNotFoundException;
import com.file.uploader.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee saveEmployee(Employee employee) {
        Employee employee1 = employeeRepository.save(employee);
        return employee1;
    }

    public Employee getEmployee(Integer employeeId) throws EmployeeNotFoundException {
        Optional<Employee> employee = employeeRepository.findById(employeeId);

        if (employee.isPresent()){
            return  employee.get();
        }

        throw new EmployeeNotFoundException("Employee Not Found With Id : "+employeeId+" please give valid employeeId");
    }

    public List<Employee> getALlEmployees(){
      List<Employee> employees=  employeeRepository.findAll();
      if(employees.size()<0){
          return  employees;
      }
      throw  new ListOfEmployeeNotFoundException("list of employee not found ");
    }

    public Employee updateEmployee(Employee employee){
      Employee employee1=  employeeRepository.save(employee);
      return  employee1;
    }

    public void deleteEmployeeById(Integer employeeId){
        employeeRepository.deleteById(employeeId);
    }
}
