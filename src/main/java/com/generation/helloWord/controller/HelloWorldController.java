package com.generation.helloWord.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")

public class HelloWorldController {
	
	@GetMapping("/hello")
	public String helloWorld() {
		return "Hello World!!!";
	}
	
	@GetMapping("/bsm")
	public String bsm() {
		return "Bsm Generation Brasil: Mentalidade de crescimento, orientação ao detalhe, responsabilidade pessoal, orientação ao futuro,"
				+ "proatividade, comunicação, persistência";
	}
	
	@GetMapping("/aprendizado da semana")
	public String aprendizado() {
		return "Spring";
	}

}
