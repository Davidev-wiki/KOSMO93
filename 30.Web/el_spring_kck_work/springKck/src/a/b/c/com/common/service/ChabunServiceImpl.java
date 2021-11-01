package a.b.c.com.common.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import a.b.c.com.board.vo.SpringBoardVO;
import a.b.c.com.common.dao.ChabunDAO;
import a.b.c.com.mem.vo.SpringMemberVO;
import a.b.c.com.rboard.vo.SpringRboardVO;

@Service
@Transactional
public class ChabunServiceImpl implements ChabunService {

	// logger set
	private Logger logger = Logger.getLogger(ChabunServiceImpl.class);
	
	// DAO instance
	private ChabunDAO chabunDAO;
	
	// 기본 생성자
	public ChabunServiceImpl() {
		
	}
	
	// 생성자에 DI 주입
	@Autowired(required=false)
	public ChabunServiceImpl(ChabunDAO chabunDAO) {
		this.chabunDAO = chabunDAO;
	}
	
	@Override
	public SpringBoardVO getBoardChabun() {
		// TODO Auto-generated method stub
		logger.info("ChabunServiceImpl.getBoardChabun() 진입");
		return chabunDAO.getBoardChabun();
	}
	
	@Override
	public SpringRboardVO getRboardChabun() {
		logger.info("ChabunServiceImpl.getRboardChabun() 진입");
		return chabunDAO.getRboardChabun(); 
	}
	
	@Override
	public SpringMemberVO getMemChabun() {
		// TODO Auto-generated method stub
		logger.info("ChabunServiceImpl.getMemChabun() 진입");
		return chabunDAO.getMemChabun();
	}
}
