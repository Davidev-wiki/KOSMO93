<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="a.b.c.com.kosmo.notice.vo.NoticeVO" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>공지사항 전체 조회</title>
<style type="text/css">
	* {
		margin: 0 auto;
		/*text-align: center;*/
	}
	
	div {
		margin: 50px 0px 0px 100px;
	}			

	td, th {
		 padding: 5px;
	}
	
	.tt {
		text-align: center;
	}
</style>
<script>
<!-- jQuery 사용하지 않고 javascript로 데이터 넘기기 -->

function noticeUpdate(actionUpdate){
	
	console.log("noticeUpdate()진입");
	
	if("U" == actionUpdate) {
		var v1 = "UOK";
		document.noticeUpdateForm.action="/testKck/notice?ISUD_TYPE="+v1;	
	}
	
	if("D" == actionUpdate) {
		var v2 = "DOK";
		document.noticeUpdateForm.action="/testKck/notice?ISUD_TYPE="+v2;	
	}
	
	document.noticeUpdateForm.method="POST";
	document.noticeUpdateForm.enctype="application/x-www-form-urlencoded";
	document.noticeUpdateForm.submit();
}

function checkAction(actionName){
	console.log("checkAction() 진입");
	
	if("I" == actionName){
		location.href="testKck/kck/notice/notice.html";
	}
	if("SALL" == actionName){
		location.href="testKck/notice?ISUD_TYPE=SALL";
	}
	
}


</script>
</head>
<body>
<% request.setCharacterEncoding("EUC-KR");%>
SELECT
<%

// 서블릿에서 데이터 갖고 오기

	Object obj = request.getAttribute("aListS");	
	if (obj == null) return;
	
	ArrayList<NoticeVO> aList = (ArrayList<NoticeVO>)obj;
	
	// nCnt : 가져온 데이터 건 수(=데이터 조회 결과)
	int nCnt = aList.size();
	
	out.println("조건 조회 : " + nCnt + "건 확인");
	
	String nnum = "";
	String nsubject = "";
	String nmemo = "";
	String nphoto = "";
	String deleteyn = "";
	String insertdate = "";
	String updatedate = "";
	
	// 데이터 조회 성공시 
	// 가져온 객체를 새로운 객체에 초기화하고
	// 로컬 변수에 해당 값들을 초기화한다.
	if (nCnt == 1){
		
		NoticeVO nvo = new NoticeVO();
		
		nnum = nvo.getNnum();
		nsubject = nvo.getNsubject();
		nmemo = nvo.getNmemo();
		nphoto = nvo.getNphoto();
		deleteyn = nvo.getDeleteyn();
		insertdate = nvo.getInsertdate();
		updatedate = nvo.getUpdatedate();
		
	}
%>
<hr>
<div>
<form name="noticeUpdateForm" id="noticeUpdateForm">
<table border="1">
<tr>
<td colspan="2" align="center">
<font size="4" style="color:blue;">공지사항 수정</font>
<img src="/testKck/img/ase.gif" width="25" height="25" alt="image">
</td>
</tr>
<tr>
<td class="tt">글 번호</td>
<td><input type="text" name="nnum" id="nnum" value="<%= nnum %>" readonly></td>
</tr>
<tr>
<td class="tt">제목</td>
<td><input type="text" name="nsubject" id="nsubject" value="<%= nsubject %>" size="25"></td>
</tr>
<tr>
<td class="tt">내용</td>
<td><textarea name="nmemo" id="nmemo" cols="50" rows="10"><%= nmemo %></textarea></td>
</tr>
<tr>
<td class="tt">사진</td>
<td><img src="testKck/fileupload/notice/<%= nphoto %>" border="1" width="40" height="50" alt="img"></td>
</tr>
<tr>
<td colspan="2" align="center">
<input type="hidden" name="ISUD_TYPE" id="ISUD_TYPE">
<input type="button" value="수정" onclick="noticeUpdate('U')"/> 
<input type="button" value="삭제" onclick="noticeUpdate('D')"/> 
<input type="reset" value="취소" />
&nbsp;&nbsp;&nbsp;&nbsp;
<input type="button" value="입력" onclick="checkAction('I')"/>
<input type="button" value="목록" onclick="checkAction('SALL')"/>
</tr>
</table>
</form>
</div>
</body>
</html>
