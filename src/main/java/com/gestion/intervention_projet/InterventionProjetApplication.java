package com.gestion.intervention_projet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class InterventionProjetApplication {
	@CrossOrigin("/http://localhost:4200/")
	@GetMapping()
	public static void main(String[] args) {
		SpringApplication.run(InterventionProjetApplication.class, args);
	}

}
