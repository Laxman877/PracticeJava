package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.User;

public class UserDao {
	SessionFactory sf;
	public UserDao() {
		sf=new Configuration()
				.configure("resources/hibernate.cfg.xml")
				.addAnnotatedClass(User.class)
				.buildSessionFactory();
	}
	public void regUser(User u) {
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		s.saveOrUpdate(u);
		tx.commit();
		s.close();
	}
	public User isEmailExist(User u) {
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		String qry="from User u where u.email='"+u.getEmail()+"'";
		User us=(User) s.createQuery(qry).uniqueResult();
		return us;
	}
	public boolean logincheck(User u) {
		boolean b=false;
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		String qry="from User us where us.email='"+u.getEmail()+"' and us.pass='"+u.getPass()+"'";
		User us=(User) s.createQuery(qry).uniqueResult();
		if(us!=null) {
			b=true;
		}
		return b;
	}
	public User getUser(String user) {
		Session  s=sf.openSession();
		Transaction tx=s.beginTransaction();
		return (User) s.createQuery("from User u where u.email='"+user+"'").uniqueResult();
	}
	public User getById(int uid) {
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		User u=s.get(User.class, uid);
		return u;
	}
	
}
