package com.example.libreria.repository.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name ="libros")
public class LibroEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String isbn;
    private String titulo;
    private String descripcion;
    private double precio;
    @JoinColumn(name="autor_id")
    @JsonIgnoreProperties(value={"libros", "hibernateLazyInitializer"})
    @OneToMany(fetch = FetchType.LAZY)
    private AutorEntity autor;
}
