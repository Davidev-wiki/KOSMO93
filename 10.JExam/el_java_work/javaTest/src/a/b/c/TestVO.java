package a.b.c;

public class TestVO {

	String mnum;
	String mid;
	String mpw;
	String mhp;
	String maddr;

	public TestVO() {
		System.out.println("TestVO의 생성자");
	}

	public TestVO(String mnum, String mid, String mpw, String mhp, String maddr) {

		this.mnum = mnum;
		this.mid = mid;
		this.mpw = mpw;
		this.mhp = mhp;
		this.maddr = maddr;
	}

	public String getMnum() {
		return mnum;
	}

	public String getMid() {
		return mid;
	}

	public String getMpw() {
		return mpw;
	}

	public String getMhp() {
		return mhp;
	}

	public String getMaddr() {
		return maddr;
	}

	public void setMnum(String mnum) {
		this.mnum = mnum;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}

	public void setMpw(String mpw) {
		this.mpw = mpw;
	}

	public void setMhp(String mhp) {
		this.mhp = mhp;
	}

	public void setMaddr(String maddr) {
		this.maddr = maddr;
	}
}
