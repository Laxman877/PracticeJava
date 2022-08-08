package dao;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Employee;

public class Empdao {
	SessionFactory sf=new Configuration()
			.configure("resources/hibernate.cfg.xml")
			.addAnnotatedClass(Employee.class)
			.buildSessionFactory();

	public void addEmp(Employee emp) {
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		s.saveOrUpdate(emp);
		tx.commit();
		s.close();
	}

	public ArrayList<Employee> getAllEmp() {
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		return (ArrayList<Employee>) s.createQuery("from Employee").list();
	}

	public void empDelete(int uid) {
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		Employee emp=s.get(Employee.class, uid);
		s.delete(emp);
		tx.commit();
		s.clear();
	}

	public Employee getById(int uid) {
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		Employee emp=s.get(Employee.class, uid);
		return emp;
	}
	
}
