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
---------------�׽�Ʈ------------------<br>
1Ʈ : ${fdvo}<br>
2Ʈ : ${fdvo.getnum()}<br>
3Ʈ : ${FormDataVO.getnum() }<br>
�� Ʋ�Ǵ� ��������
--------------------------------------<br>
<hr>
EL ǥ�������� ������ �����ϱ� : <br>
${formDataVO.datanum}<br>
${formDataVO.dataid}<br>
${formDataVO.datapw}<br>
${formDataVO.dataname}<br>
<hr>
EL ǥ���� �� ��ü �Լ��� ������ �����ϱ� : <br>
${formDataVO.getDatanum() }<br>
${formDataVO.getDataid() }<br>
${formDataVO.getDatapw() }<br>
${formDataVO.getDataname() }<br>
</body>
</html>