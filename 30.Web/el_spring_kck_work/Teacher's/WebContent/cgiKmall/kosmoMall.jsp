<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
	String[] img ={"apple1.jpg", "apple2.jpg", "apple3.jpg", "banana1.jpg", "banana2.jpg", "banana3.jpg", "pear1.jpg", "pear2.jpg", "pear3.jpg"};
	String[] name = {"사과1", "사과2", "사과3", "바나나1", "바나나2", "바나나3", "배1", "배2", "배3"};
	String[] price = {"1,500", "1,600", "1,700", "3,000", "3,500", "4,000", "5,000", "6,000", "7,000"};
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>KOSMO MALL</title>
<script type="text/javascript">

	function findCart(name, price){
		alert("name >>> : " + name + ", price >>> : " + price);
		
		if (confirm("장바구니에 담으시겠습니까 ??")){
			location.href="/springHbe/cgiKmall/cartProcess.jsp?name="+name+"&price="+price;
		}
	}
	
	function findView(){
		if (confirm("장바구니를 보시겠습니까 ?? ")){
			location.href="/springHbe/cgiKmall/cartView.jsp";
		}
	}

</script>
</head>
<body>
<div align="center">
<h3>[ 코스모 과일 가게 ]</h3>
<hr>
<table border="1">
<tr align="right">
<td colspan="3">
	<input type="button" value="장바구니 보기" onclick="findView()">
</td>
</tr>
<% 
for (int i=0; i < img.length; i++){
	if (i % 3 == 0){
		out.println("<tr align='center'>");			
	}
%>
<td>
	<table>
		<tr align="center">
			<td>
				<img src="/springHbe/img/img_kmall/<%= img[i] %>" width="50" height="50">
			</td>
		</tr>
		<tr align="center">
			<td>
				<b><%= name[i] %></b>
			</td>
		</tr>
		<tr align="center">
			<td>
				<b>\<%= price[i] %>원</b>
			</td>
		</tr>
		<tr align="center">
			<td>
				<input type="button" value="장바구니 담기" onclick="findCart('<%= name[i] %>', '<%= price[i] %>')"/>
			</td>
		</tr>
	</table>
</td>
<%		
	if (i % 3 == 2){
		out.println("</tr");			
	}		
}
%>
</table>
</div>
</body>
</html>