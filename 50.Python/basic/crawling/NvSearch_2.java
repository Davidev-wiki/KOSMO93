package a.b.c.com.crawling;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
	

public class NvSearch_2 {

	public static void main(String[] args) {
    // TODO Auto-generated method stub
   
        String clientId = "gzyPKhIbCBIraUul2B6D"; //애플리케이션 클라이언트 아이디값"
        String clientSecret = "rkWwRpBy99"; //애플리케이션 클라이언트 시크릿값"
    
        System.out.println("검색어를 입력하시오.  >>> : ");
        Scanner sc = new Scanner(System.in);
        String searchStr = sc.next();
               
        String text = null;
        try {
            text = URLEncoder.encode(searchStr, "UTF-8");
        } catch (Exception e) {
            System.out.println("검색어 인코딩 실패  >>> : " + e);
        }

        String apiURL = "https://openapi.naver.com/v1/search/news?query=" + text;    // json 결과
        //String apiURL = "https://openapi.naver.com/v1/search/blog.xml?query="+ text; // xml 결과

        Map<String, String> requestHeaders = new HashMap<>();
        requestHeaders.put("X-Naver-Client-Id", clientId);
        requestHeaders.put("X-Naver-Client-Secret", clientSecret);
        String responseBody = get(apiURL,requestHeaders);

        System.out.println("검색어 : " + searchStr + " 뉴스 검색 최신순 검색 결과 값 출력 >>> :");
        System.out.println(responseBody);
        
        // 파일로 저장하기 
	        // JSON
	        // XML
        // 데이터베이스에 인서트 하기
        	// 오라클에 인서트 하기
    		// JSON, XML
    }


    private static String get(String apiUrl, Map<String, String> requestHeaders){
        
    	HttpURLConnection con = connect(apiUrl);
        
        try {
            con.setRequestMethod("GET");
           
            for(Map.Entry<String, String> header :requestHeaders.entrySet()) {
                con.setRequestProperty(header.getKey(), header.getValue());
            }


            int responseCode = con.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) { // 정상 호출
                return readBody(con.getInputStream());
            } else { // 에러 발생
                return readBody(con.getErrorStream());
            }
        } catch (Exception e) {
            throw new RuntimeException("API 요청과 응답 실패", e);
        } finally {
            con.disconnect();
        }
    }


    private static HttpURLConnection connect(String apiUrl){
        
    	try {
            URL url = new URL(apiUrl);
            return (HttpURLConnection)url.openConnection();
        } catch (Exception e) {
            throw new RuntimeException("연결이 실패했습니다. : " + apiUrl, e);
        }
    }


    private static String readBody(InputStream body){
        InputStreamReader streamReader = new InputStreamReader(body);


        try (BufferedReader lineReader = new BufferedReader(streamReader)) {
            StringBuilder responseBody = new StringBuilder();


            String line;
            while ((line = lineReader.readLine()) != null) {
                responseBody.append(line);
            }


            return responseBody.toString();
        } catch (IOException e) {
            throw new RuntimeException("API 응답을 읽는데 실패했습니다.", e);
        }
    }
}
