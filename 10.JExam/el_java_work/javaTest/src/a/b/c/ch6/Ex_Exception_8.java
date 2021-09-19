package a.b.c.ch6;


// 사용자 정의 예외 클래스

class IDFormatException extends Exception{
	public IDFormatException (String s) {
		super(s);
	}
}


class IDFormatTest{
	private String userID;
	
	public String getUserID() {
		return userID;
	}
	
	public void setUserID(String userID) throws IDFormatException {
		
		if(userID == null) {
			IDFormatException ide = new IDFormatException("아이디는 null일 수 없습니다.");
			throw ide;
		}else if (userID.length() < 8 || userID.length() > 20) {
			throw new IDFormatException("아이디는 8~ 20자 사이로 입력해주세요.");
		}
		this.userID = userID;
	}
}


public class Ex_Exception_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IDFormatTest idt = new IDFormatTest();
		
		String userID = null;
		try {
			idt.setUserID(userID);
		} catch(IDFormatException i) {
			System.out.println("IDFormatException 에러 발생 : " + i.getMessage());
		}
		
		userID = "1234567";
		try {
			idt.setUserID(userID);
		} catch(IDFormatException i){
			System.out.println("IDFormatException 에러 발생 : " + i.getMessage());
		}
		
		
		System.out.println("프로그램이 끝났습니당~");
		
	}

}
