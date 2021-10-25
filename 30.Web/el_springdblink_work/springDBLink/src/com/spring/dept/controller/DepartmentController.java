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
// [@RequestMapping(value="/department")]
public class DepartmentController {
	
	// logger 초기화
	private Logger logger = Logger.getLogger(DepartmentController.class);
	
	// directory -> const 선언
	private static final String CONTEXT_PATH = "dept";
	
	// service instance
	// 서비스를 호출하기 위해서 선언해준다.
	@Autowired
	private DeptService deptService;
	
	// 데이터 전체 조회를 위한 함수.
	// "listDepartment"로 들어온 요청은 이리 come
	// value와 method를 지정해주지 않았다. method=디폴트로 GET이 된다.
	@RequestMapping("listDepartment")
	// @ModelAttribute 기능 
	// 1. 선언 후 자동으로 객체를 생성한다.(VO 한정)
	// 2. 링크타고 들어온 매핑된 값들이 자동으로 객체에 매핑된다.
	// @ModelAttribue("이름") : 괄호 안에 "이름"이 들어가면 이 문자열이 생성된 객체의 이름이 된다.
	public ModelAndView listDepartment(@ModelAttribute DeptVO param) {
		// System.out.println 스프링버전 (라이브러리 추가 필요.)
		logger.info("DepartmentController.listDepartlment() 진입");
		
		List<DeptVO> list = deptService.listDepartment(param);
		
		ModelAndView mav = new ModelAndView();
		// addObject("attributeName으로", attributeValue를 추가한다.);
		// setViewName(String viewName); : 뷰 이름 세팅해주기 : 뷰 리졸버가 이 이름을 이용해 뷰를 연결해준다.
		// *getViewName() 함수도 있음.
		mav.addObject("departmentList", list);
		mav.setViewName(CONTEXT_PATH + "/department");
		
		return mav;
	}
	
	// 상세 정보 보기 -> departmetn_pop.jsp
	@RequestMapping("selectDepartment")
	public ModelAndView selectDepartment(@RequestParam("deptid") String deptid) {
		
		logger.info("DepartmentController.selectDepartment() 진입");
		
		ModelAndView mav = new ModelAndView();
		
		if(deptid.equals("")) { // [등록] 버튼 클릭시
			mav.addObject("mode", "insert");
		} else { 				// [수정/삭제] 버튼 클릭시
			mav.addObject("DeptVO", deptService.selectDepartment(deptid));
			mav.addObject("mode", "update");
		}
		
		mav.setViewName(CONTEXT_PATH+"/department_pop");
		
		return mav;
	}
	
	
	// 레코드 추가
	@RequestMapping("insertDepartment")
	public ModelAndView insertDepartment(@ModelAttribute DeptVO param) {
		logger.info("DepartmentController.insertDepartment() 진입");
		
		String resultStr="";
		
		int result = deptService.insertDepartment(param);
		
		if(result > 0) resultStr = "등록이 완료되었습니다.";
		else resultStr = "등록에 문제가 있어 완료하지 못하였습니다.";
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("result", resultStr);
		mav.setViewName(CONTEXT_PATH+"/result");
		
		return mav;
	}
	// 레코드 수정 -> result.jsp
	@RequestMapping("updateDepartment")
	public ModelAndView updateDepartment(@ModelAttribute DeptVO param) {
		logger.info("DepartmentController.updateDepartment() 진입");
		
		String resultStr = "";
		
		int result = deptService.updateDepartment(param);
		
		if (result > 0) resultStr = "수정이 완료되었습니다.";
		else resultStr = "수정에 문제가 있어 완료하지 못하였습니다.";
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("result", resultStr);
		mav.setViewName(CONTEXT_PATH + "/result");
		
		return mav;
	}
	
	// 레코드 삭제
	@RequestMapping("deleteDepartment")
	public ModelAndView deleteDepartment(@ModelAttribute DeptVO param) {
		logger.info("DepartmentController.deleteDepartment() 진입");
		
		String resultStr = "";
		
		int result = deptService.deleteDepartment(param);
		
		if(result > 0) resultStr = "삭제가 완료되었습니다.";
		else resultStr = "삭제에 문제가 있어 완료하지 못하였습니다.";		
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("result", resultStr);
		mav.setViewName(CONTEXT_PATH + "/result");
		
		return mav;
		
	}
	
}
