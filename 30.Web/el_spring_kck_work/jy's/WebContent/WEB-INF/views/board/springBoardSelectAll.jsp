<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<%@ page import="java.util.List" %>
<%@ page import="a.b.c.com.board.vo.SpringBoardVO" %>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<title>게시판 목록</title>
	<style type="text/css">
		.tt{
			text-align:center;
			font-weight:bold;
		}
	</style>
	<link rel="stylesheet" href="/springOjy/common/datepiker/jquery-ui-1.12.1/jquery-ui.min.css">
	<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
	<script src="/springOjy/common/datepiker/jquery-ui-1.12.1/jquery-ui.min.js"></script>
	<script type="text/javascript">
		
		$(document).ready(function(){
			alert("ready >>");
			/*
				CSS 선택자 우선순위 점수
				직접기입 : style = '' : 1000 점
				id : #sbnum : 100점
				class : .sbnum : 10점
				속성 : [name="sbnum"] 10점
			*/
			// sbnum
			$(document).on("click","#sbnum",function(){
				alert("chkInSbnum >>> : ");
				if($(this).prop('checked')){
					//$('input[type="checkbox"][name="sbnum"]').prop('checked',false);
					$('.sbnum').prop('checked',false);
					$(this).prop('checked',true);
				}
			}); // end of $(document).on("click","#sbnum",function()
					
			// 검색버튼
			// U
			$(document).on("click","#searchBtn",function(){
				alert("searchBtn >>> : ");
				$("#boardList").attr({"method":"GET"
									  ,"action":"boardSelectAll.o"}).submit();
			});
			// datepicker : from~to 기간조회
			$("#startdate").datepicker({
				showOn :"button", // 달력을 표시할 타이밍 (both : focus or button)
				buttonImage : "/springOjy/img/cal_0.gif",
				buttonImageOnly : true,
				buttonText: "날짜선택",
				dateFormat : "yy-mm-dd",
				changeMonth : true,
				onClose : function(selectedDate){
					$("#enddate").datepicker("option","minDate",selectedDate);
				}
			});// end of $("#startdate").datepicker
			$("#enddate").datepicker({
				showOn : "button",
				buttonImage : "/springOjy/img/cal_0.gif",
				buttonImageOnly : true,
				buttonText : "날짜선택",
				dateFormat : "yy-mm-dd",
				changeMonth : true,
				onClose : function(selectedDate){
					$("#startdate").datepicker("option","maxDate",selectedDate);
				}   
			});// end of $("#enddate").datepicker 함수
			
			// I
			$(document).on("click","#I",function(){
				alert("I >>> : ");
				location.href="boardForm.o";
			});
			// U 
			$(document).on("click","#U",function(){
				alert("U >>> : ");
				if($('.sbnum:checked').length ==0){
					alert("수정할 글번호 하나를 선택하세요 !!");
					return;
				}
				$("#boardList").attr({ "method":"POST"
									  ,"action":"boardSelect.o"}).submit();		
			});
			// D
			$(document).on("click","#D",function(){
				alert("D >>> : ");
				if($('.sbnum:checked').length == 0){
					alert("삭제할 글번호 하나를 선택하세요 !!");
					return;
				}
				$("#boardList").attr({"method" :"POST"
					 ,"action":"boardSelect.o"}).submit();
			});
		});
	</script>
	</head>
	<body>
		<% request.setCharacterEncoding("UTF-8"); %>
		<% response.setCharacterEncoding("UTF-8"); %>
		<%
			Object obj = request.getAttribute("listAll");
			List<SpringBoardVO> list = (List)obj;
			
			int nCnt = list.size();
			System.out.println("nCnt >>> : " + nCnt);
			
			// 페이징 변수 세팅
			int pageSize = 0;
			int groupSize = 0;
			int curPage = 0;
			int totalCount = 0;
			
			Object objPaging = request.getAttribute("pagingBVO");
			SpringBoardVO pagingBVO = (SpringBoardVO)objPaging;
			
		%>
		<form name="boardList" id="boardList">
		<table border="1" align="center">
			<thead>
				<tr>
					<td colspan="10" align="center">
						<h2>게시판</h2>
					</td>
				</tr>
				<tr>
					<td colspan="10" align="left">
						<select id="keyfilter" name="keyfilter">
							<option value="key1">제목</option>
							<option value="key2">내용</option>
							<option value="key3">제목+내용</option>
							<option value="key4">작성자</option>
							<option value="key5">글번호</option>
						</select>
						<input type="text" id="keyoword" name="keyword" placeholder="검색어 입력"><br>
						<input type="text" id="startdate" name="startdate" size="12" placeholder="시작일">
						~ <input type="text" id="enddate" name="enddate" size="12" placeholder="종료일">
						<button type="button" id="searchBtn">검색</button>
					</td>
				</tr>
				<tr>
					<td class="tt">체크</td>
					<td class="tt">글번호</td>
					<td class="tt">제목</td>
					<td class="tt">작성자</td>
					<td class="tt">내용</td>
					<td class="tt">최종작성일</td>
					<td class="tt">사진</td>
				</tr>
			</thead>
			<%
				for(int i=0; i<nCnt; i++){
					SpringBoardVO bvo = list.get(i);
					pageSize = Integer.parseInt(pagingBVO.getPageSize());
					groupSize = Integer.parseInt(pagingBVO.getGroupSize());
					curPage = Integer.parseInt(pagingBVO.getCurPage());
					totalCount = Integer.parseInt(bvo.getTotalCount());
		
			%>
			<tbody>
				<tr>
					<td align="center">
						<input type="checkbox" name="sbnum" id="sbnum" class="sbnum" value=<%= bvo.getSbnum() %>>
					</td>
					<td class="tt"><%= bvo.getSbnum() %></td>
					<td class="tt"><%= bvo.getSbsubject() %></td>
					<td class="tt"><%= bvo.getSbname() %></td>
					<td class="tt"><%= bvo.getSbcontent() %></td>
					<td class="tt"><%= bvo.getSbupdatedate() %></td>
					<td class="tt"><img src="/springOjy/imgupload/sm_<%= bvo.getSbfile()%>"></td>
				</tr>
				<%
				}// end of for문
				%>
				<tr>
					<td colspan="7" align="right">
						<input type="button" value="글쓰기" id='I'>
						<input type="button" value="글수정" id='U'>
						<input type="button" value="글삭제" id='D'>
					</td>
				</tr>
				<tr>
						<td colspan="7">
							<jsp:include page="boardPaging.jsp" flush="true">
								<jsp:param name="url" value="boardSelectPaging.o"/>
								<jsp:param name="str" value=""/>
								<jsp:param name="pageSize" value="<%=pageSize %>"/>
								<jsp:param name="groupSize" value="<%=groupSize %>"/>
								<jsp:param name="curPage" value="<%=curPage %>"/>
								<jsp:param name="totalCount" value="<%=totalCount %>"/>
							</jsp:include>
						</td>
				</tr>
			</tbody>
		</table>
		</form>
	</body>
</html>