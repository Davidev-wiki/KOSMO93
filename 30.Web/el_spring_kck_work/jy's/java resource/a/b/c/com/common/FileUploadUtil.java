package a.b.c.com.common;

import java.util.ArrayList;
import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import com.oreilly.servlet.MultipartRequest;

public class FileUploadUtil {
	
	private String imgfilePaths;
	private int imgfileSize;
	private String encodeType;
	private MultipartRequest mr;

	public FileUploadUtil() {
		this.imgfilePaths = CommonUtils.IMG_UPLOAD_PATH;
		this.imgfileSize = CommonUtils.IMG_FILE_SIZE;
		this.encodeType = CommonUtils.EN_CODE;
	}// end of FileUplodUtil
	
	public boolean imgfileUpload(HttpServletRequest req) {
		boolean bool = imgfileUpload(req, imgfilePaths);
		return bool;
	}// end of imgfileUpload
	
	public boolean imgfileUploadSize(HttpServletRequest req) {
		boolean bool = imgfileUploadSize(req, imgfilePaths);
		return bool;
	}// end of imgfileUploadSize
	
	public boolean imgfileUpload(HttpServletRequest req, String filePath) {
		
		System.out.println("FileUploadUtil :: imgfileUpload 함수 진입 >>");
		
		boolean bool = false;
		try {
			mr = new MultipartRequest(req, filePath, imgfileSize, encodeType, new FileRename());
			System.out.println("mr >>> : " + mr);
			bool = true;
		}catch(Exception e) {
			System.out.println("imgfileUploadUtil.imgfileUpload() >>> : " + mr);
		}
		return bool;
	}// end of imgfileUpload 
	
	public boolean imgfileUploadSize(HttpServletRequest req, String filePath) {
		System.out.println("FileUploadUtil :: imgfileUploadSize 함수 진입 >>");
		
		boolean bool = false;
		try {
			mr = new MultipartRequest(req, filePath, imgfileSize, encodeType, new FileRename());
			System.out.println("mr >>> : " + mr);
			System.out.println("mr.getOriginalFilename(\"sbfile\") >>> : " + mr.getOriginalFileName("sbfile"));
			System.out.println("mr.getFilesystemName(\"sbfile\") >>> : " + mr.getFilesystemName("sbfile"));
			// 원본 이미지 파일 크기 조절하기
			ThumnailImg.thumnailFun(filePath, mr.getFilesystemName("sbfile"));
			bool=true;
		}catch(Exception e) {
			System.out.println("FileUploadUtil.imgfileUploadSize() >>>" + mr);
		}
		return bool;
	}// end of imgfileUploadSize
	
	public String getParameter(String s) {
		return mr.getParameter(s);
	}// end of getParameter
	
	public String getFileName(String f) {
		return mr.getFilesystemName(f);
	}// end of getFileName
	
	public ArrayList<String> getFileNames(){
		Enumeration<String> en = mr.getFileNames();
		ArrayList<String> a = new ArrayList<String>();
		
		while (en.hasMoreElements()) {
			String f = en.nextElement().toString();
			a.add(mr.getFilesystemName(f));
		}// end of while문
		return a;
	}// end of getFileNames 
	
}

