package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Student;
import model.StudentDetails;

public class Viewdata {
	public static void main(String[] args) {
		SessionFactory sf=new Configuration()
				.configure("resources/hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.addAnnotatedClass(StudentDetails.class)
				.buildSessionFactory();
		
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		
//		StudentDetails sd=s.load(StudentDetails.class, 1);
//		
//		System.out.println(sd.getEmail()+" "+sd.getPass()+" "+sd.getStudent().getFname()+" "+sd.getStudent().getLname());
//		tx.commit();
		
		Student st=s.load(Student.class, 3);
		System.out.println(st.getFname()+" "+st.getLname()+" "+st.getStudentDetails().getEmail()+" "+st.getStudentDetails().getPass());
	}
}
