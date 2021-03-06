package com.lucas.practice.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucas.practice.api.entities.User;
import com.lucas.practice.api.services.interfaces.IUserService;

@RequestMapping("/api/user")
@RestController
public class UserController extends BaseController<User,IUserService> {
	
	
	
	public UserController(IUserService service) 
	{
		super(service);
	}
	
	@GetMapping
	@RequestMapping("/test")
	public String Test() 
	{
		boolean res = super._service.Add(new User());
		
		return "Teste";
	}
}
