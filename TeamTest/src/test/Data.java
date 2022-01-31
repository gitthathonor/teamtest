package test;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.io.BufferedReader;
import java.io.IOException;

public class Data {
public static void main(String[] args) throws IOException {

StringBuilder urlBuilder = new StringBuilder("http://api.kcisa.kr/openapi/service/rest/meta4/getKCPG0504"); /*URL*/
urlBuilder.append("?" + URLEncoder.encode("serviceKey","UTF-8") + "=21c5a413-0c0e-41ca-972c-ceb99bb6e848"); /*서비스키*/
urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("세션당 요청레코드수", "UTF-8")); /*세션당 요청레코드수*/
urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("페이지수", "UTF-8")); /*페이지수*/

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

}

}