package a.b.c.ch5;

public class Ex_Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ���ڸ� ����ϴ� ��� 4����
		
		// Integer Ÿ��
		Integer i0 = new Integer(100);
		System.out.println(i0);
		
		// Integer Ÿ��
		Integer i1 = new Integer("100");
		System.out.println(i1);
		
		// int Ÿ��
		int i2 = Integer.parseInt("100");
		System.out.println(i2);
		
		// int Ÿ��
		int i3 = 100;
		System.out.println(i0);
		
		// Integer Ÿ�� -> int Ÿ������ ��ȯ
		int i0Val = i0.intValue();
		System.out.println(i0Val);
		
		int i1Val = i0.intValue();
		System.out.println(i1Val);
		
		// int Ÿ�� -> Integer Ÿ������ ��ȯ
		Integer i4 = Integer.valueOf(i3);
		System.out.println(i4);
	}
}
