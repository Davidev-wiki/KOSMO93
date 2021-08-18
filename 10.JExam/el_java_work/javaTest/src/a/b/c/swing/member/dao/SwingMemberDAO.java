package a.b.c.swing.member.dao;

import java.util.ArrayList;

import a.b.c.swing.member.vo.SwingMemberVO;

public interface SwingMemberDAO {

	public ArrayList<SwingMemberVO> smSelectAll();
	public ArrayList<SwingMemberVO> smSelect(SwingMemberVO svo);
	public boolean smInsert();
	public boolean smUpdate();
	public boolean smDelete();
	
}
