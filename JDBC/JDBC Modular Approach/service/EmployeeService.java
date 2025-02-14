package com.service;

import com.dao.EmployeeDAO;

public class EmployeeService {

	public void insertData() throws Exception
	{
		EmployeeDAO ed = new EmployeeDAO();
		ed.insertData();
		
	}
	
	public void UpdateData() throws Exception
	{
		EmployeeDAO ed = new EmployeeDAO();
		ed.updateData();
		
	}
	
	public void deleteData() throws Exception
	{
		EmployeeDAO ed = new EmployeeDAO();
		ed.deleteData();
		
	}
	
	public void selectData() throws Exception
	{
		EmployeeDAO ed = new EmployeeDAO();
		ed.selectData();
		
	}
}
