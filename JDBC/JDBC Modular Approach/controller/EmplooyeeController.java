package com.controller;

import com.service.EmployeeService;

public class EmplooyeeController {

	public static void main(String[] args) throws Exception {
		EmployeeService es = new EmployeeService();
//		es.insertData();
		
//		es.UpdateData();
		
//		es.deleteData();
		
		es.selectData();
	}

}
