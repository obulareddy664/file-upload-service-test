package com.file.uploader.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class EmployeeNotFoundException extends RuntimeException{

    private String message;


}
