package com.employeedata;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteEmployee {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tt = ss.beginTransaction();
		
		int empid = 1;
		Employee emp1 = ss.get(Employee.class, empid);
		
		ss.remove(emp1);
		System.out.println("Data Deleted");
		
		tt.commit();
		ss.close();
	}
	
}
