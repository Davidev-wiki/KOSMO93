package a.b.c.com.kosmo.login.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import a.b.c.com.kosmo.login.service.LoginService;
import a.b.c.com.kosmo.login.service.LoginServiceImpl;
import a.b.c.com.kosmo.mem.vo.MemberVO;

@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		request.setCharacterEncoding("EUC-KR");
		response.setCharacterEncoding("EUC-KR");
		response.setContentType("text/html; charset=EUC-KR");

		PrintWriter out = response.getWriter();

		String login_type = request.getParameter("login_type");
		if (login_type != null)
			login_type.toUpperCase();

		String remoteIP = request.getRemoteAddr();
		String method = request.getMethod();

		// 웹페이지에서 로그인 버튼이 눌려 login_type에 값이 들어온 경우
		if (login_type != null && login_type.length() > 0) {

			// login_type이 'LOGIN'인 경우
			if ("LOGIN".equals(login_type)) {
				out.println("로그인 체크 login_type >>> : " + login_type);
				System.out.println("로그인 체크 login_type >>> : " + login_type);
				System.out.println("method >>> : " + method);
				System.out.println("remoteIP >>> : " + remoteIP);

				String mid = request.getParameter("mid");
				String mpw = request.getParameter("mpw");
				System.out.println("아이디 mid >>> : " + mid);
				System.out.println("비밀번호 mpw >>> : " + mpw);

				// 서비스 호출
				LoginService ls = new LoginServiceImpl();
				MemberVO mvo = null;
				mvo = new MemberVO();

				mvo.setMid(mid);
				mvo.setMpw(mpw);
				int nCnt = ls.loginCheckCnt(mvo);
				System.out.println("컨트롤러에 받아온 nCnt 값 : " + nCnt);

				if (nCnt == 1) {
					request.setAttribute("nCnt", new Integer(nCnt));
					RequestDispatcher rd = request.getRequestDispatcher("/kck/login/login.jsp");
					rd.forward(request, response);
				} else {
					out.println("<script>");
					out.println("alert('로그인 실패 !!')");
					out.println("location.href='/testKck/kck/login/login.html'");
					out.println("</script>");
				}

			} // 로그아웃
			if ("LOGOUT".equals(login_type)) {
				out.println("로그아웃 login_type : " + login_type);
				System.out.println("로그아웃 login_type : " + login_type);

				String mid = request.getParameter("mid");
				boolean bool = false;

				if (mid != null && mid.length() > 0) {
					bool = true;
				}

				if (bool) {
					RequestDispatcher rd = request.getRequestDispatcher("/kck/login/logout.jsp");
					rd.forward(request, response);
				} else {
				}
			}

		} else {
			System.out.println("login_type을 잘 넘기세요 : " + login_type);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
