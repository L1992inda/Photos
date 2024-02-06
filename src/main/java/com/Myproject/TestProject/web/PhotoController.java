package com.Myproject.TestProject.web;

import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ResponseStatusException;

import com.Myproject.TestProject.model.Photo;
import com.Myproject.TestProject.service.ServiceClass;


@RestController
@Validated
public class PhotoController {

    private final ServiceClass serviceClass;

    public PhotoController(ServiceClass serviceClass) {
        this.serviceClass = serviceClass;
    }

    @GetMapping("/")
    public String hello(){
        return "Hello";
    }

    @GetMapping("/photos")
    public Iterable <Photo> get(){
        return serviceClass.get(); 
    }
    @GetMapping("/photos/{id}")
    public Photo get(@PathVariable Integer id){
        Photo photo = serviceClass.get(id);
        if(photo == null) throw new ResponseStatusException(HttpStatus.NOT_FOUND);
            return photo;
    }
    
    @DeleteMapping("/photos/{id}")
    public void delete(@PathVariable Integer id){
       serviceClass.remove(id);
    }
    
    // @PostMapping("/photos/add")
    // public Photo create(@Valid @RequestBody  Photo photo){
    //     photo.setId(UUID.randomUUID().toString());
    //     db.put(photo.getId(), photo);
    //     return photo;
    // }

    @PostMapping("/photos")
    public Photo create(@RequestPart("data") MultipartFile file ) throws IOException{
      return serviceClass.save(file.getOriginalFilename(),file.getContentType(),file.getBytes());
        
    }
}
