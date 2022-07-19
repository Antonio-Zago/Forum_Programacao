package com.site.forum_programacao.models;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;



@Entity
public class Pergunta {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPergunta;
	
	@Lob 
	private String descricao;
	
	@ManyToOne
	@JoinColumn(name = "idUsuario")
	private Usuario usuario;
	
	
	@OneToMany(mappedBy = "pergunta")
	private List<Resposta> respostas;
	
	
	@Enumerated(EnumType.STRING)
	private StatusPergunta status;
	
	
	private LocalDateTime dataPergunta;

	private String titulo;
	
	@ManyToOne
	private User user;
	
	
	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public LocalDateTime getDataPergunta() {
		return dataPergunta;
	}


	public void setDataPergunta(LocalDateTime dataPergunta) {
		this.dataPergunta = dataPergunta;
	}


	public StatusPergunta getStatus() {
		return status;
	}


	public void setStatus(StatusPergunta status) {
		this.status = status;
	}


	public Long getIdPergunta() {
		return idPergunta;
	}


	public void setIdPergunta(Long idPergunta) {
		this.idPergunta = idPergunta;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}


	public List<Resposta> getRespostas() {
		return respostas;
	}


	public void setRespostas(List<Resposta> respostas) {
		this.respostas = respostas;
	} 
	
	
	
}
