package a.b.c.ch7;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import a.b.c.common.*;

public class Ex_BufferedStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String filePath = FilePath.FILE_PATH;

		String inFile = filePath + "/" + "Ex_BufferedStream.java";
		String outFile = filePath + "/" + "Ex_BufferedStream.txt";

		BufferedInputStream inbuf = null;
		BufferedOutputStream outbuf = null;
		FileInputStream fis = null;
		FileOutputStream fos = null;
		File f = null;
		int data = 0;

		// 파일 불러오기
		try {

			f = new File(inFile);
			// 해당 경로에 설정한 파일이 있는지 체크
			boolean bFile = f.exists();

			// 파일이 있다면 아래 동작 실행하기
			if (bFile) {
				// 새로운 Stream, Buffer를 만드는 과정

				// 파일 읽어오기
				fis = new FileInputStream(f);
				inbuf = new BufferedInputStream(fis);

				// (outFile이란 이름, 뒤에 이어쓰기)파일을 쓰고 만들기
				fos = new FileOutputStream(outFile, true);
				outbuf = new BufferedOutputStream(fos);

				// 오픈한 파일의 데이터를2진수로 읽고 그것을 Buffer에 담아 내보내기
				while ((data = inbuf.read()) != -1) {
					System.out.print((char) data);
					outbuf.write(data);
				}
				// 8k 가 안되는 버퍼가 있을 수 있으므로 반드시 flush()로 잔여 데이터가 있으면 보낸다.
				outbuf.flush();

				// 오픈한 i/o 기능을 닫아준다.
				inbuf.close();
				inbuf = null;
				outbuf.close();
				outbuf = null;
				fis.close();
				fis = null;
				fos.close();
				fos = null;

			} else {
				System.out.println("파일이 없슴");
			}

		} catch (Exception e) {
			// 파일 없으면 에러메시지 보여주기
			System.out.println("에러 발생! : " + e.getMessage());
		} finally {
			// 오픈한 기능 안닫혀 있으면 닫아주기
			if (inbuf != null) {
				try {
					inbuf.close();
					inbuf = null;
				} catch (Exception e) {
				}
			}
			if (outbuf != null) {
				try {
					outbuf.close();
					outbuf = null;
				} catch (Exception e) {
				}
			}
			if (fis != null) {
				try {
					fis.close();
					fis = null;
				} catch (Exception e) {
				}
			}
			if (fos != null) {
				try {
					fos.close();
					fos = null;
				} catch (Exception e) {
				}
			}
		}
	}
}
