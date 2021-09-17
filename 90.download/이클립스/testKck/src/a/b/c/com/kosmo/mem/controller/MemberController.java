package a.b.c.com.kosmo.mem.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import a.b.c.com.common.CommonUtils;
import a.b.c.com.common.FileUploadUtil;
import a.b.c.com.common.GetChabun;
import a.b.c.com.kosmo.mem.service.MemberService;
import a.b.c.com.kosmo.mem.service.MemberServiceImpl;
import a.b.c.com.kosmo.mem.vo.MemberVO;

/**
 * Servlet implementation class MemberController
 */
@WebServlet("/mem")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		// html로부터 받은 데이터 출력하기
		String isudType = request.getParameter("ISUD_TYPE");
		System.out.println("isudType : " + isudType);
		/*
		String mnum = request.getParameter("mnum");
		System.out.println("mnum : " + mnum);
		
		String mname = request.getParameter("mname");
		System.out.println("mname : " + mname);
		
		String mid = request.getParameter("mid");
		System.out.println("mid : " + mid);
		
		String mpw = request.getParameter("mpw");
		System.out.println("mpw : " + mpw);
		
		String mpw_r = request.getParameter("mpw_r");
		System.out.println("mpw_r : " + mpw_r);
		
		String mgender = request.getParameter("mgender");
		System.out.println("mgender : " + mgender);
		
		String mbirth = request.getParameter("mbirth");
		System.out.println("mbirth : " + mbirth);
		
		String mbirth1 = request.getParameter("mbirth1");
		System.out.println("mbirth1 : " + mbirth1);
		
		String mbirth2 = request.getParameter("mbirth2");
		System.out.println("mbirth2 : " + mbirth2);
		
		String mhp = request.getParameter("mhp");
		System.out.println("mhp : " + mhp);
		
		String mhp1 = request.getParameter("mhp1");
		System.out.println("mhp1 : " + mhp1);
		
		String mhp2 = request.getParameter("mhp2");
		System.out.println("mhp2 : " + mhp2);
		
		String mtel = request.getParameter("mtel");
		System.out.println("mtel : " + mtel);
		
		String mtel1 = request.getParameter("mtel1");
		System.out.println("mtel1 : " + mtel1);
		
		String mtel2 = request.getParameter("mtel2");
		System.out.println("mtel2 : " + mtel2);
		
		String memail = request.getParameter("memail");
		System.out.println("memail : " + memail);
		
		String memail1 = request.getParameter("memail1");
		System.out.println("memail1 : " + memail1);
		
		String mzonecode = request.getParameter("mzonecode");
		System.out.println("mzonecode : " + mzonecode);

		String mroadaddress = request.getParameter("mroadaddress");
		System.out.println("mroadaddress : " + mroadaddress);

		String mroadaddressdetail = request.getParameter("mroadaddressdetail");
		System.out.println("mroadaddressdetail : " + mroadaddressdetail);

		String mjibunaddress = request.getParameter("mjibunaddress");
		System.out.println("mjibunaddress : " + mjibunaddress);
		
		String mhobby = request.getParameter("mhobby");
		System.out.println("mhobby : " + mhobby);
		
		String minfo = request.getParameter("minfo");
		System.out.println("minfo : " + minfo);
		
		String mphoto = request.getParameter("mphoto");
		System.out.println("mphoto : " + mphoto);
		*/
		
		// Logic start ------------------------------------------------------------------------
		
		// 분기를 위해 isudType을 대문자로 변경
		if (isudType != null && isudType.length() > 0){
			isudType = isudType.toUpperCase();
		
		// 회원 등록 ("I")
			if("I".equals(isudType)){
				System.out.println("입력된 isudType : " + isudType);
				
				boolean bool = request.getContentType().toLowerCase().startsWith("multipart/form-data");
				if (bool){
					System.out.println("회원 등록 파일 업로드 루틴 : bool : " + bool);
					
					String filePaths = CommonUtils.MEMBER_IMG_UPLOAD_PATH;
					int size_limit = CommonUtils.MEMBER_IMG_FILE_SIZE;
					String encode_type = CommonUtils.MEMBER_IMG_ENCODE;
					
					FileUploadUtil fu = new FileUploadUtil();
					
					boolean bFile = fu.fileUpldad3(request, filePaths, size_limit, encode_type);
					
					
					if (bFile){  // 파일 업로드에 성공한 경우 : 서비스 호출
						
						MemberService ms = new MemberServiceImpl();
						
						MemberVO mvo = null;
						mvo = new MemberVO();
						
						String mnum = GetChabun.getMemChabun("d");
						System.out.println("빈 객체에 세팅할 mnum 값 : " + mnum);
						mvo.setMnum(mnum);

						String mname = request.getParameter("mname");
						System.out.println("빈 객체에 세팅할 mname 값: " + mname);
						mvo.setMname(mname);
						
						String mid = request.getParameter("mid");
						System.out.println("빈 객체에 세팅할 mid 값 : " + mid);
						mvo.setMid(mid);
						
						String mpw = request.getParameter("mpw");
						System.out.println("빈 객체에 세팅할 mpw 값 : " + mpw);
						mvo.setMpw(mpw);
						
						String mgender = request.getParameter("mgender");
						System.out.println("빈 객체에 세팅할 mgender 값 : " + mgender);
						mvo.setMgender(mgender);
						
						String mbirth = request.getParameter("mbirth") + request.getParameter("mbirth1") + request.getParameter("mbirth2");
						System.out.println("빈 객체에 세팅할 mbirth 값 : " + mbirth);
						mvo.setMbirth(mbirth);
						
						String mhp = request.getParameter("mhp") + request.getParameter("mhp1") + request.getParameter("mhp2");
						System.out.println("빈 객체에 세팅할 mhp 값 : " + mhp);
						mvo.setMhp(mhp);
						
						String mtel = request.getParameter("mtel") + request.getParameter("mtel1") + request.getParameter("mtel2");
						System.out.println("빈 객체에 세팅할 mtel 값 : " + mtel);
						mvo.setMtel(mtel);
						
						String memail = request.getParameter("memail") + request.getParameter("memail1");
						System.out.println("빈 객체에 세팅할 memail 값 : " + memail);
						mvo.setMemail(memail);
						
						String mzonecode = request.getParameter("mzonecode");
						System.out.println("빈 객체에 세팅할 mzonecode 값 : " + mzonecode);
						mvo.setMzonecode(mzonecode);
						
						String mroadaddress = request.getParameter("mroadaddress").concat("@").concat(request.getParameter("mroadaddressdetail"));
						System.out.println("빈 객체에 세팅할 mroadaddress 값 : " + mroadaddress);
						mvo.setMroadaddress(mroadaddress);
						
						String mjibunaddress = request.getParameter("mjibunaddress");
						System.out.println("빈 객체에 세팅할 mjibunaddress 값 : " + mjibunaddress);
						mvo.setMjibunaddress(mjibunaddress);
						
						String[] hobby = request.getParameterValues("mhobby");
						String mhobby = "";
						for (int i=0; i<hobby.length; i++){
							mhobby += hobby[i] + ",";
						}
						System.out.println("빈 객체에 세팅할 mhobby 값 : " + mhobby);
						mvo.setMhobby(mhobby);
						
						String minfo = request.getParameter("minfo");
						System.out.println("빈 객체에 세팅할 minfo 값 : " + minfo);
						mvo.setMinfo(minfo);
						
						ArrayList<String> aFileName = fu.getFileNames();
						String mphoto = aFileName.get(0);
						System.out.println("빈 객체에 세팅할 mphoto 값 : " + mphoto);
						mvo.setMphoto(mphoto);
						
						String madmin = "00"; // 관리자 코드
						mvo.setMadmin(madmin);
						
						System.out.println("setting된 객체 mvo : ");
						MemberVO.printlnMemberVO(mvo);
						
						
						boolean bInsert = ms.memberInsert(mvo);
						
						if(bInsert) {  // 정상
							System.out.println("서비스에 전달했던 결과를 정상적으로 받아왔어요 : " + bInsert);
							request.setAttribute("bInsert", new Boolean(bInsert));
							RequestDispatcher rd = request.getRequestDispatcher("/testKck/mem/memInsert.jsp");
							rd.forward(request, response);
							
						} else {  // 실패
							out.println("<script>");
							out.println("location.href='/testKck/kck/mem/mem.html'");
							out.println("</script>");
						}
						
						
					} else { // 파일 업로드에 실패한 경우
						System.out.println("파일 업로드에 실패했어요..");
					}
				
				}
				
			}
			
		// 회원정보 전체 조회 ("SALL")
			if("I".equals(isudType)){
				System.out.println("입력된 isudType : " + isudType);
				
			}
			
		// 회원 조건 조회 ("S")
			if("I".equals(isudType)){
				System.out.println("입력된 isudType : " + isudType);
				
			}
			
		// 회원 수정 ("U")
			if("I".equals(isudType)){
				System.out.println("입력된 isudType : " + isudType);
				
			}
			
		// 회원 삭제 ("D")
			if("I".equals(isudType)){
				System.out.println("입력된 isudType : " + isudType);
				
			}
			
		} else {
			System.out.println("잘못된 ISUD_TYPE 입니다.");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
