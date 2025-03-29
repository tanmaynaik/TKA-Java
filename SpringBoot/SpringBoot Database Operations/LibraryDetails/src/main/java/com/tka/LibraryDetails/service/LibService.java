package com.tka.LibraryDetails.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.LibraryDetails.dao.LibDAO;
import com.tka.LibraryDetails.entity.Library;

@Service
public class LibService {
	
	@Autowired
	LibDAO dao;
	
	public String inserData(Library l) {
		
		String msg = dao.insertData(l);
		return msg;
	}

}
