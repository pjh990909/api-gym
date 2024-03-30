package com.javaex.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.TrainerVo;

@Repository
public class TrainerDao {
	@Autowired
	private SqlSession splSession;
	
	
	//로그인
	public TrainerVo trainerSelectByIdPw(TrainerVo trainerVo) {
		System.out.println("TrainerDao.memberSelectByIdPw()");
		
		TrainerVo authUser = splSession.selectOne("trainer.selectByIdPw", trainerVo);
		
		return authUser;
	}
	
	//강사정보
	public TrainerVo loginSeccess(int no) {
		System.out.println("TrainerDao.loginSeccess()");
		
		return splSession.selectOne("trainer.selectTinformation", no);
	}
	
	//트레이너 소개 및 pt등록창
	public TrainerVo trainerList() {
		System.out.println("TrainerDao.trainerList()");
		
		return null;
	}
}
