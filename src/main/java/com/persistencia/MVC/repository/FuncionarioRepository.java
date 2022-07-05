package com.persistencia.MVC.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.persistencia.MVC.model.Funcionario;

@Repository
public interface FuncionarioRepository extends JpaRepository <Funcionario, Integer> {
    
}
