package dao;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.User01;

public class UserDao {
	SessionFactory sf;
	public UserDao() {
		sf=new Configuration()
			.configure("resources/hibernate.cfg.xml")
			.addAnnotatedClass(User01.class)
			.buildSessionFactory();
	}
	public void addEmp(User01 u) {
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		s.saveOrUpdate(u);
		tx.commit();
		s.close();
	}
	public ArrayList<User01> getAllEmp() {
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		return (ArrayList<User01>) s.createQuery("from User01").list();
	}
	public void deleteEmp(int uid) {
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		User01 u=s.get(User01.class, uid);
		s.delete(u);
		tx.commit();
		s.close();
	}
	public User01 getById(int uid) {
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		User01 u=s.get(User01.class, uid);
		return u;
	}
}
