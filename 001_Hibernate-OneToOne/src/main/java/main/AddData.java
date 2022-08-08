package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Student;
import model.StudentDetails;

public class AddData {
	public static void main(String[] args) {
		SessionFactory sf=new Configuration()
				.configure("resources/hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.addAnnotatedClass(StudentDetails.class)
				.buildSessionFactory();
		
		Student st=new Student();
		st.setFname("kunal");
		st.setLname("pendhrakar");
		
		StudentDetails sd=new StudentDetails();
		sd.setEmail("kunal@gmail.com");
		sd.setPass("kunal321");
		sd.setStudent(st);
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		s.save(st);
		s.save(sd);
		tx.commit();
		
	}
}
