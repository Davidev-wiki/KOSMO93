package a.b.c.ch5;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex_Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
		System.out.println("\nDateŸ�� ��ü d�� �� : " + d);
		System.out.println("��谡 ��Ÿ���� �ּҰ� : " + System.identityHashCode(d));
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		System.out.println("sdf : " + sdf);
		System.out.println("sdf : " + sdf.format(d));

		Date d1 = new Date();
		System.out.println("\nDateŸ�� ��ü d1�� �� : " + d1);
		System.out.println("��谡 ��Ÿ���� �ּҰ� : " + System.identityHashCode(d1));
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("sdf1 : " + sdf1);
		System.out.println("sdf1 : " + sdf.format(d1));

		Date d2 = new Date();
		System.out.println("\nDateŸ�� ��ü d2�� �� : " + d2);
		System.out.println("��谡 ��Ÿ���� �ּҰ� : " + System.identityHashCode(d2));
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("sdf2 : " + sdf2);
		System.out.println("sdf2 : " + sdf2.format(d2));
	}

}