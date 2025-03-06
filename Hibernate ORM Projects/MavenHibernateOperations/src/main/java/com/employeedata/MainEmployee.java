package com.employeedata;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainEmployee {

	public static void main(String[] args) {
		
		Configuration cg = new Configuration();
		
		cg.configure("hibernate.cfg.xml");
		cg.addAnnotatedClass(Employee.class);
		
		SessionFactory sf = cg.buildSessionFactory();
		
		Session ss = sf.openSession();
		
		Transaction tt = ss.beginTransaction();
		
		Employee emp = new Employee();
		emp.setEmpid(1);
		emp.setEmpname("Om Korake");
		emp.setDept("MD");
		emp.setSalary(900000);
		emp.setCity("California");
		
		ss.persist(emp);
		
		tt.commit();
		ss.close();
		
	}

}
