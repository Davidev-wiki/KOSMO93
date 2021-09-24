package a.b.c.com.kosmo.notice.service;

import java.util.ArrayList;

import a.b.c.com.kosmo.notice.dao.NoticeDAO;
import a.b.c.com.kosmo.notice.dao.NoticeDAOImpl;
import a.b.c.com.kosmo.notice.vo.NoticeVO;

public class NoticeServiceImpl implements NoticeService {

	@Override
	public ArrayList<NoticeVO> noticeSelectAll() {
		// TODO Auto-generated method stub
		System.out.println("NoticeServiceImpl.noticeSelectAll() ����");
		NoticeDAO ndao = new NoticeDAOImpl();
		System.out.println("NoticeServiceImpl.noticeSelectAll() ���� �Ϸ�");
		return ndao.noticeSelectAll();
	}

	@Override
	public ArrayList<NoticeVO> noticeSelect(NoticeVO nvo) {
		// TODO Auto-generated method stub
		System.out.println("NoticeServiceImpl.noticeSelect() ����");
		NoticeDAO ndao = new NoticeDAOImpl();
		System.out.println("NoticeServiceImpl.noticeSelect() ���� �Ϸ�");
		return ndao.noticeSelect(nvo);
	}

	@Override
	public int noticeInsert(NoticeVO nvo) {
		// TODO Auto-generated method stub
		System.out.println("NoticeServiceImpl.noticeInsert() ����");
		NoticeDAO ndao = new NoticeDAOImpl();
		System.out.println("NoticeServiceImpl.noticeInsert() ���� �Ϸ�");
		return ndao.noticeInsert(nvo);
	}

	@Override
	public int noticeUpdate(NoticeVO nvo) {
		// TODO Auto-generated method stub
		System.out.println("NoticeServiceImpl.noticeUpdate() ����");
		NoticeDAO ndao = new NoticeDAOImpl();
		System.out.println("NoticeServiceImpl.noticeUpdate() ���� �Ϸ�");
		return ndao.noticeUpdate(nvo);
	}

	@Override
	public int noticeDelete(NoticeVO nvo) {
		// TODO Auto-generated method stub
		System.out.println("NoticeServiceImpl.noticeDelete() ����");
		NoticeDAO ndao = new NoticeDAOImpl();
		System.out.println("NoticeServiceImpl.noticeDelete() ���� �Ϸ�");
		return ndao.noticeDelete(nvo);
	}

}
