package a.b.c.ch6;

import java.util.Scanner;

public class Ex_Math_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Math.random() : 0.0 ~ 0.999 �� 1���� ��.
		// *10 �ϸ� 0~9����
		// *100 �ϸ� 0~99.9999����
		// 1���� 100���� �ϰ� ������ �Ʒ� �ڵ� ó��
		int answer = (int) (Math.random() * 100) + 1;
		System.out.println("1���� 100���� ���Ƿ� ���� �� : " + answer);

		int input = 0;
		int count = 0;

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.print("1~100���� �ƹ� ���̳� �Է��ϼ���. : ");
			count++;
			input = sc.nextInt();

			if (answer == input) {
				System.out.println("��~~" + i + "�� ���� ����!");
				break;
			} else if (answer < input) {
				System.out.println("�ٿ�~");
			} else if (answer > input) {
				System.out.println("��~");
			}

			if (count == 10) {
				System.out.println("�� �̻��� ��ȸ�� ����..  ���� : " + answer);
				break;
			}
		}
	}
}
