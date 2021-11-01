<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ page import="a.b.c.com.mem.vo.SpringMemberVO"%>
<%@ page import="a.b.c.com.common.CodeUtil"%>
<%@ page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 전체조회 Select_All</title>
<style type="text/css">
</style>
<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		
		// mnumCheck : 체크박스의 체크 확인하기 : 문법의 기능을 몰라서 이해를 못함.
		$(document).on("click", "#mnum", function(){
			
			if($(this).prop("checked")){
				$(".mnum").prop("checked", false);
				$(this).prop("checked", true);
			}
		});
		
		
		// [등록] 버튼 클릭시
		$(document).on("click", "#I", function(){
			location.href="memForm.k";
		});
		// [조회] 버튼 클릭시
		$(document).on("click", "#SALL", function(){
			$("#memSelectAllForm").attr({
				"action" : "memSelectAll.k",
				"method" : "GET"
			}).submit();
		});
		// [수정] 버튼 클릭시
		$(document).on("click", "#U", function(){
			if($(".mnum:checked").length == 0){
				alert("체크박스에 체크해주세요!");
				return;
			}
			$("#memSelectAllForm").attr({
				"action" : "memSelect.k",
				"method" : "GET"
			}).submit();
		});
		// [삭제] 버튼 클릭시
		$(document).on("click", "#D", function(){
			if($(".mnum:checked").length == 0){
				alert("체크박스에 체크해주세요!");
				return;
			}
			$("#memSelectAllForm").attr({
				"action" : "memSelect.k",
				"method" : "GET"
			}).submit();
		});
		
	});
</script>
</head>
<body>
	<% request.setCharacterEncoding("UTF-8");%>
	
	   SELECT ALL
	
	<% Object obj = request.getAttribute("listAll");
	   if(obj == null) return;
	   
	   ArrayList<SpringMemberVO> aList = (ArrayList<SpringMemberVO>)obj;
	   int nCnt = aList.size();
	   out.println("전체 조회 건 수 nCnt >>> : " + nCnt);
	%>
<table>
<tr>
	<td colspan="2">
	<font size="4" color="blue">
		<img src="/springKck/img/img_mandu/ase.gif" width="25" height="25" alter="image">
		MEMBER TEST
	</font>
</td>
</tr>
</table>
<hr>
<hr>
<form name="memSelectAllForm" id="memSelectAllForm">
	<table border="1">
		<thead>
			<tr>
				<td class="tt"><input type="checkbox" name="chkAll" id="chkAll"></td>
				<td class="tt">순번</td>
				<td class="tt">회원번호</td>
				<td class="tt">이름</td>
				<td class="tt">아이디</td>
				<td class="tt">성별</td>
				<td class="tt">생년월일</td>
				<td class="tt">핸드폰</td>
				<td class="tt">이메일</td>
				<td class="tt">주소</td>
				<td class="tt">취미</td>
				<td class="tt">사진</td>
				<td class="tt">수정일</td>
			</tr>
		</thead>
		<%
			String gender = "";
			String birth = "";
			String hp = "";
			String tel = "";
			String email = "";
			String addr = "";
			String hobby = "";
			
			for(int i=0; i < nCnt; i++){
				SpringMemberVO mvo = aList.get(i);
				gender = CodeUtil.gender(mvo.getMgender());
				birth = CodeUtil.birth(mvo.getMbirth());
				hp = CodeUtil.hp(mvo.getMhp());
				addr = mvo.getMzonecode() + " " + mvo.getMroadaddress().replace("@", " ");
				hobby = CodeUtil.hobbys(mvo.getMhobby());
		%>
		<!-- CodeUtil에서 gender함수를 이용해 "여자" or "남자"의 문자열을 받는다. -->
		<!-- CodeUtil에서 birth함수를 이용해 "YYYY-MM-DD"형태의 문자열을 받는다. -->
		<!-- CodeUtil에서 hp함수를 이용해 "000-000-0000" or "000-0000-0000"형태의 문자열을 받는다. -->
		<!-- 주소)객체에 세팅된 형태 : 서울시 양천구 신정로170@신정현대6차 107동 406호  -->
		<!-- 주소)형태 바꾸기 : 08110 서울시 양천구 신정로170 신정현대6차 107동 406호  -->
		<!-- 취미)객체에 세팅된 형태 : 취미1,취미2,취미3.... -->
		<!-- CodeUtil에서 hobbys함수를 이용해  취미1 취미2 취미3 ...형태로 바꾼다.-->
		<tbody>
			<tr>
				<td class="tt">
					<input type="checkbox" id="mnum" name="mnum" class="mnum" value=<%= mvo.getMnum() %> >
				</td>
				<td class="tt"><%= i + 1 %></td>
				<td class="tt"><%=mvo.getMnum() %></td>
				<td class="tt"><%=mvo.getMname() %></td>
				<td class="tt"><%=mvo.getMid() %></td>
				<td class="tt"><%= gender %></td>
				<td class="tt"><%= birth %></td>
				<td class="tt"><%= hp %></td>
				<td class="tt"><%= mvo.getMemail() %></td>
				<td class="tt"><%= addr %></td>
				<td class="tt"><img src="/springKck/fileupload/member/<%= mvo.getMphoto() %>" border="1" width="25" height="25" alt="iamge"></td>
				<td class="tt"><%= mvo.getUpdatedate() %></td>
			</tr>
			<%
			}	//end of for
			%>
			<tr>
				<td colspan="20" align="right">
					<input type="button" value="등록" id="I">
					<input type="button" value="조회" id="SALL">
					<input type="button" value="수정" id="U">
					<input type="button" value="삭제" id="D">
				</td>
			</tr>
		</tbody>
	</table>
</form>
</body>
</html>
