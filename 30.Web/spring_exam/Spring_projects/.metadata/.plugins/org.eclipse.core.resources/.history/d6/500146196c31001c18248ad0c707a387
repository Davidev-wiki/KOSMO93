package a.b.c.com.emp.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import a.b.c.com.emp.vo.SpringEmpVO;

@Repository
public class SpringEmpDAOImpl implements SpringEmpDAO {
	private Logger logger = Logger.getLogger(SpringEmpDAOImpl.class);
	
	@Autowired(required=false)
	private SqlSession sqlSession;

	@Override
	public List springEmpSelectAll() {
		// TODO Auto-generated method stub
		logger.info("SpringEmpDAOImpl springEmpSelectAll 함수 진입 >>> : ");		
		
		return sqlSession.selectList("springEmpSelectAll");
	}

	@Override
	public List springEmpSelect(SpringEmpVO evo) {
		// TODO Auto-generated method stub
		return sqlSession.selectList("springEmpSelect", evo);
	}
}
