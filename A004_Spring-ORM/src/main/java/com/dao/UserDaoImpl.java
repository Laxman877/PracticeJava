package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.User;
@Transactional
@Repository
public class UserDaoImpl implements UserDao {
	@Autowired
	SessionFactory sessionFactory;
	@Override
	public void addOrUpdateUser(User user) {
		// TODO Auto-generated method stub
		Session s=sessionFactory.getCurrentSession();
		s.saveOrUpdate(user);
	}

	

	@Override
	public User getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		User user= session.get(User.class, id);
		session.delete(user);
	}

	@Override
	public User validate(User login) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		User user= (User) session.createQuery("from User u where u.email='"+login.getEmail()+"' and u.password='"+login.getPassword()+"'").uniqueResult();
		return user;
	}



	@Override
	public User getUser(String user) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		return (User) session.createQuery("from User u where u.email='"+user+"'").uniqueResult();
	}

}
