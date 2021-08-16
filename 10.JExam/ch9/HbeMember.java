package a.b.c.ch9.hbemem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

import a.b.c.ch9.hbemem.sql.HbeMemberSqlMap;
import a.b.c.ch9.hbemem.vo.HbeMemberVO;
import a.b.c.common.HbeConnProperty;

public class HbeMember {
	
	// 전체 조회 함수 
	public ArrayList<HbeMemberVO> hmemSelectAll() {
		System.out.println("HbeMember.hmemSelectAll() 함수 진입 ");
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		
		ArrayList<HbeMemberVO> aList = null;
		
		try {
			
			conn = HbeConnProperty.getConnection();
			pstmt = conn.prepareStatement(HbeMemberSqlMap.getHbeMemberSelectAllQuery());
			System.out.println("전체조회 \n" + HbeMemberSqlMap.getHbeMemberSelectAllQuery());
			
			rsRs = pstmt.executeQuery();			
						
			if (rsRs !=null) {
				
				aList = new ArrayList<HbeMemberVO>();
				
				while (rsRs.next()) {
					
					HbeMemberVO hvo = new HbeMemberVO();
					hvo.setHnum(rsRs.getString(1));
					hvo.setHname(rsRs.getString(2));
					hvo.setHid(rsRs.getString(3));
					hvo.setHpw(rsRs.getString(4));
					hvo.setHbirth(rsRs.getString(5));
					hvo.setHgender(rsRs.getString(6));
					hvo.setHtel(rsRs.getString(7));
					hvo.setHhp(rsRs.getString(8));
					hvo.setHemail(rsRs.getString(9));
					hvo.setHaddr(rsRs.getString(10));
					hvo.setHhobby(rsRs.getString(11));
					hvo.setHphoto(rsRs.getString(12));
					hvo.setHskill(rsRs.getString(13));
					hvo.setHjob(rsRs.getString(14));
					hvo.setDeleteyn(rsRs.getString(15));
					hvo.setInsertdate(rsRs.getString(16));
					hvo.setUpdatedate(rsRs.getString(17));
										
					aList.add(hvo);
				}				
			}
		}catch(Exception e) {
			System.out.println("hmemSelectAll() 함수에서 디비연결 또는 쿼리에서 문제가 생겼네요 >>> : " + e.getMessage());
		}
		
		return aList;
	}
	
	// 전체 조건 함수 
	public ArrayList<HbeMemberVO> hmemSelect(HbeMemberVO hvo) {
		System.out.println("HbeMember.hmemSelect() 함수 진입 ");
		HbeMemberVO.printlnHbeMemberVO(hvo);
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		
		ArrayList<HbeMemberVO> aList = null;
		
		try {
			
			conn = HbeConnProperty.getConnection();
			pstmt = conn.prepareStatement(HbeMemberSqlMap.getHbeMemberSelectQuery());
			System.out.println("조건조회 \n" + HbeMemberSqlMap.getHbeMemberSelectQuery());
			
			pstmt.clearParameters();
			// 
			pstmt.setString(1, hvo.getHnum());
			rsRs = pstmt.executeQuery();			
						
			if (rsRs !=null) {
				
				aList = new ArrayList<HbeMemberVO>();
				
				while (rsRs.next()) {
					
					HbeMemberVO _hvo = new HbeMemberVO();
					_hvo.setHnum(rsRs.getString(1));
					_hvo.setHname(rsRs.getString(2));
					_hvo.setHid(rsRs.getString(3));
					_hvo.setHpw(rsRs.getString(4));
					_hvo.setHbirth(rsRs.getString(5));
					_hvo.setHgender(rsRs.getString(6));
					_hvo.setHtel(rsRs.getString(7));
					_hvo.setHhp(rsRs.getString(8));
					_hvo.setHemail(rsRs.getString(9));
					_hvo.setHaddr(rsRs.getString(10));
					_hvo.setHhobby(rsRs.getString(11));
					_hvo.setHphoto(rsRs.getString(12));
					_hvo.setHskill(rsRs.getString(13));
					_hvo.setHjob(rsRs.getString(14));
					_hvo.setDeleteyn(rsRs.getString(15));
					_hvo.setInsertdate(rsRs.getString(16));
					_hvo.setUpdatedate(rsRs.getString(17));
										
					aList.add(_hvo);
				}				
			}
		}catch(Exception e) {
			System.out.println("hmemSelect() 함수에서 디비연결 또는 쿼리에서 문제가 생겼네요 >>> : " + e.getMessage());
		}
		
		return aList;
	}

	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("회원정보 CRUD::ISUD 테스트 >>> : ");		
		

		Scanner sc = new Scanner(System.in);
		
		while (true) {
			
			System.out.println("\n\n회원정보 전체조회:SA, 조건조회:S, 등록:I, 수정:U, 삭제:D, 종료:Q");
			
			String isud = sc.next().toUpperCase();
			
			if ("Q".equals(isud)) break;
			
			if ("SA".equals(isud)) {
				System.out.println("회원정보 전체조회 >>> : " + isud);
				
				HbeMember hm = new HbeMember();
				
				ArrayList<HbeMemberVO> aList = hm.hmemSelectAll();

				if (aList !=null && aList.size() > 0) {
					for (int i=0; i < aList.size(); i++) {
						
						HbeMemberVO hvo = aList.get(i);
						HbeMemberVO.printHbeMemberVO(hvo);
					}		
				}else {
					System.out.println("aList 에 데이터가 없네요 >>> : " + aList);
				}
			}
			if ("S".equals(isud)) {
				System.out.println("회원정보 조건조회 >>> : " + isud);
				
				System.out.println("조회조건 회원번호를 입력하시오 >>> : ");
				Scanner scs = new Scanner(System.in);
				String hnum = scs.next();
				
				HbeMember hm = new HbeMember();
				
				HbeMemberVO hvo = null;
				hvo = new HbeMemberVO();
				hvo.setHnum(hnum);
				
				ArrayList<HbeMemberVO> aList = hm.hmemSelect(hvo);

				if (aList !=null && aList.size() > 0) {
					for (int i=0; i < aList.size(); i++) {
						
						HbeMemberVO _hvo = aList.get(i);
						HbeMemberVO.printHbeMemberVO(_hvo);
					}		
				}else {
					System.out.println("aList 에 데이터가 없네요 >>> : " + aList);
				}	
			}
			if ("I".equals(isud)) {
				System.out.println("회원정보 등록 >>> : " + isud);	
			}
			if ("U".equals(isud)) {
				System.out.println("회원정보 수정 >>> : " + isud);
			}
			if ("D".equals(isud)) {
				System.out.println("회원정보 삭제 >>> : " + isud);
			}				
		}
	}
}








