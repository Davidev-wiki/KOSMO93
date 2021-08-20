package a.b.c.swing.member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import a.b.c.board.common.KckBoardConnProperty;
import a.b.c.common.KckConnProperty2;
import a.b.c.swing.member.sql.SwingMemberSqlMap;
import a.b.c.swing.member.vo.SwingMemberVO;

public class SwingMemberDAOImpl implements SwingMemberDAO {

	// ��ü ��ȸ
	@Override
	public ArrayList<SwingMemberVO> smSelectAll() {
		// TODO Auto-generated method stub
		System.out.println("SwingMemberDAOImpl.smSelectAll()�Լ� ������");

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;

		ArrayList<SwingMemberVO> aList = null;

		try {
			conn = KckBoardConnProperty.getConnection();
			pstmt = conn.prepareStatement(SwingMemberSqlMap.getsmSelectAllQuery());
			
			rsRs = pstmt.executeQuery();

			if (rsRs != null) {

				aList = new ArrayList<SwingMemberVO>();

				while (rsRs.next()) {

					SwingMemberVO _svo = new SwingMemberVO();

					_svo.setSwnum(rsRs.getString(1));
					_svo.setSwname(rsRs.getString(2));
					_svo.setSwid(rsRs.getString(3));
					_svo.setSwpw(rsRs.getString(4));
					_svo.setDeleteyn(rsRs.getString(5));
					_svo.setInsertdate(rsRs.getString(6));
					_svo.setUpdatedate(rsRs.getString(7));

					aList.add(_svo);
				}
			}

			KckBoardConnProperty.conClose(conn, pstmt, rsRs);

		} catch (Exception e) {
			System.out.println("������ ��ȸ�� ������ �߻��߽��ϴ�.");
		} finally {
			KckBoardConnProperty.conClose(conn, pstmt, rsRs);
		}

		return aList;
	}

	// ������ȸ : ȸ�� ��ȣ
	@Override
	public ArrayList<SwingMemberVO> smSelect(SwingMemberVO svo) {
		// TODO Auto-generated method stub
		System.out.println("SwingMemberDAOImpl.smSelect()�Լ� ������");

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;

		ArrayList<SwingMemberVO> aList = null;

		try {
			conn = KckBoardConnProperty.getConnection();
			pstmt = conn.prepareStatement(SwingMemberSqlMap.getsmSelectQuery());
			pstmt.clearParameters();
			pstmt.setString(1, svo.getSwnum());

			rsRs = pstmt.executeQuery();

			if (rsRs != null) {

				aList = new ArrayList<SwingMemberVO>();

				while (rsRs.next()) {

					SwingMemberVO _svo = new SwingMemberVO();

					_svo.setSwnum(rsRs.getString(1));
					_svo.setSwname(rsRs.getString(2));
					_svo.setSwid(rsRs.getString(3));
					_svo.setSwpw(rsRs.getString(4));
					_svo.setDeleteyn(rsRs.getString(5));
					_svo.setInsertdate(rsRs.getString(6));
					_svo.setUpdatedate(rsRs.getString(7));

					aList.add(_svo);
				}
			}

			KckBoardConnProperty.conClose(conn, pstmt, rsRs);

		} catch (Exception e) {
			System.out.println("������ ��ȸ�� ������ �߻��߽��ϴ�.");
		} finally {
			KckBoardConnProperty.conClose(conn, pstmt, rsRs);
		}

		return aList;
	}

	// ������ȸ : �̸�
	public ArrayList<SwingMemberVO> smSelectName(SwingMemberVO svo){
		System.out.println("SwingMemberDAOImpl.smSelectName()�Լ� ������");

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;

		ArrayList<SwingMemberVO> aList = null;

		try {
			conn = KckBoardConnProperty.getConnection();
			pstmt = conn.prepareStatement(SwingMemberSqlMap.getsmSelectNameQuery());
			pstmt.clearParameters();
			pstmt.setString(1, svo.getSwnum());

			rsRs = pstmt.executeQuery();

			if (rsRs != null) {

				aList = new ArrayList<SwingMemberVO>();

				while (rsRs.next()) {

					SwingMemberVO _svo = new SwingMemberVO();

					_svo.setSwnum(rsRs.getString(1));
					_svo.setSwname(rsRs.getString(2));
					_svo.setSwid(rsRs.getString(3));
					_svo.setSwpw(rsRs.getString(4));
					_svo.setDeleteyn(rsRs.getString(5));
					_svo.setInsertdate(rsRs.getString(6));
					_svo.setUpdatedate(rsRs.getString(7));

					aList.add(_svo);
				}
			}

			KckBoardConnProperty.conClose(conn, pstmt, rsRs);

		} catch (Exception e) {
			System.out.println("������ ��ȸ�� ������ �߻��߽��ϴ�.");
		} finally {
			KckBoardConnProperty.conClose(conn, pstmt, rsRs);
		}

		return aList;
	}
	
	// ������ȸ : ���̵�
	public ArrayList<SwingMemberVO> smSelectId(SwingMemberVO svo){
		System.out.println("SwingMemberDAOImpl.smSelectId()�Լ� ������");

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;

		ArrayList<SwingMemberVO> aList = null;

		try {
			conn = KckBoardConnProperty.getConnection();
			pstmt = conn.prepareStatement(SwingMemberSqlMap.getsmSelectIDQuery());
			pstmt.clearParameters();
			pstmt.setString(1, svo.getSwnum());

			rsRs = pstmt.executeQuery();

			if (rsRs != null) {

				aList = new ArrayList<SwingMemberVO>();

				while (rsRs.next()) {

					SwingMemberVO _svo = new SwingMemberVO();

					_svo.setSwnum(rsRs.getString(1));
					_svo.setSwname(rsRs.getString(2));
					_svo.setSwid(rsRs.getString(3));
					_svo.setSwpw(rsRs.getString(4));
					_svo.setDeleteyn(rsRs.getString(5));
					_svo.setInsertdate(rsRs.getString(6));
					_svo.setUpdatedate(rsRs.getString(7));

					aList.add(_svo);
				}
			}

			KckBoardConnProperty.conClose(conn, pstmt, rsRs);

		} catch (Exception e) {
			System.out.println("������ ��ȸ�� ������ �߻��߽��ϴ�.");
		} finally {
			KckBoardConnProperty.conClose(conn, pstmt, rsRs);
		}

		return aList;
	}
		
	// ���
	@Override
	public boolean smInsert(SwingMemberVO svo) {
		// TODO Auto-generated method stub
		System.out.println("SwingMemberDAOImpl.smInsert()�Լ� ������");

		// ���� ������ ���� ����.
		Connection conn = null;
		PreparedStatement pstmt = null;
		int nCnt = 0;
		boolean bool = false;

		try {
			conn = KckBoardConnProperty.getConnection();
			pstmt = conn.prepareStatement(SwingMemberSqlMap.getsmInsertQuery());
			System.out.println("DB�� ������ �������� �����߽��ϴ�!  >> " + SwingMemberSqlMap.getsmInsertQuery());

			pstmt.clearParameters();
			pstmt.setString(1, svo.getSwnum());
			pstmt.setString(2, svo.getSwname());
			pstmt.setString(3, svo.getSwid());
			pstmt.setString(4, svo.getSwpw());

			nCnt = pstmt.executeUpdate();

			if (!conn.getAutoCommit())
				conn.commit();
			if (nCnt > 0) {
				bool = true;
			}
			System.out.println("��ϵ� �� �� : " + nCnt);

			KckBoardConnProperty.conClose(conn, pstmt);

		} catch (Exception e) {
			System.out.println("DB�� �����ؼ� �Է��ϴ� �� ������ �߻��߾��! : " + e.getMessage());
		} finally {
			KckBoardConnProperty.conClose(conn, pstmt);
		}

		return bool;
	}

	// ����
	@Override
	public boolean smUpdate(SwingMemberVO svo) {
		// TODO Auto-generated method stub
		System.out.println("SwingMemberDAOImpl.smUpdate()�Լ� ������");

		// ���� ������ ���� ����.
		Connection conn = null;
		PreparedStatement pstmt = null;
		int nCnt = 0;
		boolean bool = false;

		try {
			conn = KckBoardConnProperty.getConnection();
			pstmt = conn.prepareStatement(SwingMemberSqlMap.getsmUpdateQuery());
			System.out.println("DB�� ������ �������� �����߽��ϴ�!  >> " + SwingMemberSqlMap.getsmUpdateQuery());

			pstmt.clearParameters();

			pstmt.setString(1, svo.getSwnum());
			pstmt.setString(2, svo.getSwname());

			nCnt = pstmt.executeUpdate();

			if (!conn.getAutoCommit())
				conn.commit();
			if (nCnt > 0) {
				bool = true;
			}
			System.out.println("��ϵ� �� �� : " + nCnt);

			KckBoardConnProperty.conClose(conn, pstmt);

		} catch (Exception e) {
			System.out.println("DB�� �����ؼ� ������Ʈ�ϴ��߿� ������ �߻��߾�� >> " + e.getMessage());
		} finally {
			KckBoardConnProperty.conClose(conn, pstmt);
		}

		return bool;
	}

	// ����
	@Override
	public boolean smDelete(SwingMemberVO svo) {
		// TODO Auto-generated method stub
		System.out.println("SwingMemberDAOImpl.smDelete()�Լ� ������");


		Connection conn = null;
		PreparedStatement pstmt = null;
		int nCnt = 0;
		boolean bool = false;

		try {
			conn = KckBoardConnProperty.getConnection();
			pstmt = conn.prepareStatement(SwingMemberSqlMap.getsmDeleteQuery());
			System.out.println("DB�� ������ �������� �����߽��ϴ�!  >> " + SwingMemberSqlMap.getsmDeleteQuery());

			pstmt.clearParameters();
			pstmt.setString(1, svo.getSwnum());

			nCnt = pstmt.executeUpdate();

			if (!conn.getAutoCommit())
				conn.commit();
			if (nCnt > 0) {
				bool = true;
			}
			System.out.println("��ϵ� �� �� : " + nCnt);

			KckBoardConnProperty.conClose(conn, pstmt);

		} catch (Exception e) {
			System.out.println("DB�� ������ �����ϴ� ���� ������ ������ >> " + e.getMessage());
		} finally {
			KckBoardConnProperty.conClose(conn, pstmt);
		}

		return bool;
	}

	// �α���
	public int smLoginCheck(SwingMemberVO svo) {
		System.out.println("SwingMemberDAOImpl smLoginCheck() �Լ� ���� >>> : ");		
		
		// ����� ��ü�� ���������� �����ϰ� �ʱ�ȭ �ϱ� 
		Connection        conn = null;
		PreparedStatement pstmt = null;
		ResultSet         rsRs = null;
		int nCnt = 0;
		
		try{
			conn = KckConnProperty2.getConnection();
			pstmt = conn.prepareStatement(SwingMemberSqlMap.getSmLoginCheckQuery());
			System.out.println("�α��� üũ  :: \n" + SwingMemberSqlMap.getSmLoginCheckQuery());
			
			pstmt.clearParameters();
			pstmt.setString(1, svo.getSwid());
			pstmt.setString(2, svo.getSwpw());
			rsRs = pstmt.executeQuery();
			
			if (rsRs !=null){	
				while (rsRs.next()){
					nCnt = rsRs.getInt(1);
				}
			}
			
			KckConnProperty2.conClose(conn, pstmt, rsRs);
		}catch (Exception sq){
			System.out.println(" �α���üũ DB ���� " + sq.getMessage());
			System.out.println(" ���� :: " + sq);
		}finally{
			KckConnProperty2.conClose(conn, pstmt, rsRs);
		}
		
		return nCnt;
		
	}

}