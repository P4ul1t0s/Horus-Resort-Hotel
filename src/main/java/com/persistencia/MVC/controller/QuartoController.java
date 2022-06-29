package com.persistencia.MVC.controller;

<<<<<<< HEAD
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
=======
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
>>>>>>> bd3649e75fba05e226bd663d69773825c6c6da3d

import com.persistencia.MVC.model.Quarto;
import com.persistencia.MVC.repository.QuartoRepository;

<<<<<<< HEAD
@Controller
@RequestMapping("/back/quartos")
public class QuartoController {
    

    @Autowired
    QuartoRepository repository;

    @GetMapping
    public String paginaQuartos(){
        return "quartos";
    }

    @PostMapping("/salvar")
    public String salvar(Quarto novoQuarto){
        novoQuarto.setOcupado(false);
        repository.save(novoQuarto);
        return "redirect:/back/quartos";
    }
=======
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
    
>>>>>>> bd3649e75fba05e226bd663d69773825c6c6da3d
}
