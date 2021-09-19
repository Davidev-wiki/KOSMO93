package a.b.c.ch7;

import java.util.Scanner;

public class Ex_IOTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("IO 테스트 숫자 : ");
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();

		System.out.println("입력한 숫자 : " + data);
		System.out.println("2진수로 변환 : " + Integer.toBinaryString(data));

		System.out.print("IO 테스트 문자 : ");
		Scanner sc1 = new Scanner(System.in);
		String dataS = sc1.nextLine();

		System.out.println("입력한 문자 : " + dataS);

		for (int i = 0; i < dataS.length(); i++) {
			char c = dataS.charAt(i);
			System.out.println("2진수로 변환 : " + c + " : " + (byte) c +  " : " + Integer.toBinaryString((byte) c));

		}

	}

}
