package a.b.c.ch5.copy;

import java.util.Calendar;

public class Ex_Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar cd = Calendar.getInstance();
		System.out.println("\nCalendar.getInstace�� �� : cd : " + cd);
		
		// ��
		int y = cd.get(Calendar.YEAR);
		System.out.println("\ncd.get(Calendar.YEAR)�� �� : " + y);
		System.out.println("Calendar.YEAR�� ��� ���� 1�̱� ������ cd.get(1)�� ���� ���� ���´�! : " + cd.get(1));
		
		// �� 
		int m = cd.get(Calendar.MONTH) + 1;
		System.out.println("\ncd.get(Calendar.MONTH)�� �� : " + m);
		System.out.println("(Calendar.MONTH�� ������� 2�̱� ������ cd.get(2)�� ���� ���� ���´�! 0���� ī��Ʈ�ǹǷ� +1�� ���Ѵ� : " + (cd.get(2)+1));		
		
		// �� 
		int d = cd.get(Calendar.DATE);
		System.out.println("\ncd.get(Calendar.DATE)�� �� : " + d);
		System.out.println("Calendar.DATE�� ������� 5�̱� ������ cd.get(5)�� ���� ���� ���´�! : " + cd.get(5));
		
		int d1 = cd.get(Calendar.DAY_OF_YEAR);
		System.out.println("cd.get(Calendar.DAY_OF_YEAR)�� �� : " + d1);
		System.out.println("cd.get(6) : " + cd.get(6));

		
		// ��
		int h1 = cd.get(Calendar.HOUR_OF_DAY); //24�ð� ǥ���
		System.out.println("\nh1 (24�ð�ǥ���) : " + h1);
		System.out.println("cd.get(11) : " + cd.get(11));
		
		int h2 = cd.get(Calendar.HOUR); //12�ð� ǥ���
		System.out.println("h2 ��(12�ð�ǥ���) : " + h2);
		
		// ��
		int mm = cd.get(Calendar.MINUTE);
		System.out.println("mm��  : " + mm);
		System.out.println("cd.get(12) >>> : " + cd.get(12));
				
		// ��
		int s = cd.get(Calendar.SECOND);
		System.out.println("s�� : " + s);
		System.out.println("cd.get(13) >>> : " + cd.get(13));
				
		String time = "����ð��� "
					+ y + "�� "
					+ m + "�� "
					+ d + "�� "
					+ h1 + "�� "
					+ mm + "�� "
					+ s + "�� �Դϴ�.";
		System.out.println("\ntime : \n" + time);

	}

}
