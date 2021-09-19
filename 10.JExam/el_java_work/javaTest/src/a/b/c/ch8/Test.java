package a.b.c.ch8;

import java.util.Scanner;

public class Test {
	public static void muchine(String a) {
		if (a.length() < 2) {
			System.out.println(" >> 받아라 칭찬1");
		} else if (a.length() < 3 ){
			System.out.println(" >> 받아라 칭찬2");
		} else if (a.length() < 4 ){
			System.out.println(" >> 받아라 칭찬3");
		} else if (a.length() < 5 ){
			System.out.println(" >> 받아라 칭찬4");
		} else {
			System.out.println(" >> 받아라 칭찬5");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 칭찬해주는 프로그램
		
		// 사용자 입력 => 칭찬

		// 칭찬의 종류는 5개
		
		System.out.print("지금 기분이 어때요? : ");
		Scanner sc = new Scanner(System.in);
		String answer = sc.next();
		//String answer = args[0];
		System.out.println(answer + "?!?!");
		Test.muchine(answer);
	}

}
