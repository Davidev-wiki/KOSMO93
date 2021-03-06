<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>b_0</title>
</head>
<body>
	<h3>b_0</h3>
	<br> setAttribute(java.lang.String, java.lang.Oject)
	getAttribute(java.lang.String)
	<hr>
	<%
		// 여기서 참조하는 request는
		// 'request scope'를 의미하는 객체이다.
		// setAttribute("abc", "최세라")
		// : 객체 ["최세라"]에다가 "abc"라는 이름 속성을 부여한다.
		request.setAttribute("abc", "최세라");

		// "abc"라는 이름을 가진 속성의 데이터를 
		// request scope 내에서 찾은 다음에
		// String 타입으로 변경하고나서
		// abc라는 변수에 담는다.
		String abc = String.valueOf(request.getAttribute("abc"));

		// 출력해보기
		// 결과 추측 : 객체타입 최세라
		// 결과 : 최세라
		out.println("저장된 abc의 값 : " + abc);

		ArrayList<String> aList = new ArrayList<String>();
		aList.add("오재영");
		aList.add("25");
		aList.add("열공중");
		aList.add("호원동");

		// request Area 내 "오재영" 정보가 담긴 String 배열 aList에
		// "aListRequest"라는 속성을 부여한다.
		request.setAttribute("aListRequest", aList);

		// request Area 내 "aListRequest" 라는 이름을 가진 데이터를 찾아
		// 객체 타입 변수 obj에 초기화한다.
		Object obj = request.getAttribute("aListRequest");

		// obj가 null이면, 위에 있는 Line을 모두 리턴하고 종료.
		// obj가 null이 아닌 경우 아래 Line을 계속해서 실행.
		if (obj == null)
			return;
	%>
	<br>
	<br>
	<%
		ArrayList<String> _aList = (ArrayList<String>) obj;
		if (_aList != null && _aList.size() > 0) {
			for (int i = 0; i < _aList.size(); i++) {
				out.println("b_0.jsp._aList.get(" + i + ")의 값 : " + _aList.get(i));
				System.out.println("b_0.jsp._aList.get(" + i + ")의 값 : " + _aList.get(i));
			}
		}
	%>
	<hr>
	<hr>
	<%
		session.setAttribute("abc00", "최세라");
		String abc00 = String.valueOf(session.getAttribute("abc00"));
		out.println("session.getAttribute()로 가져온 객체를 String으로 변경한 값 : " + abc00);
	%>
	<br>
	<br>
	<%
		ArrayList<String> __aList = (ArrayList<String>) obj;

		if (__aList != null && __aList.size() > 0) {
			for (int i = 0; i < __aList.size(); i++) {
				out.println("__aList.get(" + i + ") 의 값 : " + __aList.get(i));
				System.out.println("__aList.get(" + i + ") 의 값 : " + __aList.get(i));

			}
		}
	%>
	<hr>
	<hr>
	<%
		application.setAttribute("abcd111", "최세라");
		String abcd111 = String.valueOf(application.getAttribute("abcd111"));
		out.println("application.getAttribute()로 가져온 객체를 String으로 변경한 값 : " + abcd111);
	%>
	<%
		ArrayList<String> ___aList = (ArrayList<String>) obj;

		if (___aList != null && ___aList.size() > 0) {
			for (int i = 0; i < ___aList.size(); i++) {
				out.println("___aList.get(" + i + ") 의 값 : " + ___aList.get(i));
				System.out.println("___aList.get(" + i + ") 의 값 : " + ___aList.get(i));

			}
		}
	%>
</body>
</html>
