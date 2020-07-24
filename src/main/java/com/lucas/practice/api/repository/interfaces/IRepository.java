package com.lucas.practice.api.repository.interfaces;

import com.lucas.practice.api.entities.BaseModel;

public interface IRepository<T extends BaseModel> {
	
	boolean Add(T entity);
	boolean Save();
	T GetById(int id);
	Iterable<T> GetAll();
	void Delete(T entity);
	void Update(T entity);

}
