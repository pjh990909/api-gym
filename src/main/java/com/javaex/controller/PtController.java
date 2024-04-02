package com.javaex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.PtService;
import com.javaex.util.JsonResult;
import com.javaex.util.JwtUtil;
import com.javaex.vo.PtVo;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class PtController {
	
	@Autowired
	private PtService ptService;
	
	@PostMapping("/api/pt/registration")
	public JsonResult ptRegistration(@RequestBody PtVo ptVo) {
		System.out.println("PtController.ptRegistration()");
		
		//int no = JwtUtil.getNoFromHeader(request);
		//실험~
		int no = 1;
		ptVo.setNo(no);
		
		int count = ptService.exeregistration(ptVo);
		
		return JsonResult.success(count);
	}
}
