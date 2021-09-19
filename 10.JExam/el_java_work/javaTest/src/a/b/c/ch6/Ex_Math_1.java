package a.b.c.ch6;

import java.util.Scanner;

public class Ex_Math_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Math.random() : 0.0 ~ 0.999 중 1개의 수.
		// *10 하면 0~9까지
		// *100 하면 0~99.9999까지
		// 1부터 100까지 하고 싶으면 아래 코드 처럼
		int answer = (int) (Math.random() * 100) + 1;
		System.out.println("1부터 100까지 임의로 뽑은 값 : " + answer);

		int input = 0;
		int count = 0;

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.print("1~100까지 아무 값이나 입력하세요. : ");
			count++;
			input = sc.nextInt();

			if (answer == input) {
				System.out.println("오~~" + i + "번 만에 정답!");
				break;
			} else if (answer < input) {
				System.out.println("다운~");
			} else if (answer > input) {
				System.out.println("업~");
			}

			if (count == 10) {
				System.out.println("더 이상의 기회는 없다..  정답 : " + answer);
				break;
			}
		}
	}
}
