package com.tka.EmployeeDetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tka.EmployeeDetails.entity.EmpEntity;
import com.tka.EmployeeDetails.service.EmpService;

@RestController
public class EmployeeController {
	@Autowired
	EmpService es;
	
	@PostMapping("/savedata")
	public String insertData(@RequestBody EmpEntity e) {
		
		String msg = es.insertData(e);
		
		return msg;
		
	}

}
