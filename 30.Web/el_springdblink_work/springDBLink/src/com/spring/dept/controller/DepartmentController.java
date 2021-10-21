package com.spring.dept.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.dept.service.DeptService;
import com.spring.dept.vo.DeptVO;

@Controller
//@RequestMapping(value="/department")
public class DepartmentController {
	private Logger logger = Logger.getLogger(DepartmentController.class);
	private static final String CONTEXT_PATH = "dept";
	
	@Autowired
	private DeptService deptService;
	
	// 전체 조회
	@RequestMapping("/listDepartment")
	public ModelAndView listDepartment(@ModelAttribute DeptVO param) {
		
		List<DeptVO> list = deptService.listDepartment(param);
		
		ModelAndView mav = new ModelAndView();
		
		return mav;
	}
	// 상세 정보 보기
	@RequestMapping("/selectDepartment")
	public ModelAndView selectDepartment(@RequestParam("deptid") String deptid) {
		
		ModelAndView mav = new ModelAndView();
		
		return mav;
	}	
	// 레코드 추가
	@RequestMapping("/insertDepartment")
	public ModelAndView insertDepartment(@ModelAttribute DeptVO param) {
		logger.info("DepartmentController.insertDepartment(@ModelAttribute DeptVO param) 진입");
		
		String resultStr="";
		int result = deptService.insertDepartment(param);
		
		if(result > 0) resultStr = "등록 완료!";
		else resultStr = "등록에 실패했어요..";
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("result", resultStr);
		// WEB-INF/jsp/dept/result를 나타낸다 (spring-servlet 설정 참조)
		mav.setViewName(CONTEXT_PATH + "/result");
		
		return mav;
	}
	// 레코드 수정
	@RequestMapping("/updateDepartment")
	public ModelAndView updateDepartment(@ModelAttribute DeptVO param) {
		
		ModelAndView mav = new ModelAndView();
		
		return mav;
	}
	// 레코드 삭제
	@RequestMapping("/deleteDepartment")
	public ModelAndView deleteDepartment(@ModelAttribute DeptVO param) {
		ModelAndView mav = new ModelAndView();

		return mav;
	}
}
