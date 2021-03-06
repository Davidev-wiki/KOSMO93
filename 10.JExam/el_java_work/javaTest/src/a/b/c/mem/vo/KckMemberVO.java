package a.b.c.mem.vo;

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

	// 기본 생성자
	public KckMemberVO() {

	}

	// 생성자 오버로딩
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

	
	// getter
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

	
	// setter
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
	
	// [전체 조회용 출력 양식] 깡통객체에 row 한 줄(get()함수를 이용해 가져온 num, name, id, pw.. 등) 을 콘솔에 출력한다.
	public static void printKckMemberVO(KckMemberVO kvo) {
		System.out.print(kvo.getKnum() + ", ");
		System.out.print(kvo.getKname() + ", ");
		System.out.print(kvo.getKid() + ", ");
		System.out.print(kvo.getKpw() + ", ");
		System.out.print(kvo.getKbirth() + ", ");
		System.out.print(kvo.getKgender() + ", ");
		System.out.print(kvo.getKtel() + ", ");
		System.out.print(kvo.getKhp() + ", ");
		System.out.print(kvo.getKemail() + ", ");
		System.out.print(kvo.getKaddr() + ", ");
		System.out.print(kvo.getKhobby() + ", ");
		System.out.print(kvo.getKphoto() + ", ");
		System.out.print(kvo.getKskill() + ", ");
		System.out.print(kvo.getKjob() + ", ");
		System.out.print(kvo.getDeleteyn() + ", ");
		System.out.print(kvo.getInsertdate() + ", ");
		System.out.println(kvo.getUpdatedate());
	}
	
	// [조건 조회용 출력 양식] 깡통 객체에다가 get()함수를 이용해 가져온 컬럼을 한 줄씩 적는다.
	public static void printlnKckMemberVO(KckMemberVO kvo) {
		System.out.println("kvo.getKnum() : " + kvo.getKnum());
		System.out.println("kvo.getKname() : " + kvo.getKname());
		System.out.println("kvo.getKid()" + kvo.getKid());
		System.out.println("kvo.getKpw()" + kvo.getKpw());
		System.out.println("kvo.getKbirth()" + kvo.getKbirth());
		System.out.println("kvo.getKgender()" + kvo.getKgender());
		System.out.println("kvo.getKtel()" + kvo.getKtel());
		System.out.println("kvo.getKhp()" + kvo.getKhp());
		System.out.println("kvo.getKemail()" + kvo.getKemail());
		System.out.println("kvo.getKaddr()" + kvo.getKaddr());
		System.out.println("kvo.getKhobby()" + kvo.getKhobby());
		System.out.println("kvo.getKphoto()" + kvo.getKphoto());
		System.out.println("kvo.getKskill()" + kvo.getKskill());
		System.out.println("kvo.getKjob()" + kvo.getKjob());
		System.out.println("kvo.getDeleteyn()" + kvo.getDeleteyn());
		System.out.println("kvo.getInsertdate()" + kvo.getInsertdate());
		System.out.println("kvo.getUpdatedate()" + kvo.getUpdatedate());
	}
	
	
	
	
}
