package com.example.libreria.services;

import java.util.List;

import com.example.libreria.repository.entities.AutorEntity;

public interface AutorService {

    List<AutorEntity> findAll();
    
    AutorEntity findById(Long id);
    
}
