//package
package a.b.c.ch3;
//import
import java.util.Scanner;

public class ExFlow_4
{
	//상수
	//멤버변수
	//생성자
	
	//함수

	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		//TODO Auto-generated method stub.

		System.out.println("나이를 입력해 주세요.");

		Scanner sc = new Scanner(System.in);

		int age = sc.nextInt();
		System.out.println("age의 값 : " + age);

		if(0 <= age && age <= 100)
		{
			if (age >= 8)
			{
				System.out.println("학교에 다닙니다.");
			}else{
				System.out.println("학교에 다니지 않습니다.");
			}
		}else{
			System.out.println("나이를 제대로 입력해주세요");
		}
	}
}
