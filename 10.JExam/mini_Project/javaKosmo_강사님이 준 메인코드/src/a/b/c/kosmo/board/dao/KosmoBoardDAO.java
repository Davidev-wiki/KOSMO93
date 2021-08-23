package a.b.c.kosmo.board.dao;

import java.util.ArrayList;

import a.b.c.kosmo.board.vo.KosmoBoardVO;

public interface KosmoBoardDAO {

	public ArrayList<KosmoBoardVO> hboardSelectAll();
	public ArrayList<KosmoBoardVO> hboardSelect(KosmoBoardVO hvo);
	public int hboardInsert(KosmoBoardVO hvo);
	public int hboardUpdate(KosmoBoardVO hvo);
	public int hboardDelete(KosmoBoardVO hvo);
}
