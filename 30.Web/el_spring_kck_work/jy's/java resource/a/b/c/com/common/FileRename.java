package a.b.c.com.common;

import java.io.File;

// 임포트를 하려면 cos.jar가 있어야 한다.
import com.oreilly.servlet.multipart.FileRenamePolicy;

public class FileRename implements FileRenamePolicy {

	public FileRename() {
		System.out.println("FileRename 생성자 진입 >> ");
	}

	@Override
	public File rename(File sf) {
		// TODO Auto-generated method stub
		System.out.println("FileRename :: rename 함수 진입 >>");
		String f = sf.getName();
		System.out.println("fileName >>> : " +  f);
		
		try {
			String s = f;
			for(int i=1; sf.exists(); i++) {
				int lt = s.lastIndexOf(".");
				String s1 = s.substring(0,lt);
				String s2 = s.substring(lt);
				String st = "_" + i + "_";
				f = s1.concat(st).concat(s2);
				sf = new File(sf.getParent(), f);
			}// end of for문
		}catch(Exception e) {
			System.out.println("FileRename.reName >>> : " + e.getMessage());
		}
		
		return sf;
	}// end of rename 함수
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("FileRename :: main 함수 진입 >> ");
		File f = new File("C:\\msdia80.dll");
		File ss = new FileRename().rename(f);
		System.out.println("ss >>> : " + ss.getName());
	}// end of main 함수
}
