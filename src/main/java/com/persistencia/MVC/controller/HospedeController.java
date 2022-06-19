package com.persistencia.MVC.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.persistencia.MVC.model.Hospede;
import com.persistencia.MVC.repository.HospedeRepository;

@Controller
public class HospedeController {

    // @Autowired
    // private AlunoServico alunoServico;
    
    @Autowired
    private HospedeRepository hospedeDao;

    
    @PostMapping("/ep-hospedes") 
    public String cadastrar(Hospede hospede){
        hospedeDao.save(hospede);
        return "redirect:/back/hospedes";
    }

    public Hospede getHospedeById(Integer id_Hospede){
        return hospedeDao.findById(id_Hospede).get();
    }

    @GetMapping("/back/hospedes/excluir?")
    public String excluir(@RequestParam Integer id_Hospede){
        Hospede hospede = getHospedeById(id_Hospede);
        hospedeDao.delete(hospede);
        return "redirect:/back/hospedes";
    }

}
