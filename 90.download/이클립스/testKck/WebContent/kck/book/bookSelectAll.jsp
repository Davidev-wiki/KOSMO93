<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="a.b.c.com.kosmo.board.vo.BoardVO"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>글 전체 조회</title>
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
	// 체크박스의 체크 확인하는 함수
	function checkOnly(chk) {
		// alert("들어온 check!! : " + chk);
		var chkObj = document.getElementsByName("bnumCheck");
		console
				.log("chkObj(bookSelectAll.jsp에서 bnumCheck라는 이름의 데이터요소를 가져온 값입니다. 뭐가 담겨있나) : "
						+ chkObj);

		// 추측 : 체크박스를 확인하면서 체크가 안되어있으면 false값 반환하기
		for (var i = 0; i < chkObj.length; i++) {
			if (chkObj[i] != chk) {
				chkObj[i].checked = false;
			}
		}
	}

	// jQuery 시작
	$(document)
			.ready(
					function() {

						// 등록하기
						$("#I").click(function() {
							location.href = "testKck/kck/board/board.html";
						});
						// 전체조회
						$("#SALL")
								.click(
										function() {
											var isudType = document.boardSelectAllForm.ISUD_TYPE.value = "SALL";
											send(isudType);
										});
						// 수정하기
						$("#U").click(function() {
							// 체크박스에서 체크 확인 결과를 가져옴
							var nCnt = chkInfo();

							if (nCnt == 0) {
								// 체크가 하나도 안되어있을 경우
								console.log("체크박스를 체크하세요");
								alert("체크박스를 체크하세요");
							} else {
								// 체크가 되어있는 경우
								/*  자바스크립트 버전
									document.boardSelectAllForm.ISUD_TYPE.value = "U";
									send(document.boardSelectAllForm.ISUD_TYPE.value);
								 */
								// jQuery 버전
								var v1 = $("#ISUD_TYPE").val("U");
								alert("v1 : " + v1.val());
								send(v1);
							}

						});
						// 삭제하기
						$("#D").click(function() {
							var nCnt = chkInfo();

							if (nCnt == 0) {
								// 체크가 하나도 안되어있을 경우
								console.log("체크박스를 체크하세요");
								alert("체크박스를 체크하세요");
							} else {
								// 체크가 되어있는 경우
								/*  자바스크립트 버전
									document.boardSelectAllForm.ISUD_TYPE.value = "U";
									send(document.boardSelectAllForm.ISUD_TYPE.value);
								 */
								// jQuery 버전
								var v2 = $("#ISUD_TYPE").val("D");
								alert("v2 : " + v2.val());
								send(v2);
							}

						});
						// 체크박스 체크 카운트
						function chkInfo() {
							var obj = document.getElementsByName("bnumCheck");
							var nCnt = 0;
							// nCnt에 체크된 체크박스의 숫자가 더해진다.
							// 체크된 체크박스의 총 개수.
							for (var i = 0; i < obj.length; i++) {
								if (obj[i].checked == true) {
									nCnt++;
								}
							}
							console.log("nCnt (체크된 체크박스의 수) : " + nCnt);
							return nCnt;
						}
						// submit
						function send(isudType) {
							alert("isudType을 보냅니다 : " + isudType);

							$("#boardSelectAllForm")
									.attr(
											{
												"action" : "/testKck/board?ISUD_TYPE="
														+ isudType,
												"method" : "GET",
												"enctype" : "application/x-www-form-urlencoded"
											}).submit();

						}

					}); // jQeury 종료
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
			<!-- img src 경로는 현재 웹 컨테이너의 경로임(잘 나온다!!) -->
			<td colspan="2"><font size="4" color="green"> <img
					src="/testKck/img/ase.gif" width="25" height="25"
					alter="image"> BOARD TEST
			</font></td>
		</tr>
	</table>
	<hr>
	<hr>
	<form name="boardSelectAllForm" id="boardSelectAllForm">
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
				// 데이터가 들어있는 갯수 만큼 (=전체 다)
				for (int i = 0; i < nCnt; i++) {
					// bvo에 담는다.
					BoardVO bvo = aList.get(i);
			%>
			<tbody>
				<tr>
					<td class="tt"><input type="checkbox" id="bnumCheck"
						name="bnumCheck" value="<%=bvo.getBnum()%>"
						onclick="checkOnly(this)"></td>
					<td class="tt"><%=i + 1%></td>
					<td class="tt"><%=bvo.getBnum()%></td>
					<td class="tt"><%=bvo.getBsubject()%></td>
					<td class="tt"><%=bvo.getBwriter()%></td>
					<td class="tt"><%=bvo.getBpw()%></td>
					<td class="tt"><%=bvo.getBmemo()%></td>
					<!-- img src = 여기도 웹 컨테이너 경로!! "/testKck/img/ase.gif"  -->
					<td class="tt">
						<img src="/testKck/fileupload/book/<%=bvo.getBphoto()%>">
					</td>
					<td class="tt"><%=bvo.getDeleteyn()%></td>
					<td class="tt"><%=bvo.getInsertdate()%></td>
					<td class="tt"><%=bvo.getUpdatedate()%></td>
				</tr>
				<%
					} // for문 종료
				%>
				<tr>
					<td conspan="20" align="right"><input type="hidden"
						name="ISUD_TYPE" id="ISUD_TYPE" value=""> <input
						type="button" value="등록" id="I"> <input type="button"
						value="조회" id="SALL"> <input type="button" value="수정"
						id="U"> <input type="button" value="삭제" id="D">
				</tr>
			</tbody>
		</table>
	</form>
</body>
</html>