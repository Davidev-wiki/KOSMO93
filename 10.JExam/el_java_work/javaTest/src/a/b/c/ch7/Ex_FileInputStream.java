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
			String path = FilePath.FILE_PATH;
			path += "/" + "Ex_FileInputStream.java";
			System.out.println("path : " + path);

			File f = new File(path);
			boolean bFile = f.exists();

			if (bFile) {
				fis = new FileInputStream(f);
				System.out.println("fis : " + fis);

				data = fis.read();
				System.out.println(data);
				System.out.println((byte) data);
				System.out.println((char) data);

				while ((data = fis.read()) != -1) {
					System.out.print((char)data);
				}

				fis.close();
				fis = null;

			} else {
				System.out.println("파일이 존재하지 않습니다.");
			}
		} catch (Exception e) {
			System.out.println("에러났어요 : " + e);
		} finally {
			if (fis != null) {
				try {
					fis.close();
					fis = null;
				} catch (Exception e) {

				}
			}
		}
	}
}
