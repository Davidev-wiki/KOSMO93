package a.b.c.swing.member.service;

import java.util.ArrayList;

import a.b.c.swing.member.vo.SwingMemberVO;

public interface SwingMemberService {
	
	// 전체 조회 
	public ArrayList<SwingMemberVO> smSelectAll();
	
	// 조건 조회
	public ArrayList<SwingMemberVO> smSelect(SwingMemberVO svo);
	
	// 조건조회 : 이름
	public ArrayList<SwingMemberVO> smSelectName(SwingMemberVO svo);

	// 조건조회 : 아이디
	public ArrayList<SwingMemberVO> smSelectId(SwingMemberVO svo);
	
	// 등록
	public boolean smInsert(SwingMemberVO svo);

	// 수정
	public boolean smUpdate(SwingMemberVO svo);

	// 삭제
	public boolean smDelete(SwingMemberVO svo);

	// 로그인 체크
	public int smLoginCheck(SwingMemberVO svo);
	
}
