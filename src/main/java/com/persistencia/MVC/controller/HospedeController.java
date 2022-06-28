package com.persistencia.MVC.controller;

import com.persistencia.MVC.model.Hospede;
import com.persistencia.MVC.repository.HospedeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hospede")
public class HospedeController {

    @Autowired
    HospedeRepository dao;
    
    @PostMapping
    public String salvar(Hospede x){
        dao.save(x);
        return "redirect:/hospede";
    }

    @GetMapping
    public String formHospede(){
        return "hospede";
    }

}
