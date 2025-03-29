package com.tka.VehicleDetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tka.VehicleDetails.entity.Vehicle;
import com.tka.VehicleDetails.service.VehicleService;

@RestController
public class VehicleControl {
	
	@Autowired
	VehicleService vs;
	
	@PostMapping("/vehicleadd")
	public String insertData(@RequestBody Vehicle v) {
		
		String msg = vs.insertData(v);
		
		return msg;
		
	}
	
	@DeleteMapping("/vehicledelete/{noplate}")
	public String deleteData(@PathVariable String noplate) {
		String delmsg = vs.deleteData(noplate);
		return delmsg;
	}

}
