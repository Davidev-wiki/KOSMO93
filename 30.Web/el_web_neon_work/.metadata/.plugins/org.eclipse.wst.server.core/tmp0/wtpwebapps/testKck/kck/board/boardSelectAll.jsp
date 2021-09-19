<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="a.b.c.com.kosmo.board.vo.BoardVO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>�Խ��� �� ��ü ��ȸ</title>
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
	
	// üũ�ڽ� üũ Ȯ���ϱ�
	function checkOnly(chk){
		var chkObj = document.getElementsByName("bnumCheck");
		console.log("THE NUMBER OF checked box : " + chkObj);
		// ù��° üũ�ڽ����� ������ Ȯ���Ѵ�
		for (var i=0; i < chkObj.length; i++){
			// üũ�ڽ��� üũ�Ǿ����� ������ false���� �ʱ�ȭ�Ѵ�.
			// .checked �� �Լ��ΰ�?
			if(chkObj[i] != chk){
				chkObj[i].checked = false;
			}
		}
	}
	
	$(document).ready(function(){
		
		// ��� ��ư ������ ���
		$("#I").click(function(){
			location.href='/testKck/kck/board/board.html';
		});
		
		// ��ȸ ��ư ������ ���(��Ʈ�ѷ� ����->��ü ��ȸ�������� �̵���Ű��)
		$("#SALL").click(function(){
			var isudType = document.boardSelectAllForm.ISUD_TYPE.value = "SALL";
			send(isudType);
		});
		
		// ���� ��ư ������ ���
		// üũ�ڽ����� ������ ����� üũ�� �� �����ؾ��Ѵ�.
		// üũ�ڽ��� üũ�� �Ǿ����� ������ �˸��޽���,
		// üũ�ڽ��� üũ�� �Ǿ������� controller�� "U"���� �־� ����
		$("#U").click(function(){
					
			var nCnt = chkInfo();
			if (nCnt == 0){
				console.log("������ �Խù��� üũ�ڽ��� üũ���ּ���");
				alert("������ �Խù��� üũ�ڽ��� üũ���ּ���");
			} else{
				// jQuery ����
				var v1 = $("$ISUD_TYPE").val("U");
				alert("v1 : " + v1.val());
				send(v1);
				// javaScript ����
				// document.boardSelectAllForm.ISUD_TYPE.val = "D";
				// send(document.boardSelectAllForm.ISUD_TYPE.value)
			}
		
		});
		// ���� ��ư ������ ���
		$("#D").click(function(){
					
			var nCnt = chkInfo();
			if (nCnt == 0){
				console.log("������ �Խù��� üũ�ڽ��� üũ���ּ���");
				alert("������ �Խù��� üũ�ڽ��� üũ���ּ���");
			} else{
				// jQuery ����
				var v2 = $("$ISUD_TYPE").val("D");
				alert("v2 : " + v2.val());
				send(v2);
				// javaScript ����
				// document.boardSelectAllForm.ISUD_TYPE.val = "D";
				// send(document.boardSelectAllForm.ISUD_TYPE.value)
				
			}
		
		});
		// üũ�ڽ� üũ ���� ī��Ʈ
		// ��� üũ�ڽ��� �ϳ��� ���鼭 üũ�Ѵ�.
		function chkInfo(){
			var obj = document.getElementsByName("bnumCheck");
			var nCnt = 0;
			
			// obj�� �迭�� ����?
			// obj(checkbox)�� üũ�Ǿ��ִ� ���, nCnt�� 1�� ���ϸ鼭
			// ������ üũ�Ѵ�.
			for (var i=0; i < obj.length; i++){
				if (obj[i].checked == true){
					nCnt++;
				}
			}
			console.log("üũ�� üũ�ڽ� : " + nCnt  + "��")
			// ������ ������ ������ ������µ��ϴ�.
			return nCnt;
		}
		
		
		// submit
		function send(isudType){
			alert("������ ������ �� isudType Ȯ�� : " + isudType);
			
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
		out.println("��ü ��ȸ �� �� : " + nCnt + " ��");
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
					<td class="tt">����</td>
					<td class="tt">�� ��ȣ</td>
					<td class="tt">�� ����</td>
					<td class="tt">����</td>
					<td class="tt">�н�����</td>
					<td class="tt">����</td>
					<td class="tt">�̹���</td>
					<td class="tt">��������</td>
					<td class="tt">�����</td>
					<td class="tt">������</td>
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
					} // for�� ����
				%>
				<tr>
					<td colspan="20" align="right"><input type="hidden"
						name="ISUD_TYPE" id="ISUD_TYPE" value=""> <input
						type="button" value="���" id="I"> <input type="button"
						value="��ȸ" id="SALL"> <input type="button" value="����"
						id="U"> <input type="button" value="����" id="D"></td>
				</tr>
			</tbody>
		</table>
	</form>
</body>
</html>