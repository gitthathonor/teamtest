<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>도시 웹 크롤링 데이터 베이스 넣기 - test</title>
<script src="/js/jquery-3.6.0.js"></script>
<script type="text/javascript">
	/* $(document).ready(function() {

		$.ajax({
			url: './InserCityAction.tr',
			success: function(data) {
				alert("도시 데이터 들고오기 성공!");
				console.log(data);
			}
		});

	}); //jquery 구문 */
</script>
</head>
<body>
	<h1> 도시 정보 들고 와서 보여주기 </h1>
	
	<input type="button" value="정보 보고싶음" onclick="location.href='./InsertCityAction.tr'">
	
	도시 정보(1) <br>
	도시 코드 : ${cdto.cityCode } <br>
	도시 이름 : ${cdto.cityName } <br>
	도시 영문명 : ${cdto.cityEngName} <br>
	도시  설명 : ${cdto.cityInfo } 



</body>
</html>