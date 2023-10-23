package com.example.libreria.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.libreria.repository.LibroRepository;
import com.example.libreria.repository.entities.LibroEntity;
import com.example.libreria.services.LibroService;

@Service
public class LibroServiceImpl implements LibroService {

    @Autowired
    private LibroRepository libroRepository;

    @Override
    public List<LibroEntity> findAll() {
        return (List<LibroEntity>) libroRepository.findAll();
    }

    @Override
    public LibroEntity findById(Long id) {
        return libroRepository.findById(id).orElse(null);
    }

    @Override
    public LibroEntity findByIsbn(String isbn) {
        return libroRepository.findByIsbn(isbn);
    }
    
}
