<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page import="java.util.List" %>
<%@ page import="a.b.c.com.board.vo.SpringBoardVO" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>BOARD SELECT</title>
		<style type="text/css">
			div{
				margin: 50px 0px 0px 100px;
			}
			.mem{ text-align: center;}
		</style>
		<script src="http://code.jquery.com/jquery-latest.min.js"></script>
		<script type="text/javascript">
			$(document).ready(function(){
				alert("ready >>");
				
				// 비밀번호 확인
				$(document).on("click","#pwbtn",function(){
					alert("pwbtn >>> : ");
					
					let pwcheckURL = "boardPwCheck.o";
					let reqType = "POST";
					let dataParam = {
						sbnum : $("#sbnum").val(),
						sbpw : $("#sbpw").val(),
					};
					//dataParam = $("#boardUpdateForm").serialize();
					//alert("dataParam >>> : " + dataParam);
					
					$.ajax({
						url : pwcheckURL,
						type : reqType,
						data : dataParam,
						success : whenSuccess,
						error : whenError
					});
					
					function whenSuccess(resData){
						alert("resData >>> : " + resData);
						if("PW_GOOD" == resData){
							alert("비밀번호 GOOD");
							$("#sbpw").attr("readonly",true);
							$("#U").css('background-color','yellow');
							$("#D").css('color','red');
						}else if("PW_GOOD" == resData){
							alert("비밀번호 BAD");
							$("#sbpw").val('');
							$("#sbpw").focus();
						};
					}// end of whenSuccess 함수
					function whenError(e){
						alert("e >>> : " + e.resonseText);
					}// end of whenError 함수					
				});// end of $(document).on("click","#pwbtn",function()
						
				// U
				$(document).on("click","#U",function(){
					alert("U >>> : ");
					$("#boardUpdateForm").attr({ "method":"POST"
												,"action":"boardUpdate.o"}).submit();
				});//$(document).on("click","#U",function()
				
				// D
				$(document).on("click","#D",function(){
					alert("D >>> : ");
					$("#boardUpdateForm").attr({ "method":"POST"
												,"action":"boardDelete.o"}).submit();
				});// end of $(document).on("click","D",function() 
			});// end of ready 
		</script>
	</head>
	<body>
		BOARD SELECT
	<hr>
	<% request.setCharacterEncoding("UTF-8"); %>
	<% response.setCharacterEncoding("UTF-8"); %>
	<%
		Object obj = request.getAttribute("listS");
		List<SpringBoardVO> list = (List)obj;
		SpringBoardVO bvo = null;
		if(list.size() == 1){
			bvo = list.get(0);
		}// end of if문
	%>
	<div>
		<form name="boardUpdateForm" id="boardUpdateForm">
			<table border=1>
				<tr>
					<td colspan="2" align="center">게시판 글 수정하기</td>
				</tr>
				<tr>
					<td class="board">글번호</td>
					<td><input type="text" name="sbnum" id="sbnum" value="<%= bvo.getSbnum() %>" readonly/></td>
				</tr>
				<tr>
					<td class="board">제목</td>
					<td><input type="text" name="sbsubject" id="sbsubject" value="<%= bvo.getSbsubject() %>" style="width:100px" readonly/>
					</td>
				</tr>
				<tr>
					<td class="board">이름</td>
					<td><input type="text" name="sbname" id="sbname" value="<%= bvo.getSbname() %>" readonly/></td>
				</tr>
				<tr>
					<td class="board">소개글</td>
					<td>
						<textarea name="sbcontent" id="sbcontent" rows="5" cols="50"><%= bvo.getSbcontent() %>
						</textarea>
					</td>
				</tr>
				<tr>
					<td class="board">사진</td>
					<td>
						<img src="/springOjy/imgupload/sm_<%= bvo.getSbfile() %>" border="1" width="40" height="50" alt="image">
					</td>
				</tr>
				<tr>
					<td class="board">등록일</td>
					<td>
						<input type="text" name="sbinsertdate" id="sbinsertdate" value="<%= bvo.getSbinsertdate() %>" readonly />
					</td>
				</tr>
				<tr>
					<td class="board">수정일</td>
					<td>
						<input type="text" name="sbupdatedate" id="sbupdatedate" value="<%= bvo.getSbupdatedate() %>" readonly />
					</td>
				</tr>
				<tr>
					<td class="board">패스워드</td>
					<td>
						<input type="text" name="sbpw" id="sbpw"/>
						<button type="button" id="pwbtn">비밀번호</button>
					</td>
				</tr>
				<tr>
					<td colspan="2" align="right">
						<button type="button" id="U">수정</button>
						<button type="button" id="D">삭제</button>
					</td>
				</tr>
			</table>
		</form>
	</div>
	<p>
	<h3>댓글 처리하는 루틴</h3>
	<hr>
	<c:import url="/rboardForm.o">
		<c:param name="sbnum" value="<%=bvo.getSbnum() %>"></c:param>
	</c:import>
<!-- 
<jsp:include page="/rboardForm.o">
	<jsp:param value="<%=bvo.getSbnum()%>" name="sbnum"/>
</jsp:include>
 -->	
	</body>
</html>