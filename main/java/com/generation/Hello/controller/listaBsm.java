package com.generation.Hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

	@RestController
	@RequestMapping("/lista-bsm")
	public class listaBsm {
		@GetMapping
		
		public String lista() {
			return "Proatividade, Comunicação, Orientação ao Detalhe, Orientação ao Futuro, Mentalidade de Crescimento, etc...";
		}
		

	}

