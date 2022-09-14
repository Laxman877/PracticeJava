package com.service;

import java.util.List;

import com.model.User;

public interface UserService {
	public void addOrUpdateUser(User user);
	public User getUser(String user);
	public User getById(int id);
	public void deleteUser(int id);
	public User validate(User login);
	
}
