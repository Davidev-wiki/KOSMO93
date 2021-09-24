package a.b.c.com.kosmo.notice.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import a.b.c.com.common.ConnProperty;
import a.b.c.com.kosmo.notice.sql.NoticeSqlMap;
import a.b.c.com.kosmo.notice.vo.NoticeVO;

public class NoticeDAOImpl implements NoticeDAO {

	@Override
	public ArrayList<NoticeVO> noticeSelectAll() {
		// TODO Auto-generated method stub
		System.out.println("NoticeDAOImpl.noticeSelectAll() 진입");

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		ArrayList<NoticeVO> aList = null;

		try {

			conn = ConnProperty.getConnection();
			pstmt = conn.prepareStatement(NoticeSqlMap.noticeSelectAllQuery());
			System.out.println("실행된 SelectAllQuery : " + NoticeSqlMap.noticeSelectAllQuery());
			rsRs = pstmt.executeQuery();

			if (rsRs != null) {

				aList = new ArrayList<NoticeVO>();

				while (rsRs.next()) {
					NoticeVO nvo = new NoticeVO();

					nvo.setNnum(rsRs.getString(1));
					nvo.setNsubject(rsRs.getString(2));
					nvo.setNmemo(rsRs.getString(3));
					nvo.setNphoto(rsRs.getString(4));
					nvo.setDeleteyn(rsRs.getString(5));
					nvo.setInsertdate(rsRs.getString(6));
					nvo.setUpdatedate(rsRs.getString(7));

					aList.add(nvo);
					NoticeVO.printlnNoticeVO(nvo);
				}
			}

			ConnProperty.conClose(conn, pstmt, rsRs);

		} catch (Exception e) {

		} finally {

			ConnProperty.conClose(conn, pstmt, rsRs);

		}

		System.out.println("NoticeDAOImpl.noticeSelectAll() 리턴 완료");
		return aList;
	}

	@Override
	public ArrayList<NoticeVO> noticeSelect(NoticeVO nvo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int noticeInsert(NoticeVO nvo) {
		// TODO Auto-generated method stub
		System.out.println("NoticeDAOImpl.noticeSelectAll() 진입");

		Connection conn = null;
		PreparedStatement pstmt = null;
		int nCnt = 0;

		try {

			conn = ConnProperty.getConnection();
			pstmt = conn.prepareStatement(NoticeSqlMap.noticeInsertQuery());
			System.out.println("실행된 Insert Query : " + NoticeSqlMap.noticeInsertQuery());
			pstmt.clearParameters();

			pstmt.setString(1, nvo.getNnum());
			pstmt.setString(2, nvo.getNsubject());
			pstmt.setString(3, nvo.getNmemo());
			pstmt.setString(4, nvo.getNphoto());

			nCnt = pstmt.executeUpdate();
			if (!conn.getAutoCommit())
				conn.getAutoCommit();

			if (nCnt > 0) {
				System.out.println("DB에 등록 완료 : " + nCnt + "건");

			} else {
				System.out.println("DB에 등록을 실패했어요..");
			}

			ConnProperty.conClose(conn, pstmt);

		} catch (Exception e) {

			System.out.println("DB에 데이터 등록중 에러가 발생했어요! : " + e.getMessage());

		} finally {
			ConnProperty.conClose(conn, pstmt);
		}

		System.out.println("NoticeDAOImpl.noticeSelectAll() 리턴 완료");
		return nCnt;
	}

	@Override
	public int noticeUpdate(NoticeVO nvo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int noticeDelete(NoticeVO nvo) {
		// TODO Auto-generated method stub
		return 0;
	}

}
