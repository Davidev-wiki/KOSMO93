package a.b.c.com.common;

import java.io.File;

import com.oreilly.servlet.multipart.FileRenamePolicy;

// FileRenamePolicy를 상속받아 구현한 클래스.
public class FileRename implements FileRenamePolicy {

	// 기본 생성자
	public FileRename() {
		
	}
	
	// 구현 함수
	@Override
	public File rename(File sf) {
		
		// 매개변수로 가져온 파일의 이름을 f에 저장.
		String f = sf.getName();
		System.out.println("갖고온 파일의 이름 >>> : " + f);
		
		try {
			
			String s = f;
			// 파일이름 변경 요청이 들어오면 
			// 파라미터로 보낸 해당 파일이 있는 경우에 실행하기.
			for (int i=1; sf.exists(); i++) {
				// 갖고온 파일의 이름을 . 기준으로 개수를 센다.
				// lt에 글자 수가 저장될 것 같다
				// s1 변수에 (.)앞까지의 파일 명을 저장?
				// s2 변수에 (.)뒤에있는 확장자 명을 저장?
				// st 변수에는 이름 변경을 위한 형식을 지정한다.
				// 파일 이름을 "원래 파일이름" + "_숫자_"."확장자명"으로 합친다.
				int lt = s.lastIndexOf(".");
				String s1 = s.substring(0, lt);
				String s2 = s.substring(lt);
				String st = "_" + i + "_";
				f = s1.concat(st).concat(s2);
				// getParent() : 새 File 객체를 만드는데 부모 객체에 만드는 것인가?
				/*
				    File(File parent, String child)
					Creates a new File instance from a parent abstract pathname and a child pathname string.
					
					File(String pathname)
					Creates a new File instance by converting the given pathname string into an abstract pathname.
					
					File(String parent, String child)
					Creates a new File instance from a parent pathname string and a child pathname string.
					
					File(URI uri)
					Creates a new File instance by converting the given file: URI into an abstract pathname.
				 */
				sf = new File(sf.getParent(), f);
			}
			
		} catch(Exception e) {
			System.out.println("FileRename.rename() 에러 발생 >>> : " + e.getMessage());
		}
		
		return sf;
	}
	
	// 메인함수
	public static void main(String[] args) {
		
		// 파일을 만들고
		// 함수를 이용해 이름을 변경해보기
		// 변경된 파일 이름을 출력해보기.
		File f = new File("C:\\msdia80.dll");
		File ss = new FileRename().rename(f);
		System.out.println("ss >>> : " + ss.getName());
	}
	
}
