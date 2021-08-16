package a.b.c.ch4;

public class ConstTest_2 extends java.lang.Object
{
	public ConstTest_2(){
		System.out.println("[상속해준 부모클래스] ConstTest_2() 생성자입니다. : ");		
	}

	public ConstTest_2(String name){
		System.out.println("[상속해준][오버로딩된] ConstTest_2(String name) 생성자 : ");
		System.out.println("[상속해준][오버로딩된] ConstTest_2() 생성자 name : " + name);
	}
}