package com.example.libreria.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.libreria.repository.AutorRepository;
import com.example.libreria.repository.entities.AutorEntity;
import com.example.libreria.services.AutorService;

@Service
public class AutorServiceImpl implements AutorService{
        
    @Autowired
    private AutorRepository autorRepository;

    @Override
    public AutorEntity findById(Long id) {
        return null;
    }

    @Override
    public List<AutorEntity> findAll() {
        return (List<AutorEntity>) autorRepository.findAll();
    }
}
