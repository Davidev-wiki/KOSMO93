package a.b.c.com.board.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import a.b.c.com.board.dao.SpringBoardDAO;
import a.b.c.com.board.vo.SpringBoardVO;

@Service
@Transactional
public class SpringBoardServiceImpl implements SpringBoardService {
	// logger set
	private Logger logger = Logger.getLogger(SpringBoardServiceImpl.class);
	
	// DAO instance
	private SpringBoardDAO springBoardDAO;
	
	// 생성자에 DI 주입 (자동 연동/null check해주라)
	@Autowired(required=false)
	public SpringBoardServiceImpl(SpringBoardDAO springBoardDAO) {
		this.springBoardDAO = springBoardDAO;
	}
	
	@Override
	public List<SpringBoardVO> boardSelect(SpringBoardVO bvo) {
		// TODO Auto-generated method stub
		logger.info("SpringBoardServiceImpl.boardSelect() 진입");
		return springBoardDAO.boardSelect(bvo);
	}

	@Override
	public List<SpringBoardVO> boardSelectAll(SpringBoardVO bvo) {
		// TODO Auto-generated method stub
		logger.info("SpringBoardServiceImpl.boardSelectAll() 진입");
		return springBoardDAO.boardSelectAll(bvo);
	}

	@Override
	public int boardInsert(SpringBoardVO bvo) {
		// TODO Auto-generated method stub
		logger.info("SpringBoardServiceImpl.boardInsert() 진입");
		return springBoardDAO.boardInsert(bvo);
	}

	@Override
	public int boardUpdate(SpringBoardVO bvo) {
		// TODO Auto-generated method stub
		logger.info("SpringBoardServiceImpl.boardUpdate() 진입");
		return springBoardDAO.boardUpdate(bvo);
	}

	@Override
	public int boardDelete(SpringBoardVO bvo) {
		// TODO Auto-generated method stub
		logger.info("SpringBoardServiceImpl.boardDelete() 진입");
		return springBoardDAO.boardDelete(bvo);
	}
	
	@Override
	public List<SpringBoardVO> boardPwCheck(SpringBoardVO bvo){
		return springBoardDAO.boardPwCheck(bvo);
	}

	
	
}
