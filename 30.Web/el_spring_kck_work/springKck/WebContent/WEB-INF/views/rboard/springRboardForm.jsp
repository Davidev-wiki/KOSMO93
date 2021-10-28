<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.List" %>
<%@ page import = "java.util.ArrayList" %>
<%@ page import = "a.b.c.com.board.vo.SpringBoardVO" %>
<%@ page import = "a.b.c.com.rboard.vo.SpringRboardVO" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>RBOARD : 댓글</title>
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script type="text/javascript">
	
	$(document).ready(function(){
		
		console.log("jQuery 진입 >>> : ");
		
		// rsbcontent(댓글 내용)의 길이 제한 기능 ---200자 제한? or 200 byte?
		$("#rsbcontent").keyup(function(){
			cut_200(this);
		});
		
		// 댓글 등록 기능(*ajax) 
		// -> controller의 rboardInsert() 함수 -> 객체 번호, 문자열 리턴받음
		$(document).on("click", "#I", function(){
			alert("I 버튼이 클릭됨 >>> : ");
			
			let insertURL = "rboardInsert.k";
			let method = "POST";
			let dataParam = {
					sbnum : $("#sbnum").val(),
					rsbname : $("#rsbname").val(),
					rsbcontent : $("#rsbcontent").val()
			};
			// serialize()?
			dataParam = $("#rboardForm").serialize();
			alert("dataParam >>> : " + dataParam);
			
			$.ajax({
						url : insertURL,
						type : method,
						data : dataParam,
						success : whenSuccess,
						error : whenError
			});
			
			function whenSuccess(resData){
				alert("응답받은 resData >>> : " + resData);
				if("SUCCESS" == resData){
						// 댓글 등록 후 입력 창 초기화 함수. 하단에 정의됨
						rboardFormData();
						location.reload();
				}
			}
			
			function whenError(e){
				alert("에러 발생! >>> : " + e.responseText);	
			}
			
			
		});
		
		// 단건 조회 기능(*ajax)
		$(document).on("click", "#S", function(){
			alert("S >>> :");
		
			let selectURL = "rboardSelect.k";
			let method = "POST";
			let dataParam = {
				rsbnum : $("#rsbnum").val()
			};
		
			// dataParam = $("#jsonTestForm").seriallize();
			alert("요청으로 전달할 dataParam >>> :" + dataParam);
			
			$.ajax({
				url : selectURL,
				type : method,
				data : dataParam,
				success : whenSuccess,
				error :  whenError
			});
			
			function whenSucess(resData){
				alert("응답받은 resData >>> : " + resData);
				// resData 체크 필요 응답 데이터는 배열로 받는듯?
				let v = resData.split(",");
				for(let i=0; i < v.length; i++){
					console.log("v[0]" + v[0]);
					console.log("v[1]" + v[1]);
					console.log("v[2]" + v[2]);
					console.log("v[3]" + v[3]);
					addNewItem(v[0], v[1], v[2], v[3]);
				}
				
			}
			
			function whenError(e){
				alert("Error : " + e.responseText);
			}
			
		});
		
		// 댓글 삭제 기능(*ajax)
		$(document).on("click", ".deleteBtn", function(){
			
			alert("D >>> :");
			
			// Check point
			var rsbnum = $(this).parents("li").attr("dataNum");
			var target = $(this).parents(".rbmemoItem");
			console.log("target >>> :" + target);
			
			let selectURL = "rboardDelete.k";
			let method = "POST";
			let dataParam = {
					rsbnum : rsbnum
			}
			// dataParam = $("#jsonTestForm").serialize();
			alert("ajax로 전달할 dataParam >>> : " + dataParam);
			
			$ajax({
				url : selectURL,
				type : method,
				data : dataParam,
				success : whenSuccess,
				error : whenError
			});
			
			function whenSuccess(resData){
				
				alert("응답받은 resData >>> : " + resData);
				console.log("resData >>> : " + resData);
				if("SUCCESS"==resData){
					alert("댓글이 삭제되었습니다!");
					target.remove();
				}
			}

			function whenError(e){
				alert("Error : " + e.responseText);
			}

		});
	
	});
	
	// 게시글 번호로 댓글 전체 조회하는 기능(*ajax)
	function selectAll(){
		alert("SALL 함수 실행됩니다 >>> :");
		
		let selectAllURL = "rboardSelectAll.k";
		let method = "POST";
		let dataParam = {
				sbnum : $("#sbnum").val()
		};
		
		// dataParam = $("jsonTestForm").serialize();
		alert("요청으로 보낼 dataParam >>> : " + dataParam);
		
		$ajax({
			url : selectAllURL,
			type : method,
			data : dataParam,
			success : whenSuccess,
			error : whenError
		});
		
		function whenSuccess(resData){
			alert("응답받은 resData >>> : " + resData);
			console.log("응답받은 resData >>> :" + resData);
		
			if(isEmpty(resData)){
				return false;
			}
			
			let v = resData.split("&");
			for(let i=0; i < v.length; i++){
				console.log(v[i]);
				let vv = v[i].split(",");
				let j = 0;
				for (; j < vv.length-1; j++){
					console.log("vv[0] >>> :" + vv[0]);
					console.log("vv[1] >>> :" + vv[1]);
					console.log("vv[2] >>> :" + vv[2]);
					console.log("vv[3] >>> :" + vv[3]);
				}
				addNewItem(vv[0], vv[1], vv[2], vv[3]);
			}
		}
		
		function whenError(e){
			alert("Error : " + e.responseText);	
		}
		
	}
	
	// 새로운 글 화면에 추가하는 기능
	function addNewItem(num, writer, content, datetime){
		
		// 데이터 체크
		if(isEmpty(num)) return false;
		
		// 새로운 글이 추가될 li태그
		var newLi = $("<li>");
		newLi.attr("dataNum", num);
		newLi.addClass("rbmemoItem");
		
		// 작성자 정보가 지정될 <p>태그
		var writerP = $("<p>");
		writerP.addClass("writer");
		
		// 작성자 정보의 이름
		var nameSpan = $("<span>");
		nameSpan.addClass("name");
		nameSpan.html(decodeURIComponent(writer) + "님");
		
		// 작성일시
		var dateSpan = $("<span>");
		dateSpan.html("/" + datetime + " ");
		
		// 삭제버튼
		var delInput = $("<input>");
		delInput.attr({"type" : "button", "value" : "삭제하기"});
		delInput.addClass("deleteBtn");
		
		// 내용
		var contentP = $("<p>");
		contentP.html(decodeURIComponent(content));
		
		// 조립하기
		writerP.append(nameSpan).append(dateSpan).append(delInput);
		newLi.append(writerP).append(contentP);
		$("rboardlist").append(newLi);
		
	}
	
	// ----------댓글 길이 체크하는 함수----------
	// 한글 포함 문자열 길이
	function getTextLength(s){
		var len = 0;
		for(var i=0; i < s.length; i++){
			if(escape(s.charAt(i)).length==6){
				len++;
			}
			len++;
		}
		return len;
	}
	
	function cut_200(obj){
		var t = $(obj).val();
		var l = t.length;
		
		while(getTextLength(t)>200){
			l--;
			t = t.substring(0,l);
		}
		$(obj).val(t);
		$('.bytes').text(getTextLength(t));
	}
	
	// ------------------------------------
	
	
	// 댓글 등록 후 입력창 초기화하는 기능
	function rboardFormData(){
		$("#rsbname").val("");
		$("#rsbcontent").val("");
	}
	
	// 데이터 체크 기능 (like. "nullcheck")
	// 밸류가 비어있는 또는 없는 경우 true 밸류가 있으면 false 
	function isEmpty(val){
		if(typeof val=="undefined" || val==null || val==""){
			return true;
		} else {
			return false;
		}
	}
	
</script>
</head>
<body>
RBOARD : 댓글
<hr>
<!-- scriptlet -->
<% request.setCharacterEncoding("UTF-8"); %>
<%
	String sbnum = request.getParameter("sbnum");
	System.out.println("request에서 받아온 sbnum >>> : " + sbnum);
%>

<div id="rbwriterdiv">
<form name="rboardForm" id="rboardForm">
<table>
<tr>
	<td>작성자</td>
	<td>
		<input type="text" name="rsbname" id="rsbname"/>
		<input type="hidden" name="sbnum" id="sbnum" value="<%=sbnum %>">
		<input type="hidden" name="rsbnum" id="rsbnum">
		<input type="button" value="등록" id="I">
	</td>
</tr>
<tr>
	<td>덧글 내용</td>
	<td>
		<textarea name="rsbcontent" id="rsbcontent" rows="5" cols="50" style="resize: none"></textarea>
		<div><span class="bytes">0</span>bytes</div>
	</td>
</tr>
</table>
<hr>

<ul name="rboardlist" id="rboardlist">
	 <!-- 여기(<ul>태그 내부)에 동적 생성 요소가 만들어집니다!! -->
</ul>

</form>
</div>
</body>
</html>