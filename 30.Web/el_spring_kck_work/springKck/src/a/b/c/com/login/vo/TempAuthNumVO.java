package a.b.c.com.login.vo;

import org.apache.log4j.Logger;

public class TempAuthNumVO {
	
	private static Logger logger = Logger.getLogger(TempAuthNumVO.class);
	
	private int anum; 			// 인증번호 시퀀스
	private String authnum;		// 인증번호
	private String memail;		// 인증이메일
	private String insertdate;	// 입력일
	
	public TempAuthNumVO() {
		
	}

	public TempAuthNumVO(int anum, String authnum, String memail, String insertdate) {
		super();
		this.anum = anum;
		this.authnum = authnum;
		this.memail = memail;
		this.insertdate = insertdate;
	}

	public static Logger getLogger() {
		return logger;
	}

	public static void setLogger(Logger logger) {
		TempAuthNumVO.logger = logger;
	}

	public int getAnum() {
		return anum;
	}

	public void setAnum(int anum) {
		this.anum = anum;
	}

	public String getAuthnum() {
		return authnum;
	}

	public void setAuthnum(String authnum) {
		this.authnum = authnum;
	}

	public String getMemail() {
		return memail;
	}

	public void setMemail(String memail) {
		this.memail = memail;
	}

	public String getInsertdate() {
		return insertdate;
	}

	public void setInsertdate(String insertdate) {
		this.insertdate = insertdate;
	}
	

	// 매개변수 확인
	public static void printVO(TempAuthNumVO tvo) {
		
		logger.info("TempAuthNumVO 데이터 확인 시작 >>> : ");

		logger.info("인증번호 시퀀스 >>> : " + tvo.getAnum());
		logger.info("인증번호 >>> : " + tvo.getAuthnum());
		logger.info("인증 이메일 >>> : " + tvo.getMemail());
		logger.info("입력일 >>> : " + tvo.getInsertdate());
		
		logger.info("TempAuthNumVO 데이터 확인 끝 >>> : ");
		
	}
	
			
}
