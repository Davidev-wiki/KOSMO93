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
		// ���⼭ �����ϴ� request��
		// 'request scope'�� �ǹ��ϴ� ��ü�̴�.
		// setAttribute("abc", "�ּ���")
		// : ��ü ["�ּ���"]���ٰ� "abc"��� �̸� �Ӽ��� �ο��Ѵ�.
		request.setAttribute("abc", "�ּ���");

		// "abc"��� �̸��� ���� �Ӽ��� �����͸� 
		// request scope ������ ã�� ������
		// String Ÿ������ �����ϰ�����
		// abc��� ������ ��´�.
		String abc = String.valueOf(request.getAttribute("abc"));

		// ����غ���
		// ��� ���� : ��üŸ�� �ּ���
		// ��� : �ּ���
		out.println("����� abc�� �� : " + abc);

		ArrayList<String> aList = new ArrayList<String>();
		aList.add("���翵");
		aList.add("25");
		aList.add("������");
		aList.add("ȣ����");

		// request Area �� "���翵" ������ ��� String �迭 aList��
		// "aListRequest"��� �Ӽ��� �ο��Ѵ�.
		request.setAttribute("aListRequest", aList);

		// request Area �� "aListRequest" ��� �̸��� ���� �����͸� ã��
		// ��ü Ÿ�� ���� obj�� �ʱ�ȭ�Ѵ�.
		Object obj = request.getAttribute("aListRequest");

		// obj�� null�̸�, ���� �ִ� Line�� ��� �����ϰ� ����.
		// obj�� null�� �ƴ� ��� �Ʒ� Line�� ����ؼ� ����.
		if (obj == null)
			return;
	%>
	<br>
	<br>
	<%
		ArrayList<String> _aList = (ArrayList<String>) obj;
		if (_aList != null && _aList.size() > 0) {
			for (int i = 0; i < _aList.size(); i++) {
				out.println("b_0.jsp._aList.get(" + i + ")�� �� : " + _aList.get(i));
				System.out.println("b_0.jsp._aList.get(" + i + ")�� �� : " + _aList.get(i));
			}
		}
	%>
	<hr>
	<hr>
	<%
		session.setAttribute("abc00", "�ּ���");
		String abc00 = String.valueOf(session.getAttribute("abc00"));
		out.println("session.getAttribute()�� ������ ��ü�� String���� ������ �� : " + abc00);
	%>
	<br>
	<br>
	<%
		ArrayList<String> __aList = (ArrayList<String>) obj;

		if (__aList != null && __aList.size() > 0) {
			for (int i = 0; i < __aList.size(); i++) {
				out.println("__aList.get(" + i + ") �� �� : " + __aList.get(i));
				System.out.println("__aList.get(" + i + ") �� �� : " + __aList.get(i));

			}
		}
	%>
	<hr>
	<hr>
	<%
		application.setAttribute("abcd111", "�ּ���");
		String abcd111 = String.valueOf(application.getAttribute("abcd111"));
		out.println("application.getAttribute()�� ������ ��ü�� String���� ������ �� : " + abcd111);
	%>
	<%
		ArrayList<String> ___aList = (ArrayList<String>) obj;

		if (___aList != null && ___aList.size() > 0) {
			for (int i = 0; i < ___aList.size(); i++) {
				out.println("___aList.get(" + i + ") �� �� : " + ___aList.get(i));
				System.out.println("___aList.get(" + i + ") �� �� : " + ___aList.get(i));

			}
		}
	%>
</body>
</html>