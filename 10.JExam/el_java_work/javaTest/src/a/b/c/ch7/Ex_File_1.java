package a.b.c.ch7;

import java.util.Properties;

public class Ex_File_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String javaVersion = System.getProperty("java.version");
		System.out.println("javaVersion : " + javaVersion);
		
		String userDir = System.getProperty("user.dir");
		System.out.println("userDir ���� ���丮 : " + userDir);
		
		String osName = System.getProperty("os.name");
		System.out.println("osName �ü�� �̸� : " + osName);
		
		String userHome = System.getProperty("user.home");
		System.out.println("userHome ����Ȩ : " + userHome);
		
		String fileSeperator = System.getProperty("file.seperator");
		System.out.println("fileSeperator ���� ������ : " + fileSeperator);
		System.out.println("java.io.File.seperator ���� ���� ���� : " + java.io.File.separator);
		
		String pathSeperator = System.getProperty("path.seperator");
		System.out.println("pathSeperator ��� ���� ���� : " + pathSeperator);
		
//		Properties p = System.getProperties();
//		System.out.println("System.getProperties() : " + p);
//		
//		
//		for (java.util.Enumeration e = p.propertyNames(); e.hasMoreElements();) {
//			String key = (String)e.nextElement();
//			String value = p.getProperty(key);
//			System.out.println(key + " = " + value);
//		}
//		
//		p.list(System.out);
	}

}
