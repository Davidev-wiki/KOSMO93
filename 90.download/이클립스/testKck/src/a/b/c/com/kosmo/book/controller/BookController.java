package a.b.c.com.kosmo.book.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import a.b.c.com.common.CommonUtils;
import a.b.c.com.common.FileUploadUtil;
import a.b.c.com.common.GetChabun;
import a.b.c.com.kosmo.board.service.BoardService;
import a.b.c.com.kosmo.board.service.BoardServiceImpl;
import a.b.c.com.kosmo.board.vo.BoardVO;
import a.b.c.com.kosmo.book.service.BookService;
import a.b.c.com.kosmo.book.service.BookServiceImpl;
import a.b.c.com.kosmo.book.vo.BookVO;

/**
 * Servlet implementation class BoardController
 */
@WebServlet("/book")
public class BookController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unchecked")
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		// 요청-응답 시 사용될 인코딩 타입을 세팅한다.
		request.setCharacterEncoding("EUC-KR");
		response.setCharacterEncoding("EUC-KR");

		// 응답시 사용되는 콘텐츠 타입과 인코딩 방식을 설정한다.
		response.setContentType("text/html; charset=EUC-KR");

		// PrintWriter API를 이용해 output에 응답할 사항을 적는다?
		// out.println에 사용되는 참조변수인가?
		PrintWriter out = response.getWriter();

		// 요청시 isudtype이라는 이름에 대한 값을
		// isudtype 변수에 담는다.
		String isudtype = request.getParameter("isudtype");

		// 해당 isudtype의 데이터의 문자를 대문자로 변경한다.
		if (isudtype != null)
			isudtype.toUpperCase();

		// 널 체크
		if (isudtype != null && isudtype.length() > 0) {

			System.out.println("데이터 요청에 입력된 isudtype 출력 값 : " + isudtype);
			System.out.println("데이터 요청에 입력된 remoteIP 출력 값 : " + request.getRemoteAddr());
			System.out.println("데이터 요청에 입력된 method 출력 값 : " + request.getMethod());

			// 도서 등록 (버튼이 눌린 경우)
			if ("I".equals(isudtype)) {
				System.out.println("도서 정보 등록 요청 isudtype : " + isudtype);
				
				
				/*
				 * 전달할 변수 초기화하기
				 * VO클래스 참조하기
				 
				  	private String bnum;
					private String btitle;
					private String bauth;
					private String isbn;
					private String bcomp;
					private String bcover;
					private String bqty;
					private String bprice;
					private String deleteyn;
					private String insertdate;
					private String updatedate;
				*/
				
		  		String bnum = "";
				String btitle = "";
				String bauth = "";
				String isbn = "";
				String bcomp = "";
				String bqty = "";
				String bprice = "";
				String bcover = "";
				
				/*
				 	POST 방식에서 request.getParameter()메서드를
					WAS에서 알아서 처리할 수 있도록 되어있는 이유는
					
	form에서 method가 POST방식일 때는 
	디폴트값으로 enctype="application/x-www-form-urlencoded" 옵션이 설정 되어있기 때문에
		
					이를 WAS에서 인식하고 알아서 in/output방식으로 데이터를 처리하기 때문입니다.
					따라서. 
					
					이미지를 위해서 전송하는 경우 enctype가 Multipart로 설정해야하기 때문에				
					request.getParameter()로 데이터를 불러올 수 없게 됩니다.
				*/
				
				
				// 파일 업로드에 관한 로직
				
				// 요청된 내용에서 콘텐츠 타입을 가져오는데,
				// 소문자로 바꿔서 가져오고, 
				// multipart/form-data 포맷을 사용해 
				// 이미지를 전송받을 수 있도록 한다.
				// book.html에서 이미 POST method이지만 
				// enctype을 multipart/form-data 로 했는데
				// 왜 굳이 또 적었나?
				// 여기서 파일이 있는 경우가 true인가???
				boolean fileUploadBool = request.getContentType().toLowerCase().startsWith("multipart/form-data");
				System.out.println("fileUploadBool 확인용 : " + fileUploadBool);
				
				if(fileUploadBool){
					System.out.println("파일 업로드시 세팅 리스트");
					
					String filePath = CommonUtils.BOOK_IMG_UPLOAD_PATH;
					int size_limit = CommonUtils.BOOK_IMG_FILE_SIZE;
					String encode_type = CommonUtils.BOOK_IMG_ENCODE;
					
					FileUploadUtil fu = new FileUploadUtil();
					
					// 데이터가 업로드 된 경우가 true
					boolean bool = fu.fileUpldad3(request, filePath, size_limit, encode_type);
					
					if (bool) {
							btitle = fu.getParameter("btitle");
							bauth = fu.getParameter("bauth");
							isbn = fu.getParameter("isbn");
							bcomp = fu.getParameter("bcomp");
							bprice = fu.getParameter("bprice");
							bqty = fu.getParameter("bqty");
							
							// 표지
							ArrayList<String> aFileName = fu.getFileNames();
							bcover = aFileName.get(0);
							
					} else {
							System.out.println("파일이 업로드 되지 않았어요..");
					}							
				}
				
				// 데이터 등록 로직 (데이터 등록은 어떻게 할 것인가?)
				// number : 채번
				// 나머지 데이터 : 입력된 요청대로 등록
				// "d" : 몇일인지 날짜가 표기된 형식
				bnum = GetChabun.getBookChabun("d"); 
				
				// DB에 등록 요청을 위해 전달할 데이터를 출력해보기
				System.out.println("bnum : " + bnum);
				System.out.println("btitle : " + btitle);
				System.out.println("bauth : " + bauth);
				System.out.println("isbn : " + isbn);
				System.out.println("bcomp : " + bcomp);
				System.out.println("bprice : " + bprice);
				System.out.println("bqty : " + bqty);
				System.out.println("bcover : " + bcover);				
				
				
				// Service를 이용해서 
				// 데이터 값이 세팅된 객체를 DB로 전달하기.
				BookService bs = new BookServiceImpl();
				
				// 객체에 데이터 세팅
				BookVO bvo = new BookVO();
				
				bvo.setBnum(bnum);
				bvo.setBtitle(btitle);
				bvo.setBauth(bauth);
				bvo.setIsbn(isbn);
				bvo.setBcomp(bcomp);
				bvo.setBprice(bprice);
				bvo.setBqty(bqty);
				bvo.setBcover(bcover);
				
				// 로그 찍어보기!!!!!!!!!!
				// BookVO.printlnBookVO(bvo);
				
				// Insert함수로 보낸 요청에 대한 결과 값을 받아
				// int 타입 nCnt 변수에 저장
				int nCnt = bs.bookInsert(bvo);
				
				if (nCnt > 0) {
					// 등록에 성공하면 bookInsert.jsp 페이지를 보여준다.
					System.out.println("도서 " + nCnt + " 건 등록 완료!");
					
					// 건 수를 담은 integer 객체를 새로 만들고
					// "nCnt"의 이름을 붙인다음 요청에다가 세팅한다.
					request.setAttribute("nCnt", new Integer(nCnt));
					
					// 요청한 데이터 처리를 중개하는 RequestDispatcher를 이용해 처리(경로)를 설정한다.
					RequestDispatcher rd = request.getRequestDispatcher("/kck/book/bookInsert.jsp");
					
					//RequestDispatcher 를 이용해 요청사항에 대한 응답을 전송한다.
					rd.forward(request, response);
					
				} else {
					// 등록에 실패하면 다시 등록하는 화면으로 보내버린다.
					System.out.println("도서 등록에 실패했어요.");
					out.println("<script>");
					out.println("location.href='/testKck/kck/book/book.html'");
					out.println("</script>");
				}
			}

			// 도서 정보 전체 조회
			// 데이터 요청시 입력된 isudtype의 값이 "SALL"인 경우
			if ("SALL".equals(isudtype)) {
				System.out.println("데이터 요청에 입력된 isudtype 출력 값 : " + isudtype);
				
				BookService bs = new BookServiceImpl();
				BookVO bvo = new BookVO();
				
				ArrayList<BookVO> aListAll = bs.bookSelectAll();
				
				if(aListAll != null && aListAll.size() > 0){
					
					request.setAttribute("aListAll", aListAll);
					RequestDispatcher rd = request.getRequestDispatcher("/kck/book/bookSelectAll.jsp");
					rd.forward(request, response);
					
				} else {
					out.println("<script>");
					out.println("location.href='/testKck/book?isudtype=SALL'");
					out.println("</script>");
				}

			}

			// 도서 정보 조건 조회 ('S' or 'U' or 'D')
			// 데이터 요청시 입력된 isudtype의 값이 "SALL"인 경우
			if ("S".equals(isudtype) || "U".equals(isudtype) || "D".equals(isudtype)) {
				System.out.println("조건 조회  isudtype 값 : " + isudtype);
				
				String bnum = request.getParameter("bnumCheck");
				if (bnum != null && bnum.length() > 0){
					System.out.println("조회할 도서 번호  : " + bnum);
					BookService bs = new BookServiceImpl();
					BookVO bvo = new BookVO();
					bvo.setBnum(bnum);
					
					ArrayList<BookVO> aList = bs.bookSelect(bvo);
					
					if(aList != null && aList.size() > 0){
						
						request.setAttribute("aList", aList);
						RequestDispatcher rd = request.getRequestDispatcher("/kck/book/bookSelect.jsp");
						rd.forward(request, response);
					} else {
						out.println("<script>");
						out.println("location.href='/testKck/book?isudtype=SALL'");
						out.println("</script>");
						
					}
				
				} else {
					System.out.println("DB에서 데이터를 가져오지 못했어요..");
				}
			}

			// 도서 수정 (버튼이 눌린 경우 실행되는 로직)
			if ("UOK".equals(isudtype)) {		
				System.out.println("도서 정보 수정 isudtype : " + isudtype);

				String bnum = request.getParameter("bnum");
				String bprice = request.getParameter("bprice");
				String bqty = request.getParameter("bqty");				
				System.out.println("bnum >>> : " + bnum);
				System.out.println("bprice >>> : " + bprice);
				System.out.println("bqty >>> : " + bqty);
				
				BookService bs = new BookServiceImpl();
				BookVO bvo = null;
				bvo = new BookVO();
				
				bvo.setBnum(bnum);
				bvo.setBprice(bprice);
				bvo.setBqty(bqty);
				
				int nCnt = bs.bookUpdate(bvo);
				
				if (nCnt >  0) {
					System.out.println("도서 정보 " + nCnt + " 건 수정 되었습니다.");		
					request.setAttribute("nCnt", new Integer(nCnt));										
					RequestDispatcher rd= request.getRequestDispatcher("/kck/book/bookUpdate.jsp");
					rd.forward(request, response);
					
				}else {
					System.out.println("도성 정보 등록 실패 !!!!");
					out.println("<script>");					
					out.println("location.href='/testKck/book?isudtype=SALL'");
					out.println("</script>");
				}
			}

			// 도서 삭제 (버튼이 눌린 경우 실행되는 로직)
			if ("DOK".equals(isudtype)) {
				System.out.println("도서 정보 수정 isudtype : " + isudtype);
				
				String bnum = request.getParameter("bnum");				
				System.out.println("bnum : " + bnum);
				
				BookService bs = new BookServiceImpl();
				BookVO bvo = null;
				bvo = new BookVO();
				
				bvo.setBnum(bnum);				
				int nCnt = bs.bookDelete(bvo);
				
				if (nCnt >  0) {
					System.out.println("도서 정보 " + nCnt + " 건 삭제 되었습니다.");		
					request.setAttribute("nCnt", new Integer(nCnt));										
					RequestDispatcher rd= request.getRequestDispatcher("/kck/book/bookDelete.jsp");
					rd.forward(request, response);
					
				}else {
					System.out.println("도서 정보 등록 실패 !!!!");
					out.println("<script>");					
					out.println("location.href='/testKck/book?isudtype=SALL'");
					out.println("</script>");
				}
			}

		} else {
			// null or length == 0일 때 출력될 문장.
			System.out.println("요청시 입력된 데이터가 없습니다, isudtype을 확인하세요!");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
