package a.b.c.mem.service;

import java.util.ArrayList;

import a.b.c.mem.dao.KckMemberDAO;
import a.b.c.mem.dao.KckMemberDAOImpl;
import a.b.c.mem.vo.KckMemberVO;

public class KckMemberServiceImpl implements KckMemberService {

	@Override
	public ArrayList<KckMemberVO> kmemSelectAll() {
		// TODO Auto-generated method stub
		System.out.println("KckMemberServiceImpl.kmemSelectAll 함수가 시작되었습니다.");
		
		KckMemberDAO kdao = new KckMemberDAOImpl();
		ArrayList<KckMemberVO> aList = kdao.kmemSelectAll();
		
		return aList;
	}

	@Override
	public ArrayList<KckMemberVO> kmemSelect(KckMemberVO kvo) {
		// TODO Auto-generated method stub
		System.out.println("KckMemberServiceImpl.kmemSelect 함수가 시작되었습니다.");

		KckMemberDAO kdao = new KckMemberDAOImpl();
		ArrayList<KckMemberVO> aList = kdao.kmemSelect(kvo);

		return aList;
	}

	@Override
	public boolean kmemInsert(KckMemberVO kvo) {
		// TODO Auto-generated method stub
		System.out.println("KckMemberServiceImpl.kmemSelect 함수가 시작되었습니다.");

		KckMemberDAO kdao = new KckMemberDAOImpl();
		boolean bool = kdao.kmemInsert(kvo);
		
		return bool;
	}

	@Override
	public boolean kmemUpdate(KckMemberVO kvo) {
		// TODO Auto-generated method stub
		System.out.println("KckMemberServiceImpl.kmemUpdate 함수가 시작되었습니다.");

		KckMemberDAO kdao = new KckMemberDAOImpl();
		boolean bool = kdao.kmemUpdate(kvo);
		
		return bool;
	}

	@Override
	public boolean kmemDelete(KckMemberVO kvo) {
		// TODO Auto-generated method stub
		System.out.println("KckMemberServiceImpl.kmemDelete 함수가 시작되었습니다.");

		KckMemberDAO kdao = new KckMemberDAOImpl();
		boolean bool = kdao.kmemDelete(kvo);
		
		return bool;
	}

}
