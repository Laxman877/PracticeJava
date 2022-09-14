package com.service;

import java.util.List;

import com.model.Admin;
import com.model.User;

public interface AdminService {
	
	public Admin adminValidate(Admin adlogin);
	public List<User> getAllUser();
}
