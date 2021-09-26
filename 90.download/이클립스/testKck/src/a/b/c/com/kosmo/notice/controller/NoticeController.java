package a.b.c.com.kosmo.notice.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import a.b.c.com.common.CommonUtils;
import a.b.c.com.common.FileUploadUtil;
import a.b.c.com.common.GetChabun;
import a.b.c.com.kosmo.notice.service.NoticeService;
import a.b.c.com.kosmo.notice.service.NoticeServiceImpl;
import a.b.c.com.kosmo.notice.vo.NoticeVO;

import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet("/notice")
public class NoticeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		// encoding setting
		request.setCharacterEncoding("EUC-KR");
		response.setCharacterEncoding("EUC-KR");
		response.setContentType("text/html; charset=EUC-KR");

		// PrintWriter
		PrintWriter out = response.getWriter();

		// request.getParameter로 가져온 값을 isudType 변수에 초기화
		String isudType = request.getParameter("ISUD_TYPE");

		// Data null 체크
		if (isudType != null && isudType.length() > 0) {

			// 분기를 위해 대문자로 변경
			isudType = isudType.toUpperCase();

			// 공지사항 등록 : "I"
			if ("I".equals(isudType)) {

				System.out.println("Controller에 입력된 isudType : " + isudType);

// DB에 데이터 등록하기위한 기본 세팅
				boolean bool = request.getContentType().toLowerCase().startsWith("multipart/form-data");

				if (bool) {
					System.out.println("파일 업로드 루틴  bool : " + bool);

					// filePaths : 파일이 업로드 되는 경로 설정
					// size_limit & encode_type : 파일 사이즈 제한 규칙, 인코딩 타입
					String filePaths = CommonUtils.NOTICE_IMG_UPLOAD_PATH;
					int size_limit = CommonUtils.NOTICE_IMG_FILE_SIZE;
					String encode_type = CommonUtils.NOTICE_IMG_ENCODE;

					// FileUploadUtil : 파일 업로드에 관한 설정이 들어있는 클래스
					FileUploadUtil fu = new FileUploadUtil();

					// FileUploadUtil의 fileUpldad3 규칙을 이용해서 true값을 받아온다.
					// 지정한 자원들의 정보를 이용해 새로운 MultipartRequest 클래스 생성한 결과임
					boolean bFile = fu.fileUpldad3(request, filePaths, size_limit, encode_type);

					// Service -> DAO로 보내는 로직
// 정상적으로 MultipartRequest를 생성완료 한 경우 서비스 호출.
					if (bFile) {

						// Service를 이용해 보낼 객체 생성
						NoticeService ns = new NoticeServiceImpl();
						NoticeVO nvo = new NoticeVO();

						// nvo 객체에 담을 값을 변수에 초기화
						// nnum은 채번로직으로 값을 받아옴
						// nphoto는 파일 이름을 문자열로 저장
						String nnum = GetChabun.getNoticeChabun("d");
						String nsubject = fu.getParameter("nsubject");
						String nmemo = fu.getParameter("nmemo");

						ArrayList<String> aFileName = fu.getFileNames();
						String nphoto = aFileName.get(0);

						// setting 된 변수 확인 출력
						System.out.println("setting된 nnum : " + nnum);
						System.out.println("setting된 nsubject : " + nsubject);
						System.out.println("setting된 nmemo : " + nmemo);
						System.out.println("setting된 nphoto : " + nphoto);

						// nvo 객체에 데이터 값 세팅
						nvo.setNnum(nnum);
						nvo.setNsubject(nsubject);
						nvo.setNmemo(nmemo);
						nvo.setNphoto(nphoto);

						int nCnt = ns.noticeInsert(nvo);
// 등록 성공 : Insert.jsp 연결
						if (nCnt > 0) {

							System.out.println("DB에 등록한 건수 nCnt를 request stream에 저장합니다. nCnt : " + nCnt);
							request.setAttribute("nCnt", nCnt);
							RequestDispatcher rd = request.getRequestDispatcher("/kck/notice/noticeInsert.jsp");
							rd.forward(request, response);

// 등록 실패 : notice.html 연결
						} else {

							System.out.println("DB에 데이터 등록 실패! 등록 : " + nCnt + " 건");
							out.println("<script>");
							out.println("location.href='testKck/kck/notice/notice.html");
							out.println("</script>");

						}
					}
				}
			}

			// 공지사항 조회 : "SALL"
			if ("SALL".equals(isudType)) {
				System.out.println("전송된 ISUD_TYPE : " + isudType);
// NoticeService로 데이터 조회 결과 받아오기
				// 객체 세팅
				NoticeService ns = new NoticeServiceImpl();
				NoticeVO nvo = new NoticeVO();
				 
				ArrayList<NoticeVO> aListAll = ns.noticeSelectAll();
// 전체 조회 성공 : 조회 화면 noticeSelect.jsp 연결
				
				if(aListAll != null && aListAll.size() > 0){
					
					System.out.println("가져온 객체의 수 : aListAll.size() : " + aListAll.size());
					request.setAttribute("aListAll", aListAll);
					RequestDispatcher rd = request.getRequestDispatcher("/kck/notice/noticeSelectAll.jsp");
					rd.forward(request, response);
					
// 전체 조회 실패 : 다시 controller : SALL로 이동	
				} else {
					System.out.println("DB에서 전체 데이터 조회에 실패했어요..");
					out.println("<script>");
					out.println("location.href='/testKck/notice?ISUD_TYPE=SALL'");
					out.println("</script>");
				}
				
			}

			// 공지사항 등록 : "U"
			if ("U".equals(isudType)) {

			}

			// 공지사항 등록 : "D"
			if ("D".equals(isudType)) {

			}

		} else {
			System.out.println("ISUD_TYPE을 확인해주세요.");
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
