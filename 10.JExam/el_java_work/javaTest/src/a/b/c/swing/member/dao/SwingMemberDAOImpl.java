package a.b.c.swing.member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import a.b.c.board.common.KckBoardConnProperty;
import a.b.c.swing.member.sql.SwingMemberSqlMap;
import a.b.c.swing.member.vo.SwingMemberVO;

public class SwingMemberDAOImpl implements SwingMemberDAO {

	@Override
	public ArrayList<SwingMemberVO> smSelectAll() {
		// TODO Auto-generated method stub
		return null;
	}

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
			pstmt.setString(2, svo.getSwnum());
			pstmt.setString(3, svo.getSwnum());
			pstmt.setString(4, svo.getSwnum());

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

}
