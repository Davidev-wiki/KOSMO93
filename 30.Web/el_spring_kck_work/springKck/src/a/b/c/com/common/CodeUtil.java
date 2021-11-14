package a.b.c.com.common;

public class CodeUtil {

	// 라벨 (항목 : 성별 / 휴대폰번호 / 전화번호 / 취미 / 취미 값)
	public static final String[] gender_value = {"여자" , "남자"};
	public static final String[] hp_value = {"010", "011", "016", "017"};
	public static final String[] tel_value = {"02", "031", "041", "051", "061"};
	public static final String[] hobby_label = {"알고리즘", "코딩", "분석설계", "데이터베이스", "스크립트"};
	public static final String[] hobby_value = {"01", "02", "03", "04", "05"};

	// 생년월일
	public static String birth(String s) {
		
		String s0 = "";
		String s1 = "";
		String s2 = "";
		String ss = "";
		
		if(s!=null && s.length()>0) {
			int sLen = s.length();
			if(8 == sLen) {
				s0 = s.substring(0, 4);
				s1 = s.substring(4, 6);
				s2 = s.substring(6);
				ss = s0 + "-" + s1 + "-" + s2;
			}
		}
		return ss;
	}

	// 성별 : 매개변수의 값이 "01"과 같으면 여자, 아니면 남자
	public static String gender(String s) {
		return "01".equals(s.toUpperCase()) ? "여자" : "남자";
	}
	
	// 핸드폰번호
	public static String hp(String s) {
		
		String s0 = "";
		String s1 = "";
		String s2 = "";
		String ss = "";	
		
		
		if(s!=null && s.length() > 0) {
			int sLen = s.length();
			// 길이가 10자인 경우.
			if(10 == sLen) {
				s0 = s.substring(0, 3);
				s1 = s.substring(3, 6);
				s2 = s.substring(6);
				ss = s0 + "-" + s1 + "-" + s2;
			}
			// 길이가 11자인 경우.
			if(11 == sLen) {
				s0 = s.substring(0, 3);
				s1 = s.substring(3, 7);
				s2 = s.substring(7);
				ss = s0 + "-" + s1 + "-" + s2;
			}
		}
		return ss;
	}
	
	// 전화번호
	public static String tel(String s) {
		
		String s0 = "";
		String s1 = "";
		String s2 = "";
		String ss = "";	
		
		
		if(s!=null && s.length() > 0) {
			int sLen = s.length();
			// 길이가 10자인 경우.
			if(10 == sLen) {
				s0 = s.substring(0, 3);
				s1 = s.substring(3, 6);
				s2 = s.substring(6);
				ss = s0 + "-" + s1 + "-" + s2;
			}
			// 길이가 11자인 경우.
			if(11 == sLen) {
				s0 = s.substring(0, 3);
				s1 = s.substring(3, 7);
				s2 = s.substring(7);
				ss = s0 + "-" + s1 + "-" + s2;
			}
		}
		return ss;
	}
	
	// 취미
	public static String hobbys(String s) {
		System.out.println("CodeUtil.hobbys()진입 >>> ");
		System.out.println("들어온 매개변수 >>> : " + s);
		
		String h = "";
		String ss[] = s.split(",");
		for(int i=0; i < ss.length; i++) {
			System.out.println("hobby(ss[i]) >>> : " + hobby(ss[i]));
			h += hobby(ss[i]) + " ";
		}
		return h;
	}
	
	// hobby : 문자 숫자로 들어온다. ex) 01, 02, 03, 04, 05
	// 위에 상수리스트에서 몇 번째 있는지 체크하고 값을 담아주기. 
	// label : value 형태로 매칭한다.
	public static String hobby(String s) {
		System.out.println("CodeUtil.hobby() 진입 >>> ");
		
		String h = "";
		if(s != null && s.length() > 0) {
			
			for(int i=1; i < hobby_label.length; i++) {
				if(("0" + i).equals(s)) {
					h = CodeUtil.hobby_label[i-1];
				}
			}
		}
		return h;
	}
	
	// 취미 value(값 : 코드) 세팅해주기
	// 취미 리스트에 순서와 취미 값 리스트의 순서를 매핑하기
	public static String setHobby(String s) {

		String h = "";
		for(int i=0; i < CodeUtil.hobby_label.length; i++) {
			if(CodeUtil.hobby_label[i].equals(s)) {
				h = CodeUtil.hobby_value[i];
			}
		}
		return h;
	}
	
	// 취미, 직업 value(값) 세팅
	public static int getComboindex(String s) {
		int c = 0;
		if("01".equals(s)) { c = 0; }
		if("02".equals(s)) { c = 1; }
		if("03".equals(s)) { c = 2; }
		if("04".equals(s)) { c = 3; }
		if("05".equals(s)) { c = 4; }
		if("06".equals(s)) { c = 5; }
		return c;
	}
	
	
	public static void main(String[] args) {
		
		// 위 함수들 테스트용
		// birth
		String b = CodeUtil.birth("20210102");
		System.out.println("CodeUtil.birth() test >>> : " + b);
		
		// tel (10자리)
		String t = CodeUtil.tel("0234568746");
		System.out.println("CodeUtil.tel() test >>> : " + t);

		// hp (11자리)
		String hp = CodeUtil.tel("01134568746");
		System.out.println("CodeUtil.hp() test >>> : " + hp);		
		
		// 성별
		String g = CodeUtil.gender("01");
		System.out.println("CodeUtil.gender('01') test >>> : " + g);		

		// 취미
		String h = CodeUtil.hobby("02");
		System.out.println("CodeUtil.hobby('02') test >>> : " + h);
		
		// 취미들
		String hs = CodeUtil.hobbys("01, 02, 03");
		System.out.println("CodeUtil.hobbys('01, 02, 03') test >>> : " + hs);
		
	}
}
