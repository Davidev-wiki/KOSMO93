package a.b.c.ch7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import a.b.c.common.FilePath;

public class Ex_InStrReadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// InputStreamReader ��� �˾ƺ���
		/*	
			InputStreamReader isr = new InputStreamReader(new FileInputStream("Ex_InStrReadTest.java"));
				
			while ((data=isr.read()) !=-1)
			{
				// �о�� �����͸� ���ڷ� ����ȯ �ؼ� �ֿܼ� ����Ѵ�. 
				System.out.print((char)data);
			}
		 */
		// �ٸ� ��Ű������ ���� �ҷ�����
		String filePath = FilePath.FILE_PATH;
		
		// ���� �н� �� ����� ���� ����� �ʱ�ȭ
		String inFile = filePath + "/" + "Ex_InStrReadTest.java";
		
		File ff = null;
		FileInputStream fis = null;
		InputStreamReader isr = null;  // byte -> char�� ��ȯ�ϴ� io ������Ʈ��
		
		BufferedReader br = null;
		
		int data = 0;
		boolean bFile = false;
		
		try {
			
			ff = new File(inFile);
			bFile = ff.exists();
			
			// ���� ��Ʈ�� ����, �о����
			if(bFile) {
				fis = new FileInputStream(ff);
				isr = new InputStreamReader(fis);
				
				br = new BufferedReader(isr);
				
				while((data=br.read()) != -1) {
					System.out.print((char)data);
				}
				
			} else {
				System.out.println("There is no File.");
			} 
			// ����� ��� ������
			br.close(); br = null;
			isr.close(); isr = null;
			fis.close(); fis = null;
			
		} catch(Exception e) {
			System.out.println("�������� : " + e.getMessage());
		} finally {
			if(br != null) {try{br.close(); br = null;} catch(Exception e) {}}
			if(isr != null) {try{isr.close(); isr = null;} catch(Exception e) {}}
			if(fis != null) {try{fis.close(); fis = null;} catch(Exception e) {}}
		}
	}
}
