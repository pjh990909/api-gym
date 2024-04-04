package com.javaex.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.PtService;
import com.javaex.util.JsonResult;
import com.javaex.util.JwtUtil;
import com.javaex.vo.PageVo;
import com.javaex.vo.PtVo;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class PtController {
	
	@Autowired
	private PtService ptService;
	
	@PostMapping("/api/pt/registration")
	public JsonResult ptRegistration(@RequestBody PtVo ptVo,HttpServletRequest request) {
		System.out.println("PtController.ptRegistration()");
		
		int no = JwtUtil.getNoFromHeader(request);
		System.out.println(no);
		
		ptVo.setNo(no);
		
		int count = ptService.exeregistration(ptVo);
		
		return JsonResult.success(count);
	}
	
	@PostMapping("/api/pt/mymemberlist")
	public JsonResult mymemberlist(HttpServletRequest request,
								   @RequestBody PageVo pageVo
								   
								   ){
		System.out.println("PtController.mymemberlist()");
		
		System.out.println(pageVo);
		
		int trainer_no = JwtUtil.getNoFromHeader(request);
		
		Map<String, Object> pMap = ptService.exeMyMemberList(trainer_no,pageVo.getCrtPage(),pageVo.getKeyword());
		
		
		
		return JsonResult.success(pMap);
	}
	
	
}
