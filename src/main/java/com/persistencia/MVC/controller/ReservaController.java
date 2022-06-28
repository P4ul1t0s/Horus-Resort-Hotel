package com.persistencia.MVC.controller;

import java.util.List;

import com.persistencia.MVC.model.Reserva;
import com.persistencia.MVC.repository.ReservaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/reserva")
public class ReservaController {

    @Autowired
    private ReservaRepository ReservaRepository;


@PostMapping("/salvar")
public Reserva adicionar(Reserva reserva){
    return ReservaRepository.save(reserva);
}

@GetMapping
public List<Reserva> listar(){
    return ReservaRepository.findAll();
}

}

