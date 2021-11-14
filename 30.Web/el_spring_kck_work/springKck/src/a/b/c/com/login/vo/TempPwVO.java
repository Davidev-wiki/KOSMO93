package a.b.c.com.login.vo;

public class TempPwVO {
	
	private String pnum;		// ??
	private String ptemppw;		// 임시 비번
	private String mid;			// 회원아이디
	private String insertdate;	// 입력일
	
	public TempPwVO() {
		
	}

	public TempPwVO(String pnum, String ptemppw, String mid, String insertdate) {
		
		this.pnum = pnum;
		this.ptemppw = ptemppw;
		this.mid = mid;
		this.insertdate = insertdate;
	}

	public String getPnum() {
		return pnum;
	}

	public void setPnum(String pnum) {
		this.pnum = pnum;
	}

	public String getPtemppw() {
		return ptemppw;
	}

	public void setPtemppw(String ptemppw) {
		this.ptemppw = ptemppw;
	}

	public String getMid() {
		return mid;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}

	public String getInsertdate() {
		return insertdate;
	}

	public void setInsertdate(String insertdate) {
		this.insertdate = insertdate;
	}
	
}
