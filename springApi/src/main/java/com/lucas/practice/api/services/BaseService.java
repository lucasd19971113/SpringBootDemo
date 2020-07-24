package com.lucas.practice.api.services;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.lucas.practice.api.entities.BaseModel;
import com.lucas.practice.api.repository.interfaces.IRepository;
import com.lucas.practice.api.services.interfaces.IService;

@Service
@Scope("request")
public class BaseService<T extends BaseModel, Repository extends IRepository<T>> implements IService<T> {
	
	
	
	protected Repository _repo;
	
	public BaseService(Repository repo) 
	{
		_repo = repo;
	}
	
	
	@Override
	public boolean Add(T entity) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public void Delete(T entity) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public Iterable<T> GetAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public T GetById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public boolean Save() {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public void Update(T entity) {
		// TODO Auto-generated method stub
		
	}
}
