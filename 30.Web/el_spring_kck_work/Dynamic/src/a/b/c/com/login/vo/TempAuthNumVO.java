package a.b.c.com.login.vo;

import org.apache.log4j.Logger;

import a.b.c.com.mem.vo.SpringMemberVO;


public class TempAuthNumVO {
	private static Logger logger = Logger.getLogger(TempAuthNumVO.class);

	private int anum;
	private String authnum;
	private String memail;
	private String insertdate;
	
	public TempAuthNumVO(){
		
	}
	
	public TempAuthNumVO(int anum, String authnum, String memail, String insertdate) {
	
		this.anum = anum;
		this.authnum = authnum;
		this.memail = memail;
		this.insertdate = insertdate;
	}
	
	public int getAnum() {
		return anum;
	}
	public String getAuthnum() {
		return authnum;
	}
	public String getMemail() {
		return memail;
	}
	public String getInsertdate() {
		return insertdate;
	}
	public void setAnum(int anum) {
		this.anum = anum;
	}
	public void setAuthnum(String authnum) {
		this.authnum = authnum;
	}
	public void setMemail(String memail) {
		this.memail = memail;
	}
	public void setInsertdate(String insertdate) {
		this.insertdate = insertdate;
	}	
	
	// 매개변수 확인
	public static void printVO(TempAuthNumVO tvo){
		logger.info("TempAuthNumVO 데이터 확인 시작 >>>");
			
		logger.info("인증번호 시퀀스 >>> : " + tvo.getAnum());
		logger.info("인증번호 >>> : " + tvo.getAuthnum());
		logger.info("인증이메일 >>> : " + tvo.getMemail());
		logger.info("입력일 >>> : " + tvo.getInsertdate());		
		
		logger.info("TempAuthNumVO 데이터 확인 끝  >>> : ");	
	}
}
