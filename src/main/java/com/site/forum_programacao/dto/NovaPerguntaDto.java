package com.site.forum_programacao.dto;

import com.site.forum_programacao.models.Pergunta;

public class NovaPerguntaDto {
	
	private String descricao;
	
	private String titulo;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Pergunta toPergunta() {
		
		Pergunta pergunta = new Pergunta();
		pergunta.setDescricao(this.descricao);
		pergunta.setTitulo(this.titulo);
		
		return pergunta;
	}
	
	
	 

}
