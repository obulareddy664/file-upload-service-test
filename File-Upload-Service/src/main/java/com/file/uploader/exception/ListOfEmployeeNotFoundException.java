package com.file.uploader.exception;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class ListOfEmployeeNotFoundException extends  RuntimeException{

    private  String message;
}
