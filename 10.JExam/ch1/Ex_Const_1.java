package a.b.c.ch1;

public class Ex_Const_1 {

	//��� ����
	String name;
	int age;

	public static int a(int a, int b) {
		int sum = a + b;
		return sum;
	}
	
	//������
	public Ex_Const_1(){
		System.out.println("[�Ű������� ���� �����ڰ� ȣ��˴ϴ�.] : Ex_Const_1()");
		System.out.println("�Ű������� �����Ƿ� ���ڰ��� ���� �� �� �����ڰ� ȣ��˴ϴ�.");
	}
	public Ex_Const_1(String name){
		System.out.println("[�Ű������� 'String name'�� �����ڰ� ȣ��˴ϴ�.] : Ex_Const_1(String name)");
		System.out.println("String name�� ��: " + name);
		System.out.println("");
	}
	public Ex_Const_1(int age){
		System.out.println("[�Ű������� 'int age'�� �����ڰ� ȣ��˴ϴ�.] : Ex_Const_1(int age)");
		System.out.println("int age�� ��: " + age);
		System.out.println("");
	}
	public Ex_Const_1(String name, int age){
		System.out.println("[�Ű������� 'String name', 'int age'�� �����ڰ� ȣ��˴ϴ�.] : Ex_Const_1(String name, int age)");
		System.out.print("String name�� ��: " + name);
		System.out.println(", int age�� ��: " + age);
		System.out.println("");
	}
	public Ex_Const_1(int age, String name){
		System.out.println("[�Ű������� 'int age', 'String name'�� �����ڰ� ȣ��˴ϴ�.] : Ex_Const_1(int age, String name)");
		System.out.print("int age�� ��: " + age);
		System.out.println("String name�� ��: " + name);
		System.out.println("");
	}

	
	public static void main(String[] args) {

		System.out.println("---------------------------------------");
		Ex_Const_1 ex_c_1 = new Ex_Const_1();
		System.out.println("ex_c_1�� �޸� �ּҰ���? : " + ex_c_1);
		System.out.println("---------------------------------------");

		Ex_Const_1 ex_c_2 = new Ex_Const_1("������");
		System.out.println("ex_c_2�� �޸� �ּҰ���? : " + ex_c_2);
		System.out.println("---------------------------------------");

		Ex_Const_1 ex_c_3 = new Ex_Const_1(34);
		System.out.println("ex_c_3�� �޸� �ּҰ���? : " + ex_c_3);
		System.out.println("---------------------------------------");

		Ex_Const_1 ex_c_4 = new Ex_Const_1("������" , 34);
		System.out.println("ex_c_4�� �޸� �ּҰ���? : " + ex_c_4);
		System.out.println("---------------------------------------");

		Ex_Const_1 ex_c_5 = new Ex_Const_1(34 , "������");
		System.out.println("ex_c_5�� �޸� �ּҰ���? : " + ex_c_5);
		System.out.println("---------------------------------------");
		
		System.out.println("---Test ����---");
		System.out.println("'ex_c_1.name�� ex_c_1.age�� �� �پ� ����� ���");
		System.out.println("ex_c_1.name : " + ex_c_1.name);
		System.out.println("ex_c_1.age : " + ex_c_1.age);
		System.out.println(ex_c_1.a(1, 3));
		System.out.println("--------------");

	} //end of main method

} //end of Ex_Const1 clas