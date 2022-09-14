package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserDao;
import com.model.User;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserDao userDao;
	@Override
	public void addOrUpdateUser(User user) {
		// TODO Auto-generated method stub
		userDao.addOrUpdateUser(user);
	}

	@Override
	public List<User> viewAllUser() {
		// TODO Auto-generated method stub
		return userDao.viewAllUser();
	}

	@Override
	public User getById(int id) {
		// TODO Auto-generated method stub
		return userDao.getById(id);
	}

	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		userDao.deleteUser(id);
	}

	@Override
	public User getUser(String user) {
		// TODO Auto-generated method stub
		return userDao.getUser(user);
	}

}
