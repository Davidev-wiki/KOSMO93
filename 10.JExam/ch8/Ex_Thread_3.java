package a.b.c.ch8;

import java.awt.FlowLayout;
import java.awt.Font;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;

// Digital TimeZone
// DigiTimeZone.java
public class Ex_Thread_3 extends JFrame implements Runnable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	// 상수 
	public static final int TIME_ZONE_0 = 0;
	public static final int TIME_ZONE_1 = 1;
	public static final int TIME_ZONE_2 = 2;
	public static final int TIME_ZONE_3 = 3;
	
	public static final int TIME_CITY_0 = 0;
	public static final int TIME_CITY_1 = 1;
	public static final int TIME_CITY_2 = 2;
	public static final int TIME_CITY_3 = 3;

	// 상수 배열 
	public static final String timeZone[] = {  "Asia/Seoul"
											  ,"America/New_York"
											  ,"Europe/Paris"
											  ,"Europe/London"};
	public static final String timeCity[] = {  "서울"
											  ,"뉴욕"
											  ,"파리"
											  ,"런던"};
	// 멤버 변수 : 은닉화 : eucapsulation
	private Thread thread;
	private JLabel label;
	private String timeZoneID;

	// 생성자 
	public Ex_Thread_3(String timeZoneID, String timeCity) {
		
		super(timeCity + " ::: 현재시간");
		this.timeZoneID = timeZoneID;
		
		setLayout(new FlowLayout()); //중앙정렬
		label = new JLabel();
		label.setFont(new Font("Serif", Font.PLAIN, 20));

		if (thread == null) {
			thread = new Thread(this);
			thread.start();
		}

		add(label);
		setBounds(100,100,400,100);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		// Asia/Seoul, America/New_York, Europe/Paris, Europe/London
		// String timeZoneID = "Europe/Paris";
		
		TimeZone tz = TimeZone.getTimeZone(this.timeZoneID);
		while(true) {
			Calendar cal = Calendar.getInstance(tz);

			String now = cal.get(Calendar.YEAR)+ "년" + 
						 (cal.get(Calendar.MONTH)+1) + "월"  +
						 cal.get(Calendar.DATE)+"일" + 
				         cal.get(Calendar.HOUR)+"시" + 
			             cal.get(Calendar.MINUTE) + "분" + 
				         cal.get(Calendar.SECOND)+ "초";  
			             //cal.get(Calendar.MILLISECOND) + "밀리세컨드";*/

			label.setText("::: " +now);

			try {
				Thread.sleep(1000); // 1초
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}		
	}

	public static void main(String[] args) {
		
		JFrame.setDefaultLookAndFeelDecorated(true);
		
		Scanner sc = new Scanner(System.in);
		System.out.println( "도시시간을 선택 하시오 \n"
		                   +"00 : 서울 \n"
						   +"01 : 뉴욕 \n"
						   +"02 : 파리 \n"
						   +"03 : 런던 \n");
		
		String zoneID = sc.next();
			
		if ("00".equals(zoneID)){
			System.out.println("서울 시간을 선택 했습니다. ");
			new Ex_Thread_3(Ex_Thread_3.timeZone[Ex_Thread_3.TIME_ZONE_0]
				               ,Ex_Thread_3.timeCity[0]);
		}
		if ("01".equals(zoneID)){
			System.out.println("뉴욕 시간을 선택 했습니다. ");
			new Ex_Thread_3(Ex_Thread_3.timeZone[Ex_Thread_3.TIME_ZONE_1]
					           ,Ex_Thread_3.timeCity[1]);
		}
		if ("02".equals(zoneID)){
			System.out.println("파리 시간을 선택 했습니다. ");
			new Ex_Thread_3(Ex_Thread_3.timeZone[Ex_Thread_3.TIME_ZONE_2]
					           ,Ex_Thread_3.timeCity[2]);
		}
		if ("03".equals(zoneID)){
			System.out.println("런던 시간을 선택 했습니다. ");
			new Ex_Thread_3(Ex_Thread_3.timeZone[Ex_Thread_3.TIME_ZONE_3]
					           ,Ex_Thread_3.timeCity[3]);
		}	
		
		sc.close();
	}
}
