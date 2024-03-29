package com.javaex.service;

import org.springframework.stereotype.Service;

import com.javaex.dao.GymDao;

@Service
public class GymService {

	private GymDao gymDao;
	
	public String exeTrainerJoin() {
		System.out.println("GymService.exeTrainerJoin()");
		
		return "";
	}
	
}
