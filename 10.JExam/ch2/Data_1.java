package a.b.c.ch2;

public class Data_1 {

	public static void main(String[] args) {
		// 1. 멤버 필드에 값이 초기화되지 않은 변수 i 소환 테스트.
		//static이 없을 때 변수 i는 print함수로 가져올 수 없다_error
		//static이 있을 때 값을 가지고 올 수 있다.(디폴트 값)
		//System.out.println(a.b.c.ch2.data.Data_1_Test.i);
		
		//i를 가져 오는 방법 ?
		
		//객체 생성
		a.b.c.ch2.data.Data_1_Test d1 = new a.b.c.ch2.data.Data_1_Test();
		//객체를 만들어도 식별자 i를 바로 호출할 수 없다.
		//System.out.println("print함수로 변수를 소환한 값 > :" + d1.i);
		//객체를 생성해서 print함수로 변수를 가져오면 초기화된 값이 소환된다.
		//System.out.println(d1.i);
		//System.out.println(d1.TEST_DATA);

		// 2. 멤버 필드에 값이 초기화 된 변수 TEST_DATA 소환 테스트.

		//변수 TEST_DATA 프린트함수로 가져오기
		//System.out.println("TEST_DATA를 print함수로 소환하면? : " + a.b.c.ch2.data.Data_1_Test.TEST_DATA);
		//문제 없이 초기화된 값을 가져온다.
		//System.out.println("TEST_DATA를 객체로 소환하면? : " + d1.TEST_DATA);
		//문제 없이 초기화된 값을 가져온다.



			//멤버 필드에 static이 없는 void 함수 a() 가져오기
			//static없을 때 호출 불가.
			//static있을 때 호출 가능.
		//System.out.println("아랫줄에 함수 a()가져오기");
			a.b.c.ch2.data.Data_1_Test.a();
			//static없을 때 객체로 a()함수 호출하기 : 호출 가능.
		//d1.a();

		//static이 있는 void 함수 b() 가져오기
		//그냥 소환해도, 객체로 소환해도 잘 호출됨.
		//a.b.c.ch2.data.Data_1_Test.b();
		//d1.b();
		
	} //end of main 함수

} //end of Data_1클래스


//[다른 패키지에서 자원을 갖고와서 사용할 클래스]