package com.example.libreria.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.libreria.services.AutorService;
import com.example.libreria.repository.entities.AutorEntity;

@RequestMapping("/biblioteca")
public class LibreriaController {


    private AutorService autorService;

    @GetMapping("/autores/")
    public List<AutorEntity> findAll(){
        return autorService.getAll();
    }

}
