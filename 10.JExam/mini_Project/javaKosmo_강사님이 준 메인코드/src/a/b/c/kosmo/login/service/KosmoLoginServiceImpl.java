package a.b.c.kosmo.login.service;

import a.b.c.kosmo.login.dao.KosmoLoginDAO;
import a.b.c.kosmo.login.dao.KosmoLoginDAOImpl;
import a.b.c.kosmo.mem.vo.KosmoMemberVO;

public class KosmoLoginServiceImpl implements KosmoLoginService {

	@Override
	public int hLoginCheck(KosmoMemberVO hvo) {
		// TODO Auto-generated method stub
		System.out.println("HbeLoginServiceImpl.hLoginCheck() 함수 진입 ");
		
		KosmoLoginDAO hdao = new KosmoLoginDAOImpl();
		return hdao.hLoginCheck(hvo);		
	}
}
