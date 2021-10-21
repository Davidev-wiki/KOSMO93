package a.b.c.com.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import a.b.c.com.service.SpringAutowiredService;
import a.b.c.com.vo.FormDataVO;

@Controller
public class SpringAutowiredController {
	
	// Logger 호출
	private Logger logger = Logger.getLogger(SpringAutowiredController.class);
	
	// 명시적 서비스 인스턴스 
	final private SpringAutowiredService springAutowiredService;
	
	// 생성자 연결, 주입
	@Autowired(required=false)
	public SpringAutowiredController (SpringAutowiredService springAutowiredService) {
		this.springAutowiredService = springAutowiredService;
	}
	
	// 요청에 따라 뷰로 연결하는 RequestMapping
	@RequestMapping(value="autowired_test", method=RequestMethod.GET)
	public String autowired_Test() {
		
		logger.info("SpringAutowiredController.autowired_Test() 내부에서 찍은 logger!");
		
		return "autowired/autowired_test_return";
	}
	
	// 요청에 따라 뷰로 연결하는 RequestMapping
	@RequestMapping(value="autowired_test_get", method=RequestMethod.GET)
	public String autowiredTest_Get(FormDataVO fvo, Model model) {
		
		logger.info("SpringAutowiredController.autowiredTest_Get() 내부에서 찍은 logger!");
		List<FormDataVO> list = springAutowiredService.autowiredTest(fvo);
		int listSize = list.size();
		
		logger.info("@Repository에서 가져온 list의 길이 : list.size() : " + list.size());
		System.out.println("Sysout : list.size() : " + list.size());
		
		model.addAttribute("list", list);
		
		return "autowired/autowired_test_get_return";
	}

}
