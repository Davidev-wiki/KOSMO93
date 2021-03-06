package a.b.c.cgitest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestJspServlet_5
 */
@WebServlet("/TestJsp_5")
public class TestJspServlet_5 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
		throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		
		out.println("<html><head><title>Servlet!</title></head><body>");
		String remoteAddr = request.getRemoteAddr();
		System.out.println("remoteAddr : " + remoteAddr);
		
		String protocol = request.getProtocol();
		out.println("protocol : " + protocol + "<br>");
		System.out.println("protocol : " + protocol);
			
		String method = request.getMethod();
		out.println("method : " + method + "<br>");
		System.out.println("method : " + method);
	
		String uri = request.getRequestURI();
		out.println("uri : " + uri + "<br>");
		System.out.println("uri : " + uri);
		
		String url = request.getRequestURL().toString();
		out.println("url : " + url + "<br>");
		System.out.println("url : " + url);
		
		String context = request.getContextPath();
		out.println("context : " + context + "<br>");
		System.out.println("context : " + context);
		
		String serverName = request.getServerName();
		out.println("serverName : " + serverName + "<br>");
		System.out.println("serverName : " + serverName);
		
		out.println("</body></html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
