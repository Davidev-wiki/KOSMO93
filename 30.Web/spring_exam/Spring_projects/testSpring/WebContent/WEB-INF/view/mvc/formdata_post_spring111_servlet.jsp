<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>VIEW : formdata_post_spring111_servlet</title>
</head>
<body>
<h3>formdata_post_spring111_servlet</h3>
<hr>
Spring Model
<h3>${model_datanum }</h3>
<h3>${model_dataid }</h3>
<h3>${model_datapw }</h3>
<h3>${model_dataname }</h3>
<hr>
request.setAttribute 이용
<h3>${request_datanum }</h3>
<h3>${request_dataid }</h3>
<h3>${request_datapw }</h3>
<h3>${request_dataname }</h3>
</body>
</html>