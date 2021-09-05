package test;

public class TestClass {
	
	// enum 테스트
	enum Week {
		MON, TUE, WED, THU, FRI, SAT, SUN
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1차원 배열 테스트
		
		/*
		
		int[] i_array;
		i_array = new int[5];
		
		System.out.println("i_array 출력 : " + i_array);
		System.out.println("i_array.length 출력 : " + i_array.length);
		System.out.println("i_array.hashCode() 출력 : " + i_array.hashCode());

		i_array[0] = 10;
		i_array[1] = 20;
		i_array[2] = 30;
		i_array[3] = 40;
		i_array[4] = 50;

		for (int i=0; i < i_array.length; i++) {
			System.out.println("i_array배열의 " + i + "번째 값은 " + i_array[i] + "입니다.");
		}
		
		for (int i=4; 0 <= i && i < i_array.length; i--) {
			System.out.println("i_array배열의 " + i + "번째 값은 " + i_array[i] + "입니다.");
		}
		
		*/
		
		
		
		// 2차원 배열 테스트
		
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
				//System.out.println("i_array["+i+"]["+j+"] 출력 : " + i_array[i][j]);
				System.out.println("j_array["+i+"]["+j+"] 출력 : " + i_array[i][j]);
			}
		}
		
		// enum & switch
		System.out.println("enumerate week.sat : " + Week.SAT);
		Week nowWeek = Week.SAT;
		
		switch(nowWeek) {
			case MON:
				System.out.println("오늘은 월요일 입니다.");
				break;
			case TUE:
				System.out.println("오늘은 화요일 입니다.");
				break;
			case WED:
				System.out.println("오늘은 수요일 입니다.");
				break;
			case THU:
				System.out.println("오늘은 목요일 입니다.");
				break;
			case FRI:
				System.out.println("오늘은 금요일 입니다.");
				break;
			case SAT:
				System.out.println("오늘은 토요일 입니다.");
				break;
			case SUN:
				System.out.println("오늘은 일요일 입니다.");
				break;
			default:
				System.out.println("오늘은 일요일 입니다.");
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
