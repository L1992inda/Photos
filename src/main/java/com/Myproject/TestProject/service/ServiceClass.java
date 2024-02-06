package com.Myproject.TestProject.service;

import org.springframework.stereotype.Service;

import com.Myproject.TestProject.model.Photo;
import com.Myproject.TestProject.repository.PhotosRepository;

@Service
public class ServiceClass {
    
    private final PhotosRepository photosRepository;

    public ServiceClass (PhotosRepository photosRepository){
        this.photosRepository = photosRepository;
    }

    public Iterable<Photo> get(){
        return photosRepository.findAll();
    }

    public Photo get(Integer id){
        return photosRepository.findById(id).orElse(null);
    }

    public void remove(Integer id) {
        photosRepository.deleteById(id);
    }

    public Photo save(String fileName, String contentType,byte[] data) {
        Photo photo =new Photo();
        photo.setContentType(contentType);
        //photo.setId(UUID.randomUUID().toString());
        photo.setFileName(fileName);
        photo.setData(data);
       photosRepository.save(photo);
        return photo;
       
    }
}
