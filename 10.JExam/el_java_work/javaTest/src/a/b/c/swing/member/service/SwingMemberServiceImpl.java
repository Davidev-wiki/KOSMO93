package a.b.c.swing.member.service;

import java.util.ArrayList;

import a.b.c.swing.member.dao.SwingMemberDAO;
import a.b.c.swing.member.dao.SwingMemberDAOImpl;
import a.b.c.swing.member.vo.SwingMemberVO;

public class SwingMemberServiceImpl implements SwingMemberService {

	// 전체 조회
	@Override
	public ArrayList<SwingMemberVO> smSelectAll() {
		// TODO Auto-generated method stub
		System.out.println("SwingMemberServiceImpl.smSelectAll함수 진입함");
		
		SwingMemberDAO sdao = new SwingMemberDAOImpl();
		ArrayList<SwingMemberVO> aList = sdao.smSelectAll();
		
		return aList;
	}

	// 조건 조회 : 일반(회원번호로 조회하기)
	@Override
	public ArrayList<SwingMemberVO> smSelect(SwingMemberVO svo) {
		// TODO Auto-generated method stub
		System.out.println("SwingMemberServiceImpl.smSelect()함수 진입함");
		
		SwingMemberDAO sdao = new SwingMemberDAOImpl();
		
		return sdao.smSelect(svo);
	}
	
	// 조건 조회 : 이름
	@Override
	public ArrayList<SwingMemberVO> smSelectName(SwingMemberVO svo){
		System.out.println("SwingMemberServiceImpl.smSelectName()함수 진입함");

		SwingMemberDAO sdao = new SwingMemberDAOImpl();
		ArrayList<SwingMemberVO> aList = sdao.smSelectName(svo);
		
		return aList;
		
	}

	// 조건 조회 : 아이디
	@Override
	public ArrayList<SwingMemberVO> smSelectId(SwingMemberVO svo){
		System.out.println("SwingMemberServiceImpl.smSelectId()함수 진입함");

		SwingMemberDAO sdao = new SwingMemberDAOImpl();
		ArrayList<SwingMemberVO> aList = sdao.smSelectId(svo);
		
		return aList;
	}

	// 등록
	@Override
	public boolean smInsert(SwingMemberVO svo) {
		// TODO Auto-generated method stub
		System.out.println("SwingMemberServiceImpl.smInsert()함수 진입함");
		
		SwingMemberDAO sdao = new SwingMemberDAOImpl();
		
		return sdao.smInsert(svo);
	}

	// 수정
	@Override
	public boolean smUpdate(SwingMemberVO svo) {
		// TODO Auto-generated method stub
		System.out.println("SwingMemberServiceImpl.smUpdate()함수 진입함");

		SwingMemberDAO sdao = new SwingMemberDAOImpl();
		boolean bool = sdao.smUpdate(svo);
		
		return bool;
	}

	// 삭제
	@Override
	public boolean smDelete(SwingMemberVO svo) {
		// TODO Auto-generated method stub
		System.out.println("SwingMemberServiceImpl.smDelete()함수 진입함");
		
		SwingMemberDAO sdao = new SwingMemberDAOImpl();
		boolean bool = sdao.smDelete(svo);
		
		return bool;
	}

	// 로그인 체크
	public int smLoginCheck(SwingMemberVO svo) {
		
		System.out.println("SwingMemberServiceImpl.smLoginCheck() 함수 진입 ");
		SwingMemberDAO sdao = new SwingMemberDAOImpl();
		
		int nCnt = sdao.smLoginCheck(svo);
		
		return nCnt;
	}

	
}
