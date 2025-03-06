package com.patientdata;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class MainPatient {

	public static void main(String[] args) {
		Configuration cg = new Configuration();

		cg.configure("hibernate.cfg.xml");
		cg.addAnnotatedClass(Patient.class);

		SessionFactory sf = cg.buildSessionFactory();

		Session ss = sf.openSession();

		Transaction tt = ss.beginTransaction();

		Patient pat = new Patient();
		pat.setPat_id(1);
		pat.setHosp_name("Dhole");
		pat.setAge(40);
		pat.setReason("Accident");
		

		ss.persist(pat);

		tt.commit();
		ss.close();
	}

}
