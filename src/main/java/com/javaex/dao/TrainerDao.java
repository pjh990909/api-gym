package com.javaex.dao;

import java.util.List;

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
	
	//강사정보2
	public TrainerVo login2(int no) {
		
		
		
		return splSession.selectOne("trainer.selectTinformation2", no);
	}
	
	//트레이너 소개 및 pt등록창
	public List<TrainerVo> trainerList() {
		System.out.println("TrainerDao.trainerList()");
		
		List<TrainerVo> TrainerList = splSession.selectList("trainer.selectTrainerList");
		
		return TrainerList;
	}
	
	//트레이너 등록폼(수정)
	public TrainerVo trainerinsertform(int no) {
		System.out.println("TrainerDao.trainerinsertform()");
		
		TrainerVo trainerVo = splSession.selectOne("trainer.trainerinsertform", no);
		System.out.println(trainerVo);
		
		return trainerVo;
	}
	//트레이너 수정(등록,수정)
	public void trainerupdateinsert(TrainerVo trainerVo) {
		System.out.println("TrainerDao.trainerupdateinsert()");
		
		splSession.update("trainer.Tupdateinsert",trainerVo);
		
		
	}
}
