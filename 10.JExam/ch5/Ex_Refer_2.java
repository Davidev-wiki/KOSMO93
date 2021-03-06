// package
package a.b.c.ch5;

// import


public class Ex_Refer_2
{
	// 상수 
	// 멤버변수
	// 생성자
	public Ex_Refer_2(){
		System.out.println("Ex_Refer_2() 생성자 >>> : ");
	}
	// 함수 
	public void referMethod(TestVO tvo_0
						  , TestVO tvo_1
						  , TestVO tvo_2
						  , TestVO tvo_3){
		System.out.println("\n >> Ex_Refer_2.referMethod()함수 시작합니다.");		
		System.out.println("\n referMethod 내에서 호출한 tvo_0의 값 : " + tvo_0);		
		System.out.println("\n referMethod 내에서 호출한 tvo_1의 값 : " + tvo_1);		
		System.out.println("\n referMethod 내에서 호출한 tvo_2의 값 : " + tvo_2);		
		System.out.println("\n referMethod 내에서 호출한 tvo_3의 값 : " + tvo_3);			
}


	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		
		System.out.println("\n 메인함수 시작합니다.!- \n");
		Ex_Refer_2 ef2 = new Ex_Refer_2();
		System.out.println("\nef2의 주소 값 : " + ef2);

		System.out.println("\n TestVO를 메모리에 올려 받은 주소값을 참조변수 tvo_0에 초기화 했습니다!- \n");

		//지역 변수, 참조자료형
		TestVO tvo_0 = new TestVO();
		System.out.println("\ntvo_0의 주소값 : " + tvo_0);

		TestVO tvo_1 = new TestVO();
		System.out.println("\ntvo_1의 주소값 : " + tvo_1);

		TestVO tvo_2 = new TestVO();
		System.out.println("\ntvo_2의 주소값 : " + tvo_2);
		
		TestVO tvo_3 = new TestVO();
		System.out.println("\ntvo_3의 주소값 : " + tvo_3);
		
		System.out.println("\n ef2참조변수를 이용, 함수에 4개의 아규먼트(tvo_0~3)를 넣어 호출합니다!- \n");
		
		ef2.referMethod(tvo_0, tvo_1, tvo_2, tvo_3);

		System.out.println("\n 메인함수 끝났습니다.!- \n");
	}
}
