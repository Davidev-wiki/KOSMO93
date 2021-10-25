package a.b.c.com.common;

import java.util.ArrayList;
import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import com.oreilly.servlet.MultipartRequest;

// HttpServletRequest를 통해 요청이 들어왔을 때,
// 재귀함수 실행 boolean type 결과를 반환? why using this?
public class FileUploadUtil {
	
	// private 멤버변수 선언
	private String imgfilePaths;
	private int imgfileSize;
	private String encodeType;
	private MultipartRequest mr;
	
	// 생성자 : VO 클래스처럼 이미지파일 경로, 사이즈, 인코딩 타입을 저장
	public FileUploadUtil() {
		this.imgfilePaths = CommonUtils.IMG_UPLOAD_PATH;
		this.imgfileSize = CommonUtils.IMG_FILE_SIZE;
		this.encodeType = CommonUtils.EN_CODE;
	}
	
	// ---------함수-----------
	
	// [이미지 파일 업로드 함수1] (함수 오버로딩)
	// ---------------------------------
	// 매개변수 : HttpServletRequest req
	// 아래 오버로딩한 함수2의 결과를 boolean 타입으로 리턴한다.
	// 여기서 결과는 아마도 
	// "해당 경로에서 파일 업로드에 성공 또는 실패"
	public boolean imgfileUpload(HttpServletRequest req) {
		System.out.println("FileUploadUtil.imgfileUpload(HttpServletRequest req) 진입 >>> :");
		boolean bool = imgfileUpload(req, imgfilePaths);
		return bool;
	}
	// [이미지 파일 업로드 함수2] (함수 오버로딩)
	// ---------------------------------
	// 매개변수 : HttpServletRequest req, String filePath
	public boolean imgfileUpload(HttpServletRequest req, String filePath) {
		System.out.println("FileUploadUtil.imgfileUpload(HttpServletRequest req, String filePath) 진입 >>> :");
		boolean bool = false;
		try {
			mr = new MultipartRequest(req, filePath, imgfileSize, encodeType, new FileRename());
			System.out.println("이미지파일 업로드 요청 : MultipartRequest mr >>> : " + mr);
			// 정상적으로 수행이 완료되면 true 리턴;
			bool = true;
		} catch(Exception e) {
			System.out.println("파일 업로드 실패  >>> :" + e.getMessage());
		}
		return bool;
	}
	
	// [이미지 파일 업로드 사이즈 함수 1] (함수 오버로딩)
	// ---------------------------------------
	// 매개변수 : HttpServletRequest req
	// 함수 2 실행 결과를 리턴한다.
	public boolean imgfileUploadSize(HttpServletRequest req) {
		System.out.println("FileUploadUtil.imgfileUploadSize(HttpServletRequest req) 진입 >>> :");
		boolean bool = imgfileUploadSize(req, imgfilePaths);
		return bool;
	}
	
	// [이미지 파일 업로드 사이즈 함수 2] (함수 오버로딩)
	// ---------------------------------------
	// 매개변수 : HttpServletRequest req, String filePath
	// ????? "sbfile" 이 뭐지
	// Thumnail class 등장
	public boolean imgfileUploadSize(HttpServletRequest req, String filePath) {
		boolean bool = false;
		try {
			mr = new MultipartRequest(req, filePath, imgfileSize, encodeType, new FileRename());
			System.out.println("이미지 파일 업로드 요청 : MultipartRequest mr >>> : " + mr);
			System.out.println("mr.getOriginalFileName(\"sbfile\") >>> : " + mr.getOriginalFileName("sbfile"));
			System.out.println("mr.getFilesystemName(\"sbfile\") >>> : " + mr.getFilesystemName("sbfile"));
			
			ThumnailImg.thumnailFun(filePath, mr.getFilesystemName("sbfile"));
			bool=true;
			
		} catch(Exception e) {
			System.out.println("파일 업로드 사이즈에 문제가 발생했어요 >>> : " + e.getMessage());
		}
		return bool;
	}
	
	// getParameter() 함수
	public String getParameter(String s) {
		System.out.println("FileUploadUtil.getParameter() 실행 >>> :");
		return mr.getParameter(s);
	}
	
	// getFileName() 함수
	public String getFileName(String f) {
		System.out.println("FileUploadUtil.getFileName() 실행 >>> :");
		return mr.getFilesystemName(f);
	}
	
	// @SuppressWarnings 어노테이션---
	// Enumeration<String> : 문자열로 이루어진 "파일 이름"을 담은 집합
	// ArrayList<String>에다가 옮겨담기 
	public ArrayList<String> getFileNames() {
		@SuppressWarnings("unchecked")
		Enumeration<String> en = mr.getFileNames();
		ArrayList<String> a = new ArrayList<String>();
		
		while (en.hasMoreElements()) {
			String f = en.nextElement().toString();
			a.add(mr.getFilesystemName(f));
		}
		return a;
	}
}
