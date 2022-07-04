package com.persistencia;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class geralController {

	@RequestMapping("/") 
	public String returnIndex(){
		return "index";
	}
    
	@RequestMapping("/login") 
	public String returnLogin(){
		return "login";
	}

	@RequestMapping("/back") 
	public String returnHome(){
		return "home";
	}

	@RequestMapping("/back/funcionarios")
    public String formCadCliente(){
        return "funcionarios";
	}
	@RequestMapping("/formCadHospede")
    public String formCadHospede(){
        return "formCadHospede";
    }

    @RequestMapping("/gerenciar")
    public String gerenciar(){
        return "gerenciar";
    }
}

