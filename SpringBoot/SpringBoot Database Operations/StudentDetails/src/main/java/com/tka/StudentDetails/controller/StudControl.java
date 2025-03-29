package com.tka.StudentDetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tka.StudentDetails.entity.Student;
import com.tka.StudentDetails.service.StdService;

@RestController
public class StudControl {
	
	@Autowired
	StdService std;
	
	@PostMapping("/studentdata")
	public String insertData(@RequestBody Student s) {
		
		String msg = std.insertData(s);
		return msg;
	}

}
