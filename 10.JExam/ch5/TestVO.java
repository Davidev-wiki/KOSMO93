//package
package a.b.c.ch5;
//import

public class TestVO
{
	//상수
	//멤버변수
	private String sval;
	private String ival;
	//생성자
	public TestVO(){
		
	}
	//함수
	public void setSval(String sval){
		this.sval = sval;
		System.out.println("sval세팅 완료");
	}
	public void setIval(String ival){
		this.ival = ival;
		System.out.println("ival세팅 완료");
	}
	public String getSval(){
		System.out.println("sval 리턴 완료");
		return this.sval;
	}
	public String getIval(){
		System.out.println("ival 리턴 완료");
		return this.ival;
	}
}
