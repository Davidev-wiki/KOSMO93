package a.b.c.ch6;

import java.util.Scanner;

public class Ex_Math_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int answer = (int) (Math.random() * 100) + 1;
		System.out.println("생성된 난수 : " + answer);

		int input = 0;
		int count = 0;

		@SuppressWarnings("resourse")
		Scanner sc = new Scanner(System.in);

		while (true) {
			count++;
			System.out.print("1~100사이의 값을 입력해보세요! : ");

			input = sc.nextInt();

			if (answer == input) {
				System.out.println("오~ 정답!!" + count + "번 만에 맞췄어요. 짝짝짝!!");
				break;
			} else if (answer < input) {
				System.out.println("down 입니다!");
			} else if (answer > input) {
				System.out.println("up 입니다!");
			}
		}
	}
}
