package a.b.c.com.common.dao;

import org.apache.log4j.Logger;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import a.b.c.com.board.vo.SpringBoardVO;
import a.b.c.com.rboard.vo.SpringRboardVO;

@Repository
public class ChabunDAOImpl implements ChabunDAO {
	private Logger logger = Logger.getLogger(ChabunDAOImpl.class);
	
	@Autowired(required=false)
	private SqlSessionTemplate sqlSession;
	
	@Override
	public SpringBoardVO getBoardChabun() {
		// TODO Auto-generated method stub
		logger.info("ChabunDAOImpl :: getBoardChabun 함수 진입 >>");
		return sqlSession.selectOne("getBoardChabun");
	}// end of getBoardChabun 함수

	@Override
	public SpringRboardVO getRboardChabun() {
		// TODO Auto-generated method stub
		logger.info("ChabunDAOImpl :: getBoardChabun 함수 진입 >>");
		return sqlSession.selectOne("getRboardChabun");
	}// end of getBoardChabun 함수

}