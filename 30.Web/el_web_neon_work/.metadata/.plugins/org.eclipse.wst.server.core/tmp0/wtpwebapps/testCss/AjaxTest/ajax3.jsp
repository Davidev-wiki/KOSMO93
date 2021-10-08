<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Ajax 3</title>
<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		
		$("#btn").click(function(){
			
			alert("��ư�� Ŭ���Ǿ����ϴ�!");
			let urlReq = "/testCss/AjaxTest/data3.jsp";
			let dataReq = "json";
			
			$.ajax({
				url : urlReq,
				dataType : dataReq,
				success : toSuccess,
				error : toError
			});
			
			function toSuccess(data){
				alert("������ ��û-���Ͽ� �����߽��ϴ�.");
				alert("������ data : " + data);
				console.log("������ data : " + data);
				alert("�������ڸ��� data�� Ÿ����? >> " + typeof(data));
				
				// JSON.stringify() javascript ��ü -> ���ڿ��� ����
				var results = JSON.stringify(data);
				alert("stringify()�Լ��� �̿��� ���ڿ��� �ٲ� ��� �� results : " + results);
				console.log("results : " + results);
				alert("���ڿ��� ������ data�� Ÿ����? >> " + typeof(results));

				// JSON.parse() ���ڿ� -> javascript��ü�� �ٲ� �ʱ�ȭ (�޸𸮿� �ε����)
				var v = JSON.parse(results);
				alert("v : " + v);
				console.log("v : " + v);
				alert("���ڿ����� �ٽ� �ڹٽ�ũ��Ʈ ��ü�� ������ data�� Ÿ����? >> " + typeof(v));
				
				// v.bools�� data3.jsp���� �ش� Ű�� ���� success�� �ǹ��ϴµ�
				console.log("v : " + v.bools); 
				alert("v.bools�� Ÿ����? : " + typeof(v.bools));
				
				if (v.bools == "success"){
					alert("true");
					$("#readJson").html("ȭ�鿡 ���Ϲ��� ��������� : v.bools : " + v.bools);
				} else {
					alert("false");
				}
			}
			
			function toError(data){
				alert("������ ��û-���Ͽ� �����߽��ϴ�.");
				console.log("������ �߻��߾��! : " + data.responseText);
			}
			
		});
		
	});
</script>
</head>
<body>
	<input type="button" id="btn" value="Click">
	<div id="readJson"></div>
</body>
</html>