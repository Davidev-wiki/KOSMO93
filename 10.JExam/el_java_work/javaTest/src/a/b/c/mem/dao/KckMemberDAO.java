package a.b.c.mem.dao;

import java.util.ArrayList;

import a.b.c.mem.vo.KckMemberVO;

public interface KckMemberDAO {

	public ArrayList<KckMemberVO> kmemSelectAll();
	public ArrayList<KckMemberVO> kmemSelect(KckMemberVO kvo);
	public boolean kmemInsert(KckMemberVO kvo);
	public boolean kmemUpdate(KckMemberVO kvo);
	public boolean kmemDelete(KckMemberVO kvo);
	
}
