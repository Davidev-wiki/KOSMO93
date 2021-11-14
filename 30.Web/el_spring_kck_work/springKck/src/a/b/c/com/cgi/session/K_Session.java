package a.b.c.com.cgi.session;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class K_Session {

	private static final String K_SESSION_ID = "KID";
	
	// ======= Singleton Pattern =======
	
	// LazyHolder 클래스 생성
	private static class LazyHolder{
		public static final K_Session SESSIONLISTENER_INSTANCE = new K_Session();
	}
	
	// 세션 인스턴스 함수 호출시 '문자열' KID를 리턴하도록 만든 함수
	public static K_Session getInstance() {
		return LazyHolder.SESSIONLISTENER_INSTANCE;
	}
	
	public K_Session() {
		
	}
	
	// 세션 Kill
	// Http 프로토콜을 이용해 세션종료를 요청하는
	// 서블릿 요청이 들어오면 세션을 죽이는 함수
	public void killSession(final HttpServletRequest hReq) {
		
		HttpSession hSession = hReq.getSession(false);
		if(hSession != null) {
			// K_SESSION_ID 속성을 지운다.
			hSession.removeAttribute(K_SESSION_ID);
			// 무효화 함수로 무효화 처리
			hSession.invalidate();
		}
	}
	
	// 세션 Set : 세션을 세팅한 결과를 
	// true / false 로 반환
	public boolean setSession(final HttpServletRequest hReq, final String userID) {
		
		HttpSession hSession = hReq.getSession();
		String k_session_val = (String)hSession.getAttribute(K_SESSION_ID);
		int nCnt = 0;
		
		if(k_session_val != null) {
			// Http프로토콜에서 가져온 userID랑 
			// 문자열 userID랑 같은지 체크후 결과를 b1에 저장.
			boolean b1 = k_session_val.equals(userID);
			
			// 위 결과가 참인 경우, 카운트 + 1
			if(b1) {
				nCnt++;
				System.out.println("세션이 확인되었습니다.");
			} else {
				System.out.println("세션이 없습니다.");
			}
			
		} else {
			System.out.println("세션이 없습니다.");
		}
		
		if(nCnt == 0) {
			// hSession.invalidate();
			// 세션에 '문자열'유저 아이디를 세팅 후 false반환 ==> 왜 굳이?
			hSession.setAttribute(K_SESSION_ID, userID);
			hSession.setMaxInactiveInterval(60*60);
			
			return false;
		}

		return true;
	}
	
	// Http프로토콜의 서블릿요청에서 KID를 가져와
	// string으로 변경한 뒤 리턴하는 함수.
	/*
	    getSession(boolean)
	    
		return 1 : 현재 HttpSession
		return 2 : 새로운 세션만들어서 반환 (boolean : true) / 안만듬 (false) 
		return 3 : null

		이 요청과 관련된 [현재 HttpSession을 반환]하거나 
		현재 세션이 없고 create가 true이면 [새 세션을 반환]합니다.
		
		create가 false이고 요청에 유효한 HttpSession이 없으면 
		이 메서드는 [null을 반환]합니다.
		
		매개변수:create - 필요한 경우 이 요청에 대한 
		새 세션을 만들려면 true이고, 그렇지 않으면 false입니다. 
		
	 */
	public String getSession(final HttpServletRequest hReq) {
		
		// return할 데이터 초기화
		// 새 새션 만들지 않는 옵션 false
		String strSession = "";
		HttpSession hSession = hReq.getSession(false);
		if (hSession != null) {
			strSession = (String)hSession.getAttribute(K_SESSION_ID);
		}
		
		return strSession;
	}
	
}
