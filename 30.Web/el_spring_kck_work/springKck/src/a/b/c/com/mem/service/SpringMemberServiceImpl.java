package a.b.c.com.mem.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import a.b.c.com.mem.dao.SpringMemberDAO;
import a.b.c.com.mem.vo.SpringMemberVO;

@Service
@Transactional
public class SpringMemberServiceImpl implements SpringMemberService {

	Logger logger = Logger.getLogger(SpringMemberServiceImpl.class);

	// instance (필드 DIx -> 생성자에 DI 주입 )
	private SpringMemberDAO springMemberDAO;
	
	@Autowired(required=false)
	public SpringMemberServiceImpl(SpringMemberDAO springMemberDAO) {
		this.springMemberDAO = springMemberDAO;
	}
	
	@Override
	public List<SpringMemberVO> memberSelectAll(SpringMemberVO mvo) {
		// TODO Auto-generated method stub
		logger.info("SpringMemberServiceImpl.memberSelectAll() 진입 >>> :");
		return springMemberDAO.memberSelectAll(mvo);
	}
	@Override
	public List<SpringMemberVO> memberSelect(SpringMemberVO mvo) {
		// TODO Auto-generated method stub
		logger.info("SpringMemberServiceImpl.memberSelect() 진입 >>> :");
		return springMemberDAO.memberSelect(mvo);

	}

	@Override
	public int memberInsert(SpringMemberVO mvo) {
		// TODO Auto-generated method stub
		logger.info("SpringMemberServiceImpl.memberInsert() 진입 >>> :");
		return springMemberDAO.memberInsert(mvo);

	}

	@Override
	public int memberUpdate(SpringMemberVO mvo) {
		// TODO Auto-generated method stub
		logger.info("SpringMemberServiceImpl.memberUpdate() 진입 >>> :");
		return springMemberDAO.memberUpdate(mvo);

	}

	@Override
	public int memberDelete(SpringMemberVO mvo) {
		// TODO Auto-generated method stub
		logger.info("SpringMemberServiceImpl.memberDelete() 진입 >>> :");
		return springMemberDAO.memberDelete(mvo);

	}

	@Override
	public List<SpringMemberVO> memberIdCheck(SpringMemberVO mvo) {
		// TODO Auto-generated method stub
		logger.info("SpringMemberServiceImpl.memberIdCheck() 진입 >>> :");
		return springMemberDAO.memberIdCheck(mvo);

	}
}
