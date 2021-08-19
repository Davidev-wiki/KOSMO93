package a.b.c.swing.member.service;

import java.util.ArrayList;

import a.b.c.swing.member.dao.SwingMemberDAO;
import a.b.c.swing.member.dao.SwingMemberDAOImpl;
import a.b.c.swing.member.vo.SwingMemberVO;

public class SwingMemberServiceImpl implements SwingMemberService {

	@Override
	public ArrayList<SwingMemberVO> smSelectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<SwingMemberVO> smSelect(SwingMemberVO svo) {
		// TODO Auto-generated method stub
		System.out.println("SwingMemberServiceImpl.smSelect()함수 진입함");
		
		SwingMemberDAO sdao = new SwingMemberDAOImpl();
		
		return sdao.smSelect(svo);
	}

	@Override
	public boolean smInsert(SwingMemberVO svo) {
		// TODO Auto-generated method stub
		System.out.println("SwingMemberServiceImpl.smInsert()함수 진입함");
		
		SwingMemberDAO sdao = new SwingMemberDAOImpl();
		
		return sdao.smInsert(svo);
	}

	@Override
	public boolean smUpdate(SwingMemberVO svo) {
		// TODO Auto-generated method stub
		System.out.println("SwingMemberServiceImpl.smUpdate()함수 진입함");

		SwingMemberDAO sdao = new SwingMemberDAOImpl();
		boolean bool = sdao.smUpdate(svo);
		
		return bool;
	}

	@Override
	public boolean smDelete(SwingMemberVO svo) {
		// TODO Auto-generated method stub
		System.out.println("SwingMemberServiceImpl.smDelete()함수 진입함");
		
		SwingMemberDAO sdao = new SwingMemberDAOImpl();
		boolean bool = sdao.smDelete(svo);
		
		return bool;
	}

}
