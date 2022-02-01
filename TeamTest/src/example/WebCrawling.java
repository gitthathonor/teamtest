package example;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class WebCrawling {
	
	public static void main(String[] args) {
		String url = "https://travel.naver.com/domestic/08/summary";
		Document doc;
		try {
			doc = Jsoup.connect(url).get();
			
			Elements e1 = doc.getElementsByClass("text");
			
			
			System.out.println(e1.text());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
