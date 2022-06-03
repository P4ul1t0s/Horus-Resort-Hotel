package HorusResortHotel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HorusResortHotelApplication {

	public static void main(String[] args) {
		SpringApplication.run(HorusResortHotelApplication.class, args);
	
	}

	@RequestMapping("/Ola")
	public String Ola() {
		return "Olá Mundo!";
	}

}