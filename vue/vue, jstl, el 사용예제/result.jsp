<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="a.b.c.com.vo.TestVO" %> 
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>TESTING</title>

<style type="text/css">
	#list {width:400px; border:1px solid black; border-collapse:collapse;}
	#list td, #list th {border:1px solid black; text-align:center;}
	#list > thead > tr {color:yellow; background-color:purple;}


</style>

</head>
<script type="text/javascript" src="https://unpkg.com/vue@2.5.16/dist/vue.js"></script>
<body>
<!-- v-for -->
<div id="example">
<ul id="example-1">
	<li v-for="item in items">
		{{ item.no }}
		{{ item.name }}
		{{ item.message }}
		{{ item.address }}
	</li>
</ul>
</div>
<%
	List<TestVO> listTest = new ArrayList<TestVO>();
	for (int i=0; i < 4; i++){
		TestVO tvo = new TestVO();
		tvo.setNo("no_" + i);
		tvo.setName("name_" + i);
		tvo.setMessage("message_" + i);
		tvo.setAddress("address_" + i);
		
		listTest.add(tvo);
	}
	
	// 자기 페이지에서 사용하려고 pageContext 사용 한 것임 
	pageContext.setAttribute("listTest", listTest);
%>
<script>	

/*
자바스크립트 블럭에서 jstl 사용 가능 
jsp - jstl - html - javaScript

자바스크립트 블럭에서 el 사용 가능 
단 ' ' 사용하기
*/
*
<c:forEach var="ii" items="${listTest }">
var no = '${ii.no }';
var name = '${ii.name }';
var message = '${ii.message }';
var address = '${ii.address }';
alert(no + " : " + name + " : " + message +  " : " + address);
</c:forEach>	

	var model = {
	
		"items": [
			{"no":'${listTest[0].no }', "name":'${listTest[0].name }', "message":'${listTest[0].message }', "address":'${listTest[0].address }'},
			{"no":'${listTest[1].no }', "name":'${listTest[1].name }', "message":'${listTest[1].message }', "address":'${listTest[1].address }'},
			{"no":'${listTest[2].no }', "name":'${listTest[2].name }', "message":'${listTest[2].message }', "address":'${listTest[2].address }'},
			{"no":'${listTest[3].no }', "name":'${listTest[3].name }', "message":'${listTest[3].message }', "address":'${listTest[3].address }'},
		]
	}
	
	var list = new Vue({
		el: "#example-1",
		data: model
	});
</script>




<table id="list">
<thead>
<tr>
<th>번호</th><th>이름</th><th>전화번호</th><th>주소</th>
</tr>
</thead>	
<c:forEach var="i" items="${listTest }">
<tr>
	<td>${i.no }</td>
	<td>${i.name }</td>
	<td>${i.message }</td>
	<td>${i.address }</td>
</tr>
</c:forEach>			
</tbody>
</table>



</body>
</html>