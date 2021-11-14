package a.b.c.com.cgi.session;

import java.util.Enumeration;
import java.util.Hashtable;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

public class K_SessionManager implements HttpSessionBindingListener {
	
	// kManager는 지역변수인가 상수인가
	private static K_SessionManager kManager = null;
	
	// 사용자 id를 저장해 둘 Hashtable
	private static Hashtable hashManager = new Hashtable();
	
	// 생성자
	private K_SessionManager() {
		
	}
	
	// 싱글톤 기법
	public static synchronized K_SessionManager getInstance() {
		
		if(kManager == null) {
			kManager = new K_SessionManager();
		}
		
		return kManager;
	}
	
	// 해당 세션에서 이미 로그인을 했는지 확인
	// 세션 아이디를 받아서 
	// 해당 세션이 로그인 상태이면 true,
	// 아니면 false를 리턴.
	public boolean isLogin(String sessionID) {
		
		boolean isLogin = false;
		
		Enumeration e = hashManager.keys();
		String key = "";
		
		// 커서함수
		while(e.hasMoreElements()) {
			key = (String)e.nextElement();
			
			if (sessionID.equals(key)) {
				isLogin = true;
			}
		}
		return isLogin;
	}
	
	// 해당 아이디 동시접속을 막기 위해
	// 이미 사용중인 아이디인지 확인
	// 유저 아이디를 받아서 해당 유저가 
	// 세션을 사용중이면 true
	// 아니면 false를 리턴
	public boolean isUsing(String userID) {
		boolean isFlag = false;
		
		Enumeration e = hashManager.keys();
		String key = "";
		
		while(e.hasMoreElements()) {
			
			key = (String)e.nextElement();
			
			if(userID.equals(hashManager.get(key))) {
				isFlag = true;
			}
		}
		return isFlag;
	}
	
	// Hashtable의 세션아이디를 유저아이디와 매칭 
	// => 세션아이디로 유저 아이디를 찾을 수 있도록?
	// Hashtable을 세션에 넣기
	// => 세션을 통해 Hashtable에 접근할 수 있게 함.
	public void setSession(HttpSession hSession, String userID) {
		// userID를 HttpSession에서 가지고 온 ID값에 저장 
		hashManager.put(hSession.getId(), userID);
		// 이 클래스를 메모리에 올려놓고 항상 유지하고 있는 상태를
		// login 이라는 문자로 세팅한 것인가?
		hSession.setAttribute("login", this.getInstance());
	}
	
	// 세션이 성립되었을 때 자동으로 호출되는 메소드
	public void valueBound(HttpSessionBindingEvent event) {
		// nothing
	}
	
	// 세션이 끊겼을 때 자동으로 호출되는 메소드
	// 세션이 끊기면 Hashtable에서 해당 세션의 정보를 삭제한다.
	public void valueUnbound(HttpSessionBindingEvent event) {
		hashManager.remove(event.getSession().getId());
	}
	
	// 세션 ID로 현재 로그인한 ID를 구분해내기
	public String getUserID(String sessionID) {
		return (String)hashManager.get(sessionID);
	}
	
	// 현재 접속자 수
	public int getUserCount(){
		return hashManager.size();
	}
}
