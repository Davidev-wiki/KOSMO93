<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result</title>
<script type="text/javascript">
	alert("${result}");
	if("${result}".indexOf("실패")>-1){
		history.go(-1);
	} else {
		opener.listSearch();
		window.close();
	}
</script>
</head>
<body>
</body>
</html>