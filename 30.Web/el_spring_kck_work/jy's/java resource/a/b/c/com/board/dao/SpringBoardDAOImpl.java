package a.b.c.com.board.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import a.b.c.com.board.vo.SpringBoardVO;

@Repository
public class SpringBoardDAOImpl implements SpringBoardDAO {
	Logger logger = Logger.getLogger(SpringBoardDAOImpl.class);
	
	// SqlSessionTemplate 은 Mybatis 쿼리문을 수행해주는 역할
	// Mybats3.0 이전에 사용하던 방식이며 DAO 클래스에 직접 SqlSession 객체를 선언하고
	// @Autowired 로 의존주입하여 쿼리문을 수행하는 방식
	@Autowired(required=false)
	private SqlSessionTemplate sqlSession;
	
	@Override
	public List<SpringBoardVO> boardSelect(SpringBoardVO bvo) {
		// TODO Auto-generated method stub
		logger.info("SpringBoardDAOImpl :: bodardSelect 함수 진입 >>");
		
		// selectList : 검색 결과를 여러 개 반환하는 경우
		return sqlSession.selectList("boardSelect", bvo);
	}// end of bodardSelect 함수

	@Override
	public List<SpringBoardVO> boardSelectAll(SpringBoardVO bvo) {
		// TODO Auto-generated method stub
		logger.info("SpringBoardDAOImpl :: boardSelectAll 함수 진입 >>");
		return sqlSession.selectList("boardSelectAll", bvo);
	}// end of boardSelectAll 함수

	@Override
	public int boardInsert(SpringBoardVO bvo) {
		// TODO Auto-generated method stub
		logger.info("SpringBoardDAOImpl :: boardInsert 함수 진입 >>");
		return (Integer)sqlSession.insert("boardInsert", bvo);
	}// end of boardInsert 함수

	@Override
	public int boardUpdate(SpringBoardVO bvo) {
		// TODO Auto-generated method stub
		logger.info("SpringBoardDAOImpl :: boardUpdate 함수 진입 >>");
		return (Integer)sqlSession.update("boardUpdate", bvo);
	}// end of boardUpdate 함수
	
	@Override
	public int boardDelete(SpringBoardVO bvo) {
		// TODO Auto-generated method stub
		logger.info("SpringBoardDAOImpl :: boardDelete 함수 진입 >>");
		return (Integer)sqlSession.update("boardDelete", bvo);
	}// end of boardDelete 함수

	@Override
	public List<SpringBoardVO> boardPwCheck(SpringBoardVO bvo) {
		// TODO Auto-generated method stub
		logger.info("SpringBoardDAOImpl :: boardPwCheck 함수 진입 >>");
		return sqlSession.selectList("boardPwCheck",bvo);
	}// end of boardIdCheck 함수

	@Override
	public List<SpringBoardVO> boardSelectPaging(SpringBoardVO bvo) {
		// TODO Auto-generated method stub
		logger.info("SpringBoardDAOImpl :: boardSelectPaging 함수 진입 >>");
		return sqlSession.selectList("boardSelectPaging", bvo);
	}// end of boardSelectPaging 함수

}

