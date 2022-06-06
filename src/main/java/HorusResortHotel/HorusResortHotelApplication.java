package HorusResortHotel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@Controller
//@RestController
public class HorusResortHotelApplication {

	public static void main(String[] args) {
		SpringApplication.run(HorusResortHotelApplication.class, args);
	
	}

	@RequestMapping("/back/funcionarios")
	public String backFuncionarios(){
		return "funcionarios.html";
	}

	@GetMapping("/")
	public String index(){
		return "index.html";
	}

}
