package a.b.c.com.emp.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
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
	
	// springEmpSelectAll : 전체 조회 페이지
	// 서비스를 호출해 전체 조회 결과를 받아와 List<SpringEmpVO> 타입으로 저장한 후
	// 'listAll'이라는 이름으로 Model에 세팅, emp/springEmpSelectAll.jsp로 리턴한다.
	// 매개변수 : Model 객체
	@RequestMapping(value="springEmpSelectAll", method=RequestMethod.GET)
	public String springEmpSelectAll(Model model) {
		logger.info("SpringEmpController springEmpSelectAll() 함수 진입 >>> : ");
		
		List<SpringEmpVO> listAll = springEmpService.springEmpSelectAll();
		int nCnt = listAll.size();
		logger.info("가져온 데이터의 개수 nCnt >>> : " + nCnt);
		
		if (nCnt > 0) {
			model.addAttribute("listAll", listAll);
			return "emp/springEmpSelectAll";
		}
		
		return "emp/springEmpForm";
	}
	
	// springEmpSelectForm : 페이지 연결 통로 개념,
	// 데이터를 가지고 조건 조회 페이지로 이동하기 위해 매개변수를 세팅해두었다.
	// 매개변수 : SpringEmpVO 객체, Model 객체
	// @ModelAttribute 사용 : 
	@RequestMapping(value="springEmpSelectForm", method=RequestMethod.GET)
	public String springEmpSelectForm(@ModelAttribute SpringEmpVO evo, Model model) {
		
		logger.info("SpringEmpController.springEmpSelectForm() 진입");
		
		return "emp/springEmpSelectForm";
	}
	
	// springEmpSelect : 조회 결과 페이지
	// 매개변수 : SpringEmpVO 객체, Model 객체
	// @ModelAttribute 사용 : 
	// 데이터를 가지고 왔으면 조회 결과 페이지로, 
	// 데이터를 가지고 오지 못하면 다시 사원 조건 조회 페이지로 이동.
	@RequestMapping(value="springEmpSelect", method=RequestMethod.GET)
	public String springEmpSelect(@ModelAttribute SpringEmpVO evo, Model model ) {
		
		logger.info("SpringEmpController.springEmpSelectForm() 진입");
		logger.info("SpringEmpController. evo.getSearchFilter() : " + evo.getSearchFilter());
		logger.info("SpringEmpController. evo.getKeyword() : " + evo.getKeyword());
		logger.info("SpringEmpController. evo.getStartDate() : " + evo.getStartDate());
		logger.info("SpringEmpController. evo.getEndDate() : " + evo.getEndDate());

		List<SpringEmpVO> searchList = springEmpService.springEmpSelect(evo);
		int nCnt = searchList.size();
		logger.info("가져온 데이터의 개수 nCnt >>> : " + nCnt);
		if(nCnt > 0) {
			model.addAttribute("searchList", searchList);
			return "emp/springEmpSelect";
		}
		return "emp/springEmpSelectForm";
	}
	
	// springEmpInsertFom : 사원 등록 페이지
	// 매개변수 : Model 객체
	@RequestMapping(value="springEmpInsertForm", method=RequestMethod.GET)
	public String springEmpInsertForm(Model model) {
		logger.info("SpringEmpController.springEmpInsertForm() 진입");

		return "emp/springEmpInsertForm";
	}
	// springEmpInsert : 빈 페이지
	// 매개변수 : SpringEmpVO 객체, Model 객체
	// 데이터를 가지고 왔으면 빈 페이지로, 
	// 데이터를 가지고 오지 못하면 다시 사원 등록 페이지로 이동.
	@RequestMapping(value="springEmpInsert", method=RequestMethod.GET)
	public String springEmpInsert(SpringEmpVO evo, Model model) {
		logger.info("SpringEmpController.springEmpInsert() 진입");
		logger.info("SpringEmpController.springEmpInsert evo.getEmpno()" + evo.getEmpno());
		logger.info("SpringEmpController.springEmpInsert evo.getEname()" + evo.getEname());
		logger.info("SpringEmpController.springEmpInsert evo.getHiredate()" + evo.getHiredate());
		
		int insertCnt = springEmpService.springEmpInsert(evo);
		
		if(insertCnt > 0) {
			logger.info("가져온 데이터의 개수 insertCnt >>> : " + insertCnt);

			model.addAttribute("insertCnt", insertCnt);
			return "emp/springEmpInsert";
		}
		
		return "emp/springEmpForm";
	}
	
	// springEmpUpdateForm : 사원 수정 페이지
	// 매개변수 : Model 객체
	@RequestMapping(value="springEmpUpdateForm", method=RequestMethod.GET)
	public String springEmpUpdateForm(Model model) {
		logger.info("SpringEmpController.springEmpUpdateForm() 진입");
		
		return "emp/springEmpUpdateForm";
	}
	
	// springEmpUpdate : 빈 페이지
	// 매개변수 : SpringEmpVO 객체, Model객체
	// @ModelAttribute 사용 : 
	// 데이터를 가지고 왔으면 빈 페이지로, 
	// 데이터를 가지고 오지 못하면 다시 사원 수정 페이지로 이동.
	@RequestMapping(value="springEmpUpdate", method=RequestMethod.GET)
	public String springEmpUpdate(@ModelAttribute SpringEmpVO evo, Model model) {
		logger.info("SpringEmpController.springEmpUpdate() 진입");
		logger.info("SpringEmpController.springEmpUpdate evo.getEmpno()" + evo.getEmpno());
		logger.info("SpringEmpController.springEmpUpdate evo.getEname()" + evo.getEname());
		logger.info("SpringEmpController.springEmpUpdate evo.getHiredate()" + evo.getHiredate());
		
		int updateCnt = springEmpService.springEmpUpdate(evo);
		
		if(updateCnt > 0) {
			logger.info("가져온 데이터의 개수 updateCnt >>> : " + updateCnt);
			model.addAttribute("updateCnt", updateCnt);
			return "emp/springEmpUpdate";
		}
		
		return "emp/springEmpForm";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
