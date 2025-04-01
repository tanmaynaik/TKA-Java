package com.tka.EmployeeDetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@DeleteMapping("/delemp/{empid}")
	public String deleteData(@PathVariable int empid) {
		String delmsg = es.deleteData(empid);
		
		return delmsg;
	}
	
	@PutMapping("/upemp/{empid}")
	public String updateData(@RequestBody EmpEntity e, @PathVariable int empid) {
		
		String upmsg = es.updateData(e, empid);
		
		return upmsg;
	}
	
	@GetMapping("/getsingledata")
	public EmpEntity getSingleRecord(@RequestParam int empid) {
		EmpEntity e = es.getSingleRecord(empid);
		return e;
	}
	
	@GetMapping("/getalldata")
	public List<Object> getAllRecord(EmpEntity e) {
		List<Object> list = es.getAllRecord(e);
		return list;
	}

}
