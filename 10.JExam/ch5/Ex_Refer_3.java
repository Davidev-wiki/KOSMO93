//package
package a.b.c.ch5;
//import


public class Ex_Refer_3
{
	//상수
	//멤버변수
	//생성자
	public Ex_Refer_3(){
		
	}
	//함수
	public void referMethod(TestVO tvo) {
		System.out.println("\n===== Ex_Refer_3.referMethod 함수 시작! =====\n");
		System.out.println("referMethod 함수 내에서 tvo 의 값 : " + tvo);
		System.out.println("referMethod 함수 내에서 tvo.getSval 의 값 : " + tvo.getSval());
		System.out.println("referMethod 함수 내에서 tvo.getIval 의 값 : " + tvo.getIval());
	}
	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		//TODO Auto-generated method stub.

		System.out.println("\n>> 메인 함수 시작합니다-!\n");

		System.out.println("\n>> Ex_Refer_3 자신의 클래스를 인스턴스합니다-!\n");
		Ex_Refer_3 ef3 = new Ex_Refer_3();
		System.out.println("ef3의 주소 값 : " + ef3);
		
		// 지역 변수, 참조자료형
		System.out.println("\n========== 반복문 시작합니다-!==========\n");
		for (int i=0; i < 3; i++ )
		{
			TestVO tvo = new TestVO();
			System.out.println("\ntvo의 주소 값 : " + tvo);
			tvo.setSval("11_" + i);
			tvo.setIval("11__" + i);
			ef3.referMethod(tvo);
			System.out.println("\n****(총 실행 횟수 : " + (i + 1) + ")****\n");
		
		/* 참조변수 호출 테스트
		TestVO tvo = new TestVO();
		tvo.setSval("인자1");
		tvo.setIval("인자1");
		tvo.getSval();
		tvo.getIval();
		*/
		}
		System.out.println("\n========== 반복문 종료-!==========\n");
		System.out.println("\n>> 메인 함수 종료-!\n");
	}
}
