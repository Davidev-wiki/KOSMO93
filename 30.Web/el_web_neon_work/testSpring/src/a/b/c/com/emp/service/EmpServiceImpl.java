package a.b.c.com.emp.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import a.b.c.com.emp.dao.EmpDAO;
import a.b.c.com.emp.vo.EmpVO;

@Service
@Transactional
public class EmpServiceImpl implements EmpService{
	
	// logger 선언, what is it means?
	private Logger logger = Logger.getLogger(EmpServiceImpl.class);
	
	// 서비스에서 DAO 연결
	private EmpDAO empDAO;
	
	
	// 생성자 
	public EmpServiceImpl(){	
	}
	// 외부에서 EmpDAO타입의 작업 요청이 들어오면 empDAO로 연결한다.
	public EmpServiceImpl(EmpDAO empDAO){
		this.empDAO = empDAO;
	}
	
	
	@Override
	public List empSelectAll(){
		logger.info("EmpServiceImpl.empSelectAll() 진입");
		
		return empDAO.empSelectAll();
	}
	
	@Override
	public List empSelect(EmpVO evo){
		logger.info("EmpServiceImpl.empSelect() 진입");

		return empDAO.empSelect(evo);
	}
	
}

