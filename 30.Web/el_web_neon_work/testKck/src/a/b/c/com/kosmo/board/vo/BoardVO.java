package a.b.c.com.kosmo.board.vo;

public class BoardVO {
	
	private String bnum;
	private String bsubject;
	private String bwriter;
	private String bpw;
	private String bmemo;
	private String bphoto;
	private String deleteyn;
	private String insertdate;
	private String updatedate;
	
	// 생성자
	public BoardVO(){
		
	}
	
	// 생성자
	public BoardVO(String bnum, String bsubject, String bwriter, String bpw, String bmemo, String bphoto,
			String deleteyn, String insertdate, String updatedate) {
	
		this.bnum = bnum;
		this.bsubject = bsubject;
		this.bwriter = bwriter;
		this.bpw = bpw;
		this.bmemo = bmemo;
		this.bphoto = bphoto;
		this.deleteyn = deleteyn;
		this.insertdate = insertdate;
		this.updatedate = updatedate;
	
	}
	
	// getter
	public String getBnum() {
		return bnum;
	}
	public String getBsubject() {
		return bsubject;
	}
	public String getBwriter() {
		return bwriter;
	}
	public String getBpw() {
		return bpw;
	}
	public String getBmemo() {
		return bmemo;
	}
	public String getBphoto() {
		return bphoto;
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
	
	// setter
	public void setBnum(String bnum) {
		this.bnum = bnum;
	}
	public void setBsubject(String bsubject) {
		this.bsubject = bsubject;
	}
	public void setBwriter(String bwriter) {
		this.bwriter = bwriter;
	}
	public void setBpw(String bpw) {
		this.bpw = bpw;
	}
	public void setBmemo(String bmemo) {
		this.bmemo = bmemo;
	}
	public void setBphoto(String bphoto) {
		this.bphoto = bphoto;
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
	
	// 프린트 함수 : 깡통에 있는 데이터를 콘솔에 출력해주는 함수.
	// print : 전체 조회용
	public static void printBoardVO(BoardVO bvo){

		System.out.print(bvo.getBnum() + " : ");
		System.out.print(bvo.getBsubject() + " : ");
		System.out.print(bvo.getBwriter() + " : ");
		System.out.print(bvo.getBpw() + " : ");
		System.out.print(bvo.getBmemo() + " : ");
		System.out.print(bvo.getDeleteyn() + " : ");
		System.out.print(bvo.getInsertdate() + " : ");
		System.out.println(bvo.getUpdatedate());
	
	}
	
	// println : 조건 조회용
	public static void printlnBoardVO(BoardVO bvo){
		
		System.out.println("bvo.getBnum() : " + bvo.getBnum());
		System.out.println("bvo.getBsubject() : " + bvo.getBsubject());
		System.out.println("bvo.getBwriter() : " + bvo.getBwriter());
		System.out.println("bvo.getBpw() : " + bvo.getBpw());
		System.out.println("bvo.getBmemo() : " + bvo.getBmemo());
		System.out.println("bvo.getDeleteyn() : " + bvo.getDeleteyn());
		System.out.println("bvo.getInsertdate() : " + bvo.getInsertdate());
		System.out.println("bvo.getUpdatedate() : " + bvo.getUpdatedate());

	}

	
}
