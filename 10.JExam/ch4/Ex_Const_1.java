
package a.b.c.ch4;

public class Ex_Const_1 extends ConstTest_2 {

	// 생성자
	public Ex_Const_1(){
		super("부모클래스 생성자 호출");
		System.out.println("[자식클래스] [기본생성자]Ex_Const_1() 생성자 : ");
	}

	public Ex_Const_1(String src){
		super(src);
		System.out.println("[자식클래스] [오버로딩된]Ex_Const_1(String src) 생성자 : ");
		System.out.println("[자식클래스] [오버로딩된]Ex_Const_1(String src) 생성자 src >>> : " + src);
	}

	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		// TODO Auto-generated method stub.

		System.out.println("\n--- main함수 시작 ---!\n");
		System.out.println("\n--- ec1 객체 생성 ---!\n");
		Ex_Const_1 ec1 = new Ex_Const_1();
		System.out.println("ec1의 값 : " + ec1);

		System.out.println("\n--- ec2 객체 생성 ---!\n");
		Ex_Const_1 ec2 = new Ex_Const_1("부모클래스 생성자호출");
		System.out.println("ec2 >>> : " + ec2);

		System.out.println("\n--- main함수 종료 ---!\n");
	}
}
