<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@page import="a.b.c.com.mem.vo.SpringMemberVO"%>  
<%@page import="a.b.c.com.common.CodeUtil"%>   
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 조회</title>
<style type="text/css">
	* {
		margin: 0 auto;
		
	}
	
	div {
		margin : 50px 0px 0px 100px;
	}
	
	td, th {
		padding : 5px;
	}
	
	.tt {
		text-align : center;
	}
	
	.photo {
		border : 1px solid red;
		width : 160px;
		height : 180px;
		display : block;
		margin-left : auto;
		margin-right : auto;
	}
	
	
</style>
<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
<!-- 다음 주소록 OPEN API CDN 불러오기  -->
<script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		
		// 이메일 : select로 메일 초이스 하는 기능
		// 직접 입력하면 상관없고
		// 셀렉트로 메일 뒷주소를 초이스했을 경우에 memail1에서 readonly시키기
		
		// 여기서 $(this) == #memail2 option:selected
		$("#memail2").change(function(){
			$("#memail2 option:selected").each(function(){
				if($(this).val() == "1"){ // 직접입력을 선택했을 경우
					var aa = $("#memail1").val(); // 직접 적은 텍스트를 var aa에 초기화;
					$("#memail1").val('');
					$("#memail1").attr("readonly", false);
					$("#memail1").focus();
				} else {	// 옵션을 선택했으면 직접 입력할 수 없도록 readonly 시켜주기
					$("#memail1").val($(this).text());
					$("#memail1").attr("readonly", true);
				}
			});
		});
	
		// 우편번호 : daum API에 연결해서 새창 띄우기
		$("#zonecode").click(function(){
			console.log("zonecode >>> : ");
			new daum.Postcode({
				oncomplete: function(data) {
					$("#mzonecode").val(data.zonecode);
					$("#mroadaddress").val(data.roadAddress);
					$("#mjibunaddress").val(data.jibunAddress);
				}
			}).open();
		});	
	});
	
	// [수정] 버튼 클릭시
	$(document).on("click", "#U", function(){
		$("#memUpdateForm").attr({
			"action" : "memUpdate.k",
			"method" : "POST"
		}).submit();
	});
	
	// [삭제] 버튼 클릭시
	$(document).on("click", "#D", function(){
		$("#memUpdateForm").attr({
			"action" : "memDelete.k",
			"method" : "POST"
		}).submit();
	});
	
	// [등록] 버튼 클릭시
	$(document).on("click", "#I", function(){
		location.href="memForm.k";
	});
	// [조회] 버튼 클릭시
		$(document).on("click", "#SALL", function(){
		$("#memUpdateForm").attr({
			"action" : "memSelectAll.k",
			"method" : "GET"
		}).submit();
	});
	
</script>
</head>
<body onload="compCheck()">
<% 	request.setCharacterEncoding("UTF-8"); %>
	SELECT
<%	
	Object obj = request.getAttribute("listS");
	if(obj==null) return;
	
	ArrayList<SpringMemberVO> aList = (ArrayList<SpringMemberVO>)obj;
	int nCnt = aList.size();
	out.println("조건 조회 건 수 nCnt >>> :" + nCnt);
	
	String mgender = "";
	String mbirth = "";
	String mhp = "";
	String mtel = "";
	String memail = "";
	String mzonecode = "";
	String mroadaddress = "";
	String mroadaddressdetail = "";
	String mjibunaddress = "";
	String mhobby = "";
	
	SpringMemberVO mvo = null;
	
	if(nCnt == 1){
		
		mvo = aList.get(0);
		
		mgender = mvo.getMgender();
		mbirth = CodeUtil.birth(mvo.getMbirth());
		mhp = CodeUtil.hp(mvo.getMhp());
		mtel = CodeUtil.tel(mvo.getMtel());
		memail = mvo.getMemail();
		
		mzonecode = mvo.getMzonecode();
		mroadaddress = mvo.getMroadaddress();
		String addr[] = mroadaddress.split("@");
		mroadaddress = addr[0];
		mroadaddressdetail = addr[1];
		mjibunaddress = mvo.getMjibunaddress();
		
		mhobby = mvo.getMhobby();
	}
%>
<hr>
<div>
<form name="memUpdateForm" id="memUpdateForm">
<table border="1">
<script>
	function compCheck(){
		console.log("conmCheck 진입 >>> :");
		
		// 성별 : 왜 이렇게 하는지 잘 모르겠음
		var gen = "<%= mgender%>";
		console.log("gen >>> :" + gen);
		
		if("01" == gen){
			document.getElementsByName("mgender")[0].checked = true;
		}
		if("02" == gen){
			document.getElementsByName("mgender")[1].checked = true;
		}
		
		// 이메일
		var email = "<%= memail %>";
		var emails = email.split("@");
		console.log("emails >>> : " + emails);
		
		document.getElementById("memail").value = emails[0];
		document.getElementById("memail1").value = emails[1];
		
		// 취미 : 체크가 되어있는 것을 트루로 만들어주기
		var hobs = "<%= mhobby %>";
		console.log("hobs >>> :" + hobs);
		var hob = hobs.split(",");
		for (var m = 0; m < hob.length; m++) {
			var hobValue = hob[m];
			console.log("hobValue >>> : " + hobValue);
			
			if("01" == hobValue){
				document.getElementByName("mhobby")[0].checked = true;
			}
			if("02" == hobValue){
				document.getElementByName("mhobby")[1].checked = true;
			}
			if("03" == hobValue){
				document.getElementByName("mhobby")[2].checked = true;
			}
			if("04" == hobValue){
				document.getElementByName("mhobby")[3].checked = true;
			}
			if("05" == hobValue){
				document.getElementByName("mhobby")[4].checked = true;
			}	
		}
	}
</script>
	<tr>
		<td colspan="3" align="center">
			<font size="4" style="color:blue;">회원정보 수정 && 삭제</font>
			<img src="/springKck/img/img_mandu/ase.gif" width="25" height="25" alt="image">
		</td>
	</tr>
	<tr>
		<td>회원번호</td>
		<td>
			<input type="text" name="mnum" id="mnum" value="<%= mvo.getMnum() %>" readonly />
		</td>
		<td rowspan="5">
			<img class="photo" src="/springKck/fileupload/member/<%=mvo.getMphoto() %>" alt="image">
		</td>
	</tr>
	<tr>
		<td>이름</td>
		<td>
			<input type="text" name="mname" id="mname" value="<%= mvo.getMname() %>" readonly>
		</td>
	</tr>
	<tr>
		<td>아이디</td>
		<td>
			<input type="text" name="mid" id="mid" style="width:100px" value="<%= mvo.getMid() %>"  readonly>
		</td>
	</tr>
	<tr>
		<td>패스워드</td>
		<td>
			<input type="text" name="mname" id="mname" value="<%= mvo.getMname() %>" readonly>
		</td>
	</tr>
	<tr>
		<td>성별</td>
		<td>
			<input type="radio" name="mgender" id="mgender" value="01" checked />여자
			<input type="radio" name="mgender" id="mgender" value="02" />남자
		</td>
	</tr>
	<tr>
		<td>생년월일</td>
		<td colspan="2">
			<input type="text" name="mbirth" id="mbirth" value="<%= mbirth %>" readonly>
		</td>
	</tr>
	<tr>
		<td>핸드폰</td>
		<td colspan="2">
			<input type="text" name="mhp" id="mhp" value="<%= mhp %>" readonly>
		</td>
	</tr>
	<tr>
		<td>전화번호</td>
		<td>
			<input type="text" name="mtel" id="mtel" value="<%= mtel %>" readonly>
		</td>
	</tr>
	<tr>
		<td>이메일</td>
		<td colspan="2">
			<input type="text" name="memail" id="memail" style="width:100px" />
			@ <input type="text" name="memail1" id="memail1" style="width:100px"
				placeholder="직접입력" />
			<select	name="memail2" id="memail2">
				<option value="1" selected>직접입력</option>
				<option value="naver.com">naver.com</option>>
				<option value="gmail.com">gmail.com</option>>
				<option value="daum.net">daum.net</option>>
			</select>
		</td>
	</tr>
	<tr>
		<td>주소</td>
		<td colspan="2">
			<input type="text" name="mzonecode" id="mzonecode" placeholder="우편번호" style="width:50px" value="<%= mzonecode %>">
			<input type="button" name="zonecode" id="zonecode" value="우편번호 찾기"><br>
			<input type="text" name="mroadaddress" id="mroadaddres" placeholder="도로명주소" style="width:250px" value="<%= mroadaddress %>"><br>
			<input type="text" name="mroadaddressdetail" id="mroadaddresdetail" placeholder="도로명주소 상세주소" style="width:250px" value="<%= mroadaddressdetail %>"><br>
			<input type="text" name="mjibunaddress" id="mjibunaddress" placeholder="지번주소" style="width:250px" value="<%= mjibunaddress %>">
		</td>
	</tr>
	<tr>
		<td>취미</td>
		<td colspan="2">
			<input type="checkbox" name="mhobby" value="01" /> 알고리즘
			<input type="checkbox" name="mhobby" value="02" /> 코딩
			<input type="checkbox" name="mhobby" value="03" /> 분석설계<br>
			<input type="checkbox" name="mhobby" value="04" /> 데이터베이스
			<input type="checkbox" name="mhobby" value="05" /> 스크립트		
		</td>
	</tr>
	<tr>
		<td>소개글</td>
		<td colspan="2">
			<textarea name="minfo" id="minfo" rows="5" cols="50"><%= mvo.getMinfo() %></textarea>
	</tr>
	<tr>
		<td colspan="3" align="center">
		<input type="button" value="수정" id="U" />
		<input type="button" value="삭제" id="D" />
		<input type="button" value="취소" />
		&nbsp;&nbsp;&nbsp;&nbsp;
		<input type="button" value="등록" id="I" />
		<input type="button" value="목록" id="SALL" />
		</td>
	</tr>
</table>
</form>
</div>
</body>
</html>