package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.javaex.service.TrainerService;
import com.javaex.util.JsonResult;
import com.javaex.util.JwtUtil;
import com.javaex.vo.TrainerVo;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@RestController
public class TrainerController {

	@Autowired
	private TrainerService trainerService;


	// 로그인
	@PostMapping("/api/trainer/login")
	public JsonResult login(@RequestBody TrainerVo trainerVo, HttpServletResponse response) {
		System.out.println("TrainerController.login()");

		TrainerVo authUser = trainerService.exeLogin(trainerVo);
		System.out.println(authUser);

		if (authUser != null) {
			// 토큰 발급 헤더에 실어 보낸다
			JwtUtil.createTokenAndSetHeader(response, "" + authUser.getTrainer_no());
			return JsonResult.success(authUser);
		} else {
			return JsonResult.fail("로그인 실패");
		}
	}
	
	//로그인 성공(강사 정보창)
	@GetMapping("/api/trainer/trainermain")
	public JsonResult tranermain(HttpServletRequest request) {
		System.out.println("TrainerController.tranermain()");
		
		int no = JwtUtil.getNoFromHeader(request);
		
		TrainerVo trainerVo = trainerService.exeLoginSeccess(no);
		System.out.println(trainerVo);
		
		
		return JsonResult.success(trainerVo);
	}
	
	//트레이너 소개창
	@GetMapping("api/trainer/trainerintroduction")
	public JsonResult trainerintroduction() {
		System.out.println("TrainerController.trainerintroduction()");
		
		List<TrainerVo> TrainerList = trainerService.exeTrainerList();
		
		System.out.println(TrainerList);
		
		return JsonResult.success(TrainerList);
	}
	
	//트레이너 등록폼(수정폼)
	@GetMapping("api/trainer/trainerupdateinsert")
	public JsonResult trainerupdateinsertform(HttpServletRequest request) {
		System.out.println("TrainerController.trainerupdateinsertform()");
		
		int no = JwtUtil.getNoFromHeader(request);
		
		TrainerVo trainerVo = trainerService.exeTrainerinsertform(no);
		
		
		return JsonResult.success(trainerVo);
	}
	
	//트레이너 수정(등록,수정)
	@PutMapping("api/trainer/trainerupdateinsert")
	public JsonResult trainerupdateinsert(@RequestParam int trainer_no,@RequestParam String career,@RequestParam MultipartFile file) {
		System.out.println("TrainerController.trainerupdateinsert()");
		
		trainerService.exeTrainerupdateinsert(trainer_no, file, career);
		
		return JsonResult.success("성공");
	}
}
