<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List"%>
<%@ page import="a.b.c.com.board.vo.SpringBoardVO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BOARD SELECT</title>
<style type="text/css">
		div{
			margin : 50px, 0px, 0px, 100px;
		}
		.mem{
			text-align : center;
		}
</style>
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script type="text/javascript">

	$(document).ready(function(){
		
		// [수정] 버튼 클릭시 
		$(document).on("click", "#U", function(){
			alert("Update를 요청하셨습니다.");
			console.log("수정 버튼이 클릭됨 >>> :");
			$("#boardUpdateForm").attr({
				"action" : "boardUpdate.k",
				"method" : "POST"
			}).submit();
		});
		
		// [삭제] 버튼 클릭시
		$(document).on("click", "#D", function(){
			alert("Delete를 요청하셨습니다.");
			console.log("삭제 버튼이 클릭됨 >>> :");
			$("#boardUpdateForm").attr({
				"action" : "boardDelete.k",
				"method" : "POST"
			}).submit();
		});
		
		// 비밀번호 확인기능
		$(document).on("click","#pwbtn", function(){
			
			alert("비밀번호 확인을 요청하셨습니다.");
			console.log("pw확인 버튼이 클릭됨 >>> :");
			
			let pwcheckURL = "boardPwCheck.k";
			let reqType = "POST";
			let dataParam = {
					sbnum : $("#sbnum").val(),
					sbpw : $("#sbpw").val()
			};
			
			// dataParam = $("#boardUpdateForm").serialize();
			// alert("dataParam >>> : " + dataParam);
		
			$.ajax({
						url : pwcheckURL,
						type : reqType,
						data : dataParam,
						success : whenSuccess,
						error : whenError
			});
			
			function whenSuccess(resData){
				alert("통신 후 응답받은 데이터 resData >>> : " + resData);
				console.log("응답받은 데이터 resData >>> : " + resData);
				
				if("PW_GOOD"==resData){
					alert("PW 확인 완료.");
					console.log("비밀번호 확인 완료됨 >>> :");
					$("#sbpw").attr("readonly", true);
					$("#U").css("background-color","yellow");
					$("#D").css("color", "red");
				} else if("PW_BAD"==resData){
					alert("비밀번호를 다시 입력해주세요.");
					console.log("비밀번호 확인 실패 >>> : 잘못된 비밀번호입니다.");
					$("#sbpw").val('');
					$("#sbpw").focus();
				}
			}
			
			function whenError(resData){
				alert("ajax로 통신해 데이터를 받아오는 중 문제 발생! >>> : " + e.responseText);
			}
		
		})
		
	});
<!-- -->
</script>
</head>
<body>
BOARD SELECT
<hr>
<%
	Object obj = request.getAttribute("listS");
	List<SpringBoardVO> list = (List)obj;
	
	SpringBoardVO bvo = null;
	if(list.size() == 1) {
		bvo = list.get(0);	
	}
%>
<div>
<form name="boardUpdateForm" id="boardUpdateForm">
<table border="1">
	<tr>
		<td colspan="2" align="center">게시판 글 수정하기</td>	
	</tr>
	<tr>
		<td class="mem">글번호</td>
		<td><input type="text" name="sbnum" id="sbnum" value="<%=bvo.getSbnum()%>" readonly/></td>
	</tr>
	<tr>
		<td class="mem">제목</td>
		<td><input type="text" name="sbsubject" id="sbsubject" value="<%=bvo.getSbsubject()%>" style="width:100px" readonly/></td>
	</tr>
	<tr>
		<td class="mem">이름</td>
		<td><input type="text" name="sbname" id="sbname" value="<%=bvo.getSbname()%>" readonly/></td>
	</tr>
	<tr>
		<td class="mem">글 내용</td>
		<td>
		<textarea name="sbcontent" id="sbcontent" rows="5" cols="50"><%=bvo.getSbcontent()%>
		</textarea>
		</td>
	</tr>
	<tr>
		<td class="mem">사진</td>
		<td><img src="/springKck/imgupload/sm_<%=bvo.getSbfile()%>" border="1" width="40" height="50" alt="image"></td>
	</tr>
	<tr>
		<td class="mem">등록일</td>
		<td><input type="text" name="sbinsertdate" id="sbinsertdate" value="<%=bvo.getSbinsertdate()%>" readonly/></td>
	</tr>
	<tr>
		<td class="mem">수정일</td>
		<td><input type="text" name="sbupdatedate" id="sbupdatedate" value="<%=bvo.getSbupdatedate()%>" readonly/></td>
	</tr>
	<tr>
		<td class="mem">비밀번호</td>
		<td>
			<input type="text" name="sbpw" id="sbpw" />
			<button type="button" id="pwbtn">비밀번호</button>
		</td>
	</tr>
	<tr>
		<td colspna="2" align="right">
		<button type="button" id="U">수정</button>	
		<button type="button" id="D">삭제</button>	
		</td>
	</tr>
</table>
</form>
</div>
</body>
</html>