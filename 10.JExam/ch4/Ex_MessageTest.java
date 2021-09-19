package a.b.c.ch4;

public class Ex_MessageTest
{
	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		//TODO Auto-generated method stub.

		//쓰고싶은 자원 호출~!
		Ex_MessageInterface eme = new Ex_MessageInterfaceEngImpl();
		eme.sayHello("David");

		Ex_MessageInterface emk = new Ex_MessageInterfaceKorImpl();
		emk.sayHello("기찬기찬");

		Ex_MessageInterface ex_mk = new Ex_MessageInterfaceKorImpl();
		ex_mk.sayHello("찬찬기기");

		Ex_MessageInterface ex_me = new Ex_MessageInterfaceEngImpl();
		ex_me.sayHello("David");
	}
}
