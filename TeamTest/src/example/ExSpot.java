package example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;



@WebServlet
public class ExSpot extends HttpServlet {
	
	public ExSpot() {
		
	} // 생성자 하나 생성

	
	private static String getTagValue(String tag, Element eElement) {
		Node nValue = null;
		try {
	    NodeList nlList = eElement.getElementsByTagName(tag).item(0).getChildNodes();
	    nValue = (Node) nlList.item(0);
	    if(nValue == null) 
	        return null;
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("tag값이 없어요~");
		}
	    return nValue.getNodeValue();
	} //getTagValue 메서드!!!!! tag를 지정해서, element 값들을 출력시킬 수 있다.
	
	
	
	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		StringBuilder urlBuilder = new StringBuilder("http://api.visitkorea.or.kr/openapi/service/rest/KorService/areaBasedList"); /*URL*/
        urlBuilder.append("?" + URLEncoder.encode("serviceKey","UTF-8") + "=f47yx%2FsSVGp6fgmm1EYl9EdqbY1CJpRaAynHGwNF175VZlnJnQWS%2BJagCJYeUBERQ%2FZsEC%2BAYOxd432K%2FBmp4g%3D%3D"); /*Service Key*/
        urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*현재 페이지 번호*/
        urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("2", "UTF-8")); /*한 페이지 결과 수*/
        urlBuilder.append("&" + URLEncoder.encode("MobileApp","UTF-8") + "=" + URLEncoder.encode("AppTest", "UTF-8")); /*서비스명=어플명*/
        urlBuilder.append("&" + URLEncoder.encode("MobileOS","UTF-8") + "=" + URLEncoder.encode("ETC", "UTF-8")); /*IOS (아이폰), AND (안드로이드),WIN (원도우폰), ETC*/
        urlBuilder.append("&" + URLEncoder.encode("arrange","UTF-8") + "=" + URLEncoder.encode("A", "UTF-8")); /*(A=제목순, B=조회순, C=수정일순, D=생성일순) , 대표이미지가 반드시 있는 정렬 (O=제목순, P=조회순, Q=수정일순, R=생성일순)*/
        urlBuilder.append("&" + URLEncoder.encode("cat1","UTF-8") + "=" + URLEncoder.encode("", "UTF-8")); /*대분류 코드*/
        urlBuilder.append("&" + URLEncoder.encode("contentTypeId","UTF-8") + "=" + URLEncoder.encode("32", "UTF-8")); /*관광타입(관광지, 숙박 등) ID*/
        urlBuilder.append("&" + URLEncoder.encode("areaCode","UTF-8") + "=" + URLEncoder.encode("4", "UTF-8")); /*지역코드*/
        urlBuilder.append("&" + URLEncoder.encode("sigunguCode","UTF-8") + "=" + URLEncoder.encode("4", "UTF-8")); /*시군구코드(areaCode 필수)*/
        urlBuilder.append("&" + URLEncoder.encode("cat2","UTF-8") + "=" + URLEncoder.encode("", "UTF-8")); /*중분류 코드(cat1필수)*/
        urlBuilder.append("&" + URLEncoder.encode("cat3","UTF-8") + "=" + URLEncoder.encode("", "UTF-8")); /*소분류 코드(cat1,cat2필수)*/
        urlBuilder.append("&" + URLEncoder.encode("listYN","UTF-8") + "=" + URLEncoder.encode("Y", "UTF-8")); /*목록 구분 (Y=목록, N=개수)*/
        urlBuilder.append("&" + URLEncoder.encode("modifiedtime","UTF-8") + "=" + URLEncoder.encode("", "UTF-8")); /*콘텐츠 수정일*/
        URL url = new URL(urlBuilder.toString());
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Content-type", "application/json");
        System.out.println("Response code: " + conn.getResponseCode());
        BufferedReader rd;
        if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        } else {
            rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
        }
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = rd.readLine()) != null) {
            sb.append(line);
        }
        rd.close();
        conn.disconnect();
        System.out.println(sb.toString());
		
        //xml 데이터 parsing
        
        //1. parsing할 주소를 설정!(serviceKey까지 같이 설정)
        String path = url.toString();
        
        NodeList items = null;
        
//        String addr1 = "";
//        String areacode = "";
//        String mapx = "";
//        String mapy = "";
//        String title = "";
        
       
        
        //2. 페이지에 접근해줄 Document 객체 생성
        
        try {
        	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(path);
			
			// root tag
			doc.getDocumentElement().normalize();
			System.out.println("Root element : " + doc.getDocumentElement().getNodeName()); // Root element : response
			
			// 3. parsing할 정보가 있는 tag에 접근
			items = doc.getElementsByTagName("item");
			System.out.println("파싱할 리스트 수 : " + items.getLength());//파싱할 리스트 수 : 2
			
			// 4. list에 담긴 데이터 console에 출력
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
        
        ArrayList<SpotDTO> sArr = new ArrayList<>();
        
        
        for(int i=0; i<items.getLength(); i++) {
			Node nNode = items.item(i);
			if(nNode.getNodeType() == Node.ELEMENT_NODE) {
				
				Element eElement = (Element)nNode;
				SpotDTO sdto = new SpotDTO();
				sdto.setAddr1(getTagValue("addr1", eElement));
				sdto.setAreacode(getTagValue("areacode", eElement));
				sdto.setMapx(getTagValue("mapx", eElement));
				sdto.setMapy(getTagValue("mapy", eElement));
				sdto.setTitle(getTagValue("title", eElement));
				System.out.println("#############");
				System.out.println("주소 : " + getTagValue("addr1", eElement));
				System.out.println("지역코드 : " + getTagValue("areacode", eElement));
				System.out.println("x좌표 : " + getTagValue("mapx", eElement));
				System.out.println("y좌표 : " + getTagValue("mapy", eElement));
				System.out.println("장소 : " + getTagValue("title", eElement));
				sArr.add(sdto);
			}
		}
       
        request.setAttribute("sArr", sArr);
        
        
		RequestDispatcher dis
			= request.getRequestDispatcher("/spot.jsp");
		
		dis.forward(request, response);
		
	} //doGet메소드 생성
	
	
}
