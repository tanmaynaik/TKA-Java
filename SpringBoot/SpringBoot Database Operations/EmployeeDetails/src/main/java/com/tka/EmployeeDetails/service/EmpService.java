package com.tka.EmployeeDetails.service;

import java.util.List;

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

	public String deleteData(int empid) {

		String delmsg = dao.deleteData(empid);
		return delmsg;
	}

	public String updateData(EmpEntity e, int empid) {

		String upmsg = dao.updateData(e, empid);
		return upmsg;
	}

	public EmpEntity getSingleRecord(int empid) {
		EmpEntity e = dao.getSingleData(empid);
		return e;
	}

	public List<Object> getAllRecord(EmpEntity e) {
		List<Object> list = dao.getAllRecord(e);
		return list;
	}

}
