package a.b.c.ch2;

public class Data_8 {

	// void 함수, 일반함수
	// 사용법 : 참조변수 사용하기 : 클래스이름 참조변수 = new 생성자이름();
	//        참조변수.함수이름();
	// Data_8 d8 = new Data_8();
	// d8.aMethod();
	public void aMethod(){
		System.out.println("이 문장은 Data_8 클래스의 public void aMethod() 함수의 실행문구 입니다!");
		System.out.println("'static'이 없으므로 참조변수를 이용해 호출해야 합니다.");
		System.out.println("'void'키워드를 보니 return 값이 없네요.");

	}

	// void 함수, static  함수 
	// 사용법 : 클래스이름.함수이름();
	// Data_8.aaMethod();
	public static void aaMethod(){
		System.out.println("이 문장은 Data_8 클래스의 public static void aaMethod()함수의 실행문구 입니다!");
		System.out.println("'static'가 있네요. 메모리에 올라가 있으니 경로를 통해 직접 호출할 수 있습니다.");
		System.out.println("'void'키워드를 보니 return 값이 없네요.");
	}

	// 리턴형이 있는 함수, 일반 함수
	// 참조변수 사용하기, 리턴형을 받아서 사용하기 
	// Data_8 d8 = new Data_8();
	// int i = d8.bMethod();
	public int bMethod(){
		System.out.println("이 문장은 Data_8 클래스의 public int bMethod() 함수의 실행문구 입니다!");
		System.out.println("'static'이 없으므로 참조변수를 이용해 호출해야 합니다.");
		System.out.println("리턴형이 'int'입니다. 정수형 결과 값을 내보냅니다. 변수를 이용해 값을 저장하세요.");
		return 1;
	}

	// 리턴형이 있는 함수, static 함수 
	// 클래스이름.함수이름(); 리턴형 받기
	// int i = Data_8.bbMethod();
	public static int bbMethod(){
		System.out.println("이 문장은 Data_8 클래스의 public static int bbMethod() 함수의 실행문구 입니다!");
				System.out.println("'static'가 있네요. 메모리에 올라가 있으니 경로를 통해 직접 호출할 수 있습니다.");
		System.out.println("리턴형이 'int'입니다. 정수형 결과 값을 내보냅니다. 변수를 이용해 값을 저장하세요.");
		return 1;
	}

	public static void main(java.lang.String[] args){
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("main함수가 실행됩니다.");
		System.out.println("-----------------------------------------------------------------------------");
		// static 함수 사용하기 
		// 클래스이름.함수이름
		System.out.println("Data_8.aaMethod() 함수가 실행됩니다.");
		Data_8.aaMethod();
		System.out.println("-----------------------------------------------------------------------------");
		
		System.out.println("Data_8.bbMethod() 함수가 실행됩니다.");
		System.out.println("Data_8.aaMethod() 함수가 int 타입 변수 'i' 에 초기화됩니다.");
		int i = Data_8.bbMethod();
		System.out.println("int 타입의 변수 'i' 값을 출력합니다.");
		System.out.println("i = " + i);
		System.out.println("-----------------------------------------------------------------------------");

		System.out.println("Data_8클래스로 'd8'의 객체가 생성됩니다.");
		// static 없는 함수 : 참조변수 이용하기 : 인스턴스 해서 사용하기 : new 연산자 사용하기 
		// 참조변수.함수이름
		Data_8 d8 = new Data_8();
		System.out.println("참조변수 'd8'로부터 aMethod() 함수가 호출됩니다.");
		d8.aMethod();
		System.out.println("-----------------------------------------------------------------------------");
		
		System.out.println("참조변수 'd8'로부터 bMethod() 함수를 호출합니다.");
		System.out.println("리턴 값이 있는 bMethod() 함수는 int 형 변수 'i1'에 리턴 값을 저장합니다.");
		int i1 = d8.bMethod();
		System.out.println("int 형 변수 'i1'에 값을 저장했습니다.");
		System.out.println("i1의 값은 " + i1 + " 입니다.");
		System.out.println("------------------------------------------------------------------프로그램 종료!");


	} // end of main 함수 	
} // end of Data_6


