package a.b.c.com.board.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import a.b.c.com.board.vo.SpringBoardVO;

// SqlSessionTemplate 이 클래스가 없는데?
// mybatis lib에 있음..
@Repository
public class SpringBoardDAOImpl implements SpringBoardDAO {
	
	// logger set
	private Logger logger = Logger.getLogger(SpringBoardDAOImpl.class);
	
	// Autowired set
	// null check 해줘, sqlSession 인스턴스해줘
	@Autowired(required=false)
	private SqlSessionTemplate sqlSession;
	
	
	@Override
	public List<SpringBoardVO> boardSelect(SpringBoardVO bvo) {
		// TODO Auto-generated method stub
		logger.info("SpringBoardDAOImpl.boardSelect() 진입");
		return sqlSession.selectList("boardSelect", bvo);
	}

	@Override
	public List<SpringBoardVO> boardSelectAll(SpringBoardVO bvo) {
		// TODO Auto-generated method stub
		logger.info("SpringBoardDAOImpl.boardSelectAll() 진입");
		return sqlSession.selectList("boardSelectAll", bvo);
	}

	@Override
	public int boardInsert(SpringBoardVO bvo) {
		// TODO Auto-generated method stub
		logger.info("SpringBoardDAOImpl.boardInsert() 진입");
		return (Integer)sqlSession.insert("boardInsert", bvo);
	}

	@Override
	public int boardUpdate(SpringBoardVO bvo) {
		// TODO Auto-generated method stub
		logger.info("SpringBoardDAOImpl.boardUpdate() 진입");
		return (Integer)sqlSession.update("boardUpdate", bvo);
	}

	@Override
	public int boardDelete(SpringBoardVO bvo) {
		// TODO Auto-generated method stub
		logger.info("SpringBoardDAOImpl.boardDelete() 진입");
		return (Integer)sqlSession.update("boardDelete", bvo);
	}

	@Override
	public List<SpringBoardVO> boardPwCheck(SpringBoardVO bvo) {
		// TODO Auto-generated method stub
		logger.info("SpringBoardDAOImpl.boardPwCheck() 진입");
		return sqlSession.selectList("boardPwCheck", bvo);
	}

}
