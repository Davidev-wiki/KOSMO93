//package
package a.b.c.ch5;
//import


public class Ex_String
{
	//���
	//�������
	//������
	
	//�Լ�

	// main() �Լ� : ���α׷� ������
	public static void main(String[] args) {
		//TODO Auto-generated method stub.
		System.out.println("\n------------------------------------------------------------------\n");
		// s : ��������, ��������
		String s = "abc";
		System.out.println("String s�� �� : " + s);
		System.out.println("String s�� �Լ��� �Ἥ ����� �� System.identityHashCode(s) : " + System.identityHashCode(s));
		
		// s1 : s�� ���� ��
		String s1 = "abc";
		System.out.println("String s1�� �� : " + s1);
		System.out.println("String s1�� �Լ��� �Ἥ ����� �� System.identityHashCode(s1) : " + System.identityHashCode(s1));

		System.out.println("\n------------------------------------------------------------------\n");

		// ���ڿ��� ���� 's'�� 's1' ��� ��谡 ����Ű�� �ּ��� ���� �����ѵ�, 
		// ss1�� ���� �ٸ� �����̹Ƿ� ���ο� �޸𸮸� �Ҵ��ϰ� ��.
		String ss1 = s + s1;
		System.out.println("String ss1�� �� : " + ss1);
		System.out.println("String ss1�� �Լ��� �Ἥ ����� �� System.identityHashCode(ss1) : " + System.identityHashCode(ss1));
		System.out.println("\n���ڿ��� ���� 's'�� 's1' ��� ��谡 ����Ű�� �ּ��� ���� �����ѵ�,");
		System.out.println("ss1�� ���� �ٸ� �����̹Ƿ� ���ο� �޸𸮸� �Ҵ��ϰ� ��.\n");	

		System.out.println("\n------------------------------------------------------------------\n");
	
		String s2 = "abcd";
		System.out.println("String s2�� �ּ� �� : " + s2);
		System.out.println("String s2�� �Լ��� �Ἥ ����� �� System.identityHashCode(s2) : " + System.identityHashCode(s2));
		

		String s3 = "abcd";
		System.out.println("String s3�� �ּ� �� : " + s3);
		System.out.println("String s3�� �Լ��� �Ἥ ����� �� System.identityHashCode(s3) : " + System.identityHashCode(s3));
	
		System.out.println("\n------------------------------------------------------------------\n");

		String s4 = new String("abc");
		System.out.println("\nString s4 = new String(\"abc\")�� �� : " + s4);
		System.out.println("String s4�� �Լ��� �Ἥ ����� �� System.identityHashCode(s4) : " + System.identityHashCode(s4));
		

		String s5 = new String("abc");
		System.out.println("\nString s5 = new String(\"abc\")�� �� : " + s5);
		System.out.println("String s5�� �Լ��� �Ἥ ����� �� System.identityHashCode(s5) : " + System.identityHashCode(s5));

		String s6 = new String("abcd");
		System.out.println("\nString s6 = new String(\"abcd\")�� �� : " + s6);
		System.out.println("String s6�� �Լ��� �Ἥ ����� �� System.identityHashCode(s6) : " + System.identityHashCode(s6));


		System.out.println("\n----------------------String ���ڿ� ���ϱ� ----------------------------\n");
		// + �����ڸ� ����ؼ� ���ڿ� ���� �� �ִ� : �̰��� �����϶�� �Ѵ�. 
		// public String concat(String str) : concat  �Լ� ����� �����Ѵ�. 
		String sss = "abc";
		String sss1 = "abc";
		String sss2 = sss + sss1; // ����
		System.out.println("sss2 >>> : " + sss2);
		String sss3 = sss.concat(sss1); // ���� 
		System.out.println("sss3 >>> : " + sss3);
		// String ���ڿ� ���ϱ� �� ���� StringBuffer, StringBuilder Ŭ���� ����� ���� �Ѵ�.
	}
}
