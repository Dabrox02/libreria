package com.example.libreria.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.libreria.repository.entities.AutorEntity;

public interface AutorRepository extends CrudRepository<AutorEntity, Long>{
    
}
