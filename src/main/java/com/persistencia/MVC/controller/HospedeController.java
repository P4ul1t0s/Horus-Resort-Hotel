package com.persistencia.MVC.controller;


import java.lang.ProcessBuilder.Redirect;
import java.util.List;
import java.util.Optional;

import com.persistencia.MVC.model.Funcionario;
import com.persistencia.MVC.model.Hospede;
import com.persistencia.MVC.repository.HospedeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

@RestController
@RequestMapping("/hospede")
public class HospedeController {

    @Autowired
    HospedeRepository dao;
    
    /*@PostMapping
    public String salvar(Hospede x){
        dao.save(x);
        return "redirect:/hospede";
    }*/
    @PostMapping
    public RedirectView adicionar(Hospede x){
        dao.save(x);
        return new RedirectView("/hospede");
    }
    /*@GetMapping
    public List<Hospede> listar(){
        return dao.findAll();
    }
    @GetMapping("/{id}")
    public Hospede buscarPorId(@PathVariable Long id){
        Optional<Hospede> hospedeOpcional = dao.findById(id);
        
        return hospedeOpcional.get();
    }
    @DeleteMapping("/delete/{id}")
    public Hospede excluirPorID(@PathVariable Long id){
        Optional<Hospede> hospedeOpcional = dao.findById(id);
        dao.delete(hospedeOpcional.get());
        return hospedeOpcional.get();
    }*/
}
