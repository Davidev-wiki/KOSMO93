package a.b.c.com.vo;

public class UserVO {

	private String m_uid;
	private String m_pwd;
	
	public UserVO() {}
	
	public UserVO(String m_uid, String m_pwd) {
		super();
		this.m_uid = m_uid;
		this.m_pwd = m_pwd;
	}

	public String getM_uid() {
		return m_uid;
	}
	public void setM_uid(String m_uid) {
		this.m_uid = m_uid;
	}
	public String getM_pwd() {
		return m_pwd;
	}
	public void setM_pwd(String m_pwd) {
		this.m_pwd = m_pwd;
	}
}
