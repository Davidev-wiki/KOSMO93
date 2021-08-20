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
		// ���� ��� ����
		String filePath = FilePath.FILE_PATH;
		// ������ ���� �̸�, ���� ���� ���� �̸� ���� �ʱ�ȭ
		String inFile = filePath + "/" + "Ex_InOutStrReadTest.java";
		String outFile = filePath + "/" + "Ex_InOutStrReadTest.txt";
		
		// �ʿ��� ��ɵ� �ʱ�ȭ�ϱ�
		
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
			// ��ο� �� ������ �����.
			
			ff = new File(inFile);
			bFile = ff.exists();
			
			if(bFile) {
				// 1. ��ǲ ��Ʈ���� ���� [�Է�]
				fis = new FileInputStream(ff);
				// 2. ��ǲ ��Ʈ�� ���� ����
				isr = new InputStreamReader(fis);
				// 3. ���۵� ���� ����
				br = new BufferedReader(isr);
				
				// 1. �ƿ� ��Ʈ�� ���� [���]
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
