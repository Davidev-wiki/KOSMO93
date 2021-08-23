package a.b.c.kosmo.mem.dao;

import java.util.ArrayList;

import a.b.c.kosmo.mem.vo.KosmoMemberVO;

public interface KosmoMemberDAO {
	
	public ArrayList<KosmoMemberVO> hmemSelectAll();
	public ArrayList<KosmoMemberVO> hmemSelect(KosmoMemberVO hvo);
	public boolean hmemInsert(KosmoMemberVO hvo);
	public boolean hmemUpdate(KosmoMemberVO hvo);
	public boolean hmemDelete(KosmoMemberVO hvo);
	
	// 회원 이름 검색
	public ArrayList<KosmoMemberVO> hmemSelectName(KosmoMemberVO hvo);
	// 회원 아이디 검색
	public ArrayList<KosmoMemberVO> hmemSelectId(KosmoMemberVO hvo);	
}
