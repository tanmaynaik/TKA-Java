package com.patientdata;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeletePatient {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Patient.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tt = ss.beginTransaction();
		
		int pat_id = 1;
		Patient pat = ss.get(Patient.class, pat_id);
		
		ss.remove(pat);
		System.out.println("Data Deleted");
		
		tt.commit();
		ss.close();
	}
	
}
