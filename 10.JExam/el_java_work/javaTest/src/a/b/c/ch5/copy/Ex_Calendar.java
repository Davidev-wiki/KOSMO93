package a.b.c.ch5.copy;

import java.util.Calendar;

public class Ex_Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar cd = Calendar.getInstance();
		System.out.println("\nCalendar.getInstace의 값 : cd : " + cd);
		
		// 년
		int y = cd.get(Calendar.YEAR);
		System.out.println("\ncd.get(Calendar.YEAR)의 값 : " + y);
		System.out.println("Calendar.YEAR의 상수 값이 1이기 때문에 cd.get(1)도 같은 값이 나온다! : " + cd.get(1));
		
		// 월 
		int m = cd.get(Calendar.MONTH) + 1;
		System.out.println("\ncd.get(Calendar.MONTH)의 값 : " + m);
		System.out.println("(Calendar.MONTH의 상수값이 2이기 때문에 cd.get(2)도 같은 값이 나온다! 0부터 카운트되므로 +1을 더한다 : " + (cd.get(2)+1));		
		
		// 일 
		int d = cd.get(Calendar.DATE);
		System.out.println("\ncd.get(Calendar.DATE)의 값 : " + d);
		System.out.println("Calendar.DATE의 상수값이 5이기 때문에 cd.get(5)도 같은 값이 나온다! : " + cd.get(5));
		
		int d1 = cd.get(Calendar.DAY_OF_YEAR);
		System.out.println("cd.get(Calendar.DAY_OF_YEAR)의 값 : " + d1);
		System.out.println("cd.get(6) : " + cd.get(6));

		
		// 시
		int h1 = cd.get(Calendar.HOUR_OF_DAY); //24시간 표기법
		System.out.println("\nh1 (24시간표기법) : " + h1);
		System.out.println("cd.get(11) : " + cd.get(11));
		
		int h2 = cd.get(Calendar.HOUR); //12시간 표기법
		System.out.println("h2 시(12시간표기법) : " + h2);
		
		// 분
		int mm = cd.get(Calendar.MINUTE);
		System.out.println("mm분  : " + mm);
		System.out.println("cd.get(12) >>> : " + cd.get(12));
				
		// 초
		int s = cd.get(Calendar.SECOND);
		System.out.println("s초 : " + s);
		System.out.println("cd.get(13) >>> : " + cd.get(13));
				
		String time = "현재시간은 "
					+ y + "년 "
					+ m + "월 "
					+ d + "일 "
					+ h1 + "시 "
					+ mm + "분 "
					+ s + "초 입니다.";
		System.out.println("\ntime : \n" + time);

	}

}
