package com.generation.Hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
	@RequestMapping ("/Objetivos-Semanais")
	public class listaObjetivosSemanais {
		
		@GetMapping
		public String listaObjetivos() {
			return "Realizar todas as atividades, rever conteúdo de aula, praticar o pitch pessoal, etc...";
		}
	}

