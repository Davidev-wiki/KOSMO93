package a.b.c.ch6;

import java.util.Scanner;

public class Ex_Math_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int answer = (int) (Math.random() * 100) + 1;
		System.out.println("������ ���� : " + answer);

		int input = 0;
		int count = 0;

		@SuppressWarnings("resourse")
		Scanner sc = new Scanner(System.in);

		while (true) {
			count++;
			System.out.print("1~100������ ���� �Է��غ�����! : ");

			input = sc.nextInt();

			if (answer == input) {
				System.out.println("��~ ����!!" + count + "�� ���� ������. ¦¦¦!!");
				break;
			} else if (answer < input) {
				System.out.println("down �Դϴ�!");
			} else if (answer > input) {
				System.out.println("up �Դϴ�!");
			}
		}
	}
}
