package a.b.c.kosmo.board.service;

import java.util.ArrayList;

import a.b.c.kosmo.board.dao.KosmoBoardDAO;
import a.b.c.kosmo.board.dao.KosmoBoardDAOImpl;
import a.b.c.kosmo.board.vo.KosmoBoardVO;

public class KosmoBoardServiceImpl implements KosmoBoardService {

	@Override
	public ArrayList<KosmoBoardVO> hboardSelectAll() {
		// TODO Auto-generated method stub
		System.out.println("HbeBoardServiceImpl hboardSelectAll() �Լ� ���� >>> : ");
		
		KosmoBoardDAO hdao = new KosmoBoardDAOImpl();		
		return hdao.hboardSelectAll();
	}

	@Override
	public ArrayList<KosmoBoardVO> hboardSelect(KosmoBoardVO hvo) {
		// TODO Auto-generated method stub
		System.out.println("HbeBoardServiceImpl hboardSelect() �Լ� ���� >>> : ");
		
		KosmoBoardDAO hdao = new KosmoBoardDAOImpl();		
		return hdao.hboardSelect(hvo);
	}

	@Override
	public int hboardInsert(KosmoBoardVO hvo) {
		// TODO Auto-generated method stub
		System.out.println("HbeBoardServiceImpl hboardInsert() �Լ� ���� >>> : ");
		
		KosmoBoardDAO hdao = new KosmoBoardDAOImpl();		
		return hdao.hboardInsert(hvo);
	}

	@Override
	public int hboardUpdate(KosmoBoardVO hvo) {
		// TODO Auto-generated method stub
		System.out.println("HbeBoardServiceImpl hboardUpdate() �Լ� ���� >>> : ");
		
		KosmoBoardDAO hdao = new KosmoBoardDAOImpl();		
		return hdao.hboardUpdate(hvo);
	}

	@Override
	public int hboardDelete(KosmoBoardVO hvo) {
		// TODO Auto-generated method stub
		System.out.println("HbeBoardServiceImpl hboardDelete() �Լ� ���� >>> : ");
		
		KosmoBoardDAO hdao = new KosmoBoardDAOImpl();		
		return hdao.hboardDelete(hvo);
	}

}
