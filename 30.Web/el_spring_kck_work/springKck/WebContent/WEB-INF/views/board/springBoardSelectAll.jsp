<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="a.b.c.com.board.vo.SpringBoardVO" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 목록</title>
<style type="text/css">
		.tt{
			text-align : center;
			font-weight : bold;
		}
</style>
<!-- CSS에 따라 jQuery 버전도 다른듯 -->
<link rel="stylesheet" href="/springKck/common/datepicker/jquery-ui-1.12.1/jquery-ui.min.css">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="/springKck/common/datepicker/jquery-ui-1.12.1/jquery-ui.min.js"></script>
<script type="text/javascript">
		$(document).ready(function(){
			/*
			CSS 선택자 우선순위 점수
			직접기입  : styl='' : 1000 점 
			id : #sbnum : 100점
			class : .sbnum : 10점
			속성 : [name="sbnum"] : 10점
			*/
			
			// "sbnum : checkbox's name"
			// 체크박스에 체크여부 확인하는 기능
			$(document).on("click", "#sbnum", function(){
				//alert("chkInSbnum");
				console.log("checkbox >>> : 체크되었습니다.");
				if ($(this).prop('checked')) {
					// 잘 모르겠음.
					// $('input[type="checkbox"][name="sbnum"]').prop('checked',false);
					$('.sbnum').prop('checked', false);
					$(this).prop('checked', true);
				}
			});
			
			// --datepicker-- from ~ to 기간 조회 기능
			// startdate
			$("#startdate").datepicker({
				// 달력을 표시할 타이밍(both : focus or button)
				// 옵션 바꿔서 해보기.
				showOn : "button",
				buttonImage : "/springKck/img/cal_0.gif",
				buttonImageOnly : true,
				buttonText : "날짜선택",
				dateFormat : "yy-mm-dd",
				changeMonth : true,
				onClose : function(selectedDate){
					$("#enddate").datepicker("option", "minDate", selectedDate);
				}
			});
			
			// enddate
			$("#enddate").datepicker({
				// 달력을 표시할 타이밍(both : focus or button)
				// 옵션 바꿔서 해보기.
				showOn : "button",
				buttonImage : "/springKck/img/cal_0.gif",
				buttonImageOnly : true,
				buttonText : "날짜선택",
				dateFormat : "yy-mm-dd",
				changeMonth : true,
				onClose : function(selectedDate){
					$("#startdate").datepicker("option", "maxDate", selectedDate);
				}
			});
			// [검색] 버튼 클릭시 전체 조회 화면으로 이동
			$(document).on("click", "#searchBtn", function(){
				alert("검색이 시작됩니다.");
				console.log("검색 버튼이 클릭됨");
				$("#boardList").attr({
					"action" : "boardSelectAll.k",
					"method" : "GET"
				}).submit();
			});
			
			// [등록] 버튼 클릭시 글 쓰기 화면으로 이동
			$(document).on("click", "#I", function(){
				//alert("등록이 시작됩니다.");
				console.log("등록 버튼이 클릭됨");
				location.href="boardForm.k";
			});
			
			// [수정] 버튼 클릭시 체크박스 체크 확인 후 선택 조회 화면으로 이동
			$(document).on("click", "#U", function(){
				alert("수정이 시작됩니다.");
				console.log("수정 버튼이 클릭됨");
				if($('.sbnum:checked').length == 0){
					alert("수정할 게시글을 선택해주세요!");
					return;
				}
				$("#boardList").attr({
					"action" : "boardSelect.k",
					"method" : "POST"
				}).submit();
			});
			// [삭제] 버튼 클릭시 체크박스 체크 확인 후 선택조회 화면으로 이동.
			$(document).on("click", "#D", function(){
				alert("삭제가 시작됩니다.");
				console.log("삭제 버튼이 클릭됨");
				if($('.sbnum:checked').length == 0){
					alert("삭제할 게시글을 선택해주세요!");
					return;
				}
				$("#boardList").attr({
					"action" : "boardSelect.k",
					"method" : "POST"
				}).submit();
			});
		});
</script>
</head>
<body>
<!-- 인코딩타입 세팅 -->
<% 
	request.setCharacterEncoding("UTF-8");
%>
<!-- 컨트롤러에서 전체조회 데이터 가져오기 -->
<%
	Object obj = request.getAttribute("listAll");
	List<SpringBoardVO> list = (List)obj;
	
	int nCnt = list.size();
	System.out.println("가져온 데이터 건 수 : " + nCnt);
%>
<form name="boardList" id="boardList">
<table border="1" align="center">
<thead>
		<tr>
			<td colspan="10" align="center">
				<h2>[게시판]</h2>
			</td>
		</tr>
		<tr>
			<td colspan="10" align="left">
				<select id="keyfilter" name="keyfilter">
						<option value="key1">제목</option>
						<option value="key2">내용</option>
						<option value="key3">제목+내용</option>
						<option value="key4">작성자(이름)</option>
						<option value="key5">글번호</option>
				</select>
				<input type="text" id="keyword" name="keyword" placeholder="검색어를 입력하세요"><br>
				<input type="text" id="startdate" name="startdate" size="12" placeholder="시작일">
				~<input type="text" id="enddate" name="enddate" size="12" placeholder="종료일">
				<button type="button" id="searchBtn">검색</button>
			</td>
		</tr>
		<tr>
			<td class="tt">체크</td>
			<td class="tt">글번호</td>
			<td class="tt">제목</td>
			<td class="tt">이름</td>
			<td class="tt">내용</td>
			<td class="tt">수정일</td>
			<td class="tt">사진</td>
		</tr>
</thead>
<!-- 갖고온 데이터 개수만큼 반복해서 출력 -->
<%
	for (int i=0; i<nCnt; i++) {
		SpringBoardVO bvo = list.get(i);	
%>
<tbody>
	<tr>
		<td align="center">
			<input type="checkbox" name="sbnum" id="sbnum" class="sbnum" value=<%=bvo.getSbnum() %>>
		</td>
		<td class="tt"><%=bvo.getSbnum() %></td>
		<td class="tt"><%=bvo.getSbsubject() %></td>
		<td class="tt"><%=bvo.getSbname() %></td>
		<td class="tt"><%=bvo.getSbcontent() %></td>
		<td class="tt"><%=bvo.getSbupdatedate() %></td>
		<td class="tt"><img alt="img" src="/springKck/imgupload/sm_<%=bvo.getSbfile()%>"></td>
	</tr>
<%
	}
%>
	<tr>
		<td colspan="7" align="right">
			<input type="button" value="글쓰기" id="I">
			<input type="button" value="글수정" id="U">
			<input type="button" value="글삭제" id="D">	
		</td>
	</tr>
</tbody>
</table>
</form>
</body>
</html>