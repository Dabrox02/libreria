package com.example.libreria.repository.entities;


import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="autores")
public class AutorEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombres;
    private String apellidos;
    private String pais;
    private String fechaNacimiento;
    @OneToMany(mappedBy = "autor_libro", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnoreProperties("autor_libro")
    private List<LibroEntity> libros;
}
