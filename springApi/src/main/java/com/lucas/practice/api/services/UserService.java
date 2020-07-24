package com.lucas.practice.api.services;

import com.lucas.practice.api.entities.User;
import com.lucas.practice.api.repository.interfaces.IUserRepository;
import com.lucas.practice.api.services.interfaces.IUserService;

public class UserService extends BaseService<User, IUserRepository> implements IUserService {
	
	public UserService(IUserRepository repo) 
	{
		super(repo);
	}
	
	@Override
	public boolean Add(User entity) {
		// TODO Auto-generated method stub
		return super.Add(entity);
	}
	
	@Override
	public void Delete(User entity) {
		// TODO Auto-generated method stub
		super.Delete(entity);
	}
	
	@Override
	public Iterable<User> GetAll() {
		// TODO Auto-generated method stub
		return super.GetAll();
	}
	@Override
	public User GetById(int id) {
		// TODO Auto-generated method stub
		return super.GetById(id);
	}
	@Override
	public boolean Save() {
		// TODO Auto-generated method stub
		return super.Save();
	}
	@Override
	public void Update(User entity) {
		// TODO Auto-generated method stub
		super.Update(entity);
	}
	
}
