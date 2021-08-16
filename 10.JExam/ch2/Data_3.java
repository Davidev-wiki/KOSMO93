package a.b.c.ch2;

public class Data_3 {

	//멤버변수
	byte b;
	char c;
	short s;
	int i;
	float f;
	double d;
	boolean bo;
	String str;
	
	//생성자
	Data_3() {
		System.out.println("Data_3 클래스의 생성자 Data_3()입니다.");
	}
		

		public static void main(java.lang.String[] args) {
				
			
			Data_3 d3 = new Data_3();
			System.out.println("DefaultValue의 d3주소값 : " + d3);
			System.out.println("byte의 default 값 : " + d3.b);
			System.out.println("char의 default 값 : \'" + d3.c + "\'");
			System.out.println("short의 default 값 : " + d3.s);
			System.out.println("int의 default 값 : " + d3.i);
			System.out.println("float의 default 값 : " + d3.f);
			System.out.println("double의 default 값 : " + d3.d);
			System.out.println("boolean의 default 값 : " + d3.bo);
			System.out.println("String의 default 값 : " + d3.str);

			System.out.println("-----------------------------------------");

			DefaultValue dv = new DefaultValue();
			System.out.println("DefaultValue의 dv주소값 : " + dv);
			System.out.println("byte의 default 값 : " + dv.b);
			System.out.println("char의 default 값 : \'" + dv.c + "\'");
			System.out.println("short의 default 값 : " + dv.s);
			System.out.println("int의 default 값 : " + dv.i);
			System.out.println("float의 default 값 : " + dv.f);
			System.out.println("double의 default 값 : " + dv.d);
			System.out.println("boolean의 default 값 : " + dv.bo);
			System.out.println("String의 default 값 : " + dv.str);
	
	} //end of main 함수

} //end of Data_3 클래스

class DefaultValue {
	
	//멤버 변수
	byte b;
	char c;
	short s;
	int i;
	float f;
	double d;
	boolean bo;
	String str;
	
	DefaultValue() {
		System.out.println("DefaultValue클래스 안에 있는 DefaultValue() 생성자입니다.");
	}

}