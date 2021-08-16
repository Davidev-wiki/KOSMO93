package a.b.c.ch7;

import java.io.File;
import java.io.FileInputStream;

import a.b.c.common.FilePath;

public class Ex_FileInputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		FileInputStream fis = null;
		int data = 0;
	
	try {
					
			// Common 클래스를 사용하는 규칙 
			String path = FilePath.FILE_PATH;
			System.out.println("path >>> : " + path);
			path = path + "/" + "Ex_FileInputStream.java";
			System.out.println("path >>> : " + path);
			
			File f = new File(path);
			boolean bFile = f.exists();
			
			if (bFile) {
				
				// FileInputStream I/O 객체를 오픈한다. 
				fis = new FileInputStream(f);
				System.out.println("fis >>> : " + fis);

				data = fis.read();
				System.out.println("data >>> : " + data);
				System.out.println("(byte)data >>> : " + (byte)data);
				System.out.println("(char)data >>> : " + (char)data);

				// 바이트 단위로 읽을 때 맨 끝을 -1 표현한다. 
				while ((data=fis.read()) != -1){
					System.out.print((char)data);
				}
			
				// 정상적으로 수행 되었을 때 수행 되는 루틴 
				// FileInputStream I/O 객체를 닫는다.
				fis.close();
				
				// FileInputStream I/O 객체를 null 처리 했다. 
				// 가비지 컬렉터가 바빠서 해당 객체를 메모리에서 해제하지 않았을 때를 대비해서 
				// 해당 참조변수(여기서는 fis)에 데이터가 없다라고 표현 한 것 
				fis = null;
				
			}else {
				System.out.println("파일이 없습니다. ");
			}
			
		}catch(Exception i) {
			
			System.out.println("에러가 i.getMessage() >>> : " + i.getMessage());
			
		}finally {
			
			// 비정상 종료를 대비해서 만든 루틴 이다. 
			if (fis !=null) {
				try {
					fis.close(); fis = null;
				}catch (Exception e) {
					
				}
			}
		}
	}
}
