package a.b.c.kosmo.mem.service;

import java.util.ArrayList;

import a.b.c.kosmo.mem.dao.KosmoMemberDAO;
import a.b.c.kosmo.mem.dao.KosmoMemberDAOImpl;
import a.b.c.kosmo.mem.vo.KosmoMemberVO;

public class KosmoMemberServiceImpl implements KosmoMemberService {

	@Override
	public ArrayList<KosmoMemberVO> hmemSelectAll() {
		// TODO Auto-generated method stub
		System.out.println("HbeMemberServiceImpl.hmemSelectAll() �Լ� ���� ");
		
		KosmoMemberDAO hdao = new KosmoMemberDAOImpl();
		ArrayList<KosmoMemberVO> aList = hdao.hmemSelectAll();
		return aList;
	}

	@Override
	public ArrayList<KosmoMemberVO> hmemSelect(KosmoMemberVO hvo) {
		// TODO Auto-generated method stub
		System.out.println("HbeMemberServiceImpl.hmemSelect() �Լ� ���� ");
		
		KosmoMemberDAO hdao = new KosmoMemberDAOImpl();
		ArrayList<KosmoMemberVO> aList = hdao.hmemSelect(hvo);
		return aList;
	}

	@Override
	public boolean hmemInsert(KosmoMemberVO hvo) {
		// TODO Auto-generated method stub
		System.out.println("HbeMemberServiceImpl.hmemInsert() �Լ� ���� ");
		
		KosmoMemberDAO hdao = new KosmoMemberDAOImpl();
		boolean bool = hdao.hmemInsert(hvo);
		return bool;
	}

	@Override
	public boolean hmemUpdate(KosmoMemberVO hvo) {
		// TODO Auto-generated method stub
		System.out.println("HbeMemberServiceImpl.hmemUpdate() �Լ� ���� ");
		
		KosmoMemberDAO hdao = new KosmoMemberDAOImpl();
		boolean bool = hdao.hmemUpdate(hvo);
		return bool;
	}

	@Override
	public boolean hmemDelete(KosmoMemberVO hvo) {
		// TODO Auto-generated method stub
		System.out.println("HbeMemberServiceImpl.hmemDelete() �Լ� ���� ");
		
		KosmoMemberDAO hdao = new KosmoMemberDAOImpl();
		boolean bool = hdao.hmemDelete(hvo);
		return bool;
	}

	// ������ȸ :: ȸ�� �̸� 
	@Override
	public ArrayList<KosmoMemberVO> hmemSelectName(KosmoMemberVO hvo) {
		// TODO Auto-generated method stub
		System.out.println("HbeMemberServiceImpl.hmemSelectName() �Լ� ���� ");
		
		KosmoMemberDAO hdao = new KosmoMemberDAOImpl(); 
		return hdao.hmemSelectName(hvo);
	}

	// ������ȸ :: ȸ�� ���̵�	
	@Override
	public ArrayList<KosmoMemberVO> hmemSelectId(KosmoMemberVO hvo) {
		// TODO Auto-generated method stub
		System.out.println("HbeMemberServiceImpl.hmemSelectId() �Լ� ���� ");
		
		KosmoMemberDAO hdao = new KosmoMemberDAOImpl(); 
		return hdao.hmemSelectId(hvo);

	}

}
