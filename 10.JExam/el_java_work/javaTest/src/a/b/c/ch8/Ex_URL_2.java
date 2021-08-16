package a.b.c.ch8;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class Ex_URL_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		// String urlStr =
		// "https://nid.naver.com/nidlogin.login?mode=form&url=https%3A%2F%2Fwww.naver.com";

		String urlStr = "https" // 프로토콜
				+ "://" // 프로토콜-경로 구분자
				+ "nid.naver.com" // ip or 도메인
				+ ":" // ip or 도메인 과 포트의 구분자
				+ "8080" // 포트
				+ "/nidlogin.login" // 웹 서버 경로
									// /nidlogin.login : 요청한 실제 파일 명
				+ "?" // 웹서버 경로와 Query String 구분자
				+ "mode=form" // Query String : key = value
				+ "&" // 쿼리 스트링 구분자
				+ "url=https%3A%2F%2Fwww.naver.com"; // Query String : key = value

		try {
			URL ur = new URL(urlStr);
			System.out.println(ur);
			System.out.println(ur.getProtocol());
			System.out.println(ur.getHost());
			System.out.println(ur.getPort());
			System.out.println(ur.getPath());
			System.out.println(ur.getQuery());
			System.out.println(ur.getFile());

			System.out.println(ur.openStream());

			BufferedReader br = new BufferedReader(new InputStreamReader(ur.openStream(), "UTF-8"));

			System.out.println(br);
			String inLine = "";

			while ((inLine = br.readLine()) != null) {
				System.out.println(inLine);
			}

			br.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
