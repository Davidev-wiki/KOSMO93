package test;

public class TestClass {

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
		
		
	}
}
