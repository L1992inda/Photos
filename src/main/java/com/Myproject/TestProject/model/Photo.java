package com.Myproject.TestProject.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;

@Table("PHOTOS")
public class Photo {

    @Id
    private Integer id;

    @NotEmpty @NotBlank
    private String fileName;

    private String contentType;
    
    @JsonIgnore
    private byte[] data;

    public Photo() {
    }


    public Photo(Integer id, String fileName) {
        this.id = id;
        this.fileName = fileName;
    }

  
    public Integer getId() {
        return id;
    }
   
    public void setId(Integer id) {
        this.id = id;
    }
    public String getFileName() {
        return fileName;
    }
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }


    public byte[] getData() {
        return data;
    }


    public void setData(byte[] data) {
        this.data = data;
    }


    public String getContentType() {
        return contentType;
    }


    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    
    
    
}
