package a.b.c.com.login.dao;

import java.util.List;

import a.b.c.com.mem.vo.SpringMemberVO;

public interface SpringLoginDAO {

	public List<SpringMemberVO> loginCheck(SpringMemberVO mvo);
}
