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
	Logger logger = Logger.getLogger(SpringBoardServiceImpl.class);
	
	// 서비스에서 DAO 연결하기
	private SpringBoardDAO springBoardDAO;
	
	// 생성자 @Autowired 어노테이션으로 DI (의존성 주입하기)
	// 그러므로 required=false로 꼭하기.
	@Autowired(required=false)
	public SpringBoardServiceImpl(SpringBoardDAO springBoardDAO) {
		this.springBoardDAO = springBoardDAO;
	}
	
	@Override
	public List<SpringBoardVO> boardSelect(SpringBoardVO bvo) {
		// TODO Auto-generated method stub
		logger.info("SpringBoardServiceImpl :: boardSelect 함수 진입 >>");
		return springBoardDAO.boardSelect(bvo);
	}// end of boardSelect 함수

	@Override
	public List<SpringBoardVO> boardSelectAll(SpringBoardVO bvo) {
		// TODO Auto-generated method stub
		logger.info("SpringBoardServiceImpl :: boardSelectAll 함수 진입 >>");
		return springBoardDAO.boardSelectAll(bvo);
	}// end of boardSelectAll 함수

	@Override
	public int boardInsert(SpringBoardVO bvo) {
		// TODO Auto-generated method stub
		logger.info("SpringBoardServiceImpl :: boardInsert 함수 진입 >>");
		return springBoardDAO.boardInsert(bvo);
	}// end of boardInsert 함수

	@Override
	public int boardUpdate(SpringBoardVO bvo) {
		// TODO Auto-generated method stub
		logger.info("SpringBoardServiceImpl :: boardUpadate 함수 진입 >>");
		return springBoardDAO.boardUpdate(bvo);
	}// end of boardUpadate 함수

	@Override
	public int boardDelete(SpringBoardVO bvo) {
		// TODO Auto-generated method stub
		logger.info("SpringBoardServiceImpl :: boardDelete 함수 진입 >>");
		return springBoardDAO.boardDelete(bvo);
	}// end of boardDelete 함수

	@Override
	public List<SpringBoardVO> boardPwCheck(SpringBoardVO bvo) {
		// TODO Auto-generated method stub
		logger.info("SpringBoardServiceImpl :: boardIDCheck 함수 진입 >>");
		return springBoardDAO.boardPwCheck(bvo);
	}// end of boardPwCheck 함수

	@Override
	public List<SpringBoardVO> boardSelectPaging(SpringBoardVO bvo) {
		// TODO Auto-generated method stub
		logger.info("SpringBoardServiceImpl :: boardSelectPaging 함수 진입 >>");
		return springBoardDAO.boardSelectPaging(bvo);
	}// end of boardSelectPaging 함수

}
