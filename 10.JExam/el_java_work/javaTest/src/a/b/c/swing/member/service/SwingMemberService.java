package a.b.c.swing.member.service;

import java.util.ArrayList;

import a.b.c.swing.member.vo.SwingMemberVO;

public interface SwingMemberService {
	
	// ��ü ��ȸ 
	public ArrayList<SwingMemberVO> smSelectAll();
	
	// ���� ��ȸ
	public ArrayList<SwingMemberVO> smSelect(SwingMemberVO svo);
	
	// ������ȸ : �̸�
	public ArrayList<SwingMemberVO> smSelectName(SwingMemberVO svo);

	// ������ȸ : ���̵�
	public ArrayList<SwingMemberVO> smSelectId(SwingMemberVO svo);
	
	// ���
	public boolean smInsert(SwingMemberVO svo);

	// ����
	public boolean smUpdate(SwingMemberVO svo);

	// ����
	public boolean smDelete(SwingMemberVO svo);

	// �α��� üũ
	public int smLoginCheck(SwingMemberVO svo);
	
}