package com.tka.EmployeeDetails.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.EmployeeDetails.entity.EmpEntity;


@Repository
public class EmployeeDAO {
	
	@Autowired
	SessionFactory factory;
	
	public String insertData(EmpEntity e) {
		Session ss = factory.openSession();
		Transaction tt = ss.beginTransaction();
		
		ss.persist(e);
		tt.commit();
		ss.close();
		
		return "Data is inserted";
		
	}

}
