package a.b.c.ch7;

import java.util.Scanner;

public class Ex_IOTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("IO �׽�Ʈ ���� : ");
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();

		System.out.println("�Է��� ���� : " + data);
		System.out.println("2������ ��ȯ : " + Integer.toBinaryString(data));

		System.out.print("IO �׽�Ʈ ���� : ");
		Scanner sc1 = new Scanner(System.in);
		String dataS = sc1.nextLine();

		System.out.println("�Է��� ���� : " + dataS);

		for (int i = 0; i < dataS.length(); i++) {
			char c = dataS.charAt(i);
			System.out.println("2������ ��ȯ : " + c + " : " + (byte) c +  " : " + Integer.toBinaryString((byte) c));

		}

	}

}
