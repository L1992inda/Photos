package com.Myproject.TestProject.repository;

import org.springframework.data.repository.CrudRepository;

import com.Myproject.TestProject.model.Photo;

public interface PhotosRepository extends CrudRepository <Photo,Integer>{

    
} 
