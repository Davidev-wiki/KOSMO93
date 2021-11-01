package a.b.c.com.common.dao;

import org.apache.log4j.Logger;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import a.b.c.com.board.vo.SpringBoardVO;
import a.b.c.com.mem.vo.SpringMemberVO;
import a.b.c.com.rboard.vo.SpringRboardVO;

@Repository
public class ChabunDAOImpl implements ChabunDAO {
	// logger set
	private Logger logger = Logger.getLogger(ChabunDAOImpl.class);
	
	@Autowired(required=false)
	private SqlSessionTemplate sqlSession;
	
	@Override
	public SpringBoardVO getBoardChabun() {
		// TODO Auto-generated method stub
		logger.info("ChabunDAOImpl.getBoardChabun() 진입");
		return sqlSession.selectOne("getBoardChabun");
	}

	@Override
	public SpringRboardVO getRboardChabun() {
		logger.info("ChabunDAOImpl.getRboardChabun() 진입");
		return sqlSession.selectOne("getRboardChabun");
	}

	@Override
	public SpringMemberVO getMemChabun() {
		// TODO Auto-generated method stub
		logger.info("ChabunDAOImpl.getMemChabun() 진입");
		return sqlSession.selectOne("getMemChabun");
	}	
	
}
