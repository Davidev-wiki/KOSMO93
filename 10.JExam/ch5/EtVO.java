package a.b.c.ch5;

public class EtVO {
	//상수
	//멤버변수
		private String kname;
		
	//생성자
	public EtVO(){
		System.out.println("\n>>>데이터베이스 조회중..\n");
	}
	//함수

	public void setInfo(String kname) {this.kname = kname;}
	
	public String getInfo() {return this.kname;}

}


