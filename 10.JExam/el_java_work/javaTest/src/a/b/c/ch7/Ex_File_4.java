package a.b.c.ch7;

import java.util.Scanner;

public class Ex_File_4 {

	public static int factorial (int n) {
		
		if(n > 0) {
			System.out.println(n-1);
			return n* factorial(n-1);
			
		}else {
			return 1;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하셍 : ");
		int i = sc.nextInt();
		
		System.out.println(i + "팩토리얼의 값은 " + Ex_File_4.factorial(i) + "입니다.");
		
	}

}
