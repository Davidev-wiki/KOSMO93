/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.70
 * Generated at: 2021-10-06 03:38:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.AjaxTest;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ajax1_005f1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=EUC-KR");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"EUC-KR\">\r\n");
      out.write("<title> Ajax Test </title>\r\n");
      out.write("<script  src=\"http://code.jquery.com/jquery-latest.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("	$(document).ready(function(){\r\n");
      out.write("		\r\n");
      out.write("		$('#button').click(function(){\r\n");
      out.write("			alert(\"button 함수 클릭 성공 >>> : \");			\r\n");
      out.write("			callAjax();\r\n");
      out.write("		});\r\n");
      out.write("	});\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	function callAjax(){\r\n");
      out.write("		alert(\"callAjax() 함수 호출 성공  >>> : \");\r\n");
      out.write("	\r\n");
      out.write("		// 예약어(키워드)를 ajax() 함수 안에 {} 자바스크립트 객체 형태로 사용한다.  \r\n");
      out.write("		// $.ajax({\"url\": \"\", \"type\": \"\", \"success\" : \"function(매개변수){...}\"\");		\r\n");
      out.write("		\r\n");
      out.write("		// 요청하는 데이터를 ajax 함수 밖에서 선언하고 초기화 하기 \r\n");
      out.write("		// ajax 함수 블럭에서는 로그를 찍을 수가 없다. \r\n");
      out.write("		// 요청하는 데이터 로그찍는 대상 키워드 :  url, type, data\r\n");
      out.write("		// 변수를 let 지역변수로 사용했다.\r\n");
      out.write("		let urlVal = \"/testCss/AjaxTest/data1.jsp\";\r\n");
      out.write("		let typeVal = \"GET\"\r\n");
      out.write("		let idVal = $('#id').val();\r\n");
      out.write("		\r\n");
      out.write("		// 요청하는 데이터 alert으로 로그 찍어보기 \r\n");
      out.write("		alert(\"요청하는 데이터 알럿으로 로그 찍어보기  >>> : \");\r\n");
      out.write("		alert(\"urlVal >>> : \" + urlVal);\r\n");
      out.write("		alert(\"typeVal >>> : \" + typeVal);\r\n");
      out.write("		alert(\"idVal >>> : \" + idVal);\r\n");
      out.write("		\r\n");
      out.write("		// 요청하는 데이터 콘솔에 로그 찍어보기 \r\n");
      out.write("		alert(\"요청하는 데이터 콘솔에 로그 찍어보기  >>> : \");\r\n");
      out.write("		console.log(\"urlVal >>> : \" + urlVal);\r\n");
      out.write("		console.log(\"typeVal >>> : \" + typeVal);\r\n");
      out.write("		console.log(\"idVal >>> : \" + idVal);\r\n");
      out.write("		\r\n");
      out.write("		$.ajax(\r\n");
      out.write("			{			\r\n");
      out.write("				url : urlVal,		\r\n");
      out.write("				type : typeVal,			\r\n");
      out.write("				data : {					\r\n");
      out.write("					id : idVal,	// data 는 쿼리 스트링 				\r\n");
      out.write("				},\r\n");
      out.write("				// url + data : \"/testCss/ajaxTest/data1.jsp?id=\"+#id의 값\r\n");
      out.write("				\r\n");
      out.write("				success : whenSuccess, \r\n");
      out.write("		\r\n");
      out.write("				error : whenError\r\n");
      out.write("			}\r\n");
      out.write("		);\r\n");
      out.write("		\r\n");
      out.write("		// 응답하는 데이터를 외부 함수로 사용하기 \r\n");
      out.write("		// success 키워드에서 선언한 whenSuccess 프로퍼티 함수 \r\n");
      out.write("		function whenSuccess(resData){\r\n");
      out.write("			alert(\"리턴 데이터 >>> : \" + resData);\r\n");
      out.write("			$('#ajaxResData').html(\"화면에 리턴 데이터 출력 : \"  + resData);\r\n");
      out.write("			console.log(\"콘솔에 리턴 데이터 출력 : \" + resData);\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		// error 키워드에서 선언한 whenError 프로퍼티 함수 \r\n");
      out.write("		function whenError(){\r\n");
      out.write("			alert(\"error\");\r\n");
      out.write("		}		\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("</script>		        \r\n");
      out.write("</head>\r\n");
      out.write("<body>		\r\n");
      out.write("<form id=\"frm\">			\r\n");
      out.write("	<label>아이디</label><input name=\"id\" id=\"id\">\r\n");
      out.write("	<input id=\"button\" type=\"button\" value=\"버튼\">			\r\n");
      out.write("</form>\r\n");
      out.write("<div id=\"ajaxResData\">리턴 데이터</div>		\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
