package a.b.c.com.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import a.b.c.com.vo.UserVO;

@Controller
//@RequestMapping(value="login")
public class LoginController {
	private Logger logger = Logger.getLogger(LoginController.class);
	
	/*
	  5 return type
	  ModelAndView, Model, String, void, ModelMap
	 */
	
	@RequestMapping(value="login", method=RequestMethod.GET)
	public String loginForm(Model model) {
		
		logger.info("logger print");
		model.addAttribute("userVO", new UserVO());
		return "login";
	}
	
	
	@RequestMapping(value="loginData", method=RequestMethod.POST)
	public String onSubmit111(@ModelAttribute("userVO") UserVO userVO) {
		
		logger.info("logger print");
		
		return "loginData";
	}
	
}
