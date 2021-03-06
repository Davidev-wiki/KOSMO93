<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="a.b.c.com.kosmo.notice.vo.NoticeVO"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>공지사항 전체 조회</title>
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
<script>
	//체크박스 체크 확인 함수	
	function checkOnly(chk) {
		// alert(">>> : " + chk);
		var chkObj = document.getElementsByName("bnumCheck");
		console.log("chkObj >>> : " + chkObj);
		for (var i = 0; i < chkObj.length; i++) {
			if (chkObj[i] != chk) {
				chkObj[i].checked = false;
			}
		}
	}

	$(document)
			.ready(
					function() {
						alert("jQuery 진입");

						// I(등록 버튼) 클릭
						$("#I").click(function() {
							location.href = "/testKck/kck/notice/notice.html";
						});

						// SelectAll(전체 조회) 클릭
						$("#SALL")
								.click(
										function() {
											var isudType = document.noticeSelectAllForm.ISUD_TYPE.value = "SALL";			
											send(isudType);	
										});

						// Update : 체크 여부, 체크박스에 체크가 된 항목 : 수정
						$("#U").click(function() {

							// 체크박스에 체크된 수가 '0'개라면 체크박스에 체크해주세요~ 멘트를,
							// 체크된게 있다면 ISUD_TYPE에 'U' 값을 담아서 보내기
							var nCnt = chkInfo();

							if (nCnt == 0) {
								console.log("체크박스에 체크해주세요~");
								alert("체크박스에 체크해주세요~");

							} else {
								var v1 = $("#ISUD_TYPE").val('U');
								send(v1);
							}

						});

						// Delete
						$("#DOK").click(function() {

							// 체크박스에 체크된 수가 '0'개라면 체크박스에 체크해주세요~ 멘트를,
							// 체크된게 있다면 ISUD_TYPE에 'DOK' 값을 담아서 보내기
							var nCnt = chkInfo();

							if (nCnt == 0) {
								console.log("체크박스에 체크해주세요~");
								alert("체크박스에 체크해주세요~");

							} else {
								var v2 = $("#ISUD_TYPE").val('DOK');
								send(v2);
							}
						});

						// 체크박스 체크 카운트 
						// return : 체크박스에 체크된 수
						// 체크박스의 '이름'속성을 가져와 배열에 담아 하나씩 카운트.
						// javascript에서 배열은 []표기하지 않는듯.
						function chkInfo() {
							var obj = document.getElementsByName("nnumCheck");
							var nCnt = 0;
							for (var i = 0; i < obj.length; i++) {
								if (obj[i].checked == true) {
									nCnt++;
								}
							}
							return nCnt;
						}

						// 전송하기
						function send(isudType) {
							$("#noticeSelectAllForm")
									.attr(
											{
												"action" : "/testKck/notice?ISUD_TYPE="+isudType,
												"method" : "GET",
												"enctype" : "application/x-www-form-urlencoded"
											}).submit();
						}
					});
</script>
</head>
<%
	request.setCharacterEncoding("EUC-KR");
%>
SELECT ALL
<%
	Object obj = request.getAttribute("aListAll");
	if (obj == null)
		return;

	ArrayList<NoticeVO> aList = (ArrayList<NoticeVO>) obj;

	int nCnt = aList.size();
	out.println("전체 조회 건 수 : " + nCnt + " 건");
%>
<body>
	<table>
		<tr>
			<td colspan="2"><font size="4" color="red"> <img
					src="/testKck/img/ase.gif" width="25" height="25" alt="img">
					NOTICE
			</font></td>
		</tr>
	</table>
	<hr>
	<hr>
	<form name="noticeSelectAllForm" id="noticeSelectAllForm">
		<table border="1">
			<thead>
				<tr>
					<td class="tt"><input type="checkbox" name="chkAll"
						id="chkAll"></td>
					<td class="li">순번</td>
					<td class="li">공지사항 번호</td>
					<td class="li">제목</td>
					<td class="li">내용</td>
					<td class="li">사진</td>
					<td class="li">삭제여부</td>
					<td class="li">등록일</td>
					<td class="li">수정일</td>
				</tr>
			</thead>
			<%
				// for 반복문 시작 : DB에서 객체로 가지고 온 데이터를 한 줄씩 출력함
				for (int i = 0; i < nCnt; i++) {
					// DB에서 데이터 전체 조회 후 받아온 객체에서 데이터 추출하기
					NoticeVO nvo = aList.get(i);
			%>
			<tbody>
				<tr>
					<td class="tt"><input type="checkbox" id="nnumCheck"
						name="nnumCheck" value=<%=nvo.getNnum()%>
						onclick="checkOnly(this)"></td>
					<td class="tt"><%=i + 1%></td>
					<td class="tt"><%=nvo.getNnum()%></td>
					<td class="tt"><%=nvo.getNsubject()%></td>
					<td class="tt"><%=nvo.getNmemo()%></td>
					<td class="tt"><img
						src="/testKck/fileupload/notice/<%=nvo.getNphoto()%> "
						border="1" width="25" height="25" alt="image"></td>
					<td class="tt"><%=nvo.getDeleteyn()%></td>
					<td class="tt"><%=nvo.getInsertdate()%></td>
					<td class="tt"><%=nvo.getUpdatedate()%></td>
				</tr>
				<%
					} // for 반복문 종료 : DB에서 객체로 가지고 온 데이터를 한 줄씩 출력함
				%>
				<tr>
					<td colspan="20" align="right">
						<input type="hidden" name="ISUD_TYPE" id="ISUD_TYPE" value=""> 
						<input type="button" value="등록" id="I"> 
						<input type="button" value="조회" id="SALL"> 
						<input type="button" value="수정" id="U"> 
						<input type="button" value="삭제" id="DOK">
					</td>
				</tr>
			</tbody>
		</table>
	</form>
</body>
</html>