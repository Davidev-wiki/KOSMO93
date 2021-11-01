package a.b.c.com.rboard.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import a.b.c.com.rboard.dao.SpringRboardDAO;
import a.b.c.com.rboard.vo.SpringRboardVO;

@Service
@Transactional
public class SpringRboardServiceImpl implements SpringRboardService {
	Logger logger = Logger.getLogger(SpringRboardServiceImpl.class);
	
	@Autowired(required=false)
	private SpringRboardDAO springRboardDAO;
	
	@Override
	public List<SpringRboardVO> rboardSelect(SpringRboardVO rbvo) {
		// TODO Auto-generated method stub
		logger.info("SpringRboardServiceImpl rboardSelect 함수 진입 >>> : ");
		return springRboardDAO.rboardSelect(rbvo);
	}// end of rboardSelect 함수

	@Override
	public List<SpringRboardVO> rboardSelectAll(SpringRboardVO rbvo) {
		// TODO Auto-generated method stub
		logger.info("SpringRboardServiceImpl rboardSelectAll 함수 진입 >>> : ");
		return springRboardDAO.rboardSelectAll(rbvo);
	}// end of rboardSelectAll 함수

	@Override
	public int rboardInsert(SpringRboardVO rbvo) {
		// TODO Auto-generated method stub
		logger.info("SpringRboardServiceImpl rboardInsert 함수 진입 >>> : ");
		return springRboardDAO.rboardInsert(rbvo);
	}// end of rboardInsert 함수

	@Override
	public int rboardDelete(SpringRboardVO rbvo) {
		// TODO Auto-generated method stub
		logger.info("SpringRboardServiceImpl rboardDelete 함수 진입 >>> : ");
		return springRboardDAO.rboardDelete(rbvo);
	}// end of rboardDelete 함수

}
