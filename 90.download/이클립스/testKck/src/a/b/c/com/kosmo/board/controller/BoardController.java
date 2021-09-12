package a.b.c.com.kosmo.board.controller;

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
import a.b.c.com.common.GetChabun;
import a.b.c.com.kosmo.board.service.BoardService;
import a.b.c.com.kosmo.board.service.BoardServiceImpl;
import a.b.c.com.kosmo.board.vo.BoardVO;

/**
 * Servlet implementation class BoardController
 */
@WebServlet("/board")
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unchecked")
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		request.setCharacterEncoding("EUC-KR");
		response.setCharacterEncoding("EUC-KR");
		response.setContentType("text/html; charset=EUC-KR");

		// output 객체 초기화?
		PrintWriter out = response.getWriter();

		// 요청한 HTML에 있는 hidden type의 name ISUD_TYPE
		// value = 'I' 이다.
		String isudType = request.getParameter("ISUD_TYPE");

		if (isudType != null && isudType.length() > 0) {
			isudType = isudType.toUpperCase();

			// 글 등록
			// if에서 고정된 값을 좌측에 두고 변수를 우측에 두는 것이 관행이다?
			if ("I".equals(isudType)) {
				System.out.println("게시판 글 등록 진입_isudType : " + isudType);

				String saveDirectory = CommonUtils.BOARD_IMG_UPLOAD_PATH;
				int maxPostSize = CommonUtils.BOARD_IMG_FILE_SIZE;
				String encoding = CommonUtils.BOARD_IMG_ENCODE;

				// getContentType()은 "인자"와 동일한 게 있으면 true/false를 반환함.
				boolean bool = request.getContentType().toLowerCase().startsWith("multipart/form-data");

				if (bool) {
					System.out.println("게시판 글 등록 파일 업로드 루틴 bool : : " + bool);

					try {
						// api check
						MultipartRequest mr = new MultipartRequest(   request
																	, saveDirectory
																	, maxPostSize
																	, encoding
																	, new DefaultFileRenamePolicy());
						// 가져온 값 사용할 변수로 초기화
						String bsubject = mr.getParameter("bsubject");
						String bwriter = mr.getParameter("bwriter");
						String bpw = mr.getParameter("bpw");
						String bmemo = mr.getParameter("bmemo");

						// 사진 처리
						// String bphoto = mr.getParameter("bphoto");
						// 사진파일이름을 가져와서 열거타입 변수 e에 저장
						Enumeration<String> e = mr.getFileNames();
						String imgName = e.nextElement();
						String bphoto = mr.getFilesystemName(imgName);

						System.out.println("bsubject : " + bsubject);
						System.out.println("bwriter : " + bwriter);
						System.out.println("bpw : " + bpw);
						System.out.println("bmemo : " + bmemo);
						System.out.println("bphoto : " + bphoto);

						// 서비스 호출
						BoardService bs = new BoardServiceImpl();

						BoardVO bvo = null;
						bvo = new BoardVO();
						
						String bnum = GetChabun.getBoardChabun("N");
						System.out.println("가져온 번호 : " + bnum);
						
						bvo.setBnum(bnum);
						bvo.setBsubject(bsubject);
						bvo.setBwriter(bwriter);
						bvo.setBpw(bpw);
						bvo.setBmemo(bmemo);
						bvo.setBphoto(bphoto);

						boolean bInsert = bs.boardInsert(bvo);

						if (bInsert) {
							request.setAttribute("bInsert", new Boolean(bInsert));
							// RequestDispatcher인터페이스에서 사용하는 함수인, 
							// getRequestDispatcher는 Context경로를 사용하지 않음.
							// 웹 컨테이너 경로를 이용함
							RequestDispatcher rd = request.getRequestDispatcher("/kck/board/boardInsert.jsp");
							rd.forward(request, response);
						} else {
							out.println("<script>");
							out.println("location.href='/testKck/kck/board/board.html'");
							out.println("</script>");
						}

					} catch (Exception e) {
						System.out.println("게시물 등록중 에러났어요! : " + e);
					}
				}
			} // 글 등록 end

			// 글 전체 조회
			if ("SALL".equals(isudType)) {
				System.out.println("게시판 글 전체 조회 진입_isudType : " + isudType);

				// 서비스 호출
				BoardService bs = new BoardServiceImpl();
				ArrayList<BoardVO> aListAll = bs.boardSelectAll();

				if (aListAll != null && aListAll.size() > 0) {

					request.setAttribute("aListAll", aListAll);
					// bookselectAll.jsp 만들어야 함
					// api 찾아보기
					RequestDispatcher rd = request.getRequestDispatcher("/kck/board/boardSelectAll.jsp");
					rd.forward(request, response);

				} else {
					out.println("<script>");
					// 전체 조회로 받아온 데이터가 없으면 다시 서블릿 전체 조회 페이지로 보내기
					out.println("location.href='/testKck/board?ISUD_TYPE=SALL'");
					out.println("<script>");

				}
			} // 글 등록 end

			// 글 조건 조회
			if ("S".equals(isudType) || "U".equals(isudType) || "D".equals(isudType)) {
				System.out.println("글 조건 조회 : S or U or D isudType : " + isudType);

				String bnum = request.getParameter("bnumCheck");

				if (bnum != null && bnum.length() > 0) {
					System.out.println("글 번호 : " + bnum);

					BoardService bs = new BoardServiceImpl();
					BoardVO bvo = null;
					bvo = new BoardVO();

					bvo.setBnum(bnum);

					ArrayList<BoardVO> aListS = bs.boardSelect(bvo);

					if (aListS != null && aListS.size() > 0) {
						System.out.println("aListS.size : " + aListS.size());

						// setAAttribute,rd api 찾아보기
						request.setAttribute("aListS", aListS);
						// jsp 파일 만들어야 함. 웹서버 경로임.
						RequestDispatcher rd = request.getRequestDispatcher("/kck/board/boardSelect.jsp");
						rd.forward(request, response);

					} else {
						out.println("<script>");
						out.println("alert('글 조회 실패')");
						// 서블릿이 참조하는 웹 컨테이너 경로, 전체 조회 링크로 보내버린다.
						out.println("location.href='/testkck/board?ISUD_TYPE=SALL'");
						out.println("</script>");
					}

				} else {
					System.out.println("글 번호가 없어요..");
				}
			} // 글 조건 조회 end

			// 글 수정
			if ("UOK".equals(isudType)) {
				System.out.println("글 수정 isudType : " + isudType);

				String bnum = request.getParameter("bnusm");
				String bsubject = request.getParameter("bsubject");
				String bmemo = request.getParameter("bmemo");

				System.out.println("bnum : " + bnum);
				System.out.println("bsubject : " + bsubject);
				System.out.println("bmemo : " + bmemo);

				BoardService bs = new BoardServiceImpl();
				BoardVO bvo = null;
				bvo = new BoardVO();

				bvo.setBnum(bnum);
				bvo.setBsubject(bsubject);
				bvo.setBmemo(bmemo);

				boolean bUpdate = bs.boardUpdate(bvo);

				if (bUpdate) { // true;
					System.out.println("정상적으로 수정 되었습니다." + bUpdate);
					request.setAttribute("bUpdate", new Boolean(bUpdate));
					// 웹 서버에 있는 .jsp 경로로 보내버린다.
					RequestDispatcher rd = request.getRequestDispatcher("/kck/board/boardUpdate.jsp");
					rd.forward(request, response);

				} else { // false; 정상적으로 수정되지 않은 경우
					System.out.println("글 수정 실패!");
					out.println("<script>");
					out.println("alert('글 수정 실패')");
					// 전체조회 서블릿 페이지로 이동시킨다.
					out.println("location.href='/testkck/board?isudtype=SALL'");
					out.println("</script>");
				}

			}

			// 글 삭제
			if ("DOK".equals(isudType)) {
				System.out.println("글 삭제 isudType : " + isudType);

				String bnum = request.getParameter("bnum");
				System.out.println("bnum : " + bnum);

				BoardService bs = new BoardServiceImpl();
				BoardVO bvo = null;
				bvo = new BoardVO();

				boolean bDelete = bs.boardDelete(bvo);

				if (bDelete) { // true : 삭제 성공인 경우
					System.out.println("정상적으로 글이 삭제되었습니다. " + bDelete);
					request.setAttribute("bDelete", new Boolean(bDelete));
					RequestDispatcher rd = request.getRequestDispatcher("/kck/board/boardDelete.jsp");
					rd.forward(request, response);

				} else { // false : 삭제 실패인 경우
					System.out.println("글 삭제에 실패했어요..");
					out.println("<script>");
					out.println("alert('글 수정 실패')");
					out.println("location.href='/testkck/board?isudtype=SALL'");
					out.println("</script>");
				}
			}
		} else {
			System.out.println("HTML의 form태그에서 hidden type의 ISUD_TYPE을 확인하세요");
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
