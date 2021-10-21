<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>formdata_post_valueobject</title>
</head>
<body>
<h3>formdata_post_valueobject</h3>
<hr>
---------------테스트------------------<br>
1트 : ${fdvo}<br>
2트 : ${fdvo.getnum()}<br>
3트 : ${FormDataVO.getnum() }<br>
다 틀렷다 ㅋㅋㅋㅋ
--------------------------------------<br>
<hr>
EL 표현식으로 데이터 추출하기 : <br>
${formDataVO.datanum}<br>
${formDataVO.dataid}<br>
${formDataVO.datapw}<br>
${formDataVO.dataname}<br>
<hr>
EL 표현식 및 객체 함수로 데이터 추출하기 : <br>
${formDataVO.getDatanum() }<br>
${formDataVO.getDataid() }<br>
${formDataVO.getDatapw() }<br>
${formDataVO.getDataname() }<br>
</body>
</html>