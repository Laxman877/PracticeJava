package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Reader;
import model.Subscription;

public class ReaderDao {
	SessionFactory sf;
	public ReaderDao() {
		// TODO Auto-generated constructor stub
		sf=new Configuration()
				.configure("resources/hibernate.cfg.xml")
				.addAnnotatedClass(Reader.class)
				.addAnnotatedClass(Subscription.class)
				.buildSessionFactory();
	}
	public List<Subscription> viewAllSubscrib() {
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		return s.createQuery("from Subscription").list();
	}
	public void addsubcriber(Subscription sub) {
		// TODO Auto-generated method stub
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		s.save(sub);
		tx.commit();
	}
	public void aadReader(Reader reader) {
		// TODO Auto-generated method stub
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		s.save(reader);
		tx.commit();
	}
	public List<Reader> viewAllReader() {
		// TODO Auto-generated method stub
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		return s.createQuery("from Reader").list();
	}
	
	
}
