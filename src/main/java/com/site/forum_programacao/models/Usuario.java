package com.site.forum_programacao.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Usuario {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUsuario;
	
	@OneToMany(mappedBy = "usuario")
	private List<Pergunta> perguntas;
	
	@OneToMany(mappedBy = "usuario")
	private List<Resposta> respostas;
	
	
	private String nome;


	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}


	public List<Pergunta> getPerguntas() {
		return perguntas;
	}


	public void setPerguntas(List<Pergunta> perguntas) {
		this.perguntas = perguntas;
	}


	public List<Resposta> getRespostas() {
		return respostas;
	}


	public void setRespostas(List<Resposta> respostas) {
		this.respostas = respostas;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

	
}
