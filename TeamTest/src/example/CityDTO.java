package example;

public class CityDTO {
	private int cityCode;
	private String cityName;
	private String cityEngName;
	private String cityInfo;
	private String cityImgUrl;
	
	public int getCityCode() {
		return cityCode;
	}
	public void setCityCode(int cityCode) {
		this.cityCode = cityCode;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getCityEngName() {
		return cityEngName;
	}
	public void setCityEngName(String cityEngName) {
		this.cityEngName = cityEngName;
	}
	public String getCityInfo() {
		return cityInfo;
	}
	public void setCityInfo(String cityInfo) {
		this.cityInfo = cityInfo;
	}
	public String getCityImgUrl() {
		return cityImgUrl;
	}
	public void setCityImgUrl(String cityImgUrl) {
		this.cityImgUrl = cityImgUrl;
	}
	
	@Override
	public String toString() {
		return "CityDTO [cityCode=" + cityCode + ", cityName=" + cityName + ", cityEngName=" + cityEngName
				+ ", cityInfo=" + cityInfo + ", cityImgUrl=" + cityImgUrl + "]";
	}
	
	
}
