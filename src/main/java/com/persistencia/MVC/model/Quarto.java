package com.persistencia.MVC.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.lang.NonNull;

@Entity
public class Quarto {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Column(name ="id_Quarto") 
    private Long id;

    @Column(nullable = false, length = 255)
    private String categoria; // Nome do quarto. Ex.: Suíte Master, Suíte Padrão, Quarto Família...

    @Column(nullable = false, length = 1)
    private int capacidadeAdultos;

    @Column(nullable = false, length = 1)
    private int capacidadeCriancas;

    @NonNull
    private float diaria;

    @NonNull
    private boolean ocupado;

    
    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setCapacidadeAdultos(int capacidadeAdultos) {
        this.capacidadeAdultos = capacidadeAdultos;
    }

    public void setCapacidadeCriancas(int capacidadeCriancas) {
        this.capacidadeCriancas = capacidadeCriancas;
    }

    public void setDiaria(float diaria) {
        this.diaria = diaria;
    }
    
    public Long getId() {
        return id;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getCapacidadeAdultos() {
        return capacidadeAdultos;
    }

    public int getCapacidadeCriancas() {
        return capacidadeCriancas;
    }
    
    public float getDiaria() {
        return diaria;
    }
    
    public boolean isOcupado() {
        return ocupado;
    }
}
