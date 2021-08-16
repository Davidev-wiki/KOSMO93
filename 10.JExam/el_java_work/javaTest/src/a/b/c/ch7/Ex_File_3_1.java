package a.b.c.ch7;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex_File_3_1 {

	static int totalFiles = 0;
	static int totalDirs = 0;
	
	public static void printFileList(File dir) {
		System.out.println("dir의 값 : " + dir);
		
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
		Scanner sc = new Scanner(System.in);
		System.out.print("경로를 입력하세요 : ");
		String s = sc.nextLine();
		
		if(s.length() == 0) {
			System.out.println("USAGE : java FileTest_5 DIRECTORY");
		}
		
		File dir = new File(s);
		
		if(!dir.exists() || !dir.isDirectory()) {
			System.out.println("유효하지 않은 디렉토리입니ㅏㄷ.");
			System.exit(0);
		}
		
		printFileList(dir);
		System.out.println();
		System.out.println("총 : " + totalFiles + " 개의 파일");
		System.out.println("총 : " + totalDirs + " 개의 디렉토리");

		
	}

}
