package com.persistencia.MVC.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.persistencia.MVC.model.Hospede;
import com.persistencia.MVC.model.Quarto;
import com.persistencia.MVC.model.Reserva;
import com.persistencia.MVC.repository.HospedeRepository;
import com.persistencia.MVC.repository.QuartoRepository;
import com.persistencia.MVC.repository.ReservaRepository;

//Nesta classe ficam os endereços pra busca no banco

@RestController
@RequestMapping("/api")
public class ApiGeral {
    
    @Autowired
    private HospedeRepository hospedeDao;

    @Autowired
    private QuartoRepository quartoDao;

    @Autowired
    private ReservaRepository reservaDao;
    
    @GetMapping("/hospedes")
    public List <Hospede> buscarTodos(){
        return hospedeDao.findAll();
    }

    @GetMapping("/quartos")
    public List <Quarto> buscaQuartos(){
        return quartoDao.findAll();
    }

    @GetMapping("/reservas")
    public List<Reserva> listar(){
        return reservaDao.findAll();
    }
}
