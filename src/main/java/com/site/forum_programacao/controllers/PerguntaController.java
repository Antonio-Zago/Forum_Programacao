package com.site.forum_programacao.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.site.forum_programacao.models.Pergunta;
import com.site.forum_programacao.repository.PerguntaRepository;


@Controller
@RequestMapping("/home")
public class PerguntaController {
	
	@Autowired
	private PerguntaRepository perguntaRepository;
	
	@GetMapping
	public String home(Model model) {
		List<Pergunta> perguntas = perguntaRepository.findAll();
		model.addAttribute("perguntas", perguntas);
		return "home"; 
	}
	
}
