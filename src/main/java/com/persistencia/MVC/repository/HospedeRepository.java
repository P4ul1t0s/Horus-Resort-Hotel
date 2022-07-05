package com.persistencia.MVC.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.persistencia.MVC.model.Hospede;

@Repository
public interface HospedeRepository extends JpaRepository <Hospede, Integer> {
    
}
