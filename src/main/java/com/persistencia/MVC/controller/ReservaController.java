package com.persistencia.MVC.controller;

import java.lang.ProcessBuilder.Redirect;
import java.util.List;

import com.persistencia.MVC.model.Quarto;
import com.persistencia.MVC.model.Reserva;
import com.persistencia.MVC.repository.QuartoRepository;
import com.persistencia.MVC.repository.ReservaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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

    @Autowired
    private QuartoRepository quartoRepository;
    
    private Reserva reserva;
    private Quarto quarto;

    @PostMapping("/salvar")
    public String adicionar(@RequestParam(name="checkin") String checkin,
                            @RequestParam(name="checkout") String checkout,
                            @RequestParam(name="adultos") String adultos,
                            @RequestParam(name="criancas") String criancas,
                            @RequestParam(name="status") String status, 
                            @RequestParam(name="idQuarto") String idQuarto,
                            @RequestParam(name="valorTotal") String valorTotal){
        
        reserva = new Reserva();
        
        reserva.setCheckin(checkin);
        reserva.setCheckout(checkout);
        reserva.setStatus("Pendente");
        reserva.setAdultos(Integer.parseInt(adultos));
        reserva.setCriancas(Integer.parseInt(criancas));
        reserva.setValorTotal(Float.parseFloat(valorTotal));
        // reserva.setQuarto(quartoRepository.findById(idQuarto));
        // ReservaRepository.save(reserva);
        return "redirect:/back/reserva";
    }

    @GetMapping
    public String paginaResevas(){
        return "reserva";
    }

}

