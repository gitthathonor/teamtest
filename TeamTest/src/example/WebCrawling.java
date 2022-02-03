package example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class WebCrawling {

	public static void main(String[] args) {
		try {
			for (int i = 1; i < 10; i++) {
				String url = "https://travel.naver.com/domestic/0" + i + "/summary";

				Document doc;

				doc = Jsoup.connect(url).get();

				Elements areaName = doc.getElementsByClass("name-Xm7WQ");
				Elements areaEngName = doc.getElementsByClass("nameEn-33oNZ");
				Elements areaInfo = doc.getElementsByClass("text");
				Elements cityImgUrl = doc.getElementsByClass("img-zsxw2");

				System.out.println(areaName.text());
				System.out.println(areaEngName.text());
				System.out.println(areaInfo.text());
				System.out.println(cityImgUrl.text());
			}
			
			for (int i = 10; i < 18; i++) {
				String url = "https://travel.naver.com/domestic/" + i + "/summary";

				Document doc;

				doc = Jsoup.connect(url).get();

				Elements areaName = doc.getElementsByClass("name-Xm7WQ");
				Elements areaEngName = doc.getElementsByClass("nameEn-33oNZ");
				Elements areaInfo = doc.getElementsByClass("text");
				//Elements cityImgUrl = doc.getElementsByClass("figure-3ftWB");

				System.out.println(areaName.text());
				System.out.println(areaEngName.text());
				System.out.println(areaInfo.text());
				//System.out.println(cityImgUrl.text());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
