//package
package a.b.c.ch3;
//import

public class ExFlow_3 
{
	//상수
	//멤버변수
	//생성자
	
	//함수

	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		//TODO Auto-generated method stub.
		
		int age = 9;
		int charge = 0;

		if (age < 8)
		{
			charge = 1000;
			System.out.println("미취학 아동");
		}
		else if (age < 14)
		{
			charge = 2000;
			System.out.println("초딩입니다");
		}
		else if (age < 20)
		{
			charge = 2000;
			System.out.println("중, 고등학생입니다");
		}
		else {
			charge = 3000;
			System.out.println("초딩");
		}
		System.out.println("입장료는 "+ charge +"원 입니다.");
	}
}
