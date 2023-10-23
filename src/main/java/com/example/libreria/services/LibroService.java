package com.example.libreria.services;

import java.util.List;

import com.example.libreria.repository.entities.LibroEntity;

public interface LibroService {
    
    List<LibroEntity> findAll();
    
    LibroEntity findById(Long id);

    LibroEntity findByIsbn(String isbn);

}
