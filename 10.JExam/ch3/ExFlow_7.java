package a.b.c.ch3;

//import


public class ExFlow_7 
{
	//상수
	//멤버변수
	//생성자
	
	//함수

	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		//TODO Auto-generated method stub.

		int i = 0;
		int sum = 0;

		for (i = 1; i <= 10 ; i++ )
		{
			System.out.println("현재 i의 값 : " + i);
			sum += i;
			System.out.println("현재까지 sum의 값 : " + sum);
		}

		System.out.println("\n\n[1부터 10까지의 합] : " + sum);
		System.out.println("\n종료될 때 i의 값 : " + i);
	}
}
