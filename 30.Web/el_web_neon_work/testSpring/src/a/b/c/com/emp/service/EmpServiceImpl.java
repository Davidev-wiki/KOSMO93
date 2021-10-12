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
	
	// logger ����, what is it means?
	private Logger logger = Logger.getLogger(EmpServiceImpl.class);
	
	// ���񽺿��� DAO ����
	private EmpDAO empDAO;
	
	
	// ������ 
	public EmpServiceImpl(){	
	}
	// �ܺο��� EmpDAOŸ���� �۾� ��û�� ������ empDAO�� �����Ѵ�.
	public EmpServiceImpl(EmpDAO empDAO){
		this.empDAO = empDAO;
	}
	
	
	@Override
	public List empSelectAll(){
		logger.info("EmpServiceImpl.empSelectAll() ����");
		
		return empDAO.empSelectAll();
	}
	
	@Override
	public List empSelect(EmpVO evo){
		logger.info("EmpServiceImpl.empSelect() ����");

		return empDAO.empSelect(evo);
	}
	
}
