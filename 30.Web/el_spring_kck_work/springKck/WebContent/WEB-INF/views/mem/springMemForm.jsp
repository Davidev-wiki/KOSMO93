<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>스프링 회원가입 폼</title>
<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
<script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>
<script type="text/javascript">
	
	console.log("javascript 블럭 시작 >>> :");
	
	$(document).ready(function(){
		console.log("jQeury시작 >>> :");
		
		// ---------- 아이디 중복체크 -------------
		// 아이디를 입력하지 않은 경우.
		$("#midbtn").click(function(){
			console.log("아이디 중복확인 버튼이 클릭됨 >>> :");
			
			let midVal = $("#mid").val();
			if(midVal == ''){
				alert("중복할 아이디를 입력하게나 >>> :");
				$("#mid").focus();
				return false;
			}
		});
		// 아이디를 입력한 경우
	
		/*
			// Ajax 비동기 방식
			
			$(document).on("click", "#midbtn", function(){
				console.log("아이디 중복확인 버튼이 클릭됨 >>> :");
				
				let idCheckURL = "memIdCheck.k";
				let reqType = "POST";
				let dataParam =  { mid : $("#mid").val()};
				
				$.ajax({
					url:idCheckURL,
					type:reqType,
					data:dataParam,
					success:whenSuccess,
					error:whenError
				});
				
				function whenSuccess(resData){
					if("ID_YES" == resData){
						alert("사용가능한 아이디 입니다!");
						$("#mid").css("background-color", "green");
						$("#mid").attr("readonly", true);
						$("#mpw").focus();
					} else if ("ID_NO" == resData){
						alert("이미 사용중인 아이디입니다!");
						$("#mid").val('');
						$("#mid").focus();
					}
				}
				
				function Error(e){
					alert("Error >>> : " + e.responseText);
				}

			});
		*/
		
			// Ajax 동기 방식
		$(document).on("click", "#midbtn", function(){
				
			console.log("아이디 중복확인 버튼이 클릭됨 >>> :");				
			syncIdCheckData();
			});
			
			async function syncIdCheckData(){
				console.log("동기 방식으로 작업이 시작됩니다!");
				
				let idCheckData = "";
				
				var vv = $("#mid").val();
				alert("mid 의 값 >>> :" + vv);
				
				// 아래 함수 실행 결과가 idCheckData가 됨.
				idCheckData = await ajaxIdCheckData(vv);
				alert("리턴받은 데이터, idCheckData >>> :" + idCheckData);
				
				if("ID_YES" == idCheckData){
					alert("사용 가능한 아이디 입니다!");
					$("#mid").attr("readonly", true);				
					$("#mid").css('background-color','yellow');						
					$("#mpw").focus();			
					
				} else if("ID_NO" == idCheckData){
					alert("이미 사용중인 아이디입니다!");
					$("#mid").val('');
					$("#mid").focus();
				}
			}
			
			function ajaxIdCheckData(myval){
				alert("받은 myval(=mid의 값) >>> :");
				let idCheckURL = "memIdCheck.k";
				let reqType = "POST";
				let dataParam = { mid : myval};
				
				return $.ajax({
					url: idCheckURL,
					type: reqType,
					data: dataParam
				});
			}
			
			
			// ---------- 아이디 중복체크 종료 -------------
		
			
			// ----------- 비밀번호 체크 ------------
			
			$("#pwCheck").click(function(){
				console.log("비밀번호 확인 버튼이 클릭됨 >>> :");
				
				// var pw = document.getElementById("mpw").value;
				// var pw = document.getElementById("mpw_r").value;
				var pw = $("#mpw").val();
				var pw_r = $("#mpw_r").val();
				
				if(pw == pw_r){
					alert("비밀번호가 같습니다.");
					pw_r.val('');
				} else {
					alert("동일한 비밀번호를 입력해주세요!");
					// document.memForm.mpw.value = "";
					// document.memForm.mpw_r.value = "";
					// document.memForm.mpw.focus();
					pw.val('');
					pw_r.val('');
					pw.focus();
					
					return false;
				}
			});
			
			// ----------- 생년월일 자리수 제한 ------------
			$("#mbirth").on("input", function(){
				var m = $("#mbirth");
				if(m.val().length > m.maxlength){
					m.value = m.value.slice(0, m.maxlength);
				}
			});
			
			// ----------- 월 ------------
			$("#mbirth1").append("<option value=''>월 </option>");
			for(var i=1; i<=12; i++){
				// 한자리 숫자도 '0'넣어서 잡아주기
				if(i < 10) {i = '0' + i}
				$("#mbirth1").append("<option value=" + i + ">" + i + "</option>")	
			}
			
			// ----------- 일 ------------
			$("#mbirth2").append("<option value=''>일 </option>");
			for(var i=1; i<=31; i++){
				if(i < 10) {i = '0' + i}
				$("#mbirth2").append("<option value=" + i + ">" + i + "</option>")	
			}		
			
			// ----------- 이메일 ------------
			$("#memail2").change(function(){
				$("#memail2 option:selected").each(function(){
					if('1' == $(this).val()){ // 직접 입력인 경우(직접입력의 value=1로 아래 코딩해놓음)
						var aa = $("#memail1").val();
						$("#memail1").val(''); // 값 초기화
						$("#memail1").attr("readonly", false) // 활성화하기. (true:비활성화)
					} else { // select에서 선택한 경우.
						$("#memail1").val($(this).text()); // 선택옵션에서 선택된 값을 초기화
						$("#memail1").attr("readonly", true); //비활성화
					}
				});
			});
			
			// ----------- 우편번호 : 다음 API 사용 / ajax방식? ------------
			$("#zonecode").click(function(){
				console.log("우편번호 버튼이 클릭됨 >>> : ");
				new daum.Postcode({
							oncomplete: function(data){
								$("#mzonecode").val(data.zonecode); // 5자리 새 우편번호 사용
								$("#mroadaddress").val(data.roadaddress);
								$("#mjibunaddress").val(data.jibunaddress);
							}
						}).open();
			});
	
			// 서블릿으로 보내느 폼태그 데이터,  눈으로 확인하기!
			// javascript 버전과 jQuery 버전
			$("#btn").click(function(){
				
				console.log("보내기 버튼이 클릭됨 >>> :");
			
				// ===================== 자바스크립트 ============================
				
				console.log("mnum >>> : " + document.memForm.mnum.value);
				console.log("mname >>>> : " + document.memForm.mname.value);
				console.log("mid >>> : " + document.memForm.mid.value);
				console.log("mpw >>> : " + document.memForm.mpw.value);
				console.log("mpw_r >>> : " + document.memForm.mpw_r.value);
				
				var mgender_check = document.getElementsByName("mgender");
				for (var i=0; i < mgender_check.length; i++){
					if(mgender_check[i].checked == true)
					console.log("mgender_check["+i+"].value >>> :" + mgender_check[i].value);
				}
				
				console.log("mbirth >>> :" + document.memForm.mbirth.value);
				console.log("mbirth1 >>> :" + document.memForm.mbirth1.value);
				console.log("mbirth2 >>> :" + document.memForm.mbirth2.value);
	
				console.log("mhp >>> :" + document.memForm.mhp.value);
				console.log("mhp1 >>> :" + document.memForm.mhp1.value);
				console.log("mhp2 >>> :" + document.memForm.mhp2.value);
				
				console.log("mtel >>> :" + document.memForm.mtel.value);
				console.log("mtel1 >>> :" + document.memForm.mtel1.value);
				console.log("mtel2 >>> :" + document.memForm.mtel2.value);			
				
				console.log("memail >>> :" + document.memForm.memail.value);
				console.log("memail1 >>> :" + document.memForm.memail1.value);
				
				console.log("mzonecode >>> :" + document.memForm.mzonecode.value);
				console.log("mroadaddress >>> :" + document.memForm.mroadaddress.value);
				console.log("mroadaddressdetail >>> :" + document.memForm.mroadaddressdetail.value);
				console.log("mjibunaddress >>> :" + document.memForm.mjibunaddress.value);
	
				var mhobby_check = document.getElementsByName("mhobby");
				for(var i=0; i < mhobby_check.length; i++){
					if(mhobby_check[i].checked == true){
						console.log("mhobby_check["+i+"].value >>> : " + mhobby_check[i].value);
					}
				}
				
				console.log("minfo >>> : " + document.memForm.minfo.value);
				
				console.log("mphoto >>> : " + document.memForm.mphoto.value);
				
				
				// ====================== 구 분 선 ===============================
				
				// ====================== jQuery ==============================
				
					
				console.log("mnum >>> : " + $("#mnum").val());	
				console.log("mname >>> : " + $("#mname").val());	
				console.log("mid >>> : " + $("#mid").val());	
				console.log("mpw >>> : " + $("#mpw").val());	
				console.log("mpw_r>>> : " + $("#mpw_r").val());	
				
				var mgender_check = $("input:radio[name=mgender]:checked").val();
				console.log("mgender_check.value >>> :" + mgender_check);
				
				console.log("mbirth >>> : " + $("input[name=mbirth]").val());
				console.log("mbirth1 >>> : " + $("select[name=mbirth1]").val());
				console.log("mbirth2 >>> : " + $("select[name=mbirth2]").val());
				
				console.log("mhp >>> : " + $("select[name=mhp]").val());
				console.log("mhp1 >>> : " + $("input[name=mhp1]").val());
				console.log("mhp2 >>> : " + $("input[name=mhp2]").val());
				
				console.log("mtel >>> : " + $("select[name=mtel]").val());
				console.log("mtel1 >>> : " + $("input[name=mtel1]").val());
				console.log("mtel2 >>> : " + $("input[name=mtel2]").val());
				
				console.log("memail >>> : " + $("input[name=memail]").val());
				console.log("memail1 >>> : " + $("input[name=memail1]").val());
				
				console.log("mzonecode >>> : " + $("input[name=zonecode]").val());
				console.log("mroadaddress >>> : " + $("input[name=mroadaddress]").val());
				console.log("mroadaddressdetail >>> : " + $("input[name=mroadaddressdetail]").val());
				console.log("mjibunaddress >>> : " + $("input[name=mjibunaddress]").val());
				
				var mhobby_check = $("input:checkbox[name=mhobby]").each(function(){
					if(this.checked == true){
						console.log("mhobby_check.value >>> : " + this.value);
					}
				});
				
				console.log("minfo >>> : " + $("textarea[name=minfo]").val());
	
				console.log("mphoto >>> : " + $("input[name=mphoto]").val());
	
				
				$("#memForm").attr({
					"action" : "memInsert.k",
					"method" : "POST",
					"enctype" : "multipart/form-data"
				}).submit();
				
			});
		});
</script>
</head>
<body>
<h3 align="center">회원가입</h3>
<hr>
<form name="memForm" id="memForm">
<table border="1" align="center">
<tr>
	<td colspan="2" align="center">
		<font size="4" style="color:blue;">KOSMO93기</font>
		<img src="/springKck/img/img_mandu/ase.gif" width="25" height="25" alt="img">
	</td>
</tr>
<tr>	
	<td>회원번호</td>
	<td><input type="text" name="mnum" id="mnum" readonly/></td>
</tr>
<tr>	
	<td>이름</td>
	<td><input type="text" name="mnum" id="mnum" readonly/></td>
</tr>
<div id="middiv">
<tr>
	<td>아이디</td>
		<!-- 
		<input type="text" name="mid" id="mid" placeholder="아이디 체크" style="width:100px" />
		 -->
	<td>		
	<input type="text" name="mid" id="mid" placeholder="아이디 체크" />
	<input type="button" name="midbtn" id="midbn" value="아이디중복확인" />
	</td> 
</tr>
</div>
<tr>
	<td>패스워드</td>
	<td><!-- 
			<input type="text" name="mpw" id="mpw" style="width:100px"/><br/>		
			<input type="text" id="mpw_r" name="mpw_r" placeholder="비밀번호확인" style="width:100px" />		
		 -->
		 <input type="text" name="mpw" id="mpw" /><br>
		 <input type="text" name="mpw_r" id="mpw_r" placeholder="비밀번호 확인" />
		 <input type="button" value="비밀번호 확인" id="pwCheck" /><br/>
	</td>
</tr>
<tr>
	<td>성별</td>
	<td>
		<input type="radio" name="mgender" id="mgender" value="01" checked /> 여자
		<input type="radio" name="mgender" id="mgender" value="02" /> 남자
	</td>
</tr>
<tr>
	<td>생년월일</td>
	<td>
		<input type="text" name="mbirth" id="mbirth" placeholder="년(4자)" maxlength="4" style="width:50px"/>
		<select name="mbirth1" id="mbirth1"></select>
		<select name="mbirth2" id="mbirth2"></select>
	</td>
</tr>
<tr>
	<td>핸드폰</td>
	<td>
		<select name="mhp" id="mhp">
			<option value="010">010</option>
			<option value="011">011</option>
			<option value="016">016</option>
			<option value="017">017</option>			
		</select>
		- <input type="text" name="mhp1" id="mhp1" size="2" maxlength="4" />
		- <input type="text" name="mhp2" id="mhp2" size="2" maxlength="4" />
	</td>
</tr>
<tr>
	<td>전화번호</td>
	<td>
	<select name="mtel" id="mtel">
		<option value="02">02</option>
		<option value="031">031</option>
		<option value="041">041</option>
		<option value="051">051</option>		
		<option value="061">061</option>		
	</select>
		- <input type="text" name="mtel1" id="mtel1" size="2" maxlength="4" />
		- <input type="text" name="mtel2" id="mtel2" size="2" maxlength="4" />		
	</td>
</tr>
<tr>
	<td>이메일</td>
	<td>
		<input type="text" name="memail" id="memail" style="width:100px" />
		@<input type="text" name="memail1" id="memail1" style="width:100px" placeholder="직접입력" />
		<select name="memail2" id="memail2">
			<option value="1" selected>직접입력</option>
			<option value="naver.com">naver.com</option>
			<option value="gmail.com">gmail.com</option>
			<option value="daum.net">daum.net</option>
		</select>
	</td>
</tr>
<tr>
	<td>주소</td>
	<td>
		<input type="text" name="mzonecode" id="mzonecode" placeholder="우편번호" style="width:50px" maxlength="6"/>
		<input type="button" name="zonecode" id="zonecode" value="우편번호 찾기" /><br>
		<input type="text" name="mroadaddress" id="mroadaddress" placeholder="도로명주소" style="width:250px" /><br>
		<input type="text" name="mroadaddressdetail" id="mroadaddressdetail" placeholder="도로명 상세주소" style="width:250px"/><br>
		<input type="text" name="mjibunaddress" id="mjibunaddress" placeholder="지번주소" style="width:250px"/>
	</td>
</tr>
<tr>
	<td>취미</td>
	<td>
		<input type="checkbox" name="mhobby" value="01" />알고리즘
		<input type="checkbox" name="mhobby" value="02" />코딩
		<input type="checkbox" name="mhobby" value="03" />분석설계<br>
		<input type="checkbox" name="mhobby" value="04" />데이터베이스
		<input type="checkbox" name="mhobby" value="05" />스크립트
	</td>
</tr>
<tr>
	<td>소개글</td>
	<td>
		<textarea name="minfo" id="minfo" rows="5" cols="50">내 소개글
		</textarea>
	</td>
</tr>
<tr>
	<td>사진</td>
	<td>	
		<input type="file" name="mphoto" /><br>
	</td>
</tr>
<tr>
	<td colspan="2">
		<button type="button" id="btn">보내기</button>
		<button type="reset">다시</button>
	</td>
</tr>
</table>
</form>
</body>
</html>