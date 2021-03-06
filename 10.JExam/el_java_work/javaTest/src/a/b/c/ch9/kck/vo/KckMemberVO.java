
/*
- 입출력 할 데이터가 무엇인지 정의하고 private 하게 선언한다.
- 생성자는 2개를 준비한다.
		기본 생성자 1개 : DB에서 받은 값을 set함수를 이용해 값을 초기화 하는 방법1을 위해.
		데이터 저장용 생성자 1개 : 사용자 클래스에서 아규먼트를 넣어 인스턴스하면 바로 초기화되는 방법2를 위해
- 이 예제에서는 방법1 만 사용한다.
*/


package a.b.c.ch9.kck.vo;

public class KckMemberVO {

	private String knum;
	private String kname;
	private String kid;
	private String kpw;
	private String kbirth;
	private String kgender;
	private String ktel;
	private String khp;
	private String kemail;
	private String kaddr;
	private String khobby;
	private String kphoto;
	private String kskill;
	private String kjob;
	private String deleteyn;
	private String insertdate;
	private String updatedate;

	// 생성자
	public KckMemberVO() {

	}

	public KckMemberVO(String knum, String kname, String kid, String kpw, String kbirth, String kgender, String ktel,
			String khp, String kemail, String kaddr, String khobby, String kphoto, String kskill, String kjob,
			String deleteyn, String insertdate, String updatedate) {

		this.knum = knum;
		this.kname = kname;
		this.kid = kid;
		this.kpw = kpw;
		this.kbirth = kbirth;
		this.kgender = kgender;
		this.ktel = ktel;
		this.khp = khp;
		this.kemail = kemail;
		this.kaddr = kaddr;
		this.khobby = khobby;
		this.kphoto = kphoto;
		this.kskill = kskill;
		this.kjob = kjob;
		this.deleteyn = deleteyn;
		this.insertdate = insertdate;
		this.updatedate = updatedate;

	}

	public String getKnum() {
		return knum;
	}

	public String getKname() {
		return kname;
	}

	public String getKid() {
		return kid;
	}

	public String getKpw() {
		return kpw;
	}

	public String getKbirth() {
		return kbirth;
	}

	public String getKgender() {
		return kgender;
	}

	public String getKtel() {
		return ktel;
	}

	public String getKhp() {
		return khp;
	}

	public String getKemail() {
		return kemail;
	}

	public String getKaddr() {
		return kaddr;
	}

	public String getKhobby() {
		return khobby;
	}

	public String getKphoto() {
		return kphoto;
	}

	public String getKskill() {
		return kskill;
	}

	public String getKjob() {
		return kjob;
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

	public void setKnum(String knum) {
		this.knum = knum;
	}

	public void setKname(String kname) {
		this.kname = kname;
	}

	public void setKid(String kid) {
		this.kid = kid;
	}

	public void setKpw(String kpw) {
		this.kpw = kpw;
	}

	public void setKbirth(String kbirth) {
		this.kbirth = kbirth;
	}

	public void setKgender(String kgender) {
		this.kgender = kgender;
	}

	public void setKtel(String ktel) {
		this.ktel = ktel;
	}

	public void setKhp(String khp) {
		this.khp = khp;
	}

	public void setKemail(String kemail) {
		this.kemail = kemail;
	}

	public void setKaddr(String kaddr) {
		this.kaddr = kaddr;
	}

	public void setKhobby(String khobby) {
		this.khobby = khobby;
	}

	public void setKphoto(String kphoto) {
		this.kphoto = kphoto;
	}

	public void setKskill(String kskill) {
		this.kskill = kskill;
	}

	public void setKjob(String kjob) {
		this.kjob = kjob;
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

	
	
}