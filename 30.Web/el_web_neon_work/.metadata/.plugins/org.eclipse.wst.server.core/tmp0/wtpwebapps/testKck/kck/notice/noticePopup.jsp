<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="a.b.c.com.kosmo.notice.vo.NoticeVO"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>공지사항</title>
<style type="text/css">
html {
	overflow: hidden;
}

div {
	width: 80%;
	margin: 0 auto;
}

td, th {
	padding: 5px;
}

.tt {
	text-align: left;
}

.tt1 {
	text-align: center;
}
</style>
<script type="text/javascript">
	
</script>
</head>
<body>
	<%
		request.setCharacterEncoding("EUC-KR");
	%>
	<%
		//	Servlet에서 데이터 가지고 오기

		Object obj = request.getAttribute("aListS");
		if (obj == null)
			return;

		ArrayList<NoticeVO> aList = (ArrayList<NoticeVO>) obj;
		int nCnt = aList.size();

		String nnum = "";
		String nsubject = "";
		String nmemo = "";
		String nphoto = "";

		if (nCnt == 1) {

			NoticeVO nvo = new NoticeVO();

			nnum = nvo.getNnum();
			nsubject = nvo.getNsubject();
			nmemo = nvo.getNmemo();
			nphoto = nvo.getNphoto();

		}
	%>
	<h4>공지사항 팝업</h4>
	<hr>
	<div>
		<form name="noticeForm" id="noticeForm">
			<table>
				<tr>
					<td align="center"><font size="4" style="color: blue;">
							전사 공지 </font> <img src="/testKck/img/ase.gif" width="25" height="25"
						alt="img"></td>
				</tr>
				<tr>
					<td class="tt">공지번호 : <%=nnum%></td>
				</tr>
				<tr>
					<td class="tt">제목 : <%=nsubject%></td>
				</tr>
				<tr>
					<td class="tt">내용 : <%=nmemo%></td>
				</tr>
				<tr>
					<td class="tt1"><img
						src="/testKck/fileupload/notice/<%=nphoto%>" border="1"
						width="60" height="50" alt="image"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>