package a.b.c.ch8;

import java.util.Scanner;

public class Test {
	public static void muchine(String a) {
		if (a.length() < 2) {
			System.out.println(" >> �޾ƶ� Ī��1");
		} else if (a.length() < 3 ){
			System.out.println(" >> �޾ƶ� Ī��2");
		} else if (a.length() < 4 ){
			System.out.println(" >> �޾ƶ� Ī��3");
		} else if (a.length() < 5 ){
			System.out.println(" >> �޾ƶ� Ī��4");
		} else {
			System.out.println(" >> �޾ƶ� Ī��5");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Ī�����ִ� ���α׷�
		
		// ����� �Է� => Ī��

		// Ī���� ������ 5��
		
		System.out.print("���� ����� ���? : ");
		Scanner sc = new Scanner(System.in);
		String answer = sc.next();
		//String answer = args[0];
		System.out.println(answer + "?!?!");
		Test.muchine(answer);
	}

}
