package com.persistencia.MVC.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;


import com.persistencia.MVC.model.Hospede;
import com.persistencia.MVC.repository.HospedeRepository;

@Controller
public class HospedeController {
    
    @Autowired
    private HospedeRepository hospedeDao;

    
    @PostMapping("/ep-hospedes") 
    public String cadastrar(Hospede hospede){
        hospedeDao.save(hospede);
        return "redirect:/back/hospedes";
    }

}
