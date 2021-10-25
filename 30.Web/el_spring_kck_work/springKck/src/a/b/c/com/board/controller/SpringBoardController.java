package a.b.c.com.board.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import a.b.c.com.board.service.SpringBoardService;
import a.b.c.com.board.vo.SpringBoardVO;
import a.b.c.com.common.service.ChabunService;

@Controller
public class SpringBoardController {
	
	// log4j set
	private Logger logger = Logger.getLogger(SpringBoardController.class);
	
	// 상수로 path 설정하는게 없음.
	
	// 서비스 instance
	private SpringBoardService springBoardService;
	
	// 채번 instance
	private ChabunService chabunService;
	
	
	// 생성자 주입 Autowired
	@Autowired(required=false)
	public SpringBoardController(SpringBoardService springBoardService
								,ChabunService chabunService) {
		this.springBoardService = springBoardService;
		this.chabunService = chabunService;
	}
	
	// index.jsp에서 클릭하면 boardForm으로.
	// 게시판 글 입력 화면(양식/Form)으로 보내기
	@RequestMapping(value="boardForm", method=RequestMethod.GET)
	public String boardForm() {
		logger.info("SpringBoardController.boardForm() 진입");
		return "board/springBoardForm";
	}
	
	// 글 쓰기 (boardInsert)
	// 매개변수를 SpringBoardVO sbvo를 안쓰고
	// HttpServletRequest req를 쓴다...
	@RequestMapping(value="boardInsert", method=RequestMethod.POST)
	public String boardInsert(HttpServletRequest req) {
		logger.info("SpringBoardController.boardInsert() 진입");
		return "";
	}
	// 글 목록 조회 (boardSelectAll)
	// 목록 전체 조회하는데 객체랑 모델이 굳이 필요한가?
	@RequestMapping(value="boardSelectAll", method=RequestMethod.GET)
	public String boardSelectAll(SpringBoardVO bvo, Model model) {
		return "";
	}
	
	// 게시글 수정/삭제 글 조회 (boardSelect / 조회하고싶은 데이터 bvo에 세팅해서 보내는듯)
	@RequestMapping(value="boardSelect", method=RequestMethod.POST)
	public String boardSelect(SpringBoardVO bvo, Model model) {
		return "";
	}
	// 글 수정하기 (boardUpdate)
	@RequestMapping(value="boardUpdate", method=RequestMethod.POST)
	public String boardUpdate(SpringBoardVO bvo, Model model) {
		return "";
	}
	
	// 글 삭제하기 (boardDelete)
	@RequestMapping(value="boardDelete", method=RequestMethod.POST)
	public String boardDelete(SpringBoardVO bvo, Model model) {
		return "";
	}
	
	// 비밀번호 체크하기 (boardIdCheck)
	@RequestMapping(value="boardIdCheck", method=RequestMethod.POST)
	@ResponseBody
	public String boardIdCheck (SpringBoardVO bvo) {
		return "";
	}
	
}
