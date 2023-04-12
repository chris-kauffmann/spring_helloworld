package org.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//indica para o spring que o código abaixo será um Controller, ou um controlador da nossa api
@RestController

//indica o endpoint da nossa classe controladora
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
	public String hello() {
		
		return "Hello World";
		
	}
	
	@GetMapping("/bsm")//subrota
	public String bsm() {
		return "Mentalidade de Crescimento, Persistencia, Responsabilidade Pessoal, Orientação ao Futuro, Comunicação, Orientação ao Detalhe, Proatividade, Trabalho em Equipe";
	}
	
	@GetMapping("/objetivos")//subrota
	public String objetivo() {
		return "Orientação aos detalhes e Gestão de Tempo";
	}

}
