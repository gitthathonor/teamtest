package com.tripicker.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Action {
	//Model동작이 필요할 때, 사용하는 객체(DB에 접근이 필요할 때)
	
	// => execute메서드는 실행시 request, response를 전달받아서
		// 처리후에 ActionForward를 리턴하는 메서드
	public ActionForward execute(HttpServletRequest request,
			HttpServletResponse response) throws Exception;
}
