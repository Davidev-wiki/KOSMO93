package a.b.c.com.kosmo.mem.service;

import java.util.ArrayList;

import a.b.c.com.kosmo.mem.dao.MemberDAO;
import a.b.c.com.kosmo.mem.dao.MemberDAOImpl;
import a.b.c.com.kosmo.mem.vo.MemberVO;

public class MemberServiceImpl implements MemberService {

	@Override
	public ArrayList<MemberVO> memberSelectAll() {
		// TODO Auto-generated method stub
		
		System.out.println("MemberServiceImpl.memberSelectAll() 진입");
		
		MemberDAO mdao = new MemberDAOImpl();

		System.out.println("MemberServiceImpl.memberSelectAll() 리턴");

		return mdao.memberSelectAll();
	}

	@Override
	public ArrayList<MemberVO> memberSelect(MemberVO mvo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean memberInsert(MemberVO mvo) {
		// TODO Auto-generated method stub
		
		System.out.println("MemberServiceImpl.memberInsert() 진입");
		
		MemberDAO mdao = new MemberDAOImpl();
		
		System.out.println("MemberServiceImpl.memberInsert() 리턴");  

		return mdao.memberInsert(mvo);
	}

	@Override
	public boolean memberUpdate(MemberVO mvo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean memberDelete(MemberVO mvo) {
		// TODO Auto-generated method stub
		return false;
	}

}
