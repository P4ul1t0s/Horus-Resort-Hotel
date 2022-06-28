package com.persistencia.MVC.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.persistencia.MVC.model.Quarto;
import com.persistencia.MVC.repository.QuartoRepository;

@RestController
@RequestMapping("/quarto")
public class QuartoController {

    @Autowired
    private QuartoRepository quartoRepository;
    
    @PostMapping
    public Quarto adicionar(Quarto quarto){
        return quartoRepository.save(quarto);
    }

    @GetMapping
    public List<Quarto> listar(){
        return quartoRepository.findAll();
    }

    // @GetMapping("/{id}")
    // public Quarto buscarPorId(@PathVariable Long id){
    //     Optional<Quarto> quartoOpcional = quartoRepository.findById(id);
    //     // if(quartoOpcional.isPresent()){
    //     //    throw new ResponseStatusException(HttpStatus.NOT_FOUND) ;
    //     // }
        
    //     return quartoOpcional.get();
    // }

    // @DeleteMapping("/delete/{id}")
    // //@GetMapping("/delete/{id}")
    // public Quarto excluirPorID(@PathVariable Long id){
    //     Optional<Quarto> quartoOpcional = quartoRepository.findById(id);
    //     quartoRepository.delete(quartoOpcional.get());
    //     return quartoOpcional.get();
    // }
    
}
