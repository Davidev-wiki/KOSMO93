package a.b.c.ch7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import a.b.c.common.*;

public class Ex_BufferedWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 참조 경로
		String filePath = FilePath.FILE_PATH;

		// 읽어올 파일, 새로 출력할 파일 이름 초기화.
		String inFile = filePath + "/" + "Ex_BufferedWriter.java";
		String outFile = filePath + "/" + "Ex_BufferedWriter.txt";

		// 한글 안깨지는 2byte 짜리로 데이터 처리하기 위해 FileReader & FileWriter를 씀
		BufferedReader inbuf = null;
		BufferedWriter outbuf = null;
		FileReader fr = null;
		FileWriter fw = null;

		File f = null;
		int data = 0;

		try {
			// 파일을 생성하고, 데이터 값을 받기 위한 변수 초기화
			f = new File(inFile);
			boolean bFile = f.exists();

			if (bFile) {
				// 파일 읽어오기
				fr = new FileReader(f);
				inbuf = new BufferedReader(fr);

				// 파일 쓰기
				fw = new FileWriter(outFile);
				outbuf = new BufferedWriter(fw);

				while ((data = inbuf.read()) != -1) {
					outbuf.write(data);
					System.out.print((char) data);
				}
				outbuf.flush();

				inbuf.close();
				inbuf = null;
				outbuf.close();
				outbuf = null;
				fr.close();
				fr = null;
				fw.close();
				fw = null;
			} else {
				System.out.println("파일이 엄서용");
			}

		} catch (Exception e) {

		} finally {
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
			if (fr != null) {
				try {
					fr.close();
					fr = null;
				} catch (Exception e) {
				}
			}
			if (fw != null) {
				try {
					fw.close();
					fw = null;
				} catch (Exception e) {
				}
			}
		}

	}

}
