package com.site.forum_programacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.site.forum_programacao.models.User;



@Repository
public interface UserRepository extends JpaRepository<User, String>{
	
	User findByUsername(String username);
	
}
