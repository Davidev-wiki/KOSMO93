package a.b.c.ch1;

public class Ex_Const_1 {

	//멤버 변수
	String name;
	int age;

	public static int a(int a, int b) {
		int sum = a + b;
		return sum;
	}
	
	//생성자
	public Ex_Const_1(){
		System.out.println("[매개변수가 없는 생성자가 호출됩니다.] : Ex_Const_1()");
		System.out.println("매개변수가 없으므로 인자값이 없을 때 이 생성자가 호출됩니다.");
	}
	public Ex_Const_1(String name){
		System.out.println("[매개변수가 'String name'인 생성자가 호출됩니다.] : Ex_Const_1(String name)");
		System.out.println("String name의 값: " + name);
		System.out.println("");
	}
	public Ex_Const_1(int age){
		System.out.println("[매개변수가 'int age'인 생성자가 호출됩니다.] : Ex_Const_1(int age)");
		System.out.println("int age의 값: " + age);
		System.out.println("");
	}
	public Ex_Const_1(String name, int age){
		System.out.println("[매개변수가 'String name', 'int age'인 생성자가 호출됩니다.] : Ex_Const_1(String name, int age)");
		System.out.print("String name의 값: " + name);
		System.out.println(", int age의 값: " + age);
		System.out.println("");
	}
	public Ex_Const_1(int age, String name){
		System.out.println("[매개변수가 'int age', 'String name'인 생성자가 호출됩니다.] : Ex_Const_1(int age, String name)");
		System.out.print("int age의 값: " + age);
		System.out.println("String name의 값: " + name);
		System.out.println("");
	}

	
	public static void main(String[] args) {

		System.out.println("---------------------------------------");
		Ex_Const_1 ex_c_1 = new Ex_Const_1();
		System.out.println("ex_c_1의 메모리 주소값은? : " + ex_c_1);
		System.out.println("---------------------------------------");

		Ex_Const_1 ex_c_2 = new Ex_Const_1("김찬기");
		System.out.println("ex_c_2의 메모리 주소값은? : " + ex_c_2);
		System.out.println("---------------------------------------");

		Ex_Const_1 ex_c_3 = new Ex_Const_1(34);
		System.out.println("ex_c_3의 메모리 주소값은? : " + ex_c_3);
		System.out.println("---------------------------------------");

		Ex_Const_1 ex_c_4 = new Ex_Const_1("김찬기" , 34);
		System.out.println("ex_c_4의 메모리 주소값은? : " + ex_c_4);
		System.out.println("---------------------------------------");

		Ex_Const_1 ex_c_5 = new Ex_Const_1(34 , "김찬기");
		System.out.println("ex_c_5의 메모리 주소값은? : " + ex_c_5);
		System.out.println("---------------------------------------");
		
		System.out.println("---Test 구간---");
		System.out.println("'ex_c_1.name과 ex_c_1.age를 한 줄씩 출력한 결과");
		System.out.println("ex_c_1.name : " + ex_c_1.name);
		System.out.println("ex_c_1.age : " + ex_c_1.age);
		System.out.println(ex_c_1.a(1, 3));
		System.out.println("--------------");

	} //end of main method

} //end of Ex_Const1 clas