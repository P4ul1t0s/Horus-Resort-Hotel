package com.persistencia.MVC.controller;



import java.util.List;
import java.util.Optional;

import com.persistencia.MVC.model.Hospede;
import com.persistencia.MVC.repository.HospedeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/hospede")
public class HospedeController {

    @Autowired
    private HospedeRepository hospedeRepository;
    
    @PostMapping
    public Hospede adicionar(Hospede hospede){
        return hospedeRepository.save(hospede);
    }

    @GetMapping
    public List<Hospede> listar(){
        return hospedeRepository.findAll();
    }

    @GetMapping("/{id}")
    public Hospede buscarPorId(@PathVariable Long id){
        Optional<Hospede> hospedeOpcional = hospedeRepository.findById(id);
        return hospedeOpcional.get();
    }

    @DeleteMapping("/delete/{id}")
    public Hospede excluirPorID(@PathVariable Long id){
        Optional<Hospede> hospedeOpcional = hospedeRepository.findById(id);
        hospedeRepository.delete(hospedeOpcional.get());
        return hospedeOpcional.get();
    }
    
}