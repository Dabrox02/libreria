package com.example.libreria.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.libreria.repository.entities.LibroEntity;

public interface LibroRepository extends CrudRepository<LibroEntity, Long> {
    LibroEntity findByIsbn(String isbn);
}
