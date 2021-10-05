<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="a.b.c.com.kosmo.notice.vo.NoticeVO" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>�������� ��ü ��ȸ</title>
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
<!-- jQuery ������� �ʰ� javascript�� ������ �ѱ�� -->

function noticeUpdate(actionUpdate){
	
	console.log("noticeUpdate()����");
	
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
	console.log("checkAction() ����");
	
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

// �������� ������ ���� ����

	Object obj = request.getAttribute("aListS");	
	if (obj == null) return;
	
	ArrayList<NoticeVO> aList = (ArrayList<NoticeVO>)obj;
	
	// nCnt : ������ ������ �� ��(=������ ��ȸ ���)
	int nCnt = aList.size();
	
	out.println("���� ��ȸ : " + nCnt + "�� Ȯ��");
	
	String nnum = "";
	String nsubject = "";
	String nmemo = "";
	String nphoto = "";
	String deleteyn = "";
	String insertdate = "";
	String updatedate = "";
	
	// ������ ��ȸ ������ 
	// ������ ��ü�� ���ο� ��ü�� �ʱ�ȭ�ϰ�
	// ���� ������ �ش� ������ �ʱ�ȭ�Ѵ�.
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
<font size="4" style="color:blue;">�������� ����</font>
<img src="/testKck/img/ase.gif" width="25" height="25" alt="image">
</td>
</tr>
<tr>
<td class="tt">�� ��ȣ</td>
<td><input type="text" name="nnum" id="nnum" value="<%= nnum %>" readonly></td>
</tr>
<tr>
<td class="tt">����</td>
<td><input type="text" name="nsubject" id="nsubject" value="<%= nsubject %>" size="25"></td>
</tr>
<tr>
<td class="tt">����</td>
<td><textarea name="nmemo" id="nmemo" cols="50" rows="10"><%= nmemo %></textarea></td>
</tr>
<tr>
<td class="tt">����</td>
<td><img src="testKck/fileupload/notice/<%= nphoto %>" border="1" width="40" height="50" alt="img"></td>
</tr>
<tr>
<td colspan="2" align="center">
<input type="hidden" name="ISUD_TYPE" id="ISUD_TYPE">
<input type="button" value="����" onclick="noticeUpdate('U')"/> 
<input type="button" value="����" onclick="noticeUpdate('D')"/> 
<input type="reset" value="���" />
&nbsp;&nbsp;&nbsp;&nbsp;
<input type="button" value="�Է�" onclick="checkAction('I')"/>
<input type="button" value="���" onclick="checkAction('SALL')"/>
</tr>
</table>
</form>
</div>
</body>
</html>
