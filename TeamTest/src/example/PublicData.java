package example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
//import org.apache.cxf.helpers.IOUtils;
//import org.apache.cxf.io.CachedOutputStream;
//import org.json.simple.JSONObject;
 
/**
 * Servlet implementation class test
 */
@WebServlet("/PublicData.do")
public class PublicData extends HttpServlet {
    //private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PublicData() {
        super();
        // TODO Auto-generated constructor stub
    }
 
    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html; charset=utf-8");
        
        String addr = "http://api.visitkorea.or.kr/openapi/service/rest/KorService/areaCode?ServiceKey=";
        String serviceKey = "f47yx%2FsSVGp6fgmm1EYl9EdqbY1CJpRaAynHGwNF175VZlnJnQWS%2BJagCJYeUBERQ%2FZsEC%2BAYOxd432K%2FBmp4g%3D%3D";
        //String serviceRealKey = "f47yx%2FsSVGp6fgmm1EYl9EdqbY1CJpRaAynHGwNF175VZlnJnQWS%2BJagCJYeUBERQ%2FZsEC%2BAYOxd432K%2FBmp4g%3D%3D"
        String parameter = "";
//        serviceKey = URLEncoder.encode(serviceKey,"utf-8");
        PrintWriter out = response.getWriter();
        //parameter = parameter + "&" + "areaCode=1";
        parameter = parameter + "&" + "numOfRows=10";
        //parameter = parameter + "&" + "eventEndDate=20171231";
        parameter = parameter + "&" + "pageNo=1";
        parameter = parameter + "&" + "MobileOS=ETC";
        parameter = parameter + "&" + "MobileApp=AppTest";
        parameter = parameter + "&" + "areaCode=1";
        //parameter = parameter + "&" + "_type=json";
        
        
        addr = addr + serviceKey + parameter;
        URL url = new URL(addr);
        
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Content-type", "application/xml");
        
        
        
      //Buffer 보조 스트림 연결
		BufferedReader br;
		if(conn.getResponseCode() == 200) { //HttpURLConnection.getResponseCode() : HTTP 상태(응답) 코드 반환 (200, 404, 500 등)
			br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		} else {
			br = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
		}
		StringBuilder sb = new StringBuilder();
		String line;
		while((line = br.readLine()) != null) { // Buffer 보조 스트림의 readLine 이용. 더이상 읽어올게 없을때 까지
				// 판단과 저장을 한번에 하는 코드
			sb.append(line);
		}			
		br.close();
		conn.disconnect();
		
		
		
        /*InputStream in = url.openStream(); 
        CachedOutputStream bos = new CachedOutputStream();
        IOUtils.copy(in, bos);
        in.close();
        bos.close();
        
//        out.println(addr);
        
        String data = bos.getOut().toString();        
        out.println(data);*/
        
      /*  JSONObject json = new JSONObject();
        json.put("data", data);*/
    }
 
    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    /*protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html; charset=utf-8");
        
        String addr = "http://api.visitkorea.or.kr/openapi/service/rest/KorService/searchFestival?ServiceKey=";
        String serviceKey = "429e9l%2BRPBvvMYSqI0TIu0JgvFl1vio2dcUfXj7d66%2F%2B2glco1EDs1HDHJBssw9U7HAt1A11Cy6N0Hbk2INDfQ%3D%3D";
        String parameter = "";
//        serviceKey = URLEncoder.encode(serviceKey,"utf-8");
        PrintWriter out = response.getWriter();
        parameter = parameter + "&" + "areaCode=1";
        parameter = parameter + "&" + "eventStartDate=20170401";
        parameter = parameter + "&" + "eventEndDate=20171231";
        parameter = parameter + "&" + "pageNo=1&numOfRows=10";
        parameter = parameter + "&" + "MobileOS=ETC";
        parameter = parameter + "&" + "MobileApp=aa";
        parameter = parameter + "&" + "_type=json";
        
        
        addr = addr + serviceKey + parameter;
        URL url = new URL(addr);
        
        InputStream in = url.openStream(); 
        CachedOutputStream bos = new CachedOutputStream();
        IOUtils.copy(in, bos);
        in.close();
        bos.close();
        
//        out.println(addr);
        
        String data = bos.getOut().toString();        
        out.println(data);
        
        JSONObject json = new JSONObject();
        json.put("data", data);
        
    }*/
}

