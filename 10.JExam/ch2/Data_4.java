package a.b.c.ch2;

public class Data_4 {

	//멤버변수
	static byte b;
	static char c;
	static short s;
	static int i;
	static float f;
	static double d;
	static boolean bo;
	static String str;

	//생성자
	public Data_4(){
		System.out.println("Data_4 클래스 Data_4() 생성자");
	}

		public static void main(java.lang.String[] args) {
			
			System.out.println("객체를 만들어서 출력합니다.");
			System.out.println("-----------------------------");
			Data_4 d4 = new Data_4();
			
			System.out.println(d4.b);
			System.out.println(d4.c);
			System.out.println(d4.s);
			System.out.println(d4.i);
			System.out.println(d4.f);
			System.out.println(d4.d);
			System.out.println(d4.bo);
			System.out.println(d4.str);


			System.out.println("-----------------------------");
			System.out.println("Static 키워드를 붙여서 출력합니다.");
			System.out.println(Data_4.b);
			System.out.println(Data_4.c);
			System.out.println(Data_4.s);
			System.out.println(Data_4.i);
			System.out.println(Data_4.f);
			System.out.println(Data_4.d);
			System.out.println(Data_4.bo);
			System.out.println(Data_4.str);

	} //end of main 함수

} //end of Data_4 클래스
