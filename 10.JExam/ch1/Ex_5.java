package a.b.c.ch1;

public class Ex_5 {

	public int i;
	public void a() {
		System.out.println("Ex_5 의 a() 함수이다. 현재 위치는 메인함수 바로 위");
	}
	public static void main(String args[]) {
	
		Ex_5 ex5 = new Ex_5();
		System.out.println("Ex_5() 의 주소값 >>> : " + ex5);
		System.out.println("ex5.i : " + ex5.i);
		ex5.a();


	} // end of main 함수

} // end of Ex_5 클래스