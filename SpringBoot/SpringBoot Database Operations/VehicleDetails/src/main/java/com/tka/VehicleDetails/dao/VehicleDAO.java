package com.tka.VehicleDetails.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.VehicleDetails.entity.Vehicle;

@Repository
public class VehicleDAO {
	
	@Autowired
	SessionFactory factory;
	
	public String inseertData(Vehicle v) {
		
		Session ss = factory.openSession();
		Transaction tt = ss.beginTransaction();
		
		ss.persist(v);
		tt.commit();
		ss.close();
		
		return "Data is inserted";
		
	}
	
	public String deleteData(String noplate) {
		
		Session ss = factory.openSession();
		Transaction tt = ss.beginTransaction();
		
		Vehicle v1 = ss.get(Vehicle.class, noplate);

        ss.remove(v1);
        tt.commit();
        ss.close();

		
		
		return "Data is deleted";
	}

}
