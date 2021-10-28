package a.b.c.com.rboard.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import a.b.c.com.common.ChabunUtil;
import a.b.c.com.common.service.ChabunService;
import a.b.c.com.rboard.service.SpringRboardService;
import a.b.c.com.rboard.vo.SpringRboardVO;

@Controller
public class SpringRboardController {
	
	// logger set
	private Logger logger = Logger.getLogger(SpringRboardController.class);
	
	// 비즈니스로직 서비스 연결 (null check)
	@Autowired(required=false)
	private SpringRboardService springRboardService;
	
	// 채번 서비스 연결
	@Autowired(required=false)
	private ChabunService chabunService;
	
	// rboardForm은 항상 여기로 come.
	// both GET & POST
	// 무조건 view page로 이동시키기.
	@RequestMapping(value="rboardForm", method={RequestMethod.GET, RequestMethod.POST})
	public String rboardForm() {
		logger.info("SpringRboardController.rboardForm() 진입 >>> :");
		
		return "rboard/springRboardForm";
	}
	
	// 댓글 등록(insert) / body에 응답하기.
	@RequestMapping(value="rboardInsert", method=RequestMethod.POST)
	@ResponseBody
	public String rboardInsert(SpringRboardVO rbvo) {
		logger.info("SpringRboardController.rboardInsert() 진입 >>> :");
		
		logger.info("매개변수로 가져온 rbvo의 getRsbnum() 데이터 출력 >>> :" + rbvo.getRsbnum());
		logger.info("매개변수로 가져온 rbvo의 getSbnum()데이터 출력 >>> :" + rbvo.getSbnum());
		logger.info("매개변수로 가져온 rbvo의 getRsbcontent()데이터 출력 >>> :" + rbvo.getRsbcontent());
		logger.info("매개변수로 가져온 rbvo의 getRsbname()데이터 출력 >>> :" + rbvo.getRsbname());
		logger.info("매개변수로 가져온 rbvo의 getRsbpw()데이터 출력 >>> :" + rbvo.getRsbpw());
		logger.info("매개변수로 가져온 rbvo의 getRsbinsertdate()데이터 출력 >>> :" + rbvo.getRsbinsertdate());
		
		// 채번 쿼리를 이용해 채번한 넘버를 가지고 "N"타입 (무엇인지 모름)
		// ChabunUtil.getRboardChabun()함수를 돌리면
		// RB가 붙은 넘버가 생성됨
		String rsbnum = ChabunUtil.getRboardChabun("N", chabunService.getRboardChabun().getRsbnum());
		
		logger.info("rboard 채번으로 생성된 rsbnum >>> : " + rsbnum);
		
		// 객체에 생성한 번호를 세팅해준다.
		rbvo.setRsbnum(rsbnum);
		
		int nCnt = springRboardService.rboardInsert(rbvo);
		logger.info("등록 완료 건 수 nCnt >>> : " + nCnt);
		
		if (1 == nCnt) { return "SUCCESS"; }
		else { return "FAIL";}
	}
	
	// 댓글 조회(select)
	// 조회기능이지만 Method를 "POST"로?
	// 응답은 Header가 아닌 Body로?
	@RequestMapping(value="rboardSelect", method=RequestMethod.POST)
	@ResponseBody
	public String rboardSelect(SpringRboardVO rbvo) {
		
		logger.info("SpringRboardController.rboardSelect 진입 >>> :");
		logger.info("매개변수로 가져온 rbvo의 Rsbnum " + rbvo.getRsbnum());
		
		// Rsbnum이 담긴 객체를 넘기고 결과를 받아온 후 List<SpringRboardVO>에 저장
		List<SpringRboardVO> list = springRboardService.rboardSelect(rbvo);
		
		logger.info("조회 후 받아온 리스트 출력 >>> : " + list);
		
		String listStr = list.get(0).getRsbnum() + "," + list.get(0).getRsbname()
												 + "," + list.get(0).getRsbcontent()
												 + "," + list.get(0).getRsbinsertdate();
		return listStr;
	}
	
	// 댓글 조회(selectAll)
	@RequestMapping(value="rboardSelectAll", method=RequestMethod.POST)
	@ResponseBody
	public String rboardSelectAll(SpringRboardVO rbvo) {
		logger.info("SpringRboardController.rboardSelectAll() 진입 >>> :");
		logger.info("매개변수로 가져온 rbvo의 Rsbnum " + rbvo.getRsbnum());
		
		List<SpringRboardVO> list = springRboardService.rboardSelectAll(rbvo);
		
		logger.info("조회 후 받아온 리스트 출력 >>> : " + list);
		
		String ss = "";
		String listStr = "";
		
		for (int i=0; i < list.size(); i++) {
			SpringRboardVO _rbvo = list.get(i);
			String s0 = _rbvo.getRsbnum();
			String s1 = _rbvo.getRsbname();
			String s2 = _rbvo.getRsbcontent();
			String s3 = _rbvo.getRsbinsertdate();
			
			ss = s0 + "," + s1 + "," + s2 + "," + s3;
			
			// 형태 : rsbnum,rsbname,rsbcontent,rsbinsertdate&
			listStr += ss + "&";
			
		}
		
		return listStr;
	}
	
	// 댓글 삭제(d)
	@RequestMapping(value="rboardDelete", method=RequestMethod.POST)
	@ResponseBody
	public String rboardDelete(SpringRboardVO rbvo) {
		logger.info("SpringRboardController.rboardDelete() 진입 >>> :");
		logger.info("매개변수로 받아온 rbvo.getRsbnum >>> : " + rbvo.getRsbnum());
		
		int nCnt = springRboardService.rboardDelete(rbvo);
		logger.info("댓글 삭제 건 수 >>> : " + nCnt);
		
		if(1 == nCnt) {
			return "SUCCESS";
		} else {
			return "FAIL";
		}
	}

}
