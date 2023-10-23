package com.example.libreria.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.libreria.services.AutorService;
import com.example.libreria.services.LibroService;
import com.example.libreria.repository.entities.AutorEntity;
import com.example.libreria.repository.entities.LibroEntity;

@RestController
@RequestMapping("/biblioteca")
public class LibreriaController {

    @Autowired
    private LibroService libroService;
    @Autowired
    private AutorService autorService;

    @GetMapping("/autores")
    public List<AutorEntity> findAllAutor(){
        return autorService.findAll();
    }

    @GetMapping("/libros")
    public List<LibroEntity> findAllLibro(){
        return libroService.findAll();
    }

    @GetMapping("/libros/{idLibro}")
    public LibroEntity findLibroById(@PathVariable Long idLibro){
        return libroService.findById(idLibro);
    }

    @GetMapping("/libros/isbn/{isbn}")
    public LibroEntity findLibroByIsbn(@PathVariable String isbn){
        return libroService.findByIsbn(isbn);
    }

}
