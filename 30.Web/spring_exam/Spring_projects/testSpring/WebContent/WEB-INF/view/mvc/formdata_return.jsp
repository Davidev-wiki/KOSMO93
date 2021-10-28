<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Form data View</title>
<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
<script type="text/javascript">
	
	$(document).ready(function(){
		
		alert("jQuery start!");
		console.log("jQuery ����");
		
		// ��ư 1(getbtn)������ �� ->  ��Ʈ�ѷ��� RequestMapping�� ����� 
		// action�� ���� �� ������ : formdata_get_servlet.jsp�� ������
		$(document).on("click", "#getbtn", function(){
			alert("GET ��ư ����");
			console.log("GET ��ư ����");
			$("#formData").attr({
				"action" : "formdata_get_servlet.kck",
				"method" : "GET",
				"enctype" : "application/x-www-form-urlencoded"
			
			}).submit();
		});
		// ��ư 2(get_spring_btn)������ �� -> mvc/formdata_get_spring_servlet.jsp�� ������
		
		$("#get_spring_btn").click(function(){
			alert("get_spring ��ư ����");
			console.log("get_spring ��ư ����");
			$("#formData").attr({
				"action" : "formdata_get_spring_servlet.kck",
				"method" : "GET",
				"enctype" : "application/x-www-form-urlencoded"
			
			}).submit();
			
		});
		
		// ��ư 3(post_spring_btn)������ �� -> mvc/formdata_post_spring_servlet.jsp�� ������
		$("#post_spring_btn").click(function(){
			alert("post_spring_��ư ����");
			console.log("post_spring_��ư ����");
			$("#formData").attr({
				"action" : "formdata_post_spring.kck",
				"method" : "POST",
				"enctype" : "application/x-www-form-urlencoded"
			
			}).submit();
			
		});
		
		// ��ư 4(post_spring_btn_111)������ ��- > mvc/formdata_post_spring111_servlet.jsp�� ������
		$("#post_spring_btn_111").click(function(){
			alert("post_spring_btn_111��ư ����");
			console.log("post_spring_btn_111��ư ����");
			$("#formData").attr({
				"action" : "formdata_post_valueobject.kck",
				"method" : "POST",
				"enctype" : "application/x-www-form-urlencoded"
			
			}).submit();
		});
	});

</script>
</head>
<body>
<h3 align="center">FORM DATA</h3>
<hr>
<form name="formData" id="formData">

	<table border="1" align="center">
	
		<tr>
			<td>ȸ����ȣ : </td>
			<td><input type="text" name="datanum" id="datanum"></td>
		</tr>
		<tr>
			<td>���̵� : </td>
			<td><input type="text" name="dataid" id="dataid"></td>
		</tr>
		<tr>
			<td>��й�ȣ : </td>
			<td><input type="text" name="datapw" id="datapw"></td>
		</tr>
		<tr>
			<td>�̸� : </td>
			<td><input type="text" name="dataname" id="dataname"></td>
		</tr>
		<tr>
			<td colspan="2">
				<button type="button" id="getbtn">GET</button>
				<button type="button" id="get_spring_btn">GET SPRING</button>
				<button type="button" id="post_spring_btn">POST SPRING</button>
				<button type="button" id="post_spring_btn_111">POST SPRING 111</button>
			</td>
		</tr>	
	</table>
</form>
</body>
</html>