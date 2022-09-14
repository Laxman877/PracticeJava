package com.dao;

import java.util.List;

import com.model.Admin;
import com.model.User;

public interface AdminDao {
	
	public Admin adminValidate(Admin adlogin);
	public List<User> getAllUser();
}
