//package
package a.b.c.ch3;
//import
import java.util.Scanner;
/*
패키지 이름 : a.b.c.ch3;
클래스 이름 : ExFlow_Grade
함수 이름 : gradeFun
변수 : 점수 : int score
    : 학점 : char grade
Scanner 클래스, nextInt() 함수를 이용, 콘솔에 출력하기.

1. Scanner 클래스를 이용하는 방법.
2. Scanner 클래스를 이용하지 않는 방법.
*/
/* <등급 설정>
A 등급 : 90~100
B 등급 : 80~89
C 등급 : 70~79
D 등급 : 60~69
E 등급 : 50~59
F 등급 : 50 미만
*/

public class ExFlow_Grade {
	//상수
	//멤버변수
	//생성자
	
	//함수
	public void gradeFun(){
		
		System.out.println("점수가 몇 점인가요?");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		char grade;

		if (0 <= score && score <= 100)
		{
			if (score >= 90)
			{
				grade = 'A';
			}else if(score >= 80)
			{
				grade = 'B';
			}else if(score >= 70)
			{
				grade = 'C';
			}else if(score >= 60)
			{
				grade = 'D';
			}else if(score >= 50)
			{
				grade = 'E';
			}else{
				grade = 'F';
			}
			System.out.println("당신은 " + grade + "입니다.");
		}else {
			System.out.println("이 점수 실화냐..?");
		}
	}

	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		//TODO Auto-generated method stub.
		
		ExFlow_Grade eg = new ExFlow_Grade();
		eg.gradeFun();
	}
}
