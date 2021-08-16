package a.b.c.ch7;

import java.io.File;
import java.io.FileReader;

import a.b.c.common.FilePath;

public class Ex_FileReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath = FilePath.FILE_PATH;

		String inFile = filePath + "/" + "Ex_FileReader.java";

		// ���� �б⸦ ���� ��ü ���� �غ� : �ʱ�ȭ;
		FileReader fr = null;
		// ����Ʈ �ڵ� ���� �ָӴ�
		int data = 0;

		try {

			// �ش� ��ο� �ִ� ������ ��ü�� ����ϴ�.
			File f = new File(inFile);
			// ������ �����ϸ� true, of false
			boolean bFile = f.exists();

			// ���� �ֳ���~?
			if (bFile) {
				// ������ �о���ּ���
				fr = new FileReader(f);
				System.out.println("fr : " + fr);

				// �о�� ����Ʈ�ڵ带 ������ ������ ����.
				data = fr.read();
				System.out.println("data" + data);
				System.out.println("(byte) data : " + (byte) data);
				System.out.println("(char) data : " + (char) data);

				while ((data = fr.read()) != -1) {
					System.out.print((char) data);
				}

				// �ϰ� ���� �۾��� ��� �����ϸ� ����� �͵� �ٽ� ����(����)
				fr.close();
				fr = null;
			} else {
				System.out.println("������ ����..");
			}

		} catch (Exception e) {
			System.out.println("��������� : " + e);
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
