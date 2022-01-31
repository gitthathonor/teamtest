<%@page import="java.sql.Date"%>
<%@page import="test.DatePlanDTO"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
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
	String startDate = request.getParameter("start_date");
	String endDate = request.getParameter("end_date");
	/* /* Date start_date = startDate.va	


	DatePlanDTO dto = new DatePlanDTO();	
	dto.setStart_date(startDate.va);


	// 1. 드라이버 로드
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	// 2. DB 연결
	Connection con
		= DriverManager.getConnection("jdbc:mysql://localhost:3306/practicedb","root","1234");
	
	// 3. sql구문 작성
	String sql = "insert into(start_date, end_date) values(?,?)";
	
	PreparedStatement pstmt
		= con.prepareStatement(sql);
	
	
	pstmt.setDate(1, dto.getStart_date());
	pstmt.setDate(2, dto.getEnd_date()); */
%>


시작날짜 : <%=startDate %>
도착날짜 : <%=endDate %>


</body>
</html>