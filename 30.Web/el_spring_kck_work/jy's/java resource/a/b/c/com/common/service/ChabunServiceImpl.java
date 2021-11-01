package a.b.c.com.common.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import a.b.c.com.board.vo.SpringBoardVO;
import a.b.c.com.common.dao.ChabunDAO;
import a.b.c.com.rboard.vo.SpringRboardVO;

@Service
@Transactional
public class ChabunServiceImpl implements ChabunService {
	private Logger logger = Logger.getLogger(ChabunServiceImpl.class);
	
	private ChabunDAO chabunDAO;
	
	@Autowired(required=false)
	public ChabunServiceImpl(ChabunDAO chabunDAO) {
		this.chabunDAO = chabunDAO;
	}
	
	@Override
	public SpringBoardVO getBoardChabun() {
		// TODO Auto-generated method stub
		logger.info("ChabunServiceImpl ::getBoardChabun() 함수 진입 >>");
		return chabunDAO.getBoardChabun();
	}// end of getBoardChabun 함수

	@Override
	public SpringRboardVO getRboardChabun() {
		// TODO Auto-generated method stub
		logger.info("ChabunServiceImpl ::getRboardChabun() 함수 진입 >>");
		return chabunDAO.getRboardChabun();
	}// end of getRboardChabun 함수

}
