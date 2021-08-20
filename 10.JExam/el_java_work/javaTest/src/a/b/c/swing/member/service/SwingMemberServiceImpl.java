package a.b.c.swing.member.service;

import java.util.ArrayList;

import a.b.c.swing.member.dao.SwingMemberDAO;
import a.b.c.swing.member.dao.SwingMemberDAOImpl;
import a.b.c.swing.member.vo.SwingMemberVO;

public class SwingMemberServiceImpl implements SwingMemberService {

	// ��ü ��ȸ
	@Override
	public ArrayList<SwingMemberVO> smSelectAll() {
		// TODO Auto-generated method stub
		System.out.println("SwingMemberServiceImpl.smSelectAll�Լ� ������");
		
		SwingMemberDAO sdao = new SwingMemberDAOImpl();
		ArrayList<SwingMemberVO> aList = sdao.smSelectAll();
		
		return aList;
	}

	// ���� ��ȸ : ȸ����ȣ
	@Override
	public ArrayList<SwingMemberVO> smSelect(SwingMemberVO svo) {
		// TODO Auto-generated method stub
		System.out.println("SwingMemberServiceImpl.smSelect()�Լ� ������");
		
		SwingMemberDAO sdao = new SwingMemberDAOImpl();
		
		return sdao.smSelect(svo);
	}
	
	// ���� ��ȸ : �̸�
	@Override
	public ArrayList<SwingMemberVO> smSelectName(SwingMemberVO svo){
		
		SwingMemberDAO sdao = new SwingMemberDAOImpl();
		ArrayList<SwingMemberVO> aList = sdao.smSelect(svo);
		
		return aList;
		
	}

	// ���� ��ȸ : ���̵�
	@Override
	public ArrayList<SwingMemberVO> smSelectId(SwingMemberVO svo){
		
		SwingMemberDAO sdao = new SwingMemberDAOImpl();
		ArrayList<SwingMemberVO> aList = sdao.smSelect(svo);
		
		return aList;
	}

	// ���
	@Override
	public boolean smInsert(SwingMemberVO svo) {
		// TODO Auto-generated method stub
		System.out.println("SwingMemberServiceImpl.smInsert()�Լ� ������");
		
		SwingMemberDAO sdao = new SwingMemberDAOImpl();
		
		return sdao.smInsert(svo);
	}

	// ����
	@Override
	public boolean smUpdate(SwingMemberVO svo) {
		// TODO Auto-generated method stub
		System.out.println("SwingMemberServiceImpl.smUpdate()�Լ� ������");

		SwingMemberDAO sdao = new SwingMemberDAOImpl();
		boolean bool = sdao.smUpdate(svo);
		
		return bool;
	}

	// ����
	@Override
	public boolean smDelete(SwingMemberVO svo) {
		// TODO Auto-generated method stub
		System.out.println("SwingMemberServiceImpl.smDelete()�Լ� ������");
		
		SwingMemberDAO sdao = new SwingMemberDAOImpl();
		boolean bool = sdao.smDelete(svo);
		
		return bool;
	}

	// �α��� üũ
	public int smLoginCheck(SwingMemberVO svo) {
		
		System.out.println("SwingMemberServiceImpl.smLoginCheck() �Լ� ���� ");
		SwingMemberDAO sdao = new SwingMemberDAOImpl();
		
		int nCnt = sdao.smLoginCheck(svo);
		
		return nCnt;
	}

	
}