package com.file.uploader.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.mapping.Value;

import java.sql.Date;
import java.time.LocalDateTime;

@Entity
@Data
public class FileUpload {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer fileId;

    private String fileName;

    private LocalDateTime createdTimeStamp;

    private String fileDescription;

}
