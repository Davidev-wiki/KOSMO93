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
					
			// Common Ŭ������ ����ϴ� ��Ģ 
			String path = FilePath.FILE_PATH;
			System.out.println("path >>> : " + path);
			path = path + "/" + "Ex_FileInputStream.java";
			System.out.println("path >>> : " + path);
			
			File f = new File(path);
			boolean bFile = f.exists();
			
			if (bFile) {
				
				// FileInputStream I/O ��ü�� �����Ѵ�. 
				fis = new FileInputStream(f);
				System.out.println("fis >>> : " + fis);

				data = fis.read();
				System.out.println("data >>> : " + data);
				System.out.println("(byte)data >>> : " + (byte)data);
				System.out.println("(char)data >>> : " + (char)data);

				// ����Ʈ ������ ���� �� �� ���� -1 ǥ���Ѵ�. 
				while ((data=fis.read()) != -1){
					System.out.print((char)data);
				}
			
				// ���������� ���� �Ǿ��� �� ���� �Ǵ� ��ƾ 
				// FileInputStream I/O ��ü�� �ݴ´�.
				fis.close();
				
				// FileInputStream I/O ��ü�� null ó�� �ߴ�. 
				// ������ �÷��Ͱ� �ٺ��� �ش� ��ü�� �޸𸮿��� �������� �ʾ��� ���� ����ؼ� 
				// �ش� ��������(���⼭�� fis)�� �����Ͱ� ���ٶ�� ǥ�� �� �� 
				fis = null;
				
			}else {
				System.out.println("������ �����ϴ�. ");
			}
			
		}catch(Exception i) {
			
			System.out.println("������ i.getMessage() >>> : " + i.getMessage());
			
		}finally {
			
			// ������ ���Ḧ ����ؼ� ���� ��ƾ �̴�. 
			if (fis !=null) {
				try {
					fis.close(); fis = null;
				}catch (Exception e) {
					
				}
			}
		}
	}
}
