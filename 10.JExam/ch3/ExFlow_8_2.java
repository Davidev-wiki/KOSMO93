//package
package a.b.c.ch3;
//import


public class ExFlow_8_2
{
	//상수
	//멤버변수
	//생성자
	
	//함수

	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		//TODO Auto-generated method stub.

		// 2중 for 문 : 2차원 배열과 동일

		// 외부 for문
		for(int i = 0 ; i < 3 ; i++) 
		{	// 내부 for문
			System.out.println("----------------------");
			System.out.println("외부의 for i : " + i);
			System.out.println("----------------------");
			for(int j = 0 ; j < 3 ; j++) 
			{
				System.out.print("\n내부 for j : " + j);
			}
			System.out.println("\n");
		}
	}
}
