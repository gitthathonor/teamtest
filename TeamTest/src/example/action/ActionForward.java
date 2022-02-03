package example.action;

public class ActionForward {
	
	private String path;
	private boolean isRedirect; // true면 redirect, false면 forward
	
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public boolean isRedirect() {
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
