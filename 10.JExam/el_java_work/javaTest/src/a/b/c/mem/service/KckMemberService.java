package a.b.c.mem.service;

import java.util.ArrayList;

import a.b.c.mem.vo.KckMemberVO;

// 서비스 : 인터페이스, 깡통 클래스를 재료(아규먼트)로 받아온다
public interface KckMemberService {

	public ArrayList<KckMemberVO> kmemSelectAll();
	public ArrayList<KckMemberVO> kmemSelect(KckMemberVO kvo);
	public boolean kmemInsert(KckMemberVO kvo);
	public boolean kmemUpdate(KckMemberVO kvo);
	public boolean kmemDelete(KckMemberVO kvo);

}