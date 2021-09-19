package a.b.c.ch7;

import java.io.File;
import java.util.ArrayList;

public class Ex_File_3 {

	static int totalFiles = 0;
	static int totalDirs = 0;
	
	public static void printFileList(File dir) {
		System.out.println("dir�� �� : " + dir);
		
		File [] files = dir.listFiles();
		ArrayList subDir = new ArrayList();
		
		for (int i=0; i < files.length; i++) {
			String fileName = files[i].getName();
			
			if (files[i].isDirectory()) {
				fileName = "[" + fileName + "]";
				subDir.add(i +"");
			}
			System.out.println("" + fileName);
		}
		
		int dirNum = subDir.size();
		int fileNum = files.length -dirNum;
		
		totalFiles += fileNum;
		totalDirs += dirNum;
		
		System.out.println(totalFiles);
		System.out.println(totalDirs);
		System.out.println();
		
		for(int i=0; i < subDir.size(); i++) {
			int index = Integer.parseInt((String)subDir.get(i));
			printFileList(files[index]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 1) {
			System.out.println("USAGE : java FileTest_5 DIRECTORY");
		}
		File dir = new File(args[0]);
		
		if(!dir.exists() || !dir.isDirectory()) {
			System.out.println("��ȿ���� ���� ���丮�ԴϤ���.");
			System.exit(0);
		}
		
		printFileList(dir);
		System.out.println();
		System.out.println("�� : " + totalFiles + " ���� ����");
		System.out.println("�� : " + totalDirs + " ���� ���丮");

		
	}

}
