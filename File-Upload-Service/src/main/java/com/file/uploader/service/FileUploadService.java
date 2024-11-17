package com.file.uploader.service;

import com.file.uploader.entity.FileUpload;
import com.file.uploader.repository.FileUploadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

@Service
public class FileUploadService {

    @Autowired
    private FileUploadRepository fileUploadRepository;


    public FileUpload saveFileUpload(FileUpload fileUpload){
       return  fileUploadRepository.save(fileUpload);
    }

}
