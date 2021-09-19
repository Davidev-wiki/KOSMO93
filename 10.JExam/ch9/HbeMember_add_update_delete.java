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
	
	// ��ü ��ȸ �Լ� 
	public ArrayList<HbeMemberVO> hmemSelectAll() {
		System.out.println("HbeMember.hmemSelectAll() �Լ� ���� ");
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		
		ArrayList<HbeMemberVO> aList = null;
		
		try {
			
			conn = HbeConnProperty.getConnection();
			pstmt = conn.prepareStatement(HbeMemberSqlMap.getHbeMemberSelectAllQuery());
			
			System.out.println("��ü��ȸ \n" + HbeMemberSqlMap.getHbeMemberSelectAllQuery());			
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
			System.out.println("hmemSelectAll() �Լ����� ��񿬰� �Ǵ� �������� ������ ����׿� >>> : " + e.getMessage());
		}
		
		return aList;
	}
	
	// �˻� ���� �Լ� 
	public ArrayList<HbeMemberVO> hmemSelect(HbeMemberVO hvo) {
		System.out.println("HbeMember.hmemSelect() �Լ� ���� ");
		HbeMemberVO.printlnHbeMemberVO(hvo);
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		
		ArrayList<HbeMemberVO> aList = null;
		
		try {
			
			conn = HbeConnProperty.getConnection();
			pstmt = conn.prepareStatement(HbeMemberSqlMap.getHbeMemberSelectQuery());
			System.out.println("������ȸ \n" + HbeMemberSqlMap.getHbeMemberSelectQuery());
			
			pstmt.clearParameters();
			// �÷��̽�Ȧ���� ���ε��� ������ �����Ѵ�. 
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
			System.out.println("hmemSelect() �Լ����� ��񿬰� �Ǵ� �������� ������ ����׿� >>> : " + e.getMessage());
		}
		
		return aList;
	}

	// ȸ�� ���
	public boolean hmemInsert(HbeMemberVO hvo) {
		System.out.println("HbeMember hmemInsert() �Լ� ���� >>> : ");
		HbeMemberVO.printlnHbeMemberVO(hvo);
		
		// ����� ��ü�� ���������� �����ϰ� �ʱ�ȭ �ϱ� 
		Connection conn = null;
		PreparedStatement pstmt = null;
		int nCnt = 0;
		boolean bool = false;
		
		try {			

			conn = HbeConnProperty.getConnection();
			System.out.println("conn.getAutoCommit() >>> : " + conn.getAutoCommit());
			
			pstmt = conn.prepareStatement(HbeMemberSqlMap.getHbeMemberInsertQuery());
			System.out.println("�Է��ϱ� >>> : \n"+ HbeMemberSqlMap.getHbeMemberInsertQuery());
  			
			// �Ķ���� Ŭ���� �� �ϱ� 
			pstmt.clearParameters();
			
			pstmt.setString(1, hvo.getHnum()); // 202108060007
			pstmt.setString(2, hvo.getHname()); // GGGG
			pstmt.setString(3, hvo.getHid());   // GG00
			pstmt.setString(4, hvo.getHpw());
			pstmt.setString(5, hvo.getHbirth());
			pstmt.setString(6, hvo.getHgender());
			pstmt.setString(7, hvo.getHtel());
			pstmt.setString(8, hvo.getHhp());			
			pstmt.setString(9, hvo.getHemail());
			pstmt.setString(10, hvo.getHaddr());
			pstmt.setString(11, hvo.getHhobby());
			pstmt.setString(12, hvo.getHphoto());
			pstmt.setString(13, hvo.getHskill());
			pstmt.setString(14, hvo.getHjob());
			/*
			sb.append("      			 HNUM 				\n"); // COLUMN 1
			sb.append("					,HNAME 				\n"); // COLUMN 2
			sb.append("					,HID 				\n"); // COLUMN 3
		    sb.append("					,HPW   				\n"); // COLUMN 4
		    sb.append("					,HBIRTH				\n"); // COLUMN 5	    
		    sb.append("					,HGENDER 			\n"); // COLUMN 6	    
		    sb.append("					,HTEL   			\n"); // COLUMN 7	    
		    sb.append("					,HHP 				\n"); // COLUMN 8	    	    
		    sb.append("					,HEMAIL				\n"); // COLUMN 9
		    sb.append("					,HADDR 				\n"); // COLUMN 10	    	    
		    sb.append("					,HHOBBY				\n"); // COLUMN 11
		    sb.append("					,HPHOTO 			\n"); // COLUMN 12
		    sb.append("					,HSKILL				\n"); // COLUMN 13
		    sb.append("					,HJOB				\n"); // COLUMN 14	    	    	  
		    sb.append("					,DELETEYN			\n"); // COLUMN 15
		    sb.append("					,INSERTDATE			\n"); // COLUMN 16
		    sb.append("					,UPDATEDATE			\n"); // COLUMN 17
			sb.append("			      )						\n");
			sb.append("	       VALUES   					\n");
			sb.append("	       		 (  					\n");
			sb.append("     				 ? 				\n"); // placeholder 1 202108060007
			sb.append("						,? 				\n"); // placeholder 2 GGGG
		    sb.append("						,?   			\n"); // placeholder 3 GG00
		    sb.append("						,?   			\n"); // placeholder 4
		    sb.append("						,? 				\n"); // placeholder 5
		    sb.append("						,? 				\n"); // placeholder 6
		    sb.append("						,?				\n"); // placeholder 7
		    sb.append("						,?				\n"); // placeholder 8
		    sb.append("						,?				\n"); // placeholder 9
		    sb.append("						,?   			\n"); // placeholder 10
		    sb.append("						,? 				\n"); // placeholder 11
		    sb.append("						,? 				\n"); // placeholder 12
		    sb.append("						,?				\n"); // placeholder 13
		    sb.append("						,?				\n"); // placeholder 14
			*/
			
			// ������ ���� ���� 
			// SELECT �� executeQuery() �Լ��� ����Ѵ�. : ������ ResultSet �̴� . 
			// INSERT, UPDATE, DELETE �� executeUpdate() �Լ��� ����Ѵ�. : ���ϰ��� int : �Ǽ��� �����Ѵ�. 
			// executeQuery() �� executeUpdate() �Լ��� ����ϱ� ������ exeute() �Լ��� ����ϸ� �ȴ�. 
			nCnt = pstmt.executeUpdate();						
			if (!conn.getAutoCommit()) conn.commit();			
			
			System.out.println("nCnt >>> : " + nCnt + " �� ��� �Ǿ��� ");
			
			if (nCnt > 0) { bool = true;}
			
			HbeConnProperty.conClose(conn, pstmt);
		}catch(Exception e) {
			System.out.println("�Է� ��񿬵��� ������ ������ϴ�. >>> : " + e);
		}finally {
			try {
				HbeConnProperty.conClose(conn, pstmt);				
			}catch(Exception e2) {}
		}
				
		return bool;
	}
	
	// ȸ�� ���� 
	public boolean hmemUpdate(HbeMemberVO hvo) {
		System.out.println("HbeMember hmemUpdate() �Լ� ���� >>> : ");
		HbeMemberVO.printlnHbeMemberVO(hvo);
		
		// ����� ��ü�� ���������� �����ϰ� �ʱ�ȭ �ϱ� 
		Connection conn = null;
		PreparedStatement pstmt = null;
		int nCnt = 0;
		boolean bool = false;
		
		try {			

			conn = HbeConnProperty.getConnection();
			System.out.println("conn.getAutoCommit() >>> : " + conn.getAutoCommit());
			
			pstmt = conn.prepareStatement(HbeMemberSqlMap.getHbeMemberUpdateQuery());
			System.out.println("�����ϱ� >>> : \n"+ HbeMemberSqlMap.getHbeMemberUpdateQuery());
  			
			// �Ķ���� Ŭ���� �� �ϱ� 
			pstmt.clearParameters();
			
			pstmt.setString(1, hvo.getHemail());
			pstmt.setString(2, hvo.getHaddr());
			pstmt.setString(3, hvo.getHhobby());			
			pstmt.setString(4, hvo.getHjob());
			pstmt.setString(5, hvo.getHnum()); 
			/*
			    sb.append("	SET  								\n");
				sb.append("			,HEMAIL 		= ?			\n"); // placeholder 1	    	    
				sb.append("			,HADDR			= ?			\n"); // placeholder 2	    
				sb.append("			,HHOBBY 		= ? 		\n"); // placeholder 3
				sb.append("			,HJOB   		= ?			\n"); // placeholder 4	        		
			    sb.append("		  	,UPDATEDATE 	= SYSDATE	\n");
				sb.append("	WHERE  	 HNUM 			= ?			\n"); // placeholder 5	    
				sb.append("	AND    	 DELETEYN 		= 'Y'  		\n");			
			*/
			
			// ������ ���� ���� 
			// SELECT �� executeQuery() �Լ��� ����Ѵ�. : ������ ResultSet �̴� . 
			// INSERT, UPDATE, DELETE �� executeUpdate() �Լ��� ����Ѵ�. : ���ϰ��� int : �Ǽ��� �����Ѵ�. 
			// executeQuery() �� executeUpdate() �Լ��� ����ϱ� ������ exeute() �Լ��� ����ϸ� �ȴ�. 
			nCnt = pstmt.executeUpdate();						
			if (!conn.getAutoCommit()) conn.commit();			
			
			System.out.println("nCnt >>> : " + nCnt + " �� ���� �Ǿ��� ");
			
			if (nCnt > 0) { bool = true;}
			
			HbeConnProperty.conClose(conn, pstmt);
		}catch(Exception e) {
			System.out.println("�Է� ��񿬵��� ������ ������ϴ�. >>> : " + e);
		}finally {
			try {
				HbeConnProperty.conClose(conn, pstmt);				
			}catch(Exception e2) {}
		}
				
		return bool;
	}
	
	// ȸ�� ����
	public boolean hmemDelete(HbeMemberVO hvo) {
		System.out.println("HbeMember hmemDelete() �Լ� ���� >>> : ");
		HbeMemberVO.printlnHbeMemberVO(hvo);
		
		// ����� ��ü�� ���������� �����ϰ� �ʱ�ȭ �ϱ� 
		Connection conn = null;
		PreparedStatement pstmt = null;
		int nCnt = 0;
		boolean bool = false;
		
		try {			

			conn = HbeConnProperty.getConnection();
			System.out.println("conn.getAutoCommit() >>> : " + conn.getAutoCommit());
			
			pstmt = conn.prepareStatement(HbeMemberSqlMap.getHbeMemberDeleteQuery());
			System.out.println("�����ϱ� >>> : \n"+ HbeMemberSqlMap.getHbeMemberDeleteQuery());
  			
			// �Ķ���� Ŭ���� �� �ϱ� 
			pstmt.clearParameters();
			pstmt.setString(1, hvo.getHnum()); 
			/*
				sb.append("	SET  								\n");
			    sb.append("		   DELETEYN 	= 'N'			\n");	    	   
			    sb.append("		  ,UPDATEDATE 	= SYSDATE		\n");
				sb.append("	WHERE  HNUM 		= ?				\n");	 // placeholder 1    
				sb.append("	AND    DELETEYN 	= 'Y'  			\n");		
			*/
			
			// ������ ���� ���� 
			// SELECT �� executeQuery() �Լ��� ����Ѵ�. : ������ ResultSet �̴� . 
			// INSERT, UPDATE, DELETE �� executeUpdate() �Լ��� ����Ѵ�. : ���ϰ��� int : �Ǽ��� �����Ѵ�. 
			// executeQuery() �� executeUpdate() �Լ��� ����ϱ� ������ exeute() �Լ��� ����ϸ� �ȴ�. 
			nCnt = pstmt.executeUpdate();						
			if (!conn.getAutoCommit()) conn.commit();			
			
			System.out.println("nCnt >>> : " + nCnt + " �� ���� �Ǿ��� ");
			
			if (nCnt > 0) { bool = true;}
			
			HbeConnProperty.conClose(conn, pstmt);
		}catch(Exception e) {
			System.out.println("�Է� ��񿬵��� ������ ������ϴ�. >>> : " + e);
		}finally {
			try {
				HbeConnProperty.conClose(conn, pstmt);				
			}catch(Exception e2) {}
		}
				
		return bool;	}

	
	// main() �Լ� : ���α׷� ������
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("ȸ������ CRUD::ISUD �׽�Ʈ >>> : ");		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			
			System.out.println("\n\nȸ������ ��ü��ȸ:SA, ������ȸ:S, ���:I, ����:U, ����:D, ����:Q");
			
			String isud = sc.next().toUpperCase();			
			if ("Q".equals(isud)) break;
			
			if ("SA".equals(isud)) {
				System.out.println("ȸ������ ��ü��ȸ >>> : " + isud);
				
				HbeMember hm = new HbeMember();
				
				ArrayList<HbeMemberVO> aList = hm.hmemSelectAll();

				if (aList !=null && aList.size() > 0) {
					for (int i=0; i < aList.size(); i++) {
						
						HbeMemberVO hvo = aList.get(i);
						HbeMemberVO.printHbeMemberVO(hvo);
					}		
				}else {
					System.out.println("aList �� �����Ͱ� ���׿� >>> : " + aList);
				}
			}
			if ("S".equals(isud)) {
				System.out.println("ȸ������ ������ȸ >>> : " + isud);
				
				System.out.println("��ȸ���� ȸ����ȣ�� �Է��Ͻÿ� >>> : ");
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
					System.out.println("aList �� �����Ͱ� ���׿� >>> : " + aList);
				}	
			}
			if ("I".equals(isud)) {
				System.out.println("ȸ������ ��� >>> : " + isud);	
				
				String hnum = "202108060007";
				String hname = "GGGG";
				String hid = "GG00";
				String hpw = "GG1234"; 
				String hbirth = "20210701";
				String hgender = "01";
				String htel = "03212341234";
				String hhp = "01012341234"; 
				String hemail = "GG00@naver.com";
				String haddr = "���� ��õ�� ���굿 77"; 
				String hhobby = "01";
				String hphoto = "abc06.jpg";
				String hskill = "Ư��7";
				String hjob = "01";
			
				HbeMember hm = new HbeMember();
				
				HbeMemberVO hvo = null;
				hvo = new HbeMemberVO();
				hvo.setHnum(hnum);
				hvo.setHname(hname);
				hvo.setHid(hid);
				hvo.setHpw(hpw);
				hvo.setHbirth(hbirth);
				hvo.setHgender(hgender);
				hvo.setHtel(htel);
				hvo.setHhp(hhp);
				hvo.setHemail(hemail);
				hvo.setHaddr(haddr);
				hvo.setHhobby(hhobby);				
				hvo.setHphoto(hphoto);
				hvo.setHskill(hskill);
				hvo.setHjob(hjob);
				
				boolean bool = hm.hmemInsert(hvo);

				if (bool) {
					System.out.println("ȸ�� ���� �Է� ���� >>> : " + bool);	
					
					ArrayList<HbeMemberVO> aList = hm.hmemSelectAll();

					if (aList !=null && aList.size() > 0) {
						for (int i=0; i < aList.size(); i++) {
							
							HbeMemberVO _hvo = aList.get(i);
							HbeMemberVO.printHbeMemberVO(_hvo);
						}		
					}else {
						System.out.println("aList �� �����Ͱ� ���׿� >>> : " + aList);
					}
				}else {
					System.out.println("ȸ�� ���� �Է� ���� >>> : " + bool);
				}	
				
			}
			if ("U".equals(isud)) {
				System.out.println("ȸ������ ���� >>> : " + isud);
				
				String hnum = "202108060006";				
				String hemail = "FF00@naver.com";
				String haddr = "���� ��õ�� ���굿 6622"; 
				String hhobby = "04";				
				String hjob = "02";
			
				HbeMember hm = new HbeMember();
				
				HbeMemberVO hvo = null;
				hvo = new HbeMemberVO();
				hvo.setHnum(hnum);			
				hvo.setHemail(hemail);
				hvo.setHaddr(haddr);
				hvo.setHhobby(hhobby);								
				hvo.setHjob(hjob);
				
				boolean bool = hm.hmemUpdate(hvo);
				if (bool) {
					System.out.println("ȸ�� ���� ���� ���� >>> : " + bool);	
					
					ArrayList<HbeMemberVO> aList = hm.hmemSelectAll();

					if (aList !=null && aList.size() > 0) {
						for (int i=0; i < aList.size(); i++) {
							
							HbeMemberVO _hvo = aList.get(i);
							HbeMemberVO.printHbeMemberVO(_hvo);
						}		
					}else {
						System.out.println("aList �� �����Ͱ� ���׿� >>> : " + aList);
					}
				}else {
					System.out.println("ȸ�� ���� ���� ���� >>> : " + bool);
				}					
			}
			if ("D".equals(isud)) {
				System.out.println("ȸ������ ���� >>> : " + isud);
				
				String hnum = "202108060006";				
			
				HbeMember hm = new HbeMember();
				
				HbeMemberVO hvo = null;
				hvo = new HbeMemberVO();
				hvo.setHnum(hnum);			
				
				boolean bool = hm.hmemDelete(hvo);
				
				if (bool) {
					System.out.println("ȸ�� ���� ���� ���� >>> : " + bool);	
					
					ArrayList<HbeMemberVO> aList = hm.hmemSelectAll();

					if (aList !=null && aList.size() > 0) {
						for (int i=0; i < aList.size(); i++) {
							
							HbeMemberVO _hvo = aList.get(i);
							HbeMemberVO.printHbeMemberVO(_hvo);
						}		
					}else {
						System.out.println("aList �� �����Ͱ� ���׿� >>> : " + aList);
					}
				}else {
					System.out.println("ȸ�� ���� ���� ���� >>> : " + bool);
				}					
			}				
		}
	}
}








