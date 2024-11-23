package com.file.uploader.globalexception;

import com.file.uploader.exception.EmployeeNotFoundException;
import com.file.uploader.exception.ListOfEmployeeNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice//where ever exception thows using throw keyword then request come to the
//@RestControllerAdvice and method level it will search that particular exception
public class GlobalException {

    @ExceptionHandler(EmployeeNotFoundException.class)//find
    public ResponseEntity<?> getEmployee(EmployeeNotFoundException employeeNotFoundException) {
      return  new ResponseEntity(employeeNotFoundException.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(ListOfEmployeeNotFoundException.class)
    public ResponseEntity getAllEmployees(ListOfEmployeeNotFoundException listOfEmployeeNotFoundException){
        return  new ResponseEntity(listOfEmployeeNotFoundException.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
    }

}