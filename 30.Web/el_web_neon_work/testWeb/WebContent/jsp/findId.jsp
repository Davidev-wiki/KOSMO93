<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>ID FIND</title>
<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		
		// comfirm �� ����ճ�..?
		$("#comfirm").click(function(){
			console.log("mcomfirm : ");
			alert("mcomfirm : ");
		});
		
		$("#idbtn").click(function(){
			console.log("idbtn : ");
			alert("idbtn : ");
		});
		
	});
</script>
</head>
<body>
<h3 align="center">ID FIND</h3>
<hr>
<% 
		String mname = "";
		String memail = "";
		String authnum = "";
%>
<h4 align="center">���� Ȯ�� �̸��� �ּҿ� �Է��� �̸����ּҰ� ���ƾ� ���� ��ȣ�� ���� �� �ֽ��ϴ�.</h4>

<form name="idForm" id="idForm">
	<table border="1" align="center">
		<tr>
			<td>�̸�</td>
			<td>
				<input type="text" name="mname" id="mname" value="<%= mname%>"  style="width:200px;">
			</td>
		</tr>
		<tr>
			<td>�̸����ּ�</td>
			<td>
				<input type="text" name="memail" id="memail" value="<%= memail%>" sytle="width:200px;">
				<button type="button" id="mcomfirm">������ȣ �ޱ�</button>
 			</td>
		</tr>
		<tr>
			<td>������ȣ</td>
			<td>
				<input type="text" name="authnum" id="authnum" value="<%= authnum%>" 
				placeholder="������ȣ 6�ڸ� ���� �Է�" style="width:200px;">
			</td>
		</tr>
		<tr>
			<td></td>
			<td>
			������ȣ�� ���� �ʳ���?<img src="/testWeb/img/ase.gif" width="20" height="20">
			</td>
		<tr>
			<td colspan="2" align="center">
			<input type="hidden" name="login_type" id="login_type">
			<button type="button" id="idbtn">����</button>
			</td>
		</tr>
	</table>
</form>
</body>
</html>