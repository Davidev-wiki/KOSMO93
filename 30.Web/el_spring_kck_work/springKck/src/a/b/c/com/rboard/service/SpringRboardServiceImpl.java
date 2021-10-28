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

	// logger set
	private Logger logger = Logger.getLogger(SpringRboardServiceImpl.class);
	
	// DAO 연결(null check)
	@Autowired(required=false)
	private SpringRboardDAO springRboardDAO;
	
	@Override
	public List<SpringRboardVO> rboardSelect(SpringRboardVO rbvo) {
		// TODO Auto-generated method stub
		logger.info("SpringRboardServiceImpl.rboardSelect() 진입 >>> :");
		return springRboardDAO.rboardSelect(rbvo);
	}

	@Override
	public List<SpringRboardVO> rboardSelectAll(SpringRboardVO rbvo) {
		// TODO Auto-generated method stub
		logger.info("SpringRboardServiceImpl.rboardSelectAll() 진입 >>> :");
		return springRboardDAO.rboardSelectAll(rbvo);
	}

	@Override
	public int rboardInsert(SpringRboardVO rbvo) {
		// TODO Auto-generated method stub
		logger.info("SpringRboardServiceImpl.rboardInsert() 진입 >>> :");
		return springRboardDAO.rboardInsert(rbvo);
	}

	@Override
	public int rboardDelete(SpringRboardVO rbvo) {
		// TODO Auto-generated method stub
		logger.info("SpringRboardServiceImpl.rboardDelete() 진입 >>> :");
		return springRboardDAO.rboardDelete(rbvo);
	}

}
