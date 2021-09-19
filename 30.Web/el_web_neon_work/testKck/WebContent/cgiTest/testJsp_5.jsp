<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Client & Server info</title>
</head>
<body>
<h3>client & server info</h3>
<hr>

<%
	// HTTP와 웹서버간 STREAM에는 온갖 정보가 다 들어 있다.
	
	// jsp에서 request 내장형 오브젝트를 선언하면,
	// HttpServerletRequest 인터페이스에 있는 자원을 사용할 수 있다.
	
	String remoteAddr = request.getRemoteAddr();
	out.println("remoteAddr : " + remoteAddr + "<br>");
	System.out.println("remoteAdddr : " + remoteAddr);
	
	String protocol = request.getProtocol();
	out.println("Protocol : " + protocol + "<br>");
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

	
%>

</body>
</html>