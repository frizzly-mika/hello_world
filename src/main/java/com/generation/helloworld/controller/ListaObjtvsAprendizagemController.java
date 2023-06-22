package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lista-objtvs-aprendizagem")
public class ListaObjtvsAprendizagemController {
	
	@GetMapping
	public String[] listaObjtvsAprendizagem() {
		String vet[] = {"MySQL", "Banco de Dados","Spring Framework"};
		return vet;
	}

}
