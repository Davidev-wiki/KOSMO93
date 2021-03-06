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

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("EUC-KR");
		response.setCharacterEncoding("EUC-KR");
		response.setContentType("text/html; charset=EUC-KR");

		PrintWriter out = response.getWriter();

		// html로부터 받은 데이터 출력하기
		String isudType = request.getParameter("ISUD_TYPE");
		System.out.println("isudType : " + isudType);
		/*
		 * String mnum = request.getParameter("mnum");
		 * System.out.println("mnum : " + mnum);
		 * 
		 * String mname = request.getParameter("mname");
		 * System.out.println("mname : " + mname);
		 * 
		 * String mid = request.getParameter("mid"); System.out.println("mid : "
		 * + mid);
		 * 
		 * String mpw = request.getParameter("mpw"); System.out.println("mpw : "
		 * + mpw);
		 * 
		 * String mpw_r = request.getParameter("mpw_r");
		 * System.out.println("mpw_r : " + mpw_r);
		 * 
		 * String mgender = request.getParameter("mgender");
		 * System.out.println("mgender : " + mgender);
		 * 
		 * String mbirth = request.getParameter("mbirth");
		 * System.out.println("mbirth : " + mbirth);
		 * 
		 * String mbirth1 = request.getParameter("mbirth1");
		 * System.out.println("mbirth1 : " + mbirth1);
		 * 
		 * String mbirth2 = request.getParameter("mbirth2");
		 * System.out.println("mbirth2 : " + mbirth2);
		 * 
		 * String mhp = request.getParameter("mhp"); System.out.println("mhp : "
		 * + mhp);
		 * 
		 * String mhp1 = request.getParameter("mhp1");
		 * System.out.println("mhp1 : " + mhp1);
		 * 
		 * String mhp2 = request.getParameter("mhp2");
		 * System.out.println("mhp2 : " + mhp2);
		 * 
		 * String mtel = request.getParameter("mtel");
		 * System.out.println("mtel : " + mtel);
		 * 
		 * String mtel1 = request.getParameter("mtel1");
		 * System.out.println("mtel1 : " + mtel1);
		 * 
		 * String mtel2 = request.getParameter("mtel2");
		 * System.out.println("mtel2 : " + mtel2);
		 * 
		 * String memail = request.getParameter("memail");
		 * System.out.println("memail : " + memail);
		 * 
		 * String memail1 = request.getParameter("memail1");
		 * System.out.println("memail1 : " + memail1);
		 * 
		 * String mzonecode = request.getParameter("mzonecode");
		 * System.out.println("mzonecode : " + mzonecode);
		 * 
		 * String mroadaddress = request.getParameter("mroadaddress");
		 * System.out.println("mroadaddress : " + mroadaddress);
		 * 
		 * String mroadaddressdetail =
		 * request.getParameter("mroadaddressdetail");
		 * System.out.println("mroadaddressdetail : " + mroadaddressdetail);
		 * 
		 * String mjibunaddress = request.getParameter("mjibunaddress");
		 * System.out.println("mjibunaddress : " + mjibunaddress);
		 * 
		 * String mhobby = request.getParameter("mhobby");
		 * System.out.println("mhobby : " + mhobby);
		 * 
		 * String minfo = request.getParameter("minfo");
		 * System.out.println("minfo : " + minfo);
		 * 
		 * String mphoto = request.getParameter("mphoto");
		 * System.out.println("mphoto : " + mphoto);
		 */

		// Logic start
		// ------------------------------------------------------------------------

		// 분기를 위해 isudType을 대문자로 변경
		if (isudType != null && isudType.length() > 0) {
			isudType = isudType.toUpperCase();

			// 회원 등록 ("I")
			if ("I".equals(isudType)) {
				System.out.println("입력된 isudType : " + isudType);

				boolean bool = request.getContentType().toLowerCase().startsWith("multipart/form-data");
				if (bool) {
					System.out.println("회원 등록 파일 업로드 루틴 : bool : " + bool);

					String filePaths = CommonUtils.MEMBER_IMG_UPLOAD_PATH;
					int size_limit = CommonUtils.MEMBER_IMG_FILE_SIZE;
					String encode_type = CommonUtils.MEMBER_IMG_ENCODE;

					FileUploadUtil fu = new FileUploadUtil();

					boolean bFile = fu.fileUpldad3(request, filePaths, size_limit, encode_type);

					if (bFile) { // 파일 업로드에 성공한 경우 : 서비스 호출

						MemberService ms = new MemberServiceImpl();

						MemberVO mvo = null;
						mvo = new MemberVO();

						// 회원 번호 (mnum) 세팅
						String mnum = GetChabun.getMemberChabun("d");
						System.out.println("빈 객체에 세팅할 mnum 값 : " + mnum);
						mvo.setMnum(mnum);

						// 회원 이름 (mname) 세팅
						// request.getParameter() 이용시 값을 가져오지 못함.
						String mname = fu.getParameter("mname");
						System.out.println("빈 객체에 세팅할 mname 값: " + mname);
						mvo.setMname(mname);

						// 회원 아이디 (mid) 세팅
						// request.getParameter() 이용시 값을 가져오지 못함.
						String mid = fu.getParameter("mid");
						System.out.println("빈 객체에 세팅할 mid 값 : " + mid);
						mvo.setMid(mid);

						// 회원 비밀번호 (mpw) 세팅
						// request.getParameter() 이용시 값을 가져오지 못함.
						String mpw = fu.getParameter("mpw");
						System.out.println("빈 객체에 세팅할 mpw 값 : " + mpw);
						mvo.setMpw(mpw);

						// 회원 성별 (mgender) 세팅
						String mgender = fu.getParameter("mgender");
						System.out.println("빈 객체에 세팅할 mgender 값 : " + mgender);
						mvo.setMgender(mgender);

						// 회원 생년월일 (mbirth) 세팅
						String mbirth = fu.getParameter("mbirth");
						String mbirth1 = fu.getParameter("mbirth1");
						String mbirth2 = fu.getParameter("mbirth2");
						mbirth = mbirth + mbirth1 + mbirth2;
						System.out.println("빈 객체에 세팅할 mbirth 값 : " + mbirth);
						mvo.setMbirth(mbirth);

						// 회원 휴대전화번호 (mhp) 세팅
						String mhp = fu.getParameter("mhp");
						String mhp1 = fu.getParameter("mhp1");
						String mhp2 = fu.getParameter("mhp2");
						mhp = mhp + mhp1 + mhp2;
						System.out.println("빈 객체에 세팅할 mhp 값 : " + mhp);
						mvo.setMhp(mhp);

						// 회원 전화번호 (mtel) 세팅
						String mtel = fu.getParameter("mtel");
						String mtel1 = fu.getParameter("mtel1");
						String mtel2 = fu.getParameter("mtel2");
						mtel = mtel + mtel1 + mtel2;
						System.out.println("빈 객체에 세팅할 mtel 값 : " + mtel);
						mvo.setMtel(mtel);

						// 회원 이메일 (memail) 세팅
						String memail = fu.getParameter("memail");
						String memail1 = fu.getParameter("memail1");
						memail = memail.concat("@").concat(memail1);
						System.out.println("빈 객체에 세팅할 memail 값 : " + memail);
						mvo.setMemail(memail);

						// 회원 우편번호(mzonecode) 세팅
						String mzonecode = fu.getParameter("mzonecode");
						System.out.println("빈 객체에 세팅할 mzonecode 값 : " + mzonecode);
						mvo.setMzonecode(mzonecode);

						// 회원 도로명 주소 (mroadaddress) 세팅
						// FileUploadUtil의 참조변수 fu를 이용하지 않으면,
						// 즉 fu로는 데이터를 가져오지 않음.
						String mroadaddress = fu.getParameter("mroadaddress");
						String mroadaddressdetail = fu.getParameter("mroadaddressdetail");
						mroadaddress = mroadaddress.concat("@").concat(mroadaddressdetail);
						System.out.println("빈 객체에 세팅할 mroadaddress 값 : " + mroadaddress);
						mvo.setMroadaddress(mroadaddress);

						// 회원 지번 주소 (mjibunaddress) 세팅
						String mjibunaddress = request.getParameter("mjibunaddress");
						System.out.println("빈 객체에 세팅할 mjibunaddress 값 : " + mjibunaddress);
						mvo.setMjibunaddress(mjibunaddress);

						// 회원 취미 (mhobby) 세팅
						String[] hobby = fu.getParameterValues("mhobby");
						String mhobby = "";
						for (int i = 0; i < hobby.length; i++) {
							mhobby += hobby[i] + ",";
						}
						System.out.println("빈 객체에 세팅할 mhobby 값 : " + mhobby);
						mvo.setMhobby(mhobby);

						// 회원 소개글 (minfo) 세팅
						String minfo = fu.getParameter("minfo");
						System.out.println("빈 객체에 세팅할 minfo 값 : " + minfo);
						mvo.setMinfo(minfo);

						// 회원이 업로드한 사진 (mphoto) 세팅
						ArrayList<String> aFileName = fu.getFileNames();
						String mphoto = aFileName.get(0);
						System.out.println("빈 객체에 세팅할 mphoto 값 : " + mphoto);
						mvo.setMphoto(mphoto);

						// 관리자 번호 세팅
						String madmin = "00"; // 관리자 코드
						mvo.setMadmin(madmin);

						// 세팅된 객체 mvo 출력
						System.out.println("-------- setting된 객체 mvo -------");
						MemberVO.printlnMemberVO(mvo);

						boolean bInsert = ms.memberInsert(mvo);

						if (bInsert) { // 정상
							System.out.println("서비스에 전달했던 결과를 정상적으로 받아왔어요 : " + bInsert);
							request.setAttribute("bInsert", new Boolean(bInsert));
							// 여기서 지정해주는 경로? :
							// C:/../wtwebapps/testKck/kck/mem/memInsert.jsp
							RequestDispatcher rd = request.getRequestDispatcher("/kck/mem/memInsert.jsp");
							rd.forward(request, response);

						} else { // 실패
							out.println("<script>");
							// 여기도 같은 경로를 가르킨다?
							out.println("location.href='/testKck/kck/mem/mem.html'");
							out.println("</script>");
						}

					} else { // 파일 업로드에 실패한 경우
						System.out.println("파일 업로드에 실패했어요..");
					}

				}

			}

			// 회원정보 전체 조회 ("SALL")
			if ("SALL".equals(isudType)) {
				System.out.println("입력된 isudType : " + isudType);

				// 서비스 호출한 뒤, 결과는 객체타입 배열에 초기화
				// 결과가 있으면 전체조회 스크립트인 : memSelectAll.jsp로 이동
				// 조회된 데이터가 없으면 다시 컨트롤러의 SALL 로직 수행
				MemberService ms = new MemberServiceImpl();
				ArrayList<MemberVO> aListAll = ms.memberSelectAll();

				if (aListAll != null && aListAll.size() > 0) {

					request.setAttribute("aListAll", aListAll);
					RequestDispatcher rd = request.getRequestDispatcher("/kck/mem/memSelectAll.jsp");
					rd.forward(request, response);

				} else {
					out.println("<script>");
					out.println("location.href='/testKck/mem?ISUD_TYPE=SALL'");
					out.println("</script>");
				}
			}

			// 회원 조건 조회 ("조회버튼 또는 수정버튼 또는 삭제버튼을 누른 경우")
			// 위 버튼들은 실제 동작과 연결된게 아니라 해당 데이터조회 화면으로 넘어간다.
			// 해당 넘버를 가진 회원정보를 가지고 와서 일단 먼저 보여준다.
			// 이 조회 화면 내에 있는 수정, 삭제, 목록, 입력 (I, SALL, U, D) 버튼이 실제 동작.
			if ("S".equals(isudType) || "U".equals(isudType) || "D".equals(isudType)) {
				System.out.println("입력된 isudType : " + isudType);

				// mnumCheck : memSelectAll.jsp에 있는 체크박스의 name
				String mnum = request.getParameter("mnumCheck");

				if (mnum != null && mnum.length() > 0) {
					System.out.println("가져온 회원 번호 : " + mnum);

					MemberService ms = new MemberServiceImpl();

					MemberVO mvo = new MemberVO();

					mvo.setMnum(mnum);

					ArrayList<MemberVO> aListS = ms.memberSelect(mvo);

					if (aListS != null && aListS.size() > 0) {
						// select.jsp로 보내서 조회화면 보여주기
						System.out.println("조회 결과 aListS.size() : " + aListS.size());

						request.setAttribute("aListS", aListS);
						RequestDispatcher rd = request.getRequestDispatcher("/kck/mem/memSelect.jsp");
						rd.forward(request, response);

					} else {
						// 컨트롤러를 통해 다시 전체 조회화면으로.
						out.println("<script>");
						out.println("alert('조회에 실패했어요..')");
						out.println("location.href='/testKck/mem?ISUD_TYPE=SALL'");
						out.println("</script>");
					}

				} else {
					System.out.println("선택된 글 번호가 없네요..");
				}

			}

			// 회원 수정 ("UOK")
			// 회원 수정가능 대상 : 이메일, 취미, 우편번호, 주소
			if ("UOK".equals(isudType)) {
				System.out.println("입력된 isudType : " + isudType);

				MemberService ms = new MemberServiceImpl();
				MemberVO mvo = new MemberVO();

				String mnum = request.getParameter("mnum");
				String memail = request.getParameter("memail");
				String mzonecode = request.getParameter("mzonecode");
				String mroadaddress = request.getParameter("mroadaddress");   
				String mjibunaddress = request.getParameter("mjibunaddress");
				String mhobby = request.getParameter("mhobby");
				
				mvo.setMnum(mnum);
				mvo.setMemail(memail);
				mvo.setMzonecode(mzonecode);
				mvo.setMroadaddress(mroadaddress);
				mvo.setMjibunaddress(mjibunaddress);
				mvo.setMhobby(mhobby);
				
				boolean bUpdate = ms.memberUpdate(mvo);

				if (bUpdate) {
					System.out.println("글 정보 " + bUpdate + "건 수정 완료!");
					request.setAttribute("bUpdate", new Boolean(bUpdate));										
					RequestDispatcher rd = request.getRequestDispatcher("/kck/mem/memUpdate.jsp");
					rd.forward(request, response);
				} else {
					System.out.println("글 수정에 실패했어요..");
					out.println("<script>");
					out.println("alert('글 수정 실패')");
					out.println("location.href='/testKck/mem?ISUD_TYPE=SALL'");
					out.println("</script>");

				}
			}

			// 회원 삭제 ("DOK")
			if ("DOK".equals(isudType)) {
				System.out.println("입력된 isudType : " + isudType);

				MemberService ms = new MemberServiceImpl();
				MemberVO mvo = new MemberVO();

				String mnum = request.getParameter("mnum");

				mvo.setMnum(mnum);
				
				boolean bDelete = ms.memberDelete(mvo);

				if (bDelete) {
					System.out.println("글 " + bDelete + "건 삭제 완료!");
					request.setAttribute("bDelete", new Boolean(bDelete));										
					RequestDispatcher rd = request.getRequestDispatcher("/kck/mem/memDelete.jsp");
					rd.forward(request, response);
				} else {
					System.out.println("글 삭제에 실패했어요..");
					out.println("<script>");
					out.println("alert('글 삭제 실패')");
					out.println("location.href='/testKck/mem?ISUD_TYPE=SALL'");
					out.println("</script>");
				}

			} else {
				System.out.println("잘못된 ISUD_TYPE 입니다.");
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
