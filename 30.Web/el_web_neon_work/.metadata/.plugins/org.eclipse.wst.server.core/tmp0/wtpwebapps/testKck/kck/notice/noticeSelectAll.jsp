<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="a.b.c.com.kosmo.notice.vo.NoticeVO"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>�������� ��ü ��ȸ</title>
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
	//üũ�ڽ� üũ Ȯ�� �Լ�	
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
						alert("jQuery ����");

						// I(��� ��ư) Ŭ��
						$("#I").click(function() {
							location.href = "/testKck/kck/notice/notice.html";
						});

						// SelectAll(��ü ��ȸ) Ŭ��
						$("#SALL")
								.click(
										function() {
											var isudType = document.noticeSelectAllForm.ISUD_TYPE.value = "SALL";			
											send(isudType);	
										});

						// Update : üũ ����, üũ�ڽ��� üũ�� �� �׸� : ����
						$("#U").click(function() {

							// üũ�ڽ��� üũ�� ���� '0'����� üũ�ڽ��� üũ���ּ���~ ��Ʈ��,
							// üũ�Ȱ� �ִٸ� ISUD_TYPE�� 'U' ���� ��Ƽ� ������
							var nCnt = chkInfo();

							if (nCnt == 0) {
								console.log("üũ�ڽ��� üũ���ּ���~");
								alert("üũ�ڽ��� üũ���ּ���~");

							} else {
								var v1 = $("#ISUD_TYPE").val('U');
								send(v1);
							}

						});

						// Delete
						$("#DOK").click(function() {

							// üũ�ڽ��� üũ�� ���� '0'����� üũ�ڽ��� üũ���ּ���~ ��Ʈ��,
							// üũ�Ȱ� �ִٸ� ISUD_TYPE�� 'DOK' ���� ��Ƽ� ������
							var nCnt = chkInfo();

							if (nCnt == 0) {
								console.log("üũ�ڽ��� üũ���ּ���~");
								alert("üũ�ڽ��� üũ���ּ���~");

							} else {
								var v2 = $("#ISUD_TYPE").val('DOK');
								send(v2);
							}
						});

						// üũ�ڽ� üũ ī��Ʈ 
						// return : üũ�ڽ��� üũ�� ��
						// üũ�ڽ��� '�̸�'�Ӽ��� ������ �迭�� ��� �ϳ��� ī��Ʈ.
						// javascript���� �迭�� []ǥ������ �ʴµ�.
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

						// �����ϱ�
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
	out.println("��ü ��ȸ �� �� : " + nCnt + " ��");
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
					<td class="li">����</td>
					<td class="li">�������� ��ȣ</td>
					<td class="li">����</td>
					<td class="li">����</td>
					<td class="li">����</td>
					<td class="li">��������</td>
					<td class="li">�����</td>
					<td class="li">������</td>
				</tr>
			</thead>
			<%
				// for �ݺ��� ���� : DB���� ��ü�� ������ �� �����͸� �� �پ� �����
				for (int i = 0; i < nCnt; i++) {
					// DB���� ������ ��ü ��ȸ �� �޾ƿ� ��ü���� ������ �����ϱ�
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
					} // for �ݺ��� ���� : DB���� ��ü�� ������ �� �����͸� �� �پ� �����
				%>
				<tr>
					<td colspan="20" align="right">
						<input type="hidden" name="ISUD_TYPE" id="ISUD_TYPE" value=""> 
						<input type="button" value="���" id="I"> 
						<input type="button" value="��ȸ" id="SALL"> 
						<input type="button" value="����" id="U"> 
						<input type="button" value="����" id="DOK">
					</td>
				</tr>
			</tbody>
		</table>
	</form>
</body>
</html>