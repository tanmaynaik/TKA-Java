package com.springapis.SpringAPIs;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/flight")
public class MyController {

	@RequestMapping(value = "/indigo", method= RequestMethod.GET)
	public String indigo() {
		return "This is Indigo Airlines";
	}
	
	
	@RequestMapping(value = "/spicejet", method = RequestMethod.POST)
	public String spicejet() {
		return "This is Spicejet";
	}
	
	@RequestMapping(value = "/airindia", method = RequestMethod.PUT)
	public String airindia() {
		return "This is AirIndia";
	}
	
	@RequestMapping(value = "/vistara", method = RequestMethod.DELETE)
	public String vistara() {
		return "This is Vistara";
	}
	
	@GetMapping("/qatarairways")
	public String qatarairways() {
		return "This is Qatar Airways";
	}
	
	@PostMapping("/airasia")
	public String airasia() {
		return "This is Air Asia";
	}
	
	@PutMapping("/easyjet")
	public String easyjet() {
		return "This is EasyJet";
	}
	
	@DeleteMapping("/jetblue")
	public String jetblue() {
		return "This is Jet Blue Airline";
	}

}
