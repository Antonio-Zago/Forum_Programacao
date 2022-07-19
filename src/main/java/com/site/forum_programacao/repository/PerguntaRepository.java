package com.site.forum_programacao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.site.forum_programacao.models.Pergunta;

@Repository
public interface PerguntaRepository extends JpaRepository<Pergunta, Long>{

	
	
}
