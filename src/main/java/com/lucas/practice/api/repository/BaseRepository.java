package com.lucas.practice.api.repository;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.lucas.practice.api.entities.BaseModel;
import com.lucas.practice.api.repository.interfaces.IRepository;

@Repository
@Scope("request")
public class BaseRepository<T extends BaseModel> implements IRepository<T> {
	
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
