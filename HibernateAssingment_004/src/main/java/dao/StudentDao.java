package dao;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Address;
import model.Student;

public class StudentDao {
	SessionFactory sf;
	public StudentDao() {
		sf=new Configuration()
				.configure("resources/hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.addAnnotatedClass(Address.class)
				.buildSessionFactory();
	}
	public void regStudent(Student st) {
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		s.saveOrUpdate(st);
		tx.commit();
		s.close();
	}
	public ArrayList<Student> getAllStudent() {
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		return (ArrayList<Student>) s.createQuery("from Student").list();
	}
	public void deleteData(int uid) {
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		Student std=s.load(Student.class, uid);
		s.delete(std);
		tx.commit();
		s.close();
	}
	public Student getById(int uid) {
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		Student st=s.get(Student.class, uid);
		return st;
	}
	
}
