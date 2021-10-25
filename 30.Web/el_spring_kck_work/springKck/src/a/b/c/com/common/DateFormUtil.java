package a.b.c.com.common;

import java.text.SimpleDateFormat;
import java.util.Date;

// 날짜의 형태를 만들어놓은 클래스.
// yyyy
// yyyyMM
// yyyyMMdd
public abstract class DateFormUtil {
	
	// yFormat() 함수 : yyyy
	public static String yFormat() {
		
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		String sd = sdf.format(d);
		
		System.out.println("return되는 sd의 값 >>> : " + sd);
		return sd;
	}
	
	// ymFormat() 함수 : yyyyMM
	public static String ymFormat() {
		
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMM");
		String sd = sdf.format(d);
		
		System.out.println("return되는 sd의 값 >>> : " + sd);
	
		return sd;
	}
	
	// ymdFormat() 함수
	public static String ymdFormat() {
		
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String sd = sdf.format(d);
		
		System.out.println("return되는 sd의 값 >>> : " + sd);
		
		return sd;
	}
	
	// ymdFormats() 함수
	// Flag에 따라 알맞은 함수의 결과값을 담아준다.
	public static String ymdFormats(String ymdFlag) {
		
		String sd = "";
		Date d = new Date();
		
		// parameter로 들어온 문자열이 "X"와 같으면,
		// 그에 알맞는 함수의 결과값을 변수에 넣어주기
		// N이 들어오면 값을 입력하지 않고 return
		if("D".equals(ymdFlag.toUpperCase())) {
			sd = new SimpleDateFormat("yyyyMMdd").format(d);
		}
		if("M".equals(ymdFlag.toUpperCase())) {
			sd = new SimpleDateFormat("yyyyMM").format(d);
		}
		if("Y".equals(ymdFlag.toUpperCase())) {
			sd = new SimpleDateFormat("yyyy").format(d);
		}
		if("N".equals(ymdFlag.toUpperCase())) {
			sd = "";
		}
		
		return sd;
	}
	
	public static void main(String[] args) {
		
	}
}
