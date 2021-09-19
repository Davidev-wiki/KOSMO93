package a.b.c.board.service;

import java.util.ArrayList;

import a.b.c.board.vo.KckBoardVO;

public interface KckBoardService {

	public ArrayList<KckBoardVO> kboardSelectAll();
	public ArrayList<KckBoardVO> kboardSelect(KckBoardVO kvo);
	public int kboardInsert(KckBoardVO kvo);
	public int kboardUpdate(KckBoardVO kvo);
	public int kboardDelete(KckBoardVO kvo);
}
