//package
package a.b.c.ch3;
//import
import java.util.Scanner;

public class ExFlow_4_3 {
	//상수
	//멤버변수
	//생성자
	
	//함수
	public static void Operating() {
		System.out.println("연령별 요금 계산 프로그램입니다.");
		System.out.println("나이를 입력해주세요 : ");

		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		System.out.println("나이 : " + age);
		int charge = 0;
		if (0 < age && age < 101)
		{
			if (age < 8)
			{
				charge = 1000;
				System.out.println("미취학 아동입니다.");
			}else if (age < 14)
			{
				charge = 1500;
				System.out.println("초등학생 입니다.");
			}else if (age < 20)
			{
				charge = 2000;
				System.out.println("중,고등학생 입니다.");
			}else if (age < 60)
			{
				charge = 2500;
				System.out.println("일반인 입니다.");
			}else {
				System.out.println("경로 우대입니다.");
			}
			System.out.println("요금은 " + charge + "원 입니다.");
		} else {
			System.out.println("나이를 제대로 입력해주세요");
		}
	}
	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		//TODO Auto-generated method stub.

		ExFlow_4_3 ef = new ExFlow_4_3();
		ef.Operating();

	}
}
