package com.persistencia.MVC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.persistencia.MVC.repository.FuncionarioRepository;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {
    
    

    @Autowired
    private FuncionarioRepository funcionarioRepository;


}
