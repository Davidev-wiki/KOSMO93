package a.b.c.ch5.copy;

public class Ex_String_2 extends java.lang.Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���ڿ��� ���� ���
		// ��Ʈ�� Ŭ���� ���ڿ� �� �Լ� equals()
		String s1 = "abc";
		String s2 = "abc";

		System.out.println("String s1 ��� : " + s1);
		System.out.println("String s2 ��� : " + s2);
		System.out.println("System.identityHashCode(s1) ��� : " + System.identityHashCode(s1));
		System.out.println("System.identityHashCode(s2) ��� : " + System.identityHashCode(s2));

		boolean b = s1.equals(s2);
		System.out.println("b >>> : " + b);
		if (b) {
			System.out.println("b�� true�� �� ��µǴ� ����!");
		}
		System.out.println("\n");

		boolean b1_1 = s1 == s2;
		System.out.println("b1_1, s1 == s2 �� �ּҰ��� ���� ��  : " + b1_1);

		System.out.println("\n");

		// ���ڿ��� �ٸ����
		String ss1 = "abcd";
		String ss2 = "abcde";
		System.out.println("String ss1�� String ss2 ���ڿ��� ���� ����� 'b1'�� �ʱ�ȭ");
		boolean b1 = ss1.equals(ss2);
		System.out.println("b1 �� �� : " + b1);

		System.out.println("\n");

		String s3 = new String("abc");
		String s4 = new String("abc");

		System.out.println("new String(\"abc\")���� ���� ���� ��ü�� ���� s3 >>> : " + s3);
		System.out.println("new String(\"abc\")���� ���� ���� ��ü�� ���� s4 >>> : " + s4);
		System.out.println("System.identityHashCode(s3) >>> : " + System.identityHashCode(s3));
		System.out.println("System.identityHashCode(s4) >>> : " + System.identityHashCode(s4));

		boolean b2 = s3.equals(s4);
		System.out.println("\ns3�� s4�� ���ڿ��� ���� b2 ������ �ʱ�ȭ �� �� : " + b2);

		boolean b2_1 = s3 == s4;
		System.out.println("\ns3�� s4�� �ּ� ���� ���� b2_1�� �ʱ�ȭ �� �� >>> : " + b2_1);

	}

}
