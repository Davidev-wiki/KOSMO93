package a.b.c.ch6;

import java.text.DecimalFormat;

public class Ex_Math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// E : 자연로그의 밑인 e의 값 : 2.718
		System.out.println("E : " + Math.E);

		// PI : 원주율의 값 : 3.14159
		System.out.println("PI : " + Math.PI);

		// max : 큰 값
		int max = Math.max(2, 2);
		System.out.println("max : " + max);
		
		// min : 작은 값
		int min = Math.min(5, 4);
		System.out.println("min : " + min);
	
		// random() : 0.0 ~ 0.9 사이의 난수 생성
		double random = Math.random(); // 함수 -> 클래스 업그레이드 버전 java.util.Random
		System.out.println("random : " + random);
		
		// abs() : 절대값 (-, + 부호비트 제거)
		int abs = Math.abs(-10);
		System.out.println("abs : " + abs);
		
		// round : 소수점 첫 번째 자리 반올림
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
		System.out.println("\n DecimalFormat 포맷 : " + df.format(1.234567));
		System.out.println("\n======================================\n");

		// ceil 올림
		double ceil = Math.ceil(10.1);
		System.out.println("ceil : " + ceil);

		// floor 내림
		double floor = Math.floor(10.9);
		System.out.println("floor : " + floor);
		
		// pow (A, B) A의 B제곱 계산
		double pow = Math.pow(5, 2);
		System.out.println("pow : " + pow);
	}

}
