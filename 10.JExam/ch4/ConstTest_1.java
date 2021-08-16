package a.b.c.ch4;

public class ConstTest_1 extends java.lang.Object
{
	public ConstTest_1(){
		System.out.println("[상속해준] [생성자] ConstTest_1() 생성자입니다. : ");
	}
	// 새로 오버로딩해서 만든 생성자.
	public ConstTest_1(String name){
		System.out.println("[상속해준] [오버로딩된] [생성자] ConstTest_1(String name) 생성자입니다. : ");
		System.out.println("[상속해준] [오버로딩된] [생성자] ConstTest_1() 생성자 name : " + name);
	}
}