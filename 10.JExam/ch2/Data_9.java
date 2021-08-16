package a.b.c.ch2;

public class Data_9 {

	public void aMethod(int x1, int y1){
		System.out.println("Data_9 클래스의 public void aMethod() 함수가 호출되면 출력되는 첫 문장입니다.");
		System.out.println("이 함수에는 int형 매개변수 'x1'과 'y1'이 순서대로 할당되어 있습니다.");
		System.out.println("이 함수의 로직은 매개변수 'x1'과 'y1'을 더한 값을 int형 변수 'sum1'에 초기화 합니다.");
		int sum1 = x1 + y1;
		System.out.println(" sum1 = " + sum1);
		System.out.println("'static'이 없으니 참조변수 'd9'를 이용해(d9.aMethod(x, y)) 호출했습니다.");
		System.out.println("'void'가 붙은 리턴 값이 없는 함수이니, 별도로 변수를 이용해 값을 저장하지 않았어요.");
	}

	public static void aaMethod(int x2, int y2){
		System.out.println("Data_9 클래스의 public static void aaMethod() 함수가 호출되면 출력되는 첫 문장입니다. ");
		System.out.println("이 함수에는 int형 매개변수 'x2'와 'y2'가 순서대로 할당되어 있습니다.");
		System.out.println("이 함수의 로직은 매개변수 'x2'와 'y2'를 더한 값을 int형 변수 'sum2'에 초기화 합니다.");
		int sum2 = x2 + y2;
		System.out.println(" sum2 = " + sum2);
		System.out.println("'static'이 있네요, 메모리에 올라가 있으니 직접 경로를 입력해서(Data_9.aaMethod()) 호출했어요.");
		System.out.println("'void'가 붙은 리턴 값이 없는 함수이니, 별도로 변수를 이용해 값을 저장하지 않았어요.");
	}

	public int bMethod(int x3, int y3){
		System.out.println("Data_9 클래스의 public int bMethod() 함수가 호출되면 출력되는 첫 문장입니다. ");
		System.out.println("이 함수에는 int형 매개변수 'x3'과 'y3'이 순서대로 할당되어 있습니다.");
		System.out.println("이 함수의 로직은 매개변수 'x3'과 'y3'을 더한 값을 int형 변수 'sum3'에 초기화 합니다.");
		int sum3 = x3 + y3;
		System.out.println(" sum3 = " + sum3);
		System.out.println("'static'이 없으니 참조변수 'd9'를 이용해(d9.bMethod(x, y)) 호출했습니다.");
		System.out.println("'int형' 리턴 값이 발생하는 함수이니, 별도로 값을 저장할 변수가 필요합니다!");
		return sum3;
	}

	public static int bbMethod(int x4, int y4){
		System.out.println("Data_9 클래스의 public static int bbMethod() 함수가 호출되면 출력되는 첫 문장입니다. ");
		System.out.println("이 함수에는 int형 매개변수 'x4'와 'y4'가 순서대로 할당되어 있습니다.");
		System.out.println("이 함수의 로직은 매개변수 'x4'와 'y4'을 더한 값을 int형 변수 'sum4'에 초기화 합니다.");
		int sum4 = x4 + y4;
		System.out.println(" sum4 = " + sum4);
		System.out.println("'static'이 있네요, 메모리에 올라가 있으니 직접 경로를 입력해서(Data_9.bbMethod()) 호출했어요.");
		System.out.println("'int형' 리턴 값이 발생하는 함수이니, 별도로 값을 저장할 변수가 필요합니다!");
		return sum4;
	}

	public static void main(java.lang.String[] args){
		
			System.out.println("-----------------------------------------------------------------------------");
			System.out.println("main함수가 실행됩니다.");
			System.out.println("-----------------------------------------------------------------------------");
		int x = 1;
			System.out.println("지역 변수 int x = 1; 초기화 완료");
		int y = 2;
			System.out.println("지역 변수 int y = 2; 초기화 완료");
			System.out.println("-----------------------------------------------------------------------------");
		
			System.out.println("<Data_9클래스의 aaMethod(x, y) 함수를 실행합니다.>");
		Data_9.aaMethod(x, y);
			System.out.println("-----------------------------------------------------------------------------");

			System.out.println("<Data_9클래스의 bbMethod(x, y) 함수를 실행합니다.>");
		int i = Data_9.bbMethod(x, y);
			System.out.println("<리턴 값이 int형 변수 'i'에 저장되었습니다! >");
			System.out.println(" i 값 = " + i);
			System.out.println("-----------------------------------------------------------------------------");

			System.out.println("<Data_9클래스로 d9객체를 생성합니다.>");
		Data_9 d9 = new Data_9();
			System.out.println("<Data_9클래스의 aMethod(x, y) 함수를 실행합니다.>");
		d9.aMethod(x, y);
			System.out.println("-----------------------------------------------------------------------------");

			System.out.println("생성된 d9객체로 bMethod(x, y) 함수를 실행합니다..>");
		int i1 = d9.bMethod(x, y);
			System.out.println("<리턴 값이 int형 변수 'i1'에 저장되었습니다! >");
			System.out.println(" i1 값 = " + i1);
			System.out.println("-------------------------------------------------------------------프로그램 종료!");

	} 
} 