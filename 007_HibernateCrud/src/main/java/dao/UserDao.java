package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Employee;

public class UserDao {
	SessionFactory sf=new Configuration()
			.configure("resources/hibernate.cfg.xml")
			.addAnnotatedClass(Employee.class)
			.buildSessionFactory();

	public void regUser(Employee emp) {
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		s.saveOrUpdate(emp);
		tx.commit();
		s.close();
	}

	public Employee isExist(Employee emp) {
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		Employee em= (Employee) s.createQuery("from Employee e where e.email='"+emp.getEmail()+"'").uniqueResult();
		return em;
	}

	public List<Employee> viewAllEmp() {
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		return s.createQuery("from Employee").list();
	}
	
}
