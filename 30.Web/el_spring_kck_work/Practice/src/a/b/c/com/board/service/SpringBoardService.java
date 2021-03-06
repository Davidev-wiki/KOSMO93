package a.b.c.com.board.service;

import java.util.List;

import a.b.c.com.board.vo.SpringBoardVO;

public interface SpringBoardService {
	
	public List<SpringBoardVO> boardSelectAll(SpringBoardVO bvo);
	public List<SpringBoardVO> boardSelect(SpringBoardVO bvo);
	public int boardInsert(SpringBoardVO bvo);
	public int boardUpdate(SpringBoardVO bvo);
	public int boardDelete(SpringBoardVO bvo);
	
}
