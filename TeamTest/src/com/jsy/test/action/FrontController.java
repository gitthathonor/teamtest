package com.jsy.test.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FrontController extends HttpServlet {
	
	
	protected void doProcess(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("C : doProcess() 실행!");
		
		//1. 가상 주소 설정
		//2. 가상 주소 매핑
		//3. 페이지 이동
	}
	

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("C : doGet() 실행!");
		doProcess(request,response);
	}

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("C : doPost() 실행!");
		doProcess(request,response);
	}
	
}
