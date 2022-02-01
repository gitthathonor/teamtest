<%@page import="example.AreaDAO"%>
<%@page import="example.AreaDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>AreaForm.jsp</title>
</head>
<body>
	<%
		request.setCharacterEncoding("UTF-8");
		
		AreaDTO dto = new AreaDTO();
		AreaDAO dao = new AreaDAO();
			
		dao.insertArea(dto);
	%>
	
</body>
</html>