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
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(user);
	}

	@Override
	public List<User> viewAllUser() {
		// TODO Auto-generated method stub
		Session session =sessionFactory.getCurrentSession();
		return session.createQuery("from User").list();
	}

	@Override
	public User getById(int id) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		return session.get(User.class, id);
	}

	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		User user=session.get(User.class, id);
		session.delete(user);
	}

	@Override
	public User getUser(String user) {
		Session session=sessionFactory.getCurrentSession();
		return (User) session.createQuery("from User u where u.id='"+user+"'").uniqueResult();

	}

}
