package com.javaex.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.PtVo;

@Repository
public class PtDao {

	@Autowired
	private SqlSession sqlSession;
	
	public int registration(PtVo ptVo) {
		System.out.println("PtDao.registration()");
		
		int count = sqlSession.insert("pt.insert", ptVo);
		
		return count;
	}
	
}
