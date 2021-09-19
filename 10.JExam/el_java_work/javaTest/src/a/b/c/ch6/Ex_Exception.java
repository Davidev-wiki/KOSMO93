package a.b.c.ch6;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int arr[] = new int[3];
			for (int i=0; i <= arr.length; i++) {
				System.out.println(i +"번 째 순서의 값은 "+ arr[i] +"이다.");
			}
		}catch(ArrayIndexOutOfBoundsException a) {
			
			System.out.println("\n경고 : ArrayIndexOutOfBoundsException 에러 발생함! :" + a.getMessage());	
		}catch(Exception e) {
			System.out.println("\n경고 : Exception 에러 발생함! : " + e.getMessage());
		}
		
		
		System.out.println("\n------------------------------------------\n");
		
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat();
		String date = sdf.format(d);
		System.out.println("date : " + date);
		
		System.out.println("date :" + new SimpleDateFormat().format(new Date()));
		
	}

}
