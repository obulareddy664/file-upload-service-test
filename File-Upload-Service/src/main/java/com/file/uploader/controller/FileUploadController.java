package com.file.uploader.controller;

import com.file.uploader.entity.FileUpload;
import com.file.uploader.service.FileUploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/v1")
public class FileUploadController {

    @Autowired
   private FileUploadService fileUploadService;

    @PostMapping("/upload/file")
    public ResponseEntity<FileUpload> saveFile(@RequestBody FileUpload fileUpload){
        fileUpload.setCreatedTimeStamp(LocalDateTime.now());
      FileUpload fileUpload1=  fileUploadService.saveFileUpload(fileUpload);
      return  new ResponseEntity<FileUpload>(fileUpload1, HttpStatus.OK);

    }
}


