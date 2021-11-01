package a.b.c.com.board.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	Logger logger = Logger.getLogger(SpringBoardController.class);
	
	private SpringBoardService boardService;
	private ChabunService chabunService;

	
	@Autowired(required=false)
	public SpringBoardController(SpringBoardService boardService, ChabunService chabunService) {
		this.boardService = boardService;
		this.chabunService = chabunService;
	}
	
	// 게시판 작성 양식으로 이동하는 로직.
	@RequestMapping(value="boardForm", method=RequestMethod.GET)
	public String boardForm() {
		return "boardboardForm";
	}
	
	// 게시물 글쓰기 페이지(등록) 로직.(boardboardInsert.jsp로)
	@RequestMapping(value="boardInsert", method=RequestMethod.POST)
	public String boardInsert(HttpServletRequest req) {
		
		// 채번로직 : sbnum을 만드는 로직
		String sbnum = ChabunUtil.getBoardChabun("N", chabunService.getBoardChabun().getSbnum());;
		
		// 이미지 업로드
		FileUploadUtil fu = new FileUploadUtil();
		
		// 이미지 파일 원본 사이즈 -> 크기 조정 (클래스 이용)
		boolean bool = fu.imgfileUploadSize(req);
		
		
		// 채번, 이미지 업로드 성공하면,  VO 세팅하기.
		SpringBoardVO _bvo = new SpringBoardVO();
		_bvo.setSbnum(sbnum);
		_bvo.setSbsubject(fu.getParameter("sbsubject"));
		_bvo.setSbname(fu.getParameter("sbname"));
		_bvo.setSbpw(fu.getParameter("sbpw"));
		_bvo.setSbcontent(fu.getParameter("sbcontent"));
		_bvo.setSbfile(fu.getFileName("sbfile"));
		
		int nCnt = boardService.boardInsert(_bvo);
		
		if(nCnt > 0) {
			return "board/boardInsert"; // 등록 로직 실행
		} else {
			return "board/boardForm"; // 글 쓰기 페이지로 이동
		}
	}	
	
	// 게시물 전체조회 로직.(boardboardSelectAll.jsp로)
	// 게시물이 없으면 게시물 등록 페이지(boardForm으로 이동)
	@RequestMapping(value="boardSelectAll", method=RequestMethod.GET)
	public String boardSelectAll(SpringBoardVO bvo, Model model) {
		
		List<SpringBoardVO> listAll = boardService.boardSelectAll(bvo);
		
		if(listAll.size() > 0) {
			model.addAttribute("listAll", listAll);
			return "board/boardSelectAll"; // 전체 조회 로직 실행
		} else {
			return "board/boardForm"; // 다시 글쓰기 페이지로.
		}
	}	
	
	// 게시물 수정/삭제를 위한 글 조회 로직.(boardboardSelect.jsp로)
	// 게시물이 없으면 게시물 등록 페이지(boardForm으로 이동)
	@RequestMapping(value="boardSelect", method=RequestMethod.POST)
	public String boardSelect(SpringBoardVO bvo, Model model) {
		
		List<SpringBoardVO> listS = boardService.boardSelect(bvo);
		if(listS.size() > 0) {
			model.addAttribute("listS", listS);
			return "board/boardSelect";
		} else {
			return "board/boardForm";
		}
	}	
	
	// 게시물 수정 로직.(boardboardUpdate.jsp로)
	// 게시물이 없으면 게시물 등록 페이지(boardForm으로 이동)
	@RequestMapping(value="boardUpdate", method=RequestMethod.POST)
	public String boardUpdate(SpringBoardVO bvo, Model model) {
		
		int nCnt = boardService.boardUpdate(bvo);
		
		if(nCnt > 0) {
			return "board/boardUpdate";
		} else {
			return "board/boardForm";
		}
	}	
	
	// 게시물 삭제 로직.(boardboardDelete.jsp로)
	// 게시물이 없으면 게시물 등록 페이지(boardForm으로 이동)
	@RequestMapping(value="boardDelete", method=RequestMethod.POST)
	public String boardDelete(SpringBoardVO bvo, Model model) {
		
		int nCnt = boardService.boardDelete(bvo);
		if(nCnt > 0) {
			return "board/boardDelete";	
		} else {
			return "board/boardForm";
		}
	}
	
	// 비번 체크로직.	
	@RequestMapping(value="boardPwCheck", method=RequestMethod.POST)
	@ResponseBody
	public String boardPwCheck(@RequestBody SpringBoardVO bvo, Model model) {return "";}	

}
