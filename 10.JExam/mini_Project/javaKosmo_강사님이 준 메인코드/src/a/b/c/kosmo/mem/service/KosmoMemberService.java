package a.b.c.kosmo.mem.service;

import java.util.ArrayList;

import a.b.c.kosmo.mem.vo.KosmoMemberVO;

public interface KosmoMemberService {
	
	public ArrayList<KosmoMemberVO> hmemSelectAll();
	public ArrayList<KosmoMemberVO> hmemSelect(KosmoMemberVO hvo);
	public boolean hmemInsert(KosmoMemberVO hvo);
	public boolean hmemUpdate(KosmoMemberVO hvo);
	public boolean hmemDelete(KosmoMemberVO hvo);
	
	// ȸ�� �̸� �˻�
	public ArrayList<KosmoMemberVO> hmemSelectName(KosmoMemberVO hvo);
	// ȸ�� ���̵� �˻�
	public ArrayList<KosmoMemberVO> hmemSelectId(KosmoMemberVO hvo);
}
