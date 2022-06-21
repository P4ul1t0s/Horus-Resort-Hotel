package com.persistencia.MVC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.persistencia.MVC.model.Funcionario;
import com.persistencia.MVC.repository.FuncionarioRepository;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {
    
    @Autowired
    private FuncionarioRepository FuncionarioRepository;

    @PostMapping
    public Funcionario adicionar(Funcionario funcionario) {
        return FuncionarioRepository.save(funcionario);
    }

    @GetMapping
    public List<Funcionario> listar() {
        return FuncionarioRepository.findAll();
    }
}
