package a.b.c.com.common;

public abstract class CommonUtils {
	
	// [이미지 & 인코딩 세팅 값]
	// "이미지" 업로드시 웹서버에 이미지 업로드할 경로 세팅
	// "이미지" 사이즈 제한 : 2MB
	// 인코딩 타입
	public static final String IMG_UPLOAD_PATH = "C:\\00.KOSMO93\\30.Web\\el_spring_kck_work\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\wtpwebapps\\springKck\\imgupload";
	public static final int IMG_FILE_SIZE = 2*1024*1024; 
	public static final String EN_CODE = "UTF-8";

	// [파일 세팅 값]
	// "파일" 업로드시 웹서버에 이미지 업로드할 경로 세팅
	// "파일" 사이즈 제한 : 10MB
	public static final String File_UPLOAD_PATH = "";
	public static final int FILE_FILE_SIZE = 10*1024*1024;
	
	
	// [페이지 사이즈, 그룹 사이즈, CUR 페이지, TOTAL COUNT 세팅]
	// 무얼 의미하는지는 아직 잘 모름;
	public static final String B_PAGE_SIZE = "3";
	public static final String B_GROUP_SIZE = "2";
	public static final String B_CUR_PAGE = "1";
	public static final String B_TOTAL_COUNT = "";
	
}
