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
<h3>��ü �ּ� : ${m_fvo }</h3>
<h3>��ü�� ������ num : ${m_fvo.datanum }</h3>
<h3>��ü�� ������ id : ${m_fvo.dataid }</h3>
<h3>��ü�� ������ pw : ${m_fvo.datapw }</h3>
<h3>��ü�� ������ name : ${m_fvo.dataname }</h3>

<hr><hr>
<p>
<h3>EL ǥ�������� ������ �����ϱ�</h3>
<hr>
$ {m_fvo} : ${m_fvo}<br>
$ {m_fvo.datanum} : ${m_fvo.datanum}<br>
$ {fvo.dataid} : ${fvo.dataid}<br>
$ {formDataVO.datapw} : ${formDataVO.datapw} : FormDataVO<br>

<!-- FormDataVO, ���������� �ν��Ͻ��ϸ� formDataVO��� ���������� ���Ե� -->

<p>
<h3>EL ǥ���� �� ��ü �Լ��� ������ �����ϱ�</h3>
<hr>
\${m_fvo} : ${m_fvo}<br>
\${m_fvo.getDatanum()} : ${m_fvo.getDatanum()}<br>
\${fvo.getDatanum()} : ${fvo.getDatanum()}<br>
\${formDataVO.getDatapw()} : ${formDataVO.getDatapw()} : FormDataVO<br>
<p>
<h3>request.getAttribute() ��ü�� ������ �����ϱ�</h3>
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