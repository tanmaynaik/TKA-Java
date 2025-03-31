package com.tka.StudentDetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tka.StudentDetails.entity.Student;
import com.tka.StudentDetails.service.StdService;

@RestController
public class StudControl {
	
	@Autowired
	StdService std;
	
	@PostMapping("/studentdatahql")
	public String insertData(@RequestBody Student s) {
		
		String msg = std.insertData(s);
		return msg;
	}
	
	@DeleteMapping("/delstdhql/{rollno}")
	public String deleteData(@PathVariable int rollno) {
		
		String delmsg = std.deleteData(rollno);
		return delmsg;
	}
	
	@PutMapping("/updatestudent/{rollno}")
	public String updateData(@RequestBody Student s, @PathVariable int rollno) {
		
		String updatemsg = std.updateData(s, rollno);
		return updatemsg;
	}
	
	@GetMapping("/singledata/{rollno}")
	public Student getSingleData(@PathVariable int rollno) {
		
		Student msg = std.getSingleData(rollno);
		return msg;
	}
	
	@GetMapping("/getalldata")
	public List<Student> getAllData(Student s) {
		
		List<Student> list = std.getAllData(s);
		return list;
	}

}
