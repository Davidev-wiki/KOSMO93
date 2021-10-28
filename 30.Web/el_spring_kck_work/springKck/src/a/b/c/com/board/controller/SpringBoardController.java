package a.b.c.com.board.controller;

import java.util.List;

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
import a.b.c.com.common.ChabunUtil;
import a.b.c.com.common.FileUploadUtil;
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
		
		// 채번 로직 : 공통 클래스에 있는 채번 함수 사용하기.
		// 여기 "N"이 뭐지?
		String sbnum = ChabunUtil.getBoardChabun("N", chabunService.getBoardChabun().getSbnum());
		logger.info("BoardController.boardInsert에서 채번한 sbnum >>> : " + sbnum);
		
		// 이미지 업로드 : 공통 클래스에 있는 파일 업로드 함수 이용하기
		FileUploadUtil fu = new FileUploadUtil();
		
		// 이미지 파일 원본 사이즈
		// 이미지 파일 업로드 성공 여부같아보임..
		// boolean bool = fu.imgfileUpload(req);
		
		// 이미지 파일 원본 사이즈 크기 조절하기
		boolean bool = fu.imgfileUploadSize(req);
		logger.info("BoardController.boardInsert에서 가져온 이미지파일 원본 사이즈 bool >>> : " + bool);
		
		// 채번, 이미지 업로드 성공시 VO 세팅
		// FileUploadUtil.getParameter()함수로
		// mr(MultipartRequest).getParameter();를 실행해서
		// 한다리 거쳐 데이터 가져와서 세팅함.
		SpringBoardVO _bvo = null;
		_bvo = new SpringBoardVO();
		
		_bvo.setSbnum(sbnum);
		_bvo.setSbsubject(fu.getParameter("sbsubject"));
		_bvo.setSbname(fu.getParameter("sbname"));
		_bvo.setSbpw(fu.getParameter("sbpw"));
		_bvo.setSbcontent(fu.getParameter("sbcontent"));
		_bvo.setSbfile(fu.getParameter("sbfile"));
		
		
		// 세팅한 객체를 파라미터로 보내고 등록 건수 받아오기
		int nCnt = springBoardService.boardInsert(_bvo);
		
		// 등록 건 수 있으면 전체 조회 페이지로 이동.
		// 등록 건 수 없으면 글쓰기 페이지로 이동.
		if(nCnt > 0) {
			return "board/springBoardInsert";
		}
		
		return "board/springBoardForm";
	
	}
	
	// 글 목록 조회 (boardSelectAll)
	// 목록 전체 조회하는데 객체랑 모델이 굳이 필요한가?
	// 필터에 해당하는 목록을 전체 조회하는 컨셉으로 제작한 것 같다..
	@RequestMapping(value="boardSelectAll", method=RequestMethod.GET)
	public String boardSelectAll(SpringBoardVO bvo, Model model) {
		logger.info("SpringBoardController.boardSelectAll() 진입");
		
		// 전체 조회하는데 파라미터로 받은 객체에서 
		// 키필터,키워드, 시작일, 종료일을 출력해보기
		logger.info("SpringBoardController.boardSelectAll bvo.getKeyfilter() >>> : " + bvo.getKeyfilter());
		logger.info("SpringBoardController.boardSelectAll bvo.getKeyword() >>> : " + bvo.getKeyword());
		logger.info("SpringBoardController.boardSelectAll bvo.getStartdate() >>> : " + bvo.getStartdate());
		logger.info("SpringBoardController.boardSelectAll bvo.getEnddate() >>> : " + bvo.getEnddate());		
		
		List<SpringBoardVO> listAll = springBoardService.boardSelectAll(bvo);
		logger.info("필터에 해당하는 데이터 전체 조회로 가져온 값 listAll >>> : " + listAll);
		
		// 받아온 데이터가 한 건 이상 있으면 전체 조회 페이지로
		// 받아온 데이터가 한 건도 없으면 글 쓰기 페이지로.
		if(listAll.size() > 0) {
			
			// ModelAndView 와 set하는 차이
			// ex) mav.addObject
			model.addAttribute("listAll", listAll);
			return "board/springBoardSelectAll";
		}
		
		return "board/springBoardForm";
	}
	
	// 게시글 수정/삭제 글 조회 (boardSelect / 조회하고싶은 데이터 bvo에 세팅해서 보내는듯)
	@RequestMapping(value="boardSelect", method=RequestMethod.POST)
	public String boardSelect(SpringBoardVO bvo, Model model) {
		logger.info("SpringBoardController.boardSelect() 진입");
		logger.info("SpringBoardController.boardSelect에서 받은 파라미터로 번호 출력 bvo.getSbnum() >>> : " + bvo.getSbnum());

		List<SpringBoardVO> listS = springBoardService.boardSelect(bvo);
		logger.info("가져온 데이터 개수 listS.size() >>> : " + listS.size());
		logger.info("데이터 조회한 결과 값 listS >>> : " + listS);
		
		// 알맞은 데이터 1개를 찾으면 모델에 set,조회 화면으로 이동
		// 데이터를 찾지 못하면 글 쓰기 페이지로 이동.
		if (listS.size() == 1) {
			model.addAttribute("listS", listS);
			return "board/springBoardSelect";
		}
		return "board/springBoardForm";
	}
	// 글 수정하기 (boardUpdate)
	// 글의 내용만 수정이 가능하게 Setting 된 듯.
	@RequestMapping(value="boardUpdate", method=RequestMethod.POST)
	public String boardUpdate(SpringBoardVO bvo, Model model) {
		logger.info("SpringBoardController.boardUpdate() 진입");
		
		logger.info("SpringBoardController.boardUpdate()에서 파라미터로 가져온 데이터 출력 bvo.Sbnum() >>> : " + bvo.getSbnum());
		logger.info("SpringBoardController.boardUpdate()에서 파라미터로 가져온 데이터 출력 bvo.Sbcontent() >>> : " + bvo.getSbcontent());

		int nCnt = springBoardService.boardUpdate(bvo);
		logger.info("데이터 수정 건 수 nCnt >>> : " + nCnt);
		
		// 데이터 수정이 한 건 있으면 전체조회 페이지로 이동,
		// 데이터 수정이 한 건도 없으면 글 쓰기 페이지로 이동.
		if (nCnt > 0) {
			return "board/springBoardUpdate";
		}
		
		return "board/springBoardForm";
	}
	
	// 글 삭제하기 (boardDelete)
	@RequestMapping(value="boardDelete", method=RequestMethod.POST)
	public String boardDelete(SpringBoardVO bvo, Model model) {
		logger.info("SpringBoardController.boardDelete() 진입");
		
		logger.info("SpringBoardController.boardDelete()에서 파라미터로 가져온 데이터 출력 bvo.Sbnum() >>> : " + bvo.getSbnum());

		int nCnt = springBoardService.boardDelete(bvo);
		logger.info("데이터 삭제 건 수 nCnt >>> : " + nCnt);
		
		// 데이터 수정이 한 건 있으면 전체조회 페이지로 이동,
		// 데이터 수정이 한 건도 없으면 글 쓰기 페이지로 이동.
		if (nCnt > 0) {
			return "board/springBoardDelete";
		}
		
		return "board/springBoardForm";
	}
	
	// 비밀번호 체크하기 (boardIdCheck)
	// ResponseBody : 응답을 헤더가 아닌 바디로 보낸다
	@RequestMapping(value="boardPwCheck", method=RequestMethod.POST)
	@ResponseBody
	public String boardPwCheck (SpringBoardVO bvo) {
		logger.info("SpringBoardController.boardPwCheck() 진입");
		
		logger.info("SpringBoardController.boardPwCheck()에서 파라미터로 가져온 아이디 출력 bvo.Sbnum() >>> : " + bvo.getSbnum());
		logger.info("SpringBoardController.boardPwCheck()에서 파라미터로 가져온 비밀번호 출력 bvo.Sbpw() >>> : " + bvo.getSbpw());

		// 패스워드 체크 결과를 List<SpringBoardVO>로 받는다.
		// 체크 결과는 아마도 동일한 데이터가 있는가의 여부인 듯하다
		List<SpringBoardVO> list = springBoardService.boardPwCheck(bvo);
		
		logger.info("SpringBoardController.boardPwCheck()에서 받은 패스워드 결과 : " + list);
		
		String msg = "";
		if(list.size() == 1) {
			msg = "PW_GOOD";
		} else {
			msg = "PW_BAD";
		}
		
		return msg;
	}
	
}
