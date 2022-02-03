<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="js/jquery-3.6.0.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		$.ajax({
			url: 'festival.xml',
			success: function(data){
				alert("정보가져오기 성공!");
				console.log(data);
				
				$(data).find('item').each(function(){
					var addr1 = $(this).find('addr1').text();
					$('body').append("<h2>주소 : "+addr1+"</h2>");
				});
			}
		});
		
		
		$.ajax({
			url: 'picture.xml',
			success: function(data){
				alert("정보가져오기 성공!2");
				console.log(data);
				
				$(data).find('item').each(function(){
					var originimgurl = $(this).find('originimgurl').text();
					$('body').append("<img src='"+originimgurl+"'>");
				});
			}
		});
		
		
	}); // jquery 구문
	
	
	
	
	
	
	
</script>
<title>Insert title here</title>
</head>
<body>
	<h1>ajax 방식 연습중</h1>
	<h2>hello</h2>
	
	
	
</body>
</html>