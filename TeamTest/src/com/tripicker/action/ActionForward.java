package com.tripicker.action;

public class ActionForward {
	private String path; //이동 정보
	private boolean isRedirect; //페이지 이동방식 - true : sendRedirect방식, false : forward방식
	
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public boolean isRedirect() { //get메서드와 같다. boolean 타입의 getter는 is로 받는다.
		return isRedirect;
	}
	public void setRedirect(boolean isRedirect) {
		this.isRedirect = isRedirect;
	}
	
	@Override
	public String toString() {
		return "ActionForward [path=" + path + ", isRedirect=" + isRedirect + "]";
	}
	
	
	
}
