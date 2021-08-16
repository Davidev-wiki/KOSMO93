//package
package a.b.c.ch3;
//import


/*
	ExData_5 클래스에서
	리턴형이 있고, static 키워드 없는 함수 addMethod()를 만들어서
	매개변수 int x, int y를 받아서
	더하기 결과를 return 키워드  결과 값으로 만들기

	메인함수에서 addMethod()에
	지역변수 int형 x, y를 선언한 후 10, 20으로 초기화 해서
	아규먼트로 전달해서
	int sum 지역 변수에 결과값을 대입해 콘솔에 출력하시오.

*/

public class  ExData_5 {
	//상수
	//멤버변수
	//생성자
	
	//함수 : 리턴형 O, static X
	public int addMethod(int x, int y) {
		System.out.println("ExData_5.addMethod() ---함수 시작!---");
		//더한 결과를 return값으로
		System.out.println("ExData_5.addMethod() ---함수 종료!---");
		return x + y;
		
		// int sum = x + y;
		// return sum;
	}
	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		//TODO Auto-generated method stub.
		System.out.println("ExData_5.addMethod() 시작!");
		// 지역 변수 초기화
		int x = 10;
		int y = 20;
		
		// static이 없으므로 ExData_5로 객체를 통해 호출
		//ExData_5 ed5 = new ExData_5();
		
		// 지역변수 int sum에 결과값 대입
		//int sum = ed5.addMethod(x, y);
		
		// 콘솔에 출력하기 1)
		//System.out.println(sum);

		// 호출 방법 2
		int sum1 = new ExData_5().addMethod(x, y);
		System.out.println(sum1);
	} //end of main

} //end of ExData_5
