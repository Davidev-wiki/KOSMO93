package a.b.c.com.kosmo.notice.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import a.b.c.com.common.GetChabun;
import a.b.c.com.kosmo.notice.service.NoticeService;
import a.b.c.com.kosmo.notice.service.NoticeServiceImpl;
import a.b.c.com.kosmo.notice.vo.NoticeVO;

import java.io.PrintWriter;

@WebServlet("/notice")
public class NoticeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		// 인코딩세팅
		request.setCharacterEncoding("EUC-KR");
		response.setCharacterEncoding("EUC-KR");
		response.setContentType("text/html; charset=EUC-KR");
		
		PrintWriter out = response.getWriter();
		
		// 화면에서 가져온 데이터
		String isudtype = request.getParameter("ISUD_TYPE");
		
		if(isudtype != null) isudtype.toUpperCase();
		
		if(isudtype != null && isudtype.length() > 0){
			
			// 분기 로직
			if("I".equals(isudtype)){
				
				String nnum = GetChabun.getNoticeChabun("d");
				String nsubject = request.getParameter("nsubject");
				String nmemo = request.getParameter("nmemo");
				String nphoto = request.getParameter("nphoto");
				
				NoticeService ns = new NoticeServiceImpl();
				NoticeVO nvo = new NoticeVO();
				
				nvo.setNnum(nnum);
				nvo.setNsubject(nsubject);
				nvo.setNmemo(nmemo);
				nvo.setNphoto(nphoto);
				
				int nCnt = ns.noticeInsert(nvo);
				
				if(nCnt > 0){
					System.out.println("데이터 " + nCnt + " 건  등록 성공!");
					request.setAttribute("nCnt", nCnt);
					RequestDispatcher rd = request.getRequestDispatcher("/kck/notice/noticeSelectAll.jsp");
					rd.forward(request, response);
					
				} else {
					System.out.println("데이터 Insert 결과 : 실패");
					out.println("<script>");
					out.println("location.href='/testKck/kck/notice/notice.html'");
					out.println("</script>");
					
				}
				
				// 등록 성공 : 전체 조회 화면으로
				// 등록 실패 : notice.html
			}
			if("SALL".equals(isudtype)){
				// 조회 성공 : noticeSelectAll.jsp
				// 조회 실패 : notice?=SALL
			}
			if("U".equals(isudtype)){
				// 수정 성공 : noticeUpdate.jsp
				// 수정 실패 : notice?=SALL
			}
			if("D".equals(isudtype)){
				// 삭제 성공 : noticeDeletejsp
				// 수정 실패 : notice?=SALL
			}
			
		} else {
			System.out.println("isudtype이 잘못 입력된 것 같아요.");
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
