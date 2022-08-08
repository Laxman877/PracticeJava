package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Category;
import model.Product;

public class AddData {
	public static void main(String[] args) {
		SessionFactory sf=new Configuration()
				.configure("resources/hibernate.cfg.xml")
				.addAnnotatedClass(Category.class)
				.addAnnotatedClass(Product.class)
				.buildSessionFactory();
		
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		
		Category ct=new Category();
		ct.setCname("furniture");
		
		Product p1=new Product();
		p1.setPname("sofa");
		p1.setPrice(40000);
		p1.setCategory(ct);
		
		Product p2=new Product();
		p2.setPname("coupboard");
		p2.setPrice(25000);
		p2.setCategory(ct);
		
		s.save(ct);
		s.save(p1);
		s.save(p2);
		tx.commit();
	}
}
