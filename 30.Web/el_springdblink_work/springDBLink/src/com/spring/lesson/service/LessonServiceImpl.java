package com.spring.lesson.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.lesson.dao.LessonMapper;
import com.spring.lesson.vo.LessonVO;

// 서비스임을 명시한다.
// 이 클래스에서 트랜잭션 처리를 담당한다.
@Service
@Transactional
public class LessonServiceImpl implements LessonService {
	// log4j set
	private Logger logger = Logger.getLogger(LessonServiceImpl.class);
	
	// DAO instance
	@Autowired
	private LessonMapper lessonMapper;
	
	// 전체조회
	@Override
	public List<LessonVO> listLesson(LessonVO param) {
		// TODO Auto-generated method stub
		logger.info("LessonServiceImpl.listLesson() 진입 >>> : ");
		
		// why used ArrayList?
		// List(ArrayList<LessonVO>) = 전체 조회한 결과 초기화;
		// list를 리턴.
		List<LessonVO> list = new ArrayList<LessonVO>();
		list = lessonMapper.listLesson(param);
		return list;
	}
	
	//조건조회
	@Override
	public LessonVO selectLesson(int no) {
		// TODO Auto-generated method stub
		logger.info("LessonServiceImpl.selectLesson() 진입 >>> : ");
		return lessonMapper.selectLesson(no);
	}

	@Override
	public int insertLesson(LessonVO param) {
		// TODO Auto-generated method stub
		logger.info("LessonServiceImpl.insertLesson() 진입 >>> : ");
		return lessonMapper.insertLesson(param);
	}

	@Override
	public int updateLesson(LessonVO param) {
		// TODO Auto-generated method stub
		logger.info("LessonServiceImpl.insertLesson() 진입 >>> : ");
		return lessonMapper.updateLesson(param);
	}

	@Override
	public int deleteLesson(int no) {
		// TODO Auto-generated method stub
		logger.info("LessonServiceImpl.insertLesson() 진입 >>> : ");
		return lessonMapper.deleteLesson(no);
	}

}
