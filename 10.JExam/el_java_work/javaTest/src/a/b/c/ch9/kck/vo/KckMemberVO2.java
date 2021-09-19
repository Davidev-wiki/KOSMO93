package a.b.c.ch9.kck.vo;

import a.b.c.common.CodeUtil;


// 깡통 클래스 : 데이터를 담는 목적의 통 : DTO 클래스 : VO 클래스
public class KckMemberVO2 {
	
	// private : 접근제한자 : 클래스 내부에서만 사용이 가능한 표식 : 객체마다 붙여줘야 한다.
	// 자원 보호 목적 : 현재 세팅된 자원을 함부로 손대지 마세요! 
	// 전자 기판을 직접 만지지말고 리모콘을 써서 조작하라는 것과 같은 의미 => 컴포넌트의 개념
	// 생성자 or setter & getter로만 접근이 가능하게 만든 것.
	
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

	/*
		기본 생성자 (default Constructor) 역할? 서칭해보기
		매개변수가 없는 기본 생성자.
		없으면 JVM이 기본 생성자를 만들어준다.
		new 키워드로 인스턴스할 수 있게 해준다. 
		(=메모리에 올려놓고 쓸 수 있게)
	*/
	
	public KckMemberVO2() {

	}

	public KckMemberVO2(String knum, String kname, String kid, String kpw, String kbirth, String kgender, String ktel,
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

	// KckMemberVO2 프린트 함수
	public static void printKckMemberVO(KckMemberVO2 kvo) {

		System.out.print(kvo.getKnum() + ", ");
		System.out.print(kvo.getKname() + ", ");
		System.out.print(kvo.getKid() + ", ");
		System.out.print(kvo.getKpw() + ", ");
		System.out.print(kvo.getKbirth() + ", ");
		System.out.print(CodeUtil.gender(kvo.getKgender()) + ", ");
		System.out.print(CodeUtil.tel(kvo.getKtel()) + ", ");
		System.out.print(CodeUtil.hp(kvo.getKhp()) + ", ");
		System.out.print(kvo.getKemail() + ", ");
		System.out.print(kvo.getKaddr() + ", ");
		System.out.print(CodeUtil.hobby(kvo.getKhobby()) + ", ");
		System.out.print(kvo.getKphoto() + ", ");
		System.out.print(kvo.getKskill() + ", ");
		System.out.print(CodeUtil.job(kvo.getKjob()) + ", ");
		System.out.print(kvo.getDeleteyn() + ", ");
		System.out.print(kvo.getInsertdate() + ", ");
		System.out.println(kvo.getUpdatedate());
	}

	public static void printlnKckMemberVO(KckMemberVO2 kvo) {

		System.out.println("kvo.getKnum() 		>>> : " + kvo.getKnum());
		System.out.println("kvo.getKname() 		>>> : " + kvo.getKname());
		System.out.println("kvo.getKid() 		>>> : " + kvo.getKid());
		System.out.println("kvo.getKpw() 		>>> : " + kvo.getKpw());
		System.out.println("kvo.getKbirtK() 	>>> : " + kvo.getKbirth());
		System.out.println("kvo.getKgender() 	>>> : " + kvo.getKgender());
		System.out.println("kvo.getKtel() 		>>> : " + kvo.getKtel());
		System.out.println("kvo.getKKp() 		>>> : " + kvo.getKhp());
		System.out.println("kvo.getKemail() 	>>> : " + kvo.getKemail());
		System.out.println("kvo.getKaddr() 		>>> : " + kvo.getKaddr());
		System.out.println("kvo.getKhobby() 	>>> : " + CodeUtil.hobby(kvo.getKhobby()));
		System.out.println("kvo.getKphoto() 	>>> : " + kvo.getKphoto());
		System.out.println("kvo.getKskill() 	>>> : " + kvo.getKskill());
		System.out.println("kvo.getKjob() 		>>> : " + CodeUtil.job(kvo.getKjob()));
		System.out.println("kvo.getDeleteyn() 	>>> : " + kvo.getDeleteyn());
		System.out.println("kvo.getInsertdate() >>> : " + kvo.getInsertdate());
		System.out.println("kvo.getInsertdate() >>> : " + kvo.getUpdatedate());
	}

}