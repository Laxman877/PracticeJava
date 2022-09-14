package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.Admin;
import com.model.User;
@Transactional
@Repository
public class AdminDaoImpl implements AdminDao {
	@Autowired
	SessionFactory sessionFactory;
	@Override
	public Admin adminValidate(Admin adlogin) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession(); 
		return (Admin) session.createQuery("from Admin a where a.userName='"+adlogin.getUserName()+"' and a.password='"+adlogin.getPassword()+"'").uniqueResult();
	}
	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		return session.createQuery("from User").list();
	}

}
