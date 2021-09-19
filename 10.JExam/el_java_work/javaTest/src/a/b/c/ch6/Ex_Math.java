package a.b.c.ch6;

import java.text.DecimalFormat;

public class Ex_Math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// E : �ڿ��α��� ���� e�� �� : 2.718
		System.out.println("E : " + Math.E);

		// PI : �������� �� : 3.14159
		System.out.println("PI : " + Math.PI);

		// max : ū ��
		int max = Math.max(2, 2);
		System.out.println("max : " + max);
		
		// min : ���� ��
		int min = Math.min(5, 4);
		System.out.println("min : " + min);
	
		// random() : 0.0 ~ 0.9 ������ ���� ����
		double random = Math.random(); // �Լ� -> Ŭ���� ���׷��̵� ���� java.util.Random
		System.out.println("random : " + random);
		
		// abs() : ���밪 (-, + ��ȣ��Ʈ ����)
		int abs = Math.abs(-10);
		System.out.println("abs : " + abs);
		
		// round : �Ҽ��� ù ��° �ڸ� �ݿø�
		System.out.println("\nround==============================\n");
		double round = Math.round(1.12345);
		System.out.println("round : " + round);
		double d = 3.123456789;
		System.out.println("Math.round(d) : " + Math.round(d));
		System.out.println("Math.round(d*100)/100.0 : " + Math.round(d*100)/100.0);
		System.out.println("Math.round(d*1000)/1000.0 >>> : " + Math.round(d*1000)/1000.0);
		System.out.println("Math.round(d*1000000)/1000000.0 >>> : " + Math.round(d*1000000)/1000000.0);
		System.out.println("String.format(\"%.2f\", d) >>> : " + String.format("%.2f", d));
		System.out.println("String.format(\"%.3f\", d) >>> : " + String.format("%.3f", d));
		System.out.println("String.format(\"%.5f\", d) >>> : " + String.format("%.5f", d));
		
		DecimalFormat df = new DecimalFormat();
		System.out.println("\n DecimalFormat ���� : " + df.format(1.234567));
		System.out.println("\n======================================\n");

		// ceil �ø�
		double ceil = Math.ceil(10.1);
		System.out.println("ceil : " + ceil);

		// floor ����
		double floor = Math.floor(10.9);
		System.out.println("floor : " + floor);
		
		// pow (A, B) A�� B���� ���
		double pow = Math.pow(5, 2);
		System.out.println("pow : " + pow);
	}

}
