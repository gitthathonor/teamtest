<%@page import="java.util.ArrayList"%>
<%@page import="example.CityDAO"%>
<%@page import="example.CityDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		request.setCharacterEncoding("UTF-8");
	
		CityDTO cdto = new CityDTO();
		CityDAO cdao = new CityDAO();
		
		cdao.insertCity(cdto);
		
		ArrayList<CityDTO> cdtoArr = cdao.getCityArr();
		
		request.setAttribute("arr", cdtoArr);
		
		response.sendRedirect("../main/main.jsp");
	
	%>
</body>
</html>