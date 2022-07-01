package com.persistencia.MVC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.persistencia.MVC.model.Quarto;
import com.persistencia.MVC.repository.QuartoRepository;

@Controller
@RequestMapping("/back/quartos")
public class QuartoController {
    

    @Autowired
    QuartoRepository repository;

    @GetMapping
    public String paginaQuartos(){
        return "quartos";
    }

    @PostMapping
    public String salvar(Quarto novoQuarto){
        novoQuarto.setOcupado(false);
        repository.save(novoQuarto);
        return "redirect:/back/quartos";
    }

    @GetMapping("/deletar/{id}")
    public String delete(Quarto quarto){
        repository.delete(quarto);
        return "redirect:/back/quartos";
    }
}
