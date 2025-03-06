package com.productdata;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainProduct {

	public static void main(String[] args) {
		Configuration cg = new Configuration();
		cg.configure("hibernate.cfg.xml");
		cg.addAnnotatedClass(Product.class);
		
		SessionFactory sf = cg.buildSessionFactory();
		
		Session ss = sf.openSession();
		
		Transaction tt = ss.beginTransaction();
		
		Product p = new Product();
		p.setProd_id(1);
		p.setProd_name("Perfume");
		p.setProd_brand("Nivea");
		p.setProd_color("White");
		p.setProd_price(250);
		
		ss.persist(p);
		tt.commit();
		ss.close();

	}

}
