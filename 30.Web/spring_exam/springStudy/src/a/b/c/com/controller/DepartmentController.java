package a.b.c.com.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import a.b.c.com.vo.DeptVO;

@Controller
public class DepartmentController {
	private Logger logger = Logger.getLogger(DepartmentController.class);
	
	@RequestMapping(value="department_insertForm", method=RequestMethod.GET)
	public String department_insertForm() {
		logger.info("DepartmentController department_insertForm() 함수 진입 >>> : ");
		
		return "department_Form";
	}
	
	@RequestMapping(value="department_insert", method=RequestMethod.POST)
	public String department_insert(DeptVO dvo, Model model) {
		logger.info("DepartmentController department_insert() 함수 진입 >>> : ");
		
		model.addAttribute("dvo", dvo);
		return "department_insert";
	}
}
