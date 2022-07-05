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
	
	@RequestMapping("/back/hospedes")
    public String hospedes(){
        return "hospedes";
    }
	
	@RequestMapping("/reserva")
    public String quartos(){
        return "frontQuartos";
    }
}
