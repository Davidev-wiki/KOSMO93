package a.b.c.com.login.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import a.b.c.com.login.vo.TempAuthNumVO;
import a.b.c.com.login.vo.TempPwVO;
import a.b.c.com.mem.vo.SpringMemberVO;

@Repository
public class SpringLoginDAOImpl implements SpringLoginDAO {

	Logger logger = Logger.getLogger(SpringLoginDAOImpl.class);
	
	// 생성자로 연결동작 세팅 : 의존성(DI)주입
	// required=false : null 체크하기 설정
	@Autowired(required=false)
	private SqlSessionTemplate sqlSession;
	
	@Override
	public List<SpringMemberVO> loginCheck(SpringMemberVO mvo) {
		// TODO Auto-generated method stub
		return sqlSession.selectList("loginCheck", mvo);
	}

	@Override
	public List<SpringMemberVO> emailCheck(SpringMemberVO mvo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int tempAuthNumInsert(TempAuthNumVO tvo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<SpringMemberVO> emailIdFind(SpringMemberVO mvo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SpringMemberVO> pwIdCheck(SpringMemberVO mvo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SpringMemberVO> pwEmailCheck(SpringMemberVO mvo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int tempPwInsert(TempPwVO tvo) {
		// TODO Auto-generated method stub
		return 0;
	}

}
