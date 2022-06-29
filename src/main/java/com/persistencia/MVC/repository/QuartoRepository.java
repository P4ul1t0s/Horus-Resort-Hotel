package com.persistencia.MVC.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.persistencia.MVC.model.Quarto;

@Repository
public interface QuartoRepository extends JpaRepository<Quarto, Integer>{
    
}
