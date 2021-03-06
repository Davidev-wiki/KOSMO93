package a.b.c.com.common;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class IdPwCheckServlet
 */
@WebServlet("/idpwCheck")
public class IdPwCheckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("EUC-KR");
		response.setCharacterEncoding("EUC-KR");
		response.setContentType("text/html; charset=EUC-KR");
		
		PrintWriter out = response.getWriter();
		
		String isudType = request.getParameter("ISUD_TYPE");
		if (isudType != null && isudType.length() > 0) {
			isudType = isudType.toUpperCase();
		
			// ID 중복 체크
			if ("IDCHECK".equals(isudType)) {
				// 왜 out.println이지?? 어디 출력되는거?
				out.println("isudType : " + isudType);
				
				Connection conn = null;
				PreparedStatement pstmt = null;
				ResultSet rsRs = null;
				
				int nCnt = 0;
				String idCheckVal = "";
				// 컬럼에서 카운트 함수로 mid로 가져온 id와 일치하는 개수를 가져옴.
				// 1개 있으면 이미 등록된 id가 있다는 것 
				String idCheckQuery = "SELECT COUNT(A.ENAME) NCNT FROM EMP A WHERE A.ENAME = ?";
				
				String mid = request.getParameter("mid");
				System.out.println("웹브라우저에서 가져온 mid : " + mid);
				try {
					
					conn = CommonDBConn.getConnection();
					pstmt = conn.prepareStatement(idCheckQuery);
					System.out.println("아이디 체크 쿼리 조회 : " + idCheckQuery);
					
					pstmt.setString(1, mid);
					rsRs = pstmt.executeQuery();
					
					if (rsRs != null) {
						while (rsRs.next()) {
							// 1번째 컬럼의 밸류가 리턴된다.
							nCnt = rsRs.getInt(1);
						}
						System.out.println("rsRs.getInt(1) 의 값 : nCnt : " + nCnt);
					}
					
				} catch (Exception e) {
					System.out.println("DB연동에 문제가 발생했어요! : " + e.getMessage());
				}
				
				if (nCnt == 1) {
					idCheckVal = "IDGOOD";
				} else {
					idCheckVal = "IDBAD";
				}
			
				if (idCheckVal.length() > 0) {
					
					System.out.println("idCheckVal : " + idCheckVal);
					request.setAttribute(idCheckVal, idCheckVal);
					RequestDispatcher rd = request.getRequestDispatcher("/AjaxTest/idCheck.jsp");
					rd.forward(request, response);
					
				} else {
					// Ajax에서 데이터 이동시 
					// 무조건 Javascript를 경유해야 한다.
				}
			}
			
			
			// PW 확인 
			if ("PWCHECK".equals(isudType)) {
				// 어디에 출력되는 것인지 확인 필요
				out.println("isudType : " + isudType);
				
				Connection conn = null;
				PreparedStatement pstmt = null;
				ResultSet rsRs = null;
				
				int nCnt = 0;
				String pwCheckVal = "";
				String pwCheckQuery = "SELECT COUNT(A.EMPNO) NCNT FROM EMP A WHERE A.EMPNO = ?";
				
				String mpw = request.getParameter("mpw");
				System.out.println("웹 브라우저에서 받아온 mpw의 값 : " + mpw);
				
				try {
					
					conn = CommonDBConn.getConnection();
					pstmt = conn.prepareStatement(pwCheckQuery);
					System.out.println("패스워드 체크 쿼리 조회 : " + pwCheckQuery);
					
					pstmt.setString(1, mpw);
					rsRs = pstmt.executeQuery();
					
					if (rsRs != null) {
						while (rsRs.next()){
							nCnt = rsRs.getInt(1); // 1번째 컬럼의 밸류가 리턴된다.
						}
					}
					
				} catch (Exception e) {
					System.out.println("DB연동에 문제가 발생했어요! :" + e.getMessage());
				}
				
				if (nCnt == 1){
					pwCheckVal = "PW_GOOD";
				} else {
					pwCheckVal = "PW_BAD";
				}
				
				if (pwCheckVal.length() > 0) {
					
					System.out.println("pwCheckVal : " + pwCheckVal);
					request.setAttribute(pwCheckVal, pwCheckVal);
					RequestDispatcher rd = request.getRequestDispatcher("/AjaxTest/pwCheck.jsp"); 
					rd.forward(request, response);
				
				} else {
					// 다른데로 못가!!
				}
			}
			
		} else {
			System.out.println("isudType을 확인하세요! isudType : " + isudType);
		}
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
