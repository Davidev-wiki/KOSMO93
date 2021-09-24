package a.b.c.com.kosmo.notice.service;

import java.util.ArrayList;

import a.b.c.com.kosmo.notice.dao.NoticeDAO;
import a.b.c.com.kosmo.notice.dao.NoticeDAOImpl;
import a.b.c.com.kosmo.notice.vo.NoticeVO;

public class NoticeServiceImpl implements NoticeService {

	@Override
	public ArrayList<NoticeVO> noticeSelectAll() {
		// TODO Auto-generated method stub
		System.out.println("NoticeServiceImpl.noticeSelectAll() 진입");
		NoticeDAO ndao = new NoticeDAOImpl();
		System.out.println("NoticeServiceImpl.noticeSelectAll() 리턴 완료");
		return ndao.noticeSelectAll();
	}

	@Override
	public ArrayList<NoticeVO> noticeSelect(NoticeVO nvo) {
		// TODO Auto-generated method stub
		System.out.println("NoticeServiceImpl.noticeSelect() 진입");
		NoticeDAO ndao = new NoticeDAOImpl();
		System.out.println("NoticeServiceImpl.noticeSelect() 리턴 완료");
		return ndao.noticeSelect(nvo);
	}

	@Override
	public int noticeInsert(NoticeVO nvo) {
		// TODO Auto-generated method stub
		System.out.println("NoticeServiceImpl.noticeInsert() 진입");
		NoticeDAO ndao = new NoticeDAOImpl();
		System.out.println("NoticeServiceImpl.noticeInsert() 리턴 완료");
		return ndao.noticeInsert(nvo);
	}

	@Override
	public int noticeUpdate(NoticeVO nvo) {
		// TODO Auto-generated method stub
		System.out.println("NoticeServiceImpl.noticeUpdate() 진입");
		NoticeDAO ndao = new NoticeDAOImpl();
		System.out.println("NoticeServiceImpl.noticeUpdate() 리턴 완료");
		return ndao.noticeUpdate(nvo);
	}

	@Override
	public int noticeDelete(NoticeVO nvo) {
		// TODO Auto-generated method stub
		System.out.println("NoticeServiceImpl.noticeDelete() 진입");
		NoticeDAO ndao = new NoticeDAOImpl();
		System.out.println("NoticeServiceImpl.noticeDelete() 리턴 완료");
		return ndao.noticeDelete(nvo);
	}

}
