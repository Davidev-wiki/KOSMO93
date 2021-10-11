package a.b.c.com.emp.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import a.b.c.com.emp.service.EmpService;
import a.b.c.com.emp.vo.EmpVO;

@Controller
public class EmpController{
	
	// 로거 선언
	private Logger logger = Logger.getLogger(EmpController.class);
	
	// 컨트롤러에서 서비스를 연결
	private EmpService empService;
	
	// 생성자 세팅
	public EmpController(){
		
	}
	
	// empService를 이용해 EmpController를 호출한 경우 
	// 기존 연결되어있는 Service에 연결.
	@Autowired(required=false)
	public EmpController(EmpService empService){
		this.empService = empService;
	}
	
	// 사원 조회 양식(폼) 함수 세팅 empSelectForm()
	// Request보내는 옵션에 대한 어노테이션 같다. 
	// GET방식으로 "empSelectForm" 밸류를 전달.
	@RequestMapping(value="empSelectForm", method=RequestMethod.GET)
	public String empSelectForm(@ModelAttribute EmpVO evo, Model model){
		logger.info("EmpController.empSelectForm() 진입");
		return "emp/empSelectForm"; // 경로를 나타내는 문자열의 일부분으로 추정.
	}
	
	// 전체 조회 함수 세팅 empSelectAll()
	@RequestMapping(value="empSelectAll", method=RequestMethod.GET)
	public String empSelectAll(Model model){
		logger.info("EmpController.empSelectAll() 진입");
		
		List<EmpVO> listAll = empService.empSelectAll(); // empService.empSelectAll() 역시 리턴형이 list이다.
		int nCnt = listAll.size(); // list의 길이 카운트.
		logger.info("전체조회 결과 수(nCnt) : " + nCnt);
		
		// 전체 조회 후 데이터가 존재하는 경우에만
		if (nCnt > 0) {
			// 모델에다가 속성을 추가해주기
			model.addAttribute("listAll", listAll);
			return "emp/empSelectAll";
		}
		
		return "emp/empForm"; // 문자열이다!!
	}
	
	
	
	// 조건 조회 함수 세팅 empSelectAll()
	@RequestMapping(value="empSelect", method=RequestMethod.GET)
	public String empSelect(@ModelAttribute EmpVO evo, Model model){
		// 재료로 들어온 VO에서 getter를 이용해 세팅된 데이터를 뽑아 출력해보기
		// 총 7가지 데이터 중  empno, ename, hiredate를 제외한 4개만 출력.
		// keyword(검색어), searchFilter(검색조건), 
		// startDate(검색 기간 시작일), endDate(검색 기간 종료일)
		logger.info("EmpController.empSelectAll() 진입");
		logger.info("EmpController evo.getSearchFilter()의 값 : " + evo.getSearchFilter());
		logger.info("EmpController evo.getKeyword()의 값  : " + evo.getKeyword());
		logger.info("EmpController evo.getStartDate()의 값  : " + evo.getStartDate());
		logger.info("EmpController evo.getEndDate()의 값  : " + evo.getEndDate());
		
		// 조건 검색한 결과를 'searchList' 변수에 초기화.
		List<EmpVO> searchList = empService.empSelect(evo);
		int nCnt = searchList.size();
		logger.info("조건 조회 결과 수 : " + nCnt);
		
		// 조건에 맞는 데이터가 있는 경우에만
		if(nCnt > 0){
			model.addAttribute("searchList", searchList);
			return "emp/empSelect"; // 경로 !!!
		}
		
		return "emp/empForm"; // 문자열이다!!
	}
	
}