package a.b.c.ch6;

import java.util.Scanner;

public class Ex_Math_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int answer = (int)(Math.random()*100) + 1;
		System.out.println(" answer >>> : " + answer);

		int input = 0;
		int count = 0;

		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		do{
			count++;
			System.out.println("1 과 100상의 값을 입력하세요 !!");
			
			input = sc.nextInt();
			
			if (answer > input){
				System.out.println("더 큰 수를 입력하세요 !! \n");
			}else if (answer < input){
				System.out.println("더 작은 수를 입력하세요 !!\n");
			}else{
				System.out.println("GOOD !!");	
				System.out.println("시도횟수는 " + count + " 번 입니다.");	
				break;
			}
		}
		while (true);
	}
}
