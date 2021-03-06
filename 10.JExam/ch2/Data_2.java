package a.b.c.ch2;

import java.lang.String;

/*
	String 클래스는 rt.jar에 java.lang.String으로 존재함
	a.b.c.ch2.Data_2 사용자 정의 클래스에서
	rt.jar에 있는 String클래스를 호출하려면?
	import 키워드 사용 >> import java.lang.String;

	But, 자바 문법에서 java.lang.* 패키지에 있는 클래스는
	사용 빈도가 많은 기초 클래스이기 때문에
	개발자가 사용자 정의 클래스를 만들면 기본적으로 import 된다.

	java.lang.* 패키지 외의 다른 패키지는
	반드시 import를 해야 한다.
*/

/*
	1. 이 사용자 정의 클래스를 패키지 밖에서도 호출하기 위해서 : public
	2. 이 사용자 정의 클래스를 일반 클래스로 선언 : class
	3. 이 사용자 정의 클래스의 이름은 : Data_2
*/
public class Data_2 {
		
		/*
			1. main 함수 : 이 클래스의 시작점
			2. public : 패키지 밖에서 호출하기
			3. static : main 함수를 메모리에 올려주세요(JVM)
			4. void : 메인 함수에 return 키워드 사용 불가 : 리턴 값이 없다.
			5. main : 메인 함수 : 자바에서 정해진 함수 이름 : 변경 불가
			6. () : main에 아규먼트가 들어오는 공간
			7. String : 빌트인 클래스
			8. [] : 배열 연산자
			9. args : 아규먼트 변수명 : 변경 가능한 부분.
		*/
		public static void main(java.lang.String[] args) {
				
				//콘솔에 출력 하시오
				System.out.println("main()함수는 프로그램의 시작점이다.");
				System.out.println("함수 블럭에서는 인터프리트 방식으로 수행된다.");
				System.out.println("자바 기초 자료형 배우기 시작 : ");
				
	} //end of main 함수

} //end of Data_2 클래스