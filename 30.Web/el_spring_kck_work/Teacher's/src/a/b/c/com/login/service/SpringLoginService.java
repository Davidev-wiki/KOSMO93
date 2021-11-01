package a.b.c.com.login.service;

import java.util.List;

import a.b.c.com.mem.vo.SpringMemberVO;

public interface SpringLoginService {

	public List<SpringMemberVO> loginCheck(SpringMemberVO mvo);
}
