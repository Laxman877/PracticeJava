package dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import model.Cart;
import model.Items;

public class CartDao {
	SessionFactory sf;
	public CartDao() {
		sf=new Configuration()
				.configure("resources/hibernate.cfg.xml")
				.addAnnotatedClass(Cart.class)
				.addAnnotatedClass(Items.class)
				.buildSessionFactory();
	}
	
}
