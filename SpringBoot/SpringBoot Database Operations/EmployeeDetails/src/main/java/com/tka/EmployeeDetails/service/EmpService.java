package com.tka.EmployeeDetails.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.EmployeeDetails.dao.EmployeeDAO;
import com.tka.EmployeeDetails.entity.EmpEntity;

@Service
public class EmpService {
	
	@Autowired
	EmployeeDAO dao;
	
	public String insertData(EmpEntity e) {
		
		String rts = dao.insertData(e);
		
		return rts;
		
	}

}
