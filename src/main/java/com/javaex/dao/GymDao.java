package com.javaex.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class GymDao {

	private SqlSession splSession;
	
	public String trainerJoin() {
		System.out.println("GymDao.trainerJoin()");
		
		return"";
	}
}
