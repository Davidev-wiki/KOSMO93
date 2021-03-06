package a.b.c.cgitest;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LocationServleet
 */
@WebServlet("/Location")
public class LocationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException {
		// TODO Auto-generated method stub
/*
	req.setCharacterEncoding("EUC-KR");
	res.setContentType("text/html; charset=EUC-KR");
	
	PrintWriter out = res.getWriter();
	
	out.println("<script>");
	out.println("location.href='http://www.naver.com'");
	out.println("</script>");
*/
	ArrayList<EmpVO> aList = null;
	
	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orclKOSMO00", "scott","tiger");
		Statement stmt = conn.createStatement();
		ResultSet rsRs = stmt.executeQuery("SELECT * FROM EMP");
		
		aList = new ArrayList<EmpVO>();
		
		while(rsRs.next()){
			
			EmpVO evo = new EmpVO();
			evo.setEmpno(rsRs.getString(1));
			evo.setEmpno(rsRs.getString(2));
			evo.setEmpno(rsRs.getString(3));
			evo.setEmpno(rsRs.getString(4));
			evo.setEmpno(rsRs.getString(5));
			evo.setEmpno(rsRs.getString(6));
			evo.setEmpno(rsRs.getString(7));
			evo.setEmpno(rsRs.getString(8));
			
			aList.add(evo);
		}
		
	} catch(Exception e){
		
		System.out.println("error ?????? : " + e);
	}
	
	req.setAttribute("aList", aList);
	RequestDispatcher rd = req.getRequestDispatcher("\\cgiTest\\dispatcher.jsp");
	rd.forward(req, res);
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
