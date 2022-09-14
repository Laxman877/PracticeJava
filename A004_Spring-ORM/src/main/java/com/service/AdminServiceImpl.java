package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.AdminDao;
import com.model.Admin;
import com.model.User;
@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
	AdminDao adminDao;

	@Override
	public Admin adminValidate(Admin adlogin) {
		// TODO Auto-generated method stub
		return adminDao.adminValidate(adlogin);
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return adminDao.getAllUser();
	}
}
