package com.tka.LibraryDetails.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.LibraryDetails.entity.Library;

@Repository
public class LibDAO {

	@Autowired
	SessionFactory factory;
	
	public String insertData(Library l) {
		Session ss = factory.openSession();
		Transaction tt = ss.beginTransaction();
		
		ss.persist(l);
		tt.commit();
		ss.close();
		
		return "Data is Inserted";
	}
	
}
