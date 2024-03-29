package com.javaex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.GymService;

@RestController
public class GymController {

	@Autowired
	private GymService gymService;
	
	@PostMapping(value="/api/gym")
	public String trainerjoin() {
		System.out.println("GymController.trainerjoin()");
		
		
		
		return "";
	}
}
