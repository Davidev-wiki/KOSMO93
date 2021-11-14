package a.b.c.com.login.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import a.b.c.com.login.dao.SpringLoginDAO;
import a.b.c.com.login.vo.TempAuthNumVO;
import a.b.c.com.login.vo.TempPwVO;
import a.b.c.com.mem.vo.SpringMemberVO;

@Service
@Transactional
public class SpringLoginServiceImpl implements SpringLoginService {

	Logger logger = Logger.getLogger(SpringLoginServiceImpl.class);
	
	private SpringLoginDAO springLoginDAO;
	
	@Autowired(required=false)
	public SpringLoginServiceImpl (SpringLoginDAO springLoginDAO) {
		this.springLoginDAO = springLoginDAO;
	}
	
	@Override
	public List<SpringMemberVO> loginCheck(SpringMemberVO mvo) {
		// TODO Auto-generated method stub
		logger.info("SpringLoginServiceImpl.loginCheck() 함수 진입 >>> :");
		return springLoginDAO.loginCheck(mvo);
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
