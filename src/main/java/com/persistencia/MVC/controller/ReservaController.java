package com.persistencia.MVC.controller;

import java.lang.ProcessBuilder.Redirect;
import java.util.List;
import java.util.Optional;

import com.persistencia.MVC.model.Reserva;
import com.persistencia.MVC.repository.QuartoRepository;
import com.persistencia.MVC.repository.ReservaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@Controller
@RequestMapping("/back/reserva")
public class ReservaController {

    @Autowired
    private ReservaRepository ReservaRepository;

    @PostMapping("/salvar")
    public String adicionar(Reserva reserva){
        ReservaRepository.save(reserva);
        return "redirect:/back/reserva";
    }

    @GetMapping
    public String paginaResevas(){
        return "reserva";
    }

    @DeleteMapping("/delete/{id}")
    //@GetMapping("/delete/{id}")
    public Reserva excluirPorID(@PathVariable Integer id){
        Optional<Reserva> clienteOpcional = ReservaRepository.findById(id);
        ReservaRepository.delete(clienteOpcional.get());
        return clienteOpcional.get();
    }

}

