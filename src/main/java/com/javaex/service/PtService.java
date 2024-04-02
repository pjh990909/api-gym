package com.javaex.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.PtDao;
import com.javaex.vo.PtVo;

@Service
public class PtService {

	@Autowired
	private PtDao ptDao;
	
	public int exeregistration(PtVo ptVo) {
		System.out.println("PtService.exeregistration()");
		
		int count = ptDao.registration(ptVo);
		
		return count;
	}
	
}
