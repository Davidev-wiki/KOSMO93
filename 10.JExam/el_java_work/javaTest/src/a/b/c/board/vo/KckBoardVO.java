package a.b.c.board.vo;

public class KckBoardVO {

	private String bnum;
	private String bsubject;
	private String bwriter;
	private String bcontents;
	private String bpw;
	private String deleteyn;
	private String insertdate;
	private String updatedate;

	// 생성자
	public KckBoardVO() {

	}

	// 생성자
	public KckBoardVO(String bnum, String bsubject, String bwriter, String bcontents, String bpw, String deleteyn,
			String insertdate, String updatedate) {

		this.bnum = bnum;
		this.bsubject = bsubject;
		this.bwriter = bwriter;
		this.bcontents = bcontents;
		this.bpw = bpw;
		this.deleteyn = deleteyn;
		this.insertdate = insertdate;
		this.updatedate = updatedate;
	}

	public String getBnum() {
		return bnum;
	}

	public String getBsubject() {
		return bsubject;
	}

	public String getBwriter() {
		return bwriter;
	}

	public String getBcontents() {
		return bcontents;
	}

	public String getBpw() {
		return bpw;
	}

	public String getDeleteyn() {
		return deleteyn;
	}

	public String getInsertdate() {
		return insertdate;
	}

	public String getUpdatedate() {
		return updatedate;
	}

	public void setBnum(String bnum) {
		this.bnum = bnum;
	}

	public void setBsubject(String bsubject) {
		this.bsubject = bsubject;
	}

	public void setBwriter(String bwriter) {
		this.bwriter = bwriter;
	}

	public void setBcontents(String bcontents) {
		this.bcontents = bcontents;
	}

	public void setBpw(String bpw) {
		this.bpw = bpw;
	}

	public void setDeleteyn(String deleteyn) {
		this.deleteyn = deleteyn;
	}

	public void setInsertdate(String insertdate) {
		this.insertdate = insertdate;
	}

	public void setUpdatedate(String updatedate) {
		this.updatedate = updatedate;
	}

	// 프린트 함수
	// print() 전체 조회용 함수? : row 를 한 줄로 나열
	public static void printKckBoardVO(KckBoardVO kvo) {
		System.out.print(kvo.getBnum() + " : ");
		System.out.print(kvo.getBsubject() + " : ");
		System.out.print(kvo.getBwriter() + " : ");
		System.out.print(kvo.getBcontents() + " : ");
		System.out.print(kvo.getBpw() + " : ");
		System.out.print(kvo.getDeleteyn() + " : ");
		System.out.print(kvo.getInsertdate() + " : ");
		System.out.println(kvo.getUpdatedate());
	}

	// println() 조건 조회용 함수. 객체를 한 줄씩 출력
	public static void printlnKckBoardVO(KckBoardVO kvo) {
		System.out.println("kvo.getBnum() : " + kvo.getBnum());
		System.out.println("kvo.getBsubject() : " + kvo.getBsubject());
		System.out.println("kvo.getBwriter() : " + kvo.getBwriter());
		System.out.println("kvo.getBcontents() : " + kvo.getBcontents());
		System.out.println("kvo.getBpw() : " + kvo.getBpw());
		System.out.println("kvo.getDeleteyn() : " + kvo.getDeleteyn());
		System.out.println("kvo.getInsertdate() : " + kvo.getInsertdate());
		System.out.println("kvo.getUpdatedate() : " + kvo.getUpdatedate());

	}

}
