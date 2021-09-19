package a.b.c.ch6;

import java.util.Scanner;

public class Ex_Exception_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("main함수 시작합니다! -");
		System.out.print("콘솔에 데이터를 입력하세요 -> ");
		Scanner sc = new Scanner(System.in);

		try {

			int x = sc.nextInt();
			System.out.println("입력한 데이터 x = " + x);
			int y = sc.nextInt();
			System.out.println("입력한 데이터 y = " + y);
			int z = x / y;
			System.out.println("나누기 연산 결과 = " + x + " / " + y + " = " + z);

		} catch (Exception e) {
			System.out.println("오류 발생! : " + e.getMessage());
		} finally {
			System.out.println("finally, 에러 나도 괜찮아! 고치면 되니까~");
		}

		System.out.println("main함수 종료! -");
	}

}
