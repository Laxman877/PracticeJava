package com.dao;

import java.util.List;

import com.model.User;

public interface UserDao {
	public void addOrUpdateUser(User user);
	public List<User> viewAllUser();
	public User getById(int id);
	public void deleteUser(int id);
	public User getUser(String user);
	
}
