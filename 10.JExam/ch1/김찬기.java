package a.b.c.ch1;

public class 김찬기 {

	// 멤버 변수 
	public String name;
	public String role;

	// 생성자 
	public 김찬기(String name, String role){
		this.name = name;
		this.role = role;
	}
	// main 함수 : 콘솔 어플리케이션의 시작점 
	public static void main(String args[]){
		
		System.out.println("--------------------------");
		김찬기 아들 = new 김찬기("찬기", "아들");
		System.out.println("아들로 저장된 '김찬기'가 있는 주소 : " + 아들);
		System.out.println("아들 '김찬기'의 역할 : " + 아들.role);
		System.out.println("엄빠가 부릅니다 : " + 아들.name);
		System.out.println("--------------------------");

		김찬기 학생 = new 김찬기("김찬기씨", "교육생");
		System.out.println("학생으로 저장된 '김찬기'가 있는 주소 : " + 학생);
		System.out.println("훈련생 '김찬기'의 역할 : " + 학생.role);
		System.out.println("강사가 부릅니다 : " + 학생.name);
		System.out.println("--------------------------");

		김찬기 친구 = new 김찬기("레긔야", "듀오");
		System.out.println("친구로 저장된 '김찬기'가 있는 주소 : " + 친구);
		System.out.println("친구 '김찬기'의 역할 : " + 친구.role);
		System.out.println("친구가 부릅니다 : " + 친구.name);
		System.out.println("--------------------------");
		
	} // end of main 함수 
} // end of Ex_5 클래스 