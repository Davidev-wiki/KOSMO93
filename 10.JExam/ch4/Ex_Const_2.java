package a.b.c.ch4;

public class  Ex_Const_2
{
	// 상수 
	// 멤버변수
	String name;
	String id;
	String pw;
	String address;

	// 생성자
	// 생성자를 이용해서 외부에서 입력된 데이터를 멤버변수에 초기화 하는 방법 
	public Ex_Const_2(String name, String id, String pw, String address){
		System.out.println("Ex_Const_2() 생성자 >>> : ");
		System.out.println("name >>> : " + name);
		System.out.println("id >>> : " + id);
		System.out.println("pw >>> : " + pw);
		System.out.println("address >>> : " + address);

		// 메인 함수에 있는 지역변수 데이터를
		// 생성자를 통해서 메인 함수 밖으로 가지고 나와서 
		// 멤버변수에 값을 대입을 한다. 
		// 멤버변수에 있는 데이터를 가지고 다른 클래스에서 사용한다. 
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.address = address;		
	}

	// 함수 
		public void printThis(){
			System.out.println("this : " + this);
			System.out.println("this : 인스턴스(복제된 객체) 스스로를 가르키는 keyword(예약어) 이다.\n");
		}


	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		System.out.println("\n====== 메인함수 시작! ======\n");
		System.out.println("\n=== 지역변수 선언 ===\n");
		System.out.println("String name = args[0];");
		System.out.println("String id = args[1];");
		System.out.println("String pw = args[2];");
		System.out.println("String address = args[3];\n");
		// 지역변수, 참조변수 
		String name = "";
		String id = "";
		String pw = "";
		String address = "";
		
		// 입력 인자값이 4개인경우 계속 진행, 아닌 경우 문장 출력
		// 명령행 인수 String args[] 배열의 길이를 체크
		if (4 == args.length)
		{
			name = args[0];
			id = args[1];
			pw = args[2];
			address = args[3];

			System.out.println("\n=== 객체 생성후 참조변수로 초기화된 멤버변수를 소환===\n");
			Ex_Const_2 ec2 = new Ex_Const_2(name, id, pw, address);
			System.out.println("ec2의 주소값 : " + ec2);
			System.out.println("\n*참고 : 여기서 ec2의 주소값은 하드웨어 메모리의 실제 주소가 아닌 JVM이 생성한 주소이다.\n");
			ec2.printThis();

			System.out.println("ec2.name : " + ec2.name);
			System.out.println("ec2.id : " + ec2.id);
			System.out.println("ec2.pw : " + ec2.pw);
			System.out.println("ec2.address : " + ec2.address);

			System.out.println("\n====== 메인함수 종료! ======\n");
		}else{
			System.out.println("입력해야 할 것 중에 뭐가 빠졌는데?");
		}
	}
}