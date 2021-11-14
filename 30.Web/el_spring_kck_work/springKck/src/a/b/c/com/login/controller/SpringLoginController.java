package a.b.c.com.login.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import a.b.c.com.cgi.session.K_Session;
import a.b.c.com.login.service.SpringLoginService;
import a.b.c.com.mem.vo.SpringMemberVO;

@Controller
public class SpringLoginController {
	Logger logger = Logger.getLogger(SpringLoginController.class);
	
	// 서비스 초기화
	private SpringLoginService springLoginServcie;
	
	// 생성자 Autowired (null check)
	@Autowired(required=false)
	public SpringLoginController(SpringLoginService springLoginServcie) {
		this.springLoginServcie = springLoginServcie;
	}
	
	// 로그인 입력 폼
	@GetMapping("loginForm")
	public String loginForm() {
		logger.info("SpringLoginController.loginForm() 함수 진입 >>> :");
		return "login/springLoginForm";
	}
	
	// 로그인
	@PostMapping("login")
	public String login(HttpServletRequest req, SpringMemberVO mvo, Model model) {
		logger.info("SpringLoginController.login() 함수 진입 >>> :");
		
		// 매개변수로 받은 회원정보 객체 출력.
		SpringMemberVO.printVO(mvo);
		
		// 받은 회원객체로 로그인 체크 로직 실행
		// 체크 결과는 회원객체타입 리스트에 담기
		List<SpringMemberVO> listLogin = springLoginServcie.loginCheck(mvo);
		logger.info("SpringLoginController_login_listLogin.size() >>> : " + listLogin.size());
		
		if(listLogin.size() == 1) {
			
			// K-Session 사용 준비
			K_Session ks = K_Session.getInstance();
			String kID = ks.getSession(req);
			
			// null이 아니고, 매개변수로 보낸 SpringMemberVO 에 적힌 mid와 같은 경우 
			if (kID != null && kID.equals(listLogin.get(0).getMid())) {
				logger.info("SpringLoginController login >>> : 로그인 중  >>> : 다른페이지로 이동하기 " + kID);
				
				// listLogin을 모델에 추가하기
				model.addAttribute("listLogin", listLogin);
				return "main/mainPage";
			
			} else {
				ks.setSession(req, mvo.getMid());
				logger.info("SpringLoginController login >>> : 세션 부여하기 >>> : " + mvo.getMid());
				
				model.addAttribute("listLogin", listLogin);
				return "login/springLogin";
			}
		}
		return "login/springLoginForm";
	}
	
	
	// 로그아웃
	@GetMapping("logout")
	public String logout(HttpServletRequest req, SpringMemberVO mvo, Model model) {
		logger.info("SpringLoginController.logout()함수 진입 >>> :");
		
		// 현재 Value Object 객체 내 저장된 변수의 값을 출력해보기.
		SpringMemberVO.printVO(mvo);
		
		K_Session ks = K_Session.getInstance();
		String kID = ks.getSession(req);
		
		return "login/springLogout";
	}
	
	
	
	
	
	
	
	
	
	
	// ==== 이메일로 아이디 찾기 시작 ====
	// 아이디 찾기 입력 폼
	
	// 이메일 확인해서 아이디 찾기
	
	// 인증번호 받아서 아이디 확인하기
	
	// ==== 이메일로 아이디 찾기 끝 ====
	
	
	
	
	// ==== 아이디로 비밀번호 찾기 시작 ====
	
	// 비밀번호 찾기 입력 폼
	
	// 아이디 찾기
	
	// 아이디, 이메일 확인해서 임시비밀번호 받기
	
	
	// ==== 아이디로 비밀번호 찾기 끝 ====
	
	
}
