package a.b.c.ch5;

public class Ex_Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 숫자를 출력하는 방법 4가지
		
		// Integer 타입
		Integer i0 = new Integer(100);
		System.out.println(i0);
		
		// Integer 타입
		Integer i1 = new Integer("100");
		System.out.println(i1);
		
		// int 타입
		int i2 = Integer.parseInt("100");
		System.out.println(i2);
		
		// int 타입
		int i3 = 100;
		System.out.println(i0);
		
		// Integer 타입 -> int 타입으로 변환
		int i0Val = i0.intValue();
		System.out.println(i0Val);
		
		int i1Val = i0.intValue();
		System.out.println(i1Val);
		
		// int 타입 -> Integer 타입으로 변환
		Integer i4 = Integer.valueOf(i3);
		System.out.println(i4);
	}
}
