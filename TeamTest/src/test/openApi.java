package test;

/* Java Sample */
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.io.BufferedReader;
import java.io.IOException;

public class openApi {
	public static void main(String[] args) throws IOException {

		StringBuilder urlBuilder = new StringBuilder("http://api.visitkorea.or.kr/openapi/service/rest/KorService/areaBasedList"); /* URL */
		urlBuilder.append("?" + URLEncoder.encode("serviceKey", "UTF-8") + "=ArR8oi9IW8Fgoa1%2FpDbfgOJYnLiyLD8B6g1v3SPvFROJP%2FGJcI4VsxgUxQfVJaWDVCs7oLZvLHbfPp6UxN3AUg%3D%3D"); /* 서비스키 */
		urlBuilder.append("&" + URLEncoder.encode("numOfRows", "UTF-8") + "="
				+ URLEncoder.encode("세션당 요청레코드수", "UTF-8")); /* 세션당 요청레코드수 */
		urlBuilder.append(
				"&" + URLEncoder.encode("pageNo", "UTF-8") + "=" + URLEncoder.encode("페이지수", "UTF-8")); /* 페이지수 */

		URL url = new URL(urlBuilder.toString());
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();

		conn.setRequestMethod("GET");
		conn.setRequestProperty("Content-type", "application/json");
		System.out.println("Response code: " + conn.getResponseCode());

		BufferedReader rd;
		if (conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {

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
