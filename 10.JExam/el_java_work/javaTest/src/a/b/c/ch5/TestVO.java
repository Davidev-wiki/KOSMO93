package a.b.c.ch5;

public class TestVO {
	
	public TestVO(String mnum, String mid, String mpw, String mhp, String maddr) {

		Mnum = mnum;
		Mid = mid;
		Mpw = mpw;
		Mhp = mhp;
		Maddr = maddr;
	}
	
	public String getMnum() {
		return Mnum;
	}


	public String getMid() {
		return Mid;
	}


	public String getMpw() {
		return Mpw;
	}


	public String getMhp() {
		return Mhp;
	}


	public String getMaddr() {
		return Maddr;
	}


	public void setMnum(String mnum) {
		Mnum = mnum;
	}


	public void setMid(String mid) {
		Mid = mid;
	}


	public void setMpw(String mpw) {
		Mpw = mpw;
	}


	public void setMhp(String mhp) {
		Mhp = mhp;
	}


	public void setMaddr(String maddr) {
		Maddr = maddr;
	}


	private String Mnum;
	private String Mid;
	private String Mpw;
	private String Mhp;
	private String Maddr;
	
}
