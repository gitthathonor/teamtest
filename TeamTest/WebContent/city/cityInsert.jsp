<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>여행계획짜기- 도시 선택</title>
<script src="../js/jquery-3.6.0.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		
		$("#city").click(function(){
			alert("jquery - click 연습");
		});
		
		$("#city").click(function(){
			$.ajax();
		});
		
	}); // jquery 전체 영역


</script>
</head>
<body>
	<input type="text">
	<input type="button" id="city" value="도시 선택">
</body>
</html>