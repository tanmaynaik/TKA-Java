package com.service;

import com.dao.StudentDAO;

public class StudentService {
	public void insertData() throws Exception {
		StudentDAO ed = new StudentDAO();
		ed.insertData();

	}

	public void updateData() throws Exception {
		StudentDAO ed = new StudentDAO();
		ed.updateData();

	}

	public void deleteData() throws Exception {
		StudentDAO ed = new StudentDAO();
		ed.deleteData();

	}

	public void selectData() throws Exception {
		StudentDAO ed = new StudentDAO();
		ed.selectData();

	}
}
