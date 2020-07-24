package com.lucas.practice.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.lucas.practice.api.repository.UserRepository;
import com.lucas.practice.api.repository.interfaces.IUserRepository;
import com.lucas.practice.api.services.UserService;
import com.lucas.practice.api.services.interfaces.IUserService;

@Configuration
public class AppConfig {

	@Bean
	public IUserService userService() 
	{
		UserRepository repo = new UserRepository();
	    UserService service = new UserService(repo);
	    return service;
	}
	
	@Bean
	public IUserRepository userRepository() 
	{
		UserRepository repo = new UserRepository();
	    return repo;
	}
}
