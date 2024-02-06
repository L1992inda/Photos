package com.Myproject.TestProject.web;

import org.springframework.http.ContentDisposition;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.Myproject.TestProject.model.Photo;
import com.Myproject.TestProject.service.ServiceClass;

@RestController
public class DownloadController {

    private final ServiceClass serviceClass;

    public DownloadController(ServiceClass serviceClass) {
        this.serviceClass = serviceClass;
    }

   @GetMapping("/download/{id}")
    public ResponseEntity<byte[]> download(@PathVariable Integer id) {
       Photo photo =  serviceClass.get(id);
        if(photo == null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        byte[] data = photo.getData();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.valueOf(photo.getContentType()));
        ContentDisposition build = ContentDisposition.builder("attachment")
        .filename(photo.getFileName())
        .build();
        headers.setContentDisposition(build);
        return new ResponseEntity<>(data,headers,HttpStatus.OK);
    }
    
}
