package a.b.c.board.service;

import java.util.ArrayList;

import a.b.c.board.dao.KckBoardDAO;
import a.b.c.board.dao.KckBoardDAOImpl;
import a.b.c.board.vo.KckBoardVO;

public class KckBoardServiceImpl implements KckBoardService {

	@Override
	public ArrayList<KckBoardVO> kboardSelectAll() {
		// TODO Auto-generated method stub
		System.out.println("KckBoardServiceImpl.kboardSelectAll()함수 진입-");
		
		KckBoardDAO kdao = new KckBoardDAOImpl();
		
		return kdao.kboardSelectAll();

	}

	@Override
	public ArrayList<KckBoardVO> kboardSelect(KckBoardVO kvo) {
		// TODO Auto-generated method stub
		System.out.println("KckBoardServiceImpl.kboardSelect()함수 진입-");
		
		KckBoardDAO kdao = new KckBoardDAOImpl();
		
		return kdao.kboardSelect(kvo);
	}

	@Override
	public int kboardInsert(KckBoardVO kvo) {
		// TODO Auto-generated method stub
		System.out.println("KckBoardServiceImpl.kboardInsert()함수 진입-");
		
		KckBoardDAO kdao = new KckBoardDAOImpl();
		
		return kdao.kboardInsert(kvo);
	}

	@Override
	public int kboardUpdate(KckBoardVO kvo) {
		// TODO Auto-generated method stub
		System.out.println("KckBoardServiceImpl.kboardUpdate()함수 진입-");
		
		KckBoardDAO kdao = new KckBoardDAOImpl();
		
		return kdao.kboardUpdate(kvo);
	}

	@Override
	public int kboardDelete(KckBoardVO kvo) {
		// TODO Auto-generated method stub
		System.out.println("KckBoardServiceImpl.kboardDelete()함수 진입-");
		
		KckBoardDAO kdao = new KckBoardDAOImpl();
		
		return kdao.kboardDelete(kvo);
	}
}
