package a.b.c.ch7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import a.b.c.common.FilePath;

public class Ex_InOutStrReadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 파일 경로 설정
		String filePath = FilePath.FILE_PATH;
		// 가져올 파일 이름, 새로 만들 파일 이름 변수 초기화
		String inFile = filePath + "/" + "Ex_InOutStrReadTest.java";
		String outFile = filePath + "/" + "Ex_InOutStrReadTest.txt";
		
		// 필요한 기능들 초기화하기
		
		File ff = null;
		FileInputStream fis = null;
		FileOutputStream fos = null;
		InputStreamReader isr = null;
		OutputStreamWriter osw = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		int data = 0;
		boolean bFile = false;
		
		try {
			// 경로에 새 파일을 만든다.
			
			ff = new File(inFile);
			bFile = ff.exists();
			
			if(bFile) {
				// 1. 인풋 스트림을 생성 [입력]
				fis = new FileInputStream(ff);
				// 2. 인풋 스트림 리더 생성
				isr = new InputStreamReader(fis);
				// 3. 버퍼드 리터 생성
				br = new BufferedReader(isr);
				
				// 1. 아웃 스트림 생성 [출력]
				fos = new FileOutputStream(outFile);
				osw = new OutputStreamWriter(fos);
				bw= new BufferedWriter(osw);
				
			} else {
				System.out.println("There is no File.");
			}
			
		} catch (Exception e) {
			
		} finally {
			
		}

	}

}
