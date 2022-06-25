package com.persistencia.MVC.controller;

import com.persistencia.MVC.model.Reserva;
import com.persistencia.MVC.repository.ReservaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/reserva")

public class ReservaController {

    @Autowired
    private ReservaRepository ReservaRepository;


@PostMapping("/salvar")
public String adicionar(Reserva reserva){
    ReservaRepository.save(reserva);
     return "redirect:/reserva";
}
@GetMapping
public String FormReserva(){

return "reserva";


}
    
}