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
		
			// ID �ߺ� üũ
			if ("IDCHECK".equals(isudType)) {
				// �� out.println����?? ��� ��µǴ°�?
				out.println("isudType : " + isudType);
				
				Connection conn = null;
				PreparedStatement pstmt = null;
				ResultSet rsRs = null;
				
				int nCnt = 0;
				String idCheckVal = "";
				// �÷����� ī��Ʈ �Լ��� mid�� ������ id�� ��ġ�ϴ� ������ ������.
				// 1�� ������ �̹� ��ϵ� id�� �ִٴ� �� 
				String idCheckQuery = "SELECT COUNT(A.ENAME) NCNT FROM EMP A WHERE A.ENAME = ?";
				
				String mid = request.getParameter("mid");
				System.out.println("������������ ������ mid : " + mid);
				try {
					
					conn = CommonDBConn.getConnection();
					pstmt = conn.prepareStatement(idCheckQuery);
					System.out.println("���̵� üũ ���� ��ȸ : " + idCheckQuery);
					
					pstmt.setString(1, mid);
					rsRs = pstmt.executeQuery();
					
					if (rsRs != null) {
						while (rsRs.next()) {
							// 1��° �÷��� ����� ���ϵȴ�.
							nCnt = rsRs.getInt(1);
						}
						System.out.println("rsRs.getInt(1) �� �� : nCnt : " + nCnt);
					}
					
				} catch (Exception e) {
					System.out.println("DB������ ������ �߻��߾��! : " + e.getMessage());
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
					// Ajax���� ������ �̵��� 
					// ������ Javascript�� �����ؾ� �Ѵ�.
				}
			}
			
			
			// PW Ȯ�� 
			if ("PWCHECK".equals(isudType)) {
				// ��� ��µǴ� ������ Ȯ�� �ʿ�
				out.println("isudType : " + isudType);
				
				Connection conn = null;
				PreparedStatement pstmt = null;
				ResultSet rsRs = null;
				
				int nCnt = 0;
				String pwCheckVal = "";
				String pwCheckQuery = "SELECT COUNT(A.EMPNO) NCNT FROM EMP A WHERE A.EMPNO = ?";
				
				String mpw = request.getParameter("mpw");
				System.out.println("�� ���������� �޾ƿ� mpw�� �� : " + mpw);
				
				try {
					
					conn = CommonDBConn.getConnection();
					pstmt = conn.prepareStatement(pwCheckQuery);
					System.out.println("�н����� üũ ���� ��ȸ : " + pwCheckQuery);
					
					pstmt.setString(1, mpw);
					rsRs = pstmt.executeQuery();
					
					if (rsRs != null) {
						while (rsRs.next()){
							nCnt = rsRs.getInt(1); // 1��° �÷��� ����� ���ϵȴ�.
						}
					}
					
				} catch (Exception e) {
					System.out.println("DB������ ������ �߻��߾��! :" + e.getMessage());
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
					// �ٸ����� ����!!
				}
			}
			
		} else {
			System.out.println("isudType�� Ȯ���ϼ���! isudType : " + isudType);
		}
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}