package com.spring.dept.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.spring.dept.dao.DeptMapper;
import com.spring.dept.vo.DeptVO;
@Service
public class DeptServiceImpl implements DeptService {
	private Logger logger = Logger.getLogger(DeptServiceImpl.class);
	private DeptMapper deptMapper;
	
	@Override
	public List<DeptVO> listDepartment(DeptVO param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DeptVO selectDepartment(String deptid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertDepartment(DeptVO param) {
		// TODO Auto-generated method stub
		logger.info("DeptServiceImpl.insertDepartment(DeptVO param) 진입");
		return deptMapper.insertDepartment(param);
	}

	@Override
	public int updateDepartment(DeptVO param) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteDepartment(DeptVO param) {
		// TODO Auto-generated method stub
		return 0;
	}

}
