package com.lucas.practice.api.services.interfaces;

import org.springframework.stereotype.Service;

import com.lucas.practice.api.entities.BaseModel;

@Service
public interface IService<T extends BaseModel> {
	
	boolean Add(T entity);
	boolean Save();
	T GetById(int id);
	Iterable<T> GetAll();
	void Delete(T entity);
	void Update(T entity);

}
