package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // anotacao responsavel por setar a config desta classe 
@RequestMapping("/hello-world") //o endereco da classe Controller esta no end point hello-world
public class HelloWorldController {
	
	@GetMapping //fazemos uma anotacao com o Metodo get
	public String helloWorld() {
		return "Hello Crazy World";
	}

}
