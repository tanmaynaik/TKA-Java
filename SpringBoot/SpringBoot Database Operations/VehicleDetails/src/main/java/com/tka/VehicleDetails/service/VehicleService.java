package com.tka.VehicleDetails.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.VehicleDetails.dao.VehicleDAO;
import com.tka.VehicleDetails.entity.Vehicle;

@Service
public class VehicleService {

	@Autowired
	VehicleDAO dao;
	
	public String insertData(Vehicle v) {
		
		String msg = dao.inseertData(v);
		return msg;
		
	}
	
	public String deleteData(String noplate) {
		String delmsg = dao.deleteData(noplate);
		return delmsg;
		
	}
	
}
