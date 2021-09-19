//package
package a.b.c.ch3;
//import
import java.util.Scanner;

/*조건
java.util.Scanner
1세 ~ 100세
age 조건이 60살 이상인 경우
'경로우대입니다.' '입장료는 0원 입니다.' 콘솔에 출력
*/

public class ExFlow_4_1
{
	//상수
	//멤버변수
	//생성자
	
	//함수

	// main() 함수 : 프로그램 시작점
	public static void main(String [] args) {
		//TODO Auto-generated method stub.
		
		int charge = 0;
		
		System.out.println("나이를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();

		if (0 <= age && age <= 100)
		{
			if (age >= 60)
			{
				charge = 0;
				System.out.println("경로 우대입니다");
			}else if (age < 8)
			{	
				charge = 2000;
				System.out.println("미취학 아동입니다");
			}else if (age < 14)
			{
				charge = 2500;
				System.out.println("초등학생 입니다");
			}else if (age < 20)
			{
				charge = 3000;
				System.out.println("중, 고등학생 입니다");
			}else 
			{
				charge = 5000;
				System.out.println("성인 입니다");
			}
			System.out.println("입장료는 "+ charge +"원 입니다.");
		}else {
			charge = 0;
			System.out.println("나이를 제대로 입력해주세요");
		}
	}
}
