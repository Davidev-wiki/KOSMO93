<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="a.b.c.com.vo.FormDataVO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>formdata_get_spring</title>
</head>
<body>
<h3>FormData_GET_SPRING</h3>
<hr>
<h3>객체 주소 : ${m_fvo }</h3>
<h3>객체로 가져온 num : ${m_fvo.datanum }</h3>
<h3>객체로 가져온 id : ${m_fvo.dataid }</h3>
<h3>객체로 가져온 pw : ${m_fvo.datapw }</h3>
<h3>객체로 가져온 name : ${m_fvo.dataname }</h3>

<hr><hr>
<p>
<h3>EL 표현식으로 데이터 추출하기</h3>
<hr>
$ {m_fvo} : ${m_fvo}<br>
$ {m_fvo.datanum} : ${m_fvo.datanum}<br>
$ {fvo.dataid} : ${fvo.dataid}<br>
$ {formDataVO.datapw} : ${formDataVO.datapw} : FormDataVO<br>

<!-- FormDataVO, 스프링에서 인스턴스하면 formDataVO라는 참조변수를 갖게됨 -->

<p>
<h3>EL 표현식 및 객체 함수로 데이터 추출하기</h3>
<hr>
\${m_fvo} : ${m_fvo}<br>
\${m_fvo.getDatanum()} : ${m_fvo.getDatanum()}<br>
\${fvo.getDatanum()} : ${fvo.getDatanum()}<br>
\${formDataVO.getDatapw()} : ${formDataVO.getDatapw()} : FormDataVO<br>
<p>
<h3>request.getAttribute() 객체로 데이터 추출하기</h3>
<hr>
<%
	Object obj = request.getAttribute("m_fvo");
	FormDataVO fdvo = (FormDataVO)obj;
	
	System.out.println("formdata_get_spring_return.jsp >>> : fdvo >>> : " + fdvo);	
	System.out.println("formdata_get_spring_return.jsp >>> : fdvo.getDatanum() ::: " + fdvo.getDatanum());
	System.out.println("formdata_get_spring_return.jsp >>> : fdvo.getDataid() ::: " + fdvo.getDataid());
	System.out.println("formdata_get_spring_return.jsp >>> : fdvo.getDatapw() ::: " + fdvo.getDatapw());
	System.out.println("formdata_get_spring_return.jsp >>> : fdvo.getDataname() ::: " + fdvo.getDataname());
	
	out.println("formdata_get_spring_return.jsp >>> : fdvo >>> : " + fdvo + "<br>");	
	out.println("formdata_get_spring_return.jsp >>> : fdvo.getDatanum() ::: " + fdvo.getDatanum() + "<br>");
	out.println("formdata_get_spring_return.jsp >>> : fdvo.getDataid() ::: " + fdvo.getDataid() + "<br>");
	out.println("formdata_get_spring_return.jsp >>> : fdvo.getDatapw() ::: " + fdvo.getDatapw() + "<br>");
	out.println("formdata_get_spring_return.jsp >>> : fdvo.getDataname() ::: " + fdvo.getDataname() + "<br>");
%>
</body>
</html>