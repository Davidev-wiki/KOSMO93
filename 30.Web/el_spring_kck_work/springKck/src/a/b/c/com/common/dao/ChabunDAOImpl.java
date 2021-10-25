package a.b.c.com.common.dao;

import org.apache.log4j.Logger;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import a.b.c.com.board.vo.SpringBoardVO;

@Repository
public class ChabunDAOImpl implements ChabunDAO {
	// logger set
	private Logger logger = Logger.getLogger(ChabunDAOImpl.class);
	
	@Autowired(required=false)
	private SqlSessionTemplate sqlSession;
	
	@Override
	public SpringBoardVO getBoardChabun() {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("getBoardChabun");
	}

}
