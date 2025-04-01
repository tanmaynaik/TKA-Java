package com.tka.StudentDetails.service;

import java.util.List;

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
	
	public String deleteData(int rollno) {
		String delmsg = dao.deleteData(rollno);
		return delmsg;
	}
	
	public String updateData(Student s, int rollno) {
		String updatemsg = dao.updateData(s, rollno);
		return updatemsg;
	}
	
	public Student getSingleData(int rollno) {
		Student msg = dao.getSingleData(rollno);
		return msg;
	}
	
	public List<Student> getAllData(Student s) {
		
		List<Student> std = dao.getAllRecord(s);
		return std;
	}

}
