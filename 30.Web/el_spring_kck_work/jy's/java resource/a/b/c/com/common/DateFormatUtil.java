package a.b.c.com.common;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

public abstract class DateFormatUtil {
	
	public static String ymdFormat() {
		System.out.println("DateFormatUtil :: ymdFormat 함수 진입 >> ");
		
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String sd = sdf.format(d);
		
		return sd;
	}// end of ymdFormat 함수
	
	public static String ymFormat() {
		System.out.println("DateFormatUtil :: ymFormat 함수 진입 >>");
		
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMM");
		String sd = sdf.format(d);
		
		return sd;
	}// end of ymFormat 함수
	
	public static String yFormat() {
		System.out.println("DateFormatUtil :: yFormat 함수 진입 >>");
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		String sd = sdf.format(d);
		
		return sd;
	}// end of yFormat 함수
	
	public static String ymdFormats(String ymdFlag) {
		System.out.println("DateFormatUtil :: ymdFormats 함수 진입 >>");
		
		String sd = "";
		Date d = new Date();
		
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
	}// end of ymdFormats 함수

}
