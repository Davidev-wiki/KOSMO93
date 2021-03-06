
/*
		1. 쿼리 명령어로 테이블의 데이터를 불러오게 한다.
		2. 데이터를 저장한다 >> 어떻게? >> 컬럼별로 데이터 한개씩 >> 커서 함수를 이용한다
		3. 읽어들인 데이터를 깡통 클래스에 세팅한다.
		4. 깡통 클래스에서 데이터를 읽어온다.	
*/



package a.b.c.ch9.kckmem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import a.b.c.ch9.kck.vo.KckMemberVO;
import a.b.c.common.KckConnProperty;

public class KckMember {

	// 쿼리문
	public static final String KMEM_SELECT = "SELECT * FROM KCK_MEMBER";
	// 멤버변수

	// 함수
	public ArrayList<KckMemberVO> kmemSelectALL() {

		Connection conn = null;
//		Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;

		ArrayList<KckMemberVO> aList = null;

		try {

			conn = KckConnProperty.getConnection();
			pstmt = conn.prepareStatement(KckMember.KMEM_SELECT);
			rsRs = pstmt.executeQuery();

			if (rsRs != null) {

				aList = new ArrayList<KckMemberVO>();

				while (rsRs.next()) {

					// 1회 루프 : 1행의 데이터
					KckMemberVO kvo = new KckMemberVO();
					kvo.setKnum(rsRs.getString("Knum"));
					kvo.setKname(rsRs.getString("Kname"));
					kvo.setKid(rsRs.getString("Kid"));
					kvo.setKpw(rsRs.getString("Kpw"));
					kvo.setKbirth(rsRs.getString("Kbirth"));
					kvo.setKgender(rsRs.getString("Kgender"));
					kvo.setKtel(rsRs.getString("Ktel"));
					kvo.setKhp(rsRs.getString("Khp"));
					kvo.setKemail(rsRs.getString("Kemail"));
					kvo.setKaddr(rsRs.getString("Kaddr"));
					kvo.setKhobby(rsRs.getString("Khobby"));
					kvo.setKphoto(rsRs.getString("Kphoto"));
					kvo.setKskill(rsRs.getString("Kskill"));
					kvo.setKjob(rsRs.getString("Kjob"));
					kvo.setDeleteyn(rsRs.getString("deleteyn"));
					kvo.setInsertdate(rsRs.getString("insertdate"));
					kvo.setUpdatedate(rsRs.getString("updatedate"));

					// 1행의 데이터가 저장된 객체를 aList 배열에 넣는다.
					aList.add(kvo);
				}
			}
		} catch (Exception e) {
			System.out.println("디비연결 또는 쿼리에서 문제가 생겼슴 >>> : " + e.getMessage());
		}

		return aList;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		KckMember kckm = new KckMember();

		ArrayList<KckMemberVO> aList = kckm.kmemSelectALL();

		if (aList != null && aList.size() > 0) {
			for (int i = 0; i < aList.size(); i++) {

				KckMemberVO kvo = aList.get(i);

				System.out.print(kvo.getKnum() + " : ");
				System.out.print(kvo.getKname() + " : ");
				System.out.print(kvo.getKid() + " : ");
				System.out.print(kvo.getKpw() + " : ");
				System.out.print(kvo.getKbirth() + " : ");
				System.out.print(kvo.getKgender() + " : ");
				System.out.print(kvo.getKtel() + " : ");
				System.out.print(kvo.getKhp() + " : ");
				System.out.print(kvo.getKemail() + " : ");
				System.out.print(kvo.getKaddr() + " : ");
				System.out.print(kvo.getKhobby() + " : ");
				System.out.print(kvo.getKphoto() + " : ");
				System.out.print(kvo.getKskill() + " : ");
				System.out.print(kvo.getKjob() + " : ");
				System.out.print(kvo.getDeleteyn() + " : ");
				System.out.print(kvo.getInsertdate() + " : ");
				System.out.println(kvo.getUpdatedate());
			}
		} else {
			System.out.println("aList 에 데이터가 없네요 >>> : " + aList);
		}
	}
}