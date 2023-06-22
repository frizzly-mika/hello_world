package com.generation.helloworld.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lista-bsms")
public class ListaBSMsController {
	
	@GetMapping
	public ArrayList listaBSMs() {
		
		ArrayList<String> listaBSMs = new ArrayList<String>();
		
		listaBSMs.add("Responsabilidade Pessoal");
		listaBSMs.add("Mentalidade de Crescimento");
		listaBSMs.add("Orientação para o Futuro");
		listaBSMs.add("Persistância");
		listaBSMs.add("Comunicação");
		listaBSMs.add("Trabalho em equipe");
		listaBSMs.add("Proatividade");
		listaBSMs.add("Orientação ao Detalhe");
		
		return listaBSMs;
	}

}
