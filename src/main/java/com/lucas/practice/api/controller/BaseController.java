package com.lucas.practice.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucas.practice.api.entities.BaseModel;
import com.lucas.practice.api.services.interfaces.IService;

@RestController
public abstract class BaseController<TModel extends BaseModel, 
									Service extends IService<TModel>> 
{
	protected Service _service;
	
	public BaseController(Service service) 
	{
		_service = service;
	}
	
	@GetMapping
	@RequestMapping("/health")
	public String HealthCheck() {
		
		return "Funcionando";
	}

}
