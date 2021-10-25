package com.spring.lesson.dao;

import java.util.List;

import com.spring.lesson.vo.LessonVO;

public interface LessonMapper {
	/*
 	전체 조회인 경우, List에 객체를 담아 반복 출력을 위해 리턴타입을 fix
 	조건 조회인 경우, no에 해당하는 1건의 데이터가 담긴 객체면 되므로 리턴타입을 fix.
 	등록의 경우, 등록할 데이터를 객체에 저장한 것을 DB로 가져가 등록한 뒤 등록 건 수만 리턴함.
	수정도 마찬가지, 수정할 데이터를 객체에 저장한 것을 DB로 가져가 수정한 뒤 수정 건 수만 리턴함.
 	삭제도 해당 no만 가지고 함수실행 완료 후 삭제 건 수만 리턴.	 	
	*/
	public List<LessonVO> listLesson(LessonVO param);
	public LessonVO selectLesson(int no);
	public int insertLesson(LessonVO param);
	public int updateLesson(LessonVO param);
	public int deleteLesson(int no);
}
