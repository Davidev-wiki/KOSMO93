package com.spring.dept.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.spring.dept.vo.DeptVO;
@Repository
public class DeptMapperImpl extends SqlSessionDaoSupport implements DeptMapper {
	// log4j
	private Logger logger = Logger.getLogger(DeptMapperImpl.class);
	
	// DB연결 로직 추가
	// 패키지 path 클래스이름 DeptDAO? : DB연결 설정하는 xml 파일의 이름.
	private final String PACKAGE_PATH = "com.spring.dept.dao.DeptDAO";
	
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
		logger.info("DeptMapperImpl.insertDepartment(DeptVO param) 진입");
		return (int)getSqlSession().insert(PACKAGE_PATH + "insertDepartment");
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
