package a.b.c.ch7;

import java.io.File;

import a.b.c.common.FilePath;

public class Ex_File {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String filePath = FilePath.FILE_PATH;
		
		try {
			//File Ŭ������ �ڹٿ��� ���� �� ���� ��ü�� �ٷ�� Ŭ�����̴�.
			File f = new File("aaaaaa");
			System.out.println("f : " + f);
			System.out.println("f.getName : " + f.getName());
			
			boolean bf = f.createNewFile(); // �� ������ ������ּ���
			System.out.println("bf : " + bf);
			
			boolean bdir = f.isDirectory(); // ���丮�Դϱ�?
			System.out.println("bdir : " + bdir);
			
			boolean bfile = f.isFile(); // �����Դϱ�?
			System.out.println("bfile : " + bfile);
			
			//===========================================================
			
			File f1 = new File(filePath + "/" + "aaa.txt");
			System.out.println("f1 : " + f1);
			System.out.println("f1.getName : " + f1.getName());
			
			boolean bf1 = f1.createNewFile();
			System.out.println("bf1 : " + bf1);
			
			boolean bdir1 = f1.isDirectory();
			
			boolean bfile1 = f1.isFile();
			
			
			
		} catch(Exception e) {
	
		}
	}

}
