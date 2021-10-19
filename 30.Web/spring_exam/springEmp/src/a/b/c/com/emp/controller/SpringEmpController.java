package a.b.c.com.emp.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import a.b.c.com.emp.service.SpringEmpService;
import a.b.c.com.emp.vo.SpringEmpVO;

@Controller
public class SpringEmpController {
	private Logger logger = Logger.getLogger(SpringEmpController.class);
	
	// 컨트롤러에서 서비스 연결 
	private SpringEmpService springEmpService;
		
	// 생성자에 @Autowired 어노테이션으로  DI (의존성 주입하기)
	@Autowired(required=false)
	public SpringEmpController(SpringEmpService springEmpService) {
		this.springEmpService = springEmpService;		
	}
	
	@RequestMapping(value="springEmpSelectAll", method=RequestMethod.GET)
	public String springEmpSelectAll(Model model) {
		logger.info("SpringEmpController springEmpSelectAll() 함수 진입 >>> : ");

		List<SpringEmpVO> listAll = springEmpService.springEmpSelectAll();
		int nCnt = listAll.size();
		logger.info("SpringEmpController springEmpSelectAll nCnt >>> : " + nCnt);
		
		if (nCnt > 0) {
			model.addAttribute("listAll", listAll);		
			return "emp/springEmpSelectAll";	
		}
		
		return "emp/springEmpForm";		
	}

}
