package com.persistencia.MVC.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.persistencia.MVC.model.Hospede;
import com.persistencia.MVC.repository.HospedeRepository;

//Nesta classe ficam os endereços pra busca no banco

@RestController
public class ApiGeral {
    
    @Autowired
    private HospedeRepository hospedeDao;
    
    @GetMapping("/api/hospedes")
    public List <Hospede> buscarTodos(){
        return hospedeDao.findAll();
    }
}
