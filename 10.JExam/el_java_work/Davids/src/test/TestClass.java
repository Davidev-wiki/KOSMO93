package test;

public class TestClass {
	
	// enum �׽�Ʈ
	enum Week {
		MON, TUE, WED, THU, FRI, SAT, SUN
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1���� �迭 �׽�Ʈ
		
		/*
		
		int[] i_array;
		i_array = new int[5];
		
		System.out.println("i_array ��� : " + i_array);
		System.out.println("i_array.length ��� : " + i_array.length);
		System.out.println("i_array.hashCode() ��� : " + i_array.hashCode());

		i_array[0] = 10;
		i_array[1] = 20;
		i_array[2] = 30;
		i_array[3] = 40;
		i_array[4] = 50;

		for (int i=0; i < i_array.length; i++) {
			System.out.println("i_array�迭�� " + i + "��° ���� " + i_array[i] + "�Դϴ�.");
		}
		
		for (int i=4; 0 <= i && i < i_array.length; i--) {
			System.out.println("i_array�迭�� " + i + "��° ���� " + i_array[i] + "�Դϴ�.");
		}
		
		*/
		
		
		
		// 2���� �迭 �׽�Ʈ
		
		int[][] i_array;
		i_array = new int[3][2];
		
		i_array[0][0] = 01; 
		i_array[0][1] = 02;
		i_array[1][0] = 10;
		i_array[1][1] = 11;
		i_array[2][0] = 20;
		i_array[2][1] = 21;
		
		int[][] j_array = {{0, 1, 2}, {3, 4, 5}};

		for (int i=0; i <= 2; i++) {
			for(int j=0; j <= 1; j++) {
				//System.out.println("i_array["+i+"]["+j+"] ��� : " + i_array[i][j]);
				System.out.println("j_array["+i+"]["+j+"] ��� : " + i_array[i][j]);
			}
		}
		
		// enum & switch
		System.out.println("enumerate week.sat : " + Week.SAT);
		Week nowWeek = Week.SAT;
		
		switch(nowWeek) {
			case MON:
				System.out.println("������ ������ �Դϴ�.");
				break;
			case TUE:
				System.out.println("������ ȭ���� �Դϴ�.");
				break;
			case WED:
				System.out.println("������ ������ �Դϴ�.");
				break;
			case THU:
				System.out.println("������ ����� �Դϴ�.");
				break;
			case FRI:
				System.out.println("������ �ݿ��� �Դϴ�.");
				break;
			case SAT:
				System.out.println("������ ����� �Դϴ�.");
				break;
			case SUN:
				System.out.println("������ �Ͽ��� �Դϴ�.");
				break;
			default:
				System.out.println("������ �Ͽ��� �Դϴ�.");
		}
		
		
		// while & do-while
		//int i=0;
		//while(i<10) {
		//	System.out.println("i : " + i);
		//	i++;
		//}
		
		//do {
		//	System.out.println("(do-while) i :" + i);
		//	i++;
		//} while(i<10);
		
		
		int[] sale = {157, 209, 251, 312};
		
		System.out.println("sale[0] : " + sale[0]);
		System.out.println("sale[1] : " + sale[1]);
		System.out.println("sale[2] : " + sale[2]);
		System.out.println("sale[3] : " + sale[3]);

		
		int[][] sales = {{63, 84, 140, 130}, {157, 209, 251, 312}};
		
		for (int i=0; i<2; i++) {
			for(int j=0; j<4; j++) {
				System.out.println("sales["+i+"]["+j+"] : " + sales[i][j]);
			}
		}
		
	}
}
