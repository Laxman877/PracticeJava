package main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Category;
import model.Product;

public class ViewData {
	public static void main(String[] args) {
		SessionFactory sf=new Configuration()
				.configure("resources/hibernate.cfg.xml")
				.addAnnotatedClass(Category.class)
				.addAnnotatedClass(Product.class)
				.buildSessionFactory();
		
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		//all product
//		List<Category> cat=s.createQuery("from Category").list();
//		for(Category ct:cat) {
//			System.out.println(ct.getCid()+" "+ct.getCname());
//			for(Product p:ct.getProduct()) {
//				System.out.println(p.getPid()+" "+p.getPname()+" "+p.getPrice());
//			}
//			System.out.println("********************");
//		}
		
		//prod by cat
//		Category cat=s.load(Category.class, 4);
//		System.out.println(cat.getCid()+" "+cat.getCname());
//		for(Product p:cat.getProduct()) {
//			System.out.println(p.getPid()+" "+p.getPname()+" "+p.getPrice());
//		}
		//cat by prod
		Product p=s.load(Product.class, 4);
		System.out.println(p.getPid()+" "+p.getPname()+" "+p.getPrice()+" "+p.getCategory().getCname());
	}
}
