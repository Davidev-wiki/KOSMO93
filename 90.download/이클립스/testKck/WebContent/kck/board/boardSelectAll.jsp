<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="a.b.c.com.kosmo.board.vo.BoardVO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>게시판 글 전체 조회</title>
<style type="text/css">
	* {
		margin: 0 auto;
		/*text-align: center;*/
	}
	
	td, th {
		padding: 5px;
	}
	
	.tt {
		text-align: center;
	}
</style>
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script type="text/javascript">
	
	// 체크박스 체크 확인하기
	function checkOnly(chk){
		var chkObj = document.getElementsByName("bnumCheck");
		console.log("THE NUMBER OF checked box : " + chkObj);
		// 첫번째 체크박스부터 끝까지 확인한다
		for (var i=0; i < chkObj.length; i++){
			// 체크박스에 체크되어있지 않으면 false값을 초기화한다.
			// .checked 는 함수인가?
			if(chkObj[i] != chk){
				chkObj[i].checked = false;
			}
		}
	}
	
	$(document).ready(function(){
		
		// 등록 버튼 눌렀을 경우
		$("#I").click(function(){
			location.href='/testKck/kck/board/board.html';
		});
		
		// 조회 버튼 눌렀을 경우(컨트롤러 전달->전체 조회페이지로 이동시키기)
		$("#SALL").click(function(){
			var isudType = document.boardSelectAllForm.ISUD_TYPE.value = "SALL";
			send(isudType);
		});
		
		// 수정 버튼 눌렀을 경우
		// 체크박스에서 수정할 목록을 체크한 후 수정해야한다.
		// 체크박스에 체크가 되어있지 않으면 알림메시지,
		// 체크박스에 체크가 되어있으면 controller로 "U"값을 넣어 보냄
		$("#U").click(function(){
					
			var nCnt = chkInfo();
			if (nCnt == 0){
				console.log("수정할 게시물의 체크박스에 체크해주세요");
				alert("수정할 게시물의 체크박스에 체크해주세요");
			} else{
				// jQuery 버전
				var v1 = $("$ISUD_TYPE").val("U");
				alert("v1 : " + v1.val());
				send(v1);
				// javaScript 버전
				// document.boardSelectAllForm.ISUD_TYPE.val = "D";
				// send(document.boardSelectAllForm.ISUD_TYPE.value)
			}
		
		});
		// 삭제 버튼 눌렀을 경우
		$("#D").click(function(){
					
			var nCnt = chkInfo();
			if (nCnt == 0){
				console.log("삭제할 게시물의 체크박스에 체크해주세요");
				alert("삭제할 게시물의 체크박스에 체크해주세요");
			} else{
				// jQuery 버전
				var v2 = $("$ISUD_TYPE").val("D");
				alert("v2 : " + v2.val());
				send(v2);
				// javaScript 버전
				// document.boardSelectAllForm.ISUD_TYPE.val = "D";
				// send(document.boardSelectAllForm.ISUD_TYPE.value)
				
			}
		
		});
		// 체크박스 체크 숫자 카운트
		// 모든 체크박스를 하나씩 돌면서 체크한다.
		function chkInfo(){
			var obj = document.getElementsByName("bnumCheck");
			var nCnt = 0;
			
			// obj는 배열의 형태?
			// obj(checkbox)에 체크되어있는 경우, nCnt를 1씩 더하면서
			// 끝까지 체크한다.
			for (var i=0; i < obj.length; i++){
				if (obj[i].checked == true){
					nCnt++;
				}
			}
			console.log("체크된 체크박스 : " + nCnt  + "개")
			// 리턴이 있으나 없으나 상관없는듯하다.
			return nCnt;
		}
		
		
		// submit
		function send(isudType){
			alert("데이터 보내기 전 isudType 확인 : " + isudType);
			
			$("#boardSelectAllForm").attr({
				"action" : "/testKck/board?ISUD_TYPE="isudType,
				"method" : "GET",
				"enctype" : "application/x-www-form-urlencoded"
			}).submit();
		}
	});
	
</script>
</head>
<body>
	<%
		request.setCharacterEncoding("EUC-KR");
	%>
	SELECT ALL
	<%
		Object obj = request.getAttribute("aListAll");
		if (obj == null)
			return;

		ArrayList<BoardVO> aList = (ArrayList<BoardVO>) obj;
		int nCnt = aList.size();
		out.println("전체 조회 건 수 : " + nCnt + " 건");
	%>
	<table>
		<tr>
			<td colspan="2"><font size="4" color="blue"> <img
					src="/testKck/img/ase.gif" width="25" height="25" alter="image">
					BOARD TEST
			</font></td>
		</tr>
	</table>
	<hr>
	<hr>
	<form name="boardSelectAllForm" id="boardSelecctAllForm">
		<table border="1">
			<thead>
				<tr>
					<td class="tt"><input type="checkbox" name="chkAll"
						id="chkAll"></td>
					<td class="tt">순번</td>
					<td class="tt">글 번호</td>
					<td class="tt">글 제목</td>
					<td class="tt">저자</td>
					<td class="tt">패스워드</td>
					<td class="tt">내용</td>
					<td class="tt">이미지</td>
					<td class="tt">삭제여부</td>
					<td class="tt">등록일</td>
					<td class="tt">수정일</td>
				</tr>
			</thead>
			<%
				for (int i = 0; i < nCnt; i++) {

					BoardVO bvo = aList.get(i);
			%>
			<tbody>
				<tr>
					<td class="tt"><input type="checkbox" id="bnumCheck"
						name="bnumCheck" value=<%=bvo.getBnum()%>
						onclick="checkOnly(this)"></td>
					<td class="tt"><%=i + 1%></td>
					<td class="tt"><%=bvo.getBnum()%></td>
					<td class="tt"><%=bvo.getBsubject()%></td>
					<td class="tt"><%=bvo.getBwriter()%></td>
					<td class="tt"><%=bvo.getBpw()%></td>
					<td class="tt"><%=bvo.getBmemo()%></td>
					<td class="tt"><img
						src="/testKck/fileupload/board/<%= bvo.getBphoto() %>" border="1"
						width="25" height="25" alt="image"></td>
					<td class="tt"><%=bvo.getDeleteyn()%></td>
					<td class="tt"><%=bvo.getInsertdate()%></td>
					<td class="tt"><%=bvo.getUpdatedate()%></td>
				</tr>
				<%
					} // for문 종료
				%>
				<tr>
					<td colspan="20" align="right"><input type="hidden"
						name="ISUD_TYPE" id="ISUD_TYPE" value=""> <input
						type="button" value="등록" id="I"> <input type="button"
						value="조회" id="SALL"> <input type="button" value="수정"
						id="U"> <input type="button" value="삭제" id="D"></td>
				</tr>
			</tbody>
		</table>
	</form>
</body>
</html>