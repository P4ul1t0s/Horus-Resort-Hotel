package com.persistencia.MVC.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.persistencia.MVC.model.Quarto;

@Repository
<<<<<<< HEAD
public interface QuartoRepository extends JpaRepository<Quarto, Integer>{
=======
public interface QuartoRepository extends JpaRepository<Quarto, Long>{
>>>>>>> bd3649e75fba05e226bd663d69773825c6c6da3d
    
}
