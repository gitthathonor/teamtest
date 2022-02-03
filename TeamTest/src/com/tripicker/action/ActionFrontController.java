package com.tripicker.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ActionFrontController extends HttpServlet{

	protected void doProcess(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("F : doProcess() 호출");
		
		/////1. 가상 주소 계산/////
		
//		String requestURI = request.getRequestURI();
//		System.out.println("F : requestURI = " + requestURI);
//		String ctxPath = request.getContextPath();
//		System.out.println("F : ctxPath = " + ctxPath);
//		String command = requestURI.substring(ctxPath.length());
//		System.out.println("F : command = " + command);
//		
		/////1. 가상 주소 계산/////
		
		
		/////2. 가상 주소 매핑/////
//		Action action = null;
//		ActionForward forward = null;
//		
//		if(command.equals("/Main.trip")) {
//			System.out.println("F : /Main.trip 주소 호출!");
//		} //메인 페이지로 들어간다. (DB사용X -> /main/main.jsp 출력
//		
//		forward = new ActionForward();
//		forward.setPath("/main/main.jsp");
//		forward.setRedirect(false);
//		
		/////2. 가상 주소 매핑/////
		
		
		/////3. 페이지 이동/////
		
		/*if(forward != null) {
			
			if(forward.isRedirect()) { //true
				response.sendRedirect(forward.getPath());
				System.out.println("F : 페이지 주소 - " + forward.getPath());
				System.out.println("F : 페이지 이동(sendRedirect)");
			} else { // false
				RequestDispatcher dis =
						request.getRequestDispatcher(forward.getPath());
				dis.forward(request, response);
				System.out.println("F : 페이지 주소 - " + forward.getPath());
				System.out.println("F : 페이지 이동(forward)");
			}
			
		}
		System.out.println("F : 3. 페이지 이동 끝 \n\n\n");*/
		
		/////3. 페이지 이동/////
		
	}
	
	
	
	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("F : doGet() 호출");
		doProcess(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("F : doPost() 호출");
		doProcess(request, response);
	}
	
}
