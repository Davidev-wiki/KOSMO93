package a.b.c.ch5;

import java.util.Date;

public class Ex_Date_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
		/*
		 * Date 클래스는 epoch시간 (이포크)을 리턴한다. 1970년 1월 1일 00:00:00시간을 기준으로 지나간 시간을
		 * millisecond로 반환한다.
		 */

		// 년
		// public int getYear()
		int year = d.getYear();
		System.out.println("Year : " + year);
		year = year + 1900;
		System.out.println("현재 년도는 getYear() + 1900을 해야 한다 : " + year);

		// 월
		// public int getMonth()
		int month = d.getMonth();
		System.out.println("\nMonth : " + month);
		month = month + 1;
		System.out.println("현재 월은 getMonth() + 1을 해야 한다 : " + month);

		// 일
		// public int getDate()
		int Date = d.getDate();
		System.out.println("\ngetDate() : " + Date);
		System.out.println("현재일은 잘 출력된다..");
		
		// 날짜 형식으로 표기
		String time = year + "." + month + "." + Date;
		System.out.println("time : " + time);

		time = time.replace('.', '-');
		System.out.println("time : " + time);

		time = time.replace('-', '/');
		System.out.println("time : " + time);

	}

}
