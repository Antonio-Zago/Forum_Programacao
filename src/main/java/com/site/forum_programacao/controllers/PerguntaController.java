package com.site.forum_programacao.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.site.forum_programacao.dto.NovaPerguntaDto;
import com.site.forum_programacao.models.Pergunta;
import com.site.forum_programacao.models.User;
import com.site.forum_programacao.repository.PerguntaRepository;
import com.site.forum_programacao.repository.UserRepository;



@Controller
@RequestMapping("/pergunta")
public class PerguntaController {
	
	@Autowired
	PerguntaRepository perguntaRepository;
	
	@Autowired
	UserRepository userRepository;

	@GetMapping("formulario") 
	public String formulario(NovaPerguntaDto novaPerguntaDto) {
		return "pergunta/formulario";
	}
	
	@PostMapping("novo")
	public String novo(NovaPerguntaDto novaPerguntaDto) {
		
		
		String username = SecurityContextHolder.getContext().getAuthentication().getName();
		
		Pergunta pergunta = novaPerguntaDto.toPergunta();
		User usuario = userRepository.findByUsername(username);
		
		
		pergunta.setUser(usuario);
		
		
		perguntaRepository.save(pergunta);
		
		return "redirect:/home";
	}

	
}
