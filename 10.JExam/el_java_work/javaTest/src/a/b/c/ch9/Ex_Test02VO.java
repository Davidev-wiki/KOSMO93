package a.b.c.ch9;

public class Ex_Test02VO {

	//멤버변수
	private String t3_1; // column 명
	private String t3_2;
	private String t3_3;
	private String t3_4;
	private String t3_5;
	private String t3_6;

	// 생성자(기본)
	public Ex_Test02VO() {
		
	}
	
	// 생성자(저장)
	public Ex_Test02VO(String t3_1, String t3_2, 
					   String t3_3, String t3_4, 
					   String t3_5, String t3_6) {
		
		this.t3_1 = t3_1;
		this.t3_2 = t3_2;
		this.t3_3 = t3_3;
		this.t3_4 = t3_4;
		this.t3_5 = t3_5;
		this.t3_6 = t3_6;
		
	}
	
	//getter()
	public String getT3_1() {
		return t3_1;
	}

	public String getT3_2() {
		return t3_2;
	}

	public String getT3_3() {
		return t3_3;
	}

	public String getT3_4() {
		return t3_4;
	}

	public String getT3_5() {
		return t3_5;
	}

	public String getT3_6() {
		return t3_6;
	}
	
	// setter()
	public void setT3_1(String t3_1) {
		this.t3_1 = t3_1;
	}

	public void setT3_2(String t3_2) {
		this.t3_2 = t3_2;
	}

	public void setT3_3(String t3_3) {
		this.t3_3 = t3_3;
	}

	public void setT3_4(String t3_4) {
		this.t3_4 = t3_4;
	}

	public void setT3_5(String t3_5) {
		this.t3_5 = t3_5;
	}

	public void setT3_6(String t3_6) {
		this.t3_6 = t3_6;
	}
	
	
}
