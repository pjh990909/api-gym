package com.javaex.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.TrainerDao;
import com.javaex.vo.TrainerVo;

@Service
public class TrainerService {
	@Autowired
	private TrainerDao trainerDao;

	// 로그인
	public TrainerVo exeLogin(TrainerVo trainerVo) {
		System.out.println("TrainerService.exeLogin()");
		TrainerVo authUser = trainerDao.trainerSelectByIdPw(trainerVo);
		return authUser;
	}
	
	//강사정보
	public TrainerVo exeLoginSeccess(int no) {
		System.out.println("TrainerService.exeLoginSeccess()");
		
		return trainerDao.loginSeccess(no);
	}
	
	//트레이너소개 및 pt등록창
	public TrainerVo exeTrainerList() {
		
		trainerDao.trainerList();
		return null;
	}
	
}
