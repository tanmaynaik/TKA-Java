package com.tka.StudentDetails.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.StudentDetails.entity.Student;

@Repository
public class StdDAO {
	@Autowired
	SessionFactory factory;

	public String insertData(Student s) {

		Session ss = factory.openSession();
		Transaction tt = ss.beginTransaction();
		
		ss.persist(s);
		tt.commit();
		ss.close();
		
		return "Data is inserted";
	}
}
