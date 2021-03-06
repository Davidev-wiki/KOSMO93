package a.b.c.com.board.vo;

public class SpringBoardVO {
	
	// 글번호
	private String sbnum; 
	// 제목
	private String sbsubject;
	// 이름
	private String sbname;
	// 내용
	private String sbcontent;
	// 사진 파일
	private String sbfile;
	// 비밀번호
	private String sbpw;
	
	private String sbdelyn;	
	private String sbinsertdate;
	private String sbupdatedate;

	// basic constructor
	public SpringBoardVO() {
		
	}

	// Overload constructor
	public SpringBoardVO(String sbnum, String sbsubject, String sbname, String sbcontent, String sbfile, String sbpw,
			String sbdelyn, String sbinsertdate, String sbupdatedate) {
		
		this.sbnum = sbnum;
		this.sbsubject = sbsubject;
		this.sbname = sbname;
		this.sbcontent = sbcontent;
		this.sbfile = sbfile;
		this.sbpw = sbpw;
		this.sbdelyn = sbdelyn;
		this.sbinsertdate = sbinsertdate;
		this.sbupdatedate = sbupdatedate;
	}

	
	// ======= getter() & setter() =======
	public String getSbnum() {
		return sbnum;
	}

	public void setSbnum(String sbnum) {
		this.sbnum = sbnum;
	}

	public String getSbsubject() {
		return sbsubject;
	}

	public void setSbsubject(String sbsubject) {
		this.sbsubject = sbsubject;
	}

	public String getSbname() {
		return sbname;
	}

	public void setSbname(String sbname) {
		this.sbname = sbname;
	}

	public String getSbcontent() {
		return sbcontent;
	}

	public void setSbcontent(String sbcontent) {
		this.sbcontent = sbcontent;
	}

	public String getSbfile() {
		return sbfile;
	}

	public void setSbfile(String sbfile) {
		this.sbfile = sbfile;
	}

	public String getSbpw() {
		return sbpw;
	}

	public void setSbpw(String sbpw) {
		this.sbpw = sbpw;
	}

	public String getSbdelyn() {
		return sbdelyn;
	}

	public void setSbdelyn(String sbdelyn) {
		this.sbdelyn = sbdelyn;
	}

	public String getSbinsertdate() {
		return sbinsertdate;
	}

	public void setSbinsertdate(String sbinsertdate) {
		this.sbinsertdate = sbinsertdate;
	}

	public String getSbupdatedate() {
		return sbupdatedate;
	}

	public void setSbupdatedate(String sbupdatedate) {
		this.sbupdatedate = sbupdatedate;
	}

}

	
