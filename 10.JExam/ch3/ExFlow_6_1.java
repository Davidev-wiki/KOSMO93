//package
package a.b.c.ch3;
//import


public class ExFlow_6_1 {
	//상수
	//멤버변수
	//생성자
	
	//함수
	public static void numSum() {
		
		System.out.println("numSum()함수 시작");

		int num = 1;

		num += 2;
		num += 3;
		num += 4;
		num += 5;
		num += 6;
		num += 7;
		num += 8;
		num += 9;
		num += 10;

		System.out.println("1부터 10까지의 합 : " + num);

	}
	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		//TODO Auto-generated method stub.
		System.out.println("\n[----- ExFlow_6_1.main()함수 시작 -----]");
		System.out.println("\n[ExFlow_6_1.numSum() 함수를 호출합니다.]");
		ExFlow_6_1.numSum();
		System.out.println("\n[ExFlow_6_1.numSum() 함수 실행 완료, 함수를 종료합니다.]");
		System.out.println("\n-----------------------------\n");
		System.out.println("\n[방법 2(while반복문) 실행]");
		
		int num = 1;
		int sum = 0;

		while (num <= 100)
		{
			sum += num;
			num++;
		}
		System.out.println("\n1부터 100까지의 합 : " + sum);
		System.out.println("\n-----------------------------\n");
		System.out.println("\n[방법 2(while반복문) 실행 완료 후 종료]\n");
		System.out.println("\n-----------------------------\n");
		System.out.println("[방법 3(do-while문) 실행 시작]");

		int num1 = 1;
		int sum1 = 0;

		do
		{
			sum1 += num1;
			num1++;
		}
		while (num1 <= 500);
		System.out.println("\n1부터 500까지의 합 : " + sum1);
		System.out.println("\n[방법 3(do-while문) 실행 종료]");
		System.out.println("\n-----------------------------\n");
		System.out.println("\n[----- ExFlow_6_1.main()함수 종료 -----]");
	
	}
}
