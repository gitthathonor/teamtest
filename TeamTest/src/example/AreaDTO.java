package example;

public class AreaDTO {
	private int areaCode;
	private String areaName;
	private String areaEngName;
	private String imgUrl;
	private String areaInfo;
	
	public int getAreaCode() {
		return areaCode;
	}
	public void setAreaCode(int areaCode) {
		this.areaCode = areaCode;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	public String getAreaEngName() {
		return areaEngName;
	}
	public void setAreaEngName(String areaEngName) {
		this.areaEngName = areaEngName;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public String getAreaInfo() {
		return areaInfo;
	}
	public void setAreaInfo(String areaInfo) {
		this.areaInfo = areaInfo;
	}
	
	@Override
	public String toString() {
		return "AreaDTO [areaCode=" + areaCode + ", areaName=" + areaName + ", areaEngName=" + areaEngName + ", imgUrl="
				+ imgUrl + ", areaInfo=" + areaInfo + "]";
	}
	
	
}
