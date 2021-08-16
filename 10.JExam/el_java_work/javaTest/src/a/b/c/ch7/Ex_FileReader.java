package a.b.c.ch7;

import java.io.File;
import java.io.FileReader;

import a.b.c.common.FilePath;

public class Ex_FileReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath = FilePath.FILE_PATH;

		String inFile = filePath + "/" + "Ex_FileReader.java";

		// 파일 읽기를 위한 객체 만들 준비 : 초기화;
		FileReader fr = null;
		// 바이트 코드 담을 주머니
		int data = 0;

		try {

			// 해당 경로에 있는 파일을 객체로 만듭니다.
			File f = new File(inFile);
			// 파일이 존재하면 true, of false
			boolean bFile = f.exists();

			// 파일 있나요~?
			if (bFile) {
				// 있으면 읽어봐주세요
				fr = new FileReader(f);
				System.out.println("fr : " + fr);

				// 읽어온 바이트코드를 데이터 변수에 대입.
				data = fr.read();
				System.out.println("data" + data);
				System.out.println("(byte) data : " + (byte) data);
				System.out.println("(char) data : " + (char) data);

				while ((data = fr.read()) != -1) {
					System.out.print((char) data);
				}

				// 하고 싶은 작업을 모두 수행하면 사용한 것들 다시 정리(종료)
				fr.close();
				fr = null;
			} else {
				System.out.println("파일이 없네..");
			}

		} catch (Exception e) {
			System.out.println("오류났어요 : " + e);
		} finally {
			if (fr != null) {
				try {
					fr.close();
					fr = null;
				} catch (Exception e) {

				}
			}
		}
	}
}
