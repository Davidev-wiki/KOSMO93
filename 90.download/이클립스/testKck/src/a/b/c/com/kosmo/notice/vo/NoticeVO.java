package a.b.c.com.kosmo.notice.vo;

public class NoticeVO {

	private String nnum;
	private String nsubject;
	private String nmemo;
	private String nphoto;
	private String deleteyn;
	private String insertdate;
	private String updatedate;

	public NoticeVO(){
		
	}
	
	// constructor
	public NoticeVO(String nnum, String nsubject, String nmemo, String nphoto, String deleteyn, String insertdate,
			String updatedate) {

		this.nnum = nnum;
		this.nsubject = nsubject;
		this.nmemo = nmemo;
		this.nphoto = nphoto;
		this.deleteyn = deleteyn;
		this.insertdate = insertdate;
		this.updatedate = updatedate;
	}

	// getter & setter

	public String getNnum() {
		return nnum;
	}

	public String getNsubject() {
		return nsubject;
	}

	public String getNmemo() {
		return nmemo;
	}

	public String getNphoto() {
		return nphoto;
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

	public void setNnum(String nnum) {
		this.nnum = nnum;
	}

	public void setNsubject(String nsubject) {
		this.nsubject = nsubject;
	}

	public void setNmemo(String nmemo) {
		this.nmemo = nmemo;
	}

	public void setNphoto(String nphoto) {
		this.nphoto = nphoto;
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
	// 전체 조회용 print
	public static void printNoticeVO(NoticeVO nvo){
		
		System.out.println("NoticeVO.printNoticeVO() 진입");
		
		System.out.print("nnum : " + nvo.getNnum() + ", ");
		System.out.print("nsubject : " + nvo.getNsubject() + ", ");
		System.out.print("nmemo : " + nvo.getNmemo() + ", ");
		System.out.print("nphoto : " + nvo.getNphoto() + ", ");
		System.out.print("deleteyn : " + nvo.getDeleteyn() + ", ");
		System.out.print("Insertdate : " + nvo.getInsertdate() + ", ");
		System.out.println("Updatedate : " + nvo.getUpdatedate());
		
		System.out.println("NoticeVO.printNoticeVO() 종료");

	}
	
	// 조건 조회용 println
	public static void printlnNoticeVO(NoticeVO nvo){
		System.out.println("NoticeVO.printlnNoticeVO() 진입");
		
		System.out.println("nnum : " + nvo.getNnum());
		System.out.println("nsubject : " + nvo.getNsubject());
		System.out.println("nmemo : " + nvo.getNmemo());
		System.out.println("nphoto : " + nvo.getNphoto());
		System.out.println("deleteyn : " + nvo.getDeleteyn());
		System.out.println("Insertdate : " + nvo.getInsertdate());
		System.out.println("Updatedate : " + nvo.getUpdatedate());
		
		System.out.println("NoticeVO.printlnNoticeVO() 종료");
	}
}
