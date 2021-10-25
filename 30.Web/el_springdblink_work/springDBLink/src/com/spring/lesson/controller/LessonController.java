package com.spring.lesson.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.lesson.service.LessonService;
import com.spring.lesson.vo.LessonVO;

@Controller
public class LessonController {
	
	// log4j set
	private Logger logger = Logger.getLogger(LessonController.class);
	
	// Path 상수로 초기화 static으로 메모리에 올려두어야 참조가능.
	private static final String CONTEXT_PATH = "lesson";
	
	// service instance, 자동으로 연결준비 : Autowired
	// required(자료 더 찾아보기).
	// 일단은 null 체크개념, 
	// true인 경우 nullcheck안함,  false는 nullcheck함.
	@Autowired(required=false)
	private LessonService lessonService;
	
	// Mapping : 전체 조회 
	// 위 PATH에 '/'를 붙이지 않았으니까 '/'를 붙여줘야 한다.
	// 전체 조회는 기존 페이지에서!
	@RequestMapping("/listLesson")
	public ModelAndView listLesson(@ModelAttribute LessonVO param){
		logger.info("LessonController.listLesson() 진입 >>> ");
		
		List<LessonVO> list = lessonService.listLesson(param);
		logger.info("returned list's value >>> : " + list);
		
		// ModelAndView 인스턴스
		// 데이터 전달 목적의 Model과 View이름 전달 동시에 가능하게 만든 객체.
		// ModelAndView.addObject() 를 이용해 "key", value 형태로 데이터를 set하고
		// ModelAndView.setViewName() 을 이용해 View 페이지에 대한 경로를 설정할 수 있다.
		ModelAndView mav = new ModelAndView();
		mav.addObject("lessonList", list);
		mav.addObject("paramName", param.getLname());
		mav.setViewName(CONTEXT_PATH + "/lesson");
		
		return mav;
	}
	
	// RequestParam() : 원하는 프로퍼티를 함수에 매핑해서 잘 전달하고, 잘 받기 위한
	// 명시적으로 사용하는 어노테이션. 생략이 가능하다고 한다. 테스트해보기.
	// 조회는 팝업창에서!
	@RequestMapping("/selectLesson")
	public ModelAndView selectLesson(@RequestParam("no") int no) {
		logger.info("LessonController.selectLesson() 진입 >>> ");
		
		ModelAndView mav = new ModelAndView();
		
		// 왜 아래와 같이 분기되었는지 체크 필요.
		// lesson_pop.jsp 코드와 참조 필요.${mode}
		// lesson.jsp에서 등록 버튼을 누르면 insertpopup()이 실행되는데,
		// 이 함수 내부에서 no.val(0)을 수행 한뒤 이쪽으로 보낸다. 
		// 'mode'에 문자열 "insert"만 세팅해서 lesson_pop으로 보낸다.
		if(no == 0) {
			mav.addObject("mode", "insert");
		} else {
			mav.addObject("lessonVO", lessonService.selectLesson(no));
			mav.addObject("mode", "update");
		}
		
		mav.setViewName(CONTEXT_PATH + "/lesson_pop");
		return mav;
	}
	
	@RequestMapping("/insertLesson")
	public ModelAndView insertLesson(@ModelAttribute LessonVO param) {
		logger.info("LessonController.insertLesson() 진입 >>> ");
		
		// 등록건 수에 따라 다른 문장을 세팅하기 위함.
		String resultStr = "";
 
		int result = lessonService.insertLesson(param);
		
		if(result > 0) resultStr = "등록 완료되었습니다.";
		else resultStr = "등록에 문제가 있어 완료하지 못했어요..";
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("result", resultStr);
		mav.setViewName(CONTEXT_PATH + "/result");
		
		return mav;
	}
	
	@RequestMapping("/updatetLesson")
	public ModelAndView updateLesson(@ModelAttribute LessonVO param) {
		logger.info("LessonController.updateLesson() 진입 >>> ");

		// 수정건 수에 따라 다른 문장을 세팅하기 위함.
		String resultStr = "";
 
		int result = lessonService.updateLesson(param);
		
		if(result > 0) resultStr = "수정 완료되었습니다.";
		else resultStr = "수정에 문제가 있어 완료하지 못했어요..";
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("result", resultStr);
		mav.setViewName(CONTEXT_PATH + "/result");
		
		return mav;
	}
	
	@RequestMapping("/deleteLesson")
	public ModelAndView deleteLesson(int no) {
		logger.info("LessonController.deleteLesson() 진입 >>> ");
		
		// 삭제건 수에 따라 다른 문장을 세팅하기 위함.
		String resultStr = "";
 
		int result = lessonService.deleteLesson(no);
		
		if(result > 0) resultStr = "삭제 완료되었습니다.";
		else resultStr = "삭제에 문제가 있어 완료하지 못했어요..";
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("result", resultStr);
		mav.setViewName(CONTEXT_PATH + "/result");
		
		return mav;
	}
}
