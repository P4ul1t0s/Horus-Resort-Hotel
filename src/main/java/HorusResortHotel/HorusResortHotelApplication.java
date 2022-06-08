package HorusResortHotel;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class HorusResortHotelApplication {

	public static void main(String[] args) {
		SpringApplication.run(HorusResortHotelApplication.class, args);
	
	}

	@GetMapping("/") //url (localhost:8080/)
	public void index(HttpServletResponse response) throws IOException{
		response.sendRedirect("/index.html");  //local arquivo
	}

	@GetMapping("/login")
	public void login(HttpServletResponse response) throws IOException{
		response.sendRedirect("/login.html");
	}

	@GetMapping("/back") 
	public void backHome(HttpServletResponse response) throws IOException{
		response.sendRedirect("/back/home.html"); 
	}

	@GetMapping("/back/funcionarios") //url (localhost:8080/back/funcionarios)
	public void backFuncionarios(HttpServletResponse response) throws IOException{
		response.sendRedirect("/back/funcionarios.html");  //local arquivo
	}
	
	
}


