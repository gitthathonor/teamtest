package example;

public class SpotDTO {
	private String addr1;
	private String areacode;
	private String mapx;
	private String mapy;
	private String title;
	
	public String getAddr1() {
		return addr1;
	}
	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}
	public String getAreacode() {
		return areacode;
	}
	public void setAreacode(String areacode) {
		this.areacode = areacode;
	}
	public String getMapx() {
		return mapx;
	}
	public void setMapx(String mapx) {
		this.mapx = mapx;
	}
	public String getMapy() {
		return mapy;
	}
	public void setMapy(String mapy) {
		this.mapy = mapy;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	@Override
	public String toString() {
		return "SpotDTO [addr1=" + addr1 + ", areacode=" + areacode + ", mapx=" + mapx + ", mapy=" + mapy + ", title="
				+ title + "]";
	}
	
	
	

}
