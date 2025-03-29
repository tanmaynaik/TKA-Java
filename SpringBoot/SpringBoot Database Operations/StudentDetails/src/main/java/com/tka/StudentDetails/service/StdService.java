package com.tka.StudentDetails.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.StudentDetails.dao.StdDAO;
import com.tka.StudentDetails.entity.Student;

@Service
public class StdService {
	
	@Autowired
	StdDAO dao;
	
	public String insertData(Student s) {
		String msg = dao.insertData(s);
		return msg;
	}

}
