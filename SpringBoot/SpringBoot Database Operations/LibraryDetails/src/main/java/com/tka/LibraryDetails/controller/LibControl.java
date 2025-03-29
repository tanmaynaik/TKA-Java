package com.tka.LibraryDetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tka.LibraryDetails.entity.Library;
import com.tka.LibraryDetails.service.LibService;

@RestController
public class LibControl {
	
	@Autowired
	LibService ls;
	
	@PostMapping("/bookdata")
	public String insertData(@RequestBody Library l) {
		
		String msg = ls.inserData(l);
		return msg;
		
	}

}
