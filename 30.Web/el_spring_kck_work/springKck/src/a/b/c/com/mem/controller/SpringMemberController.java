package a.b.c.com.mem.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import a.b.c.com.common.ChabunUtil;
import a.b.c.com.common.CommonUtils;
import a.b.c.com.common.FileUploadUtil;
import a.b.c.com.common.service.ChabunService;
import a.b.c.com.mem.service.SpringMemberService;
import a.b.c.com.mem.vo.SpringMemberVO;

@Controller
public class SpringMemberController{
	
	// logger
	Logger logger = Logger.getLogger(SpringMemberController.class); 
	
	// instance
	private SpringMemberService springMemberService;
	private ChabunService chabunService;
	
	// Autowired // nullcheck
	@Autowired(required=false)
	public SpringMemberController(SpringMemberService springMemberService, ChabunService chabunService) {
		this.springMemberService = springMemberService;
		this.chabunService = chabunService;
	}
	
	// 회원가입 입력 폼  "memForm"
	@GetMapping("memForm")
	public String memForm(){
		logger.info("SpringMemberController.memForm 진입 >>> : springMemForm으로 이동");
		return"mem/springMemForm";
	}
	
	
	// 회원가입 : "memInsert"
	@PostMapping("memInsert")
	public String memInsert(HttpServletRequest req) {
			
		logger.info("SpringMemberController.memInsert() 진입 >>> : ");
			
		// 채번 구하기 : getMemChabun을 한번 돌려서 가져온 번호를 [유틸리티]를 통해 D타입으로 변환하기 
		String mnum = ChabunUtil.getMemChabun("D", chabunService.getMemChabun().getMnum());
		logger.info("세팅된 회원넘버 mnum >>> : " + mnum);
	
		// 파일 이미지 업로드
		FileUploadUtil fu = new FileUploadUtil(  CommonUtils.MEMBER_IMG_UPLOAD_PATH
												,CommonUtils.MEMBER_IMG_FILE_SIZE
												,CommonUtils.MEMBER_EN_CODE);
		
		// 이미지 파일 원본 사이즈
		// 이미지 파일 사이즈 크기 조절하기 : 요청에서 가져온 이미지를 함수로 크기조절
		boolean bool = fu.imgfileUploadSize(req);
		logger.info("사이즈 조절 성공여부(?) bool >>> : " + bool);
		
		
		// 채번, 이미지 업로드 성공하면 VO 세팅하기!
		
		SpringMemberVO mvo = null;
		
		mvo = new SpringMemberVO();
		
		// 변수에 값 세팅
		// 회원번호, 이름, 아이디, 패스워드, 성별
		mvo.setMnum(mnum);
		mvo.setMname(fu.getParameter("mname"));
		mvo.setMid(fu.getParameter("mid"));
		mvo.setMpw(fu.getParameter("mpw"));
		mvo.setMgender(fu.getParameter("mgender"));
		
		// 생년월일
		String mbirth = fu.getParameter("mbirth");
		String mbirth1 = fu.getParameter("mbirth1");
		String mbirth2 = fu.getParameter("mbirth2");
		mbirth = mbirth + mbirth1 + mbirth2;
		mvo.setMbirth(mbirth);
		
		// 휴대폰번호
		String mhp = fu.getParameter("mhp");
		String mhp1 = fu.getParameter("mhp1");
		String mhp2 = fu.getParameter("mhp1");
		mhp = mhp + mhp1 + mhp2;
		mvo.setMhp(mhp);
		
		// 전화번호
		String mtel = fu.getParameter("mtel");
		String mtel1 = fu.getParameter("mtel1");
		String mtel2 = fu.getParameter("mtel1");
		mtel = mtel + mtel1 + mtel2;
		mvo.setMtel(mtel);	
		
		// 이메일
		String memail = fu.getParameter("memail");
		String memail1 = fu.getParameter("memail1");
		memail = memail.concat("@").concat(memail1);
		mvo.setMemail(memail);
		
		// 우편번호
		mvo.setMzonecode(fu.getParameter("mzonecode"));
		
		// 도로명주소
		String mroadaddress = fu.getParameter("mroadaddress");
		String mroadaddressdetail = fu.getParameter("mroadaddressdetail");
		mroadaddress = mroadaddress.concat("@").concat("mraodaddressdetail");
		mvo.setMroadaddress(mroadaddress);
		
		// 지번주소
		mvo.setMjibunaddress(fu.getParameter("mjibunaddress"));
		
		// 취미
		String[] hobby = fu.getParameterValues("mhobby");
		String mhobby = "";
		for (int i=0; i <hobby.length; i++) {
			mhobby += hobby[i] + ",";
		}
		mvo.setMhobby(mhobby);
		
		// 내 소개
		mvo.setMinfo(fu.getParameter("minfo"));
		
		// 사진 : 파일이름을 가져와 string 타입 배열에 담기 : 파일 이름만 저장?
		ArrayList<String> aFileName = fu.getFileNames();
		String mphoto = aFileName.get(0);
		mvo.setMphoto(mphoto);
		
		// 관리자
		mvo.setMadmin("00");
		
		
		// insert '등록 건 수'를 int로 받기.
		int nCnt = springMemberService.memberInsert(mvo);
		
		// 정상 등록시
		if(nCnt > 0) {
			System.out.println("가입 성공 >>> :");
			return "mem/springMemInsert" ;}
		else {
			System.out.println("등록 실패 >>> :");
			return "memForm";}
		
	}
	
	// 회원 목록 조회
	@GetMapping("memSelectAll")
	public String memSelectAll(SpringMemberVO mvo, Model model) {
		logger.info("SpringMemberController.memSelectAll() 진입 >>> :");
		
		List<SpringMemberVO> listAll = springMemberService.memberSelectAll(mvo);
		logger.info("회원목록 조회 결과 listAll >>> : " + listAll);
		
		if(listAll.size() > 0) {
			model.addAttribute("listAll", listAll);
			return "mem/springmemSelectAll";
			}
		else {return "mem/springMemForm";} // 회원가입 폼으로
	}
	

	
	
	
	
	// 회원 수정/삭제 조회
	@GetMapping("memSelect")
	public String memSelect(SpringMemberVO mvo, Model model) {
		logger.info("SpringMemberController.memSelect() 진입 >>> :");

		List<SpringMemberVO> listS = springMemberService.memberSelect(mvo);
		
		if(listS.size() > 0) {
			System.out.println("조회한 데이터 결과 listS >>>" + listS);
			model.addAttribute("listS", listS);
			return "mem/springMemSelect";
		}
		else {
			System.out.println("회원이 아니네요 >>> :");
			return "mem/springMemForm";} // 회원가입 폼으로
	}
	// 회원 정보 수정하기 (수정 항목 : 이메일/우편번호/도로명주소/지번주소)
	@PostMapping("memUpdate")
	public String memUpdate(HttpServletRequest req,SpringMemberVO mvo, Model model) {
		logger.info("SpringMemberController.memUpdate() 진입 >>> :");
		
		// 이메일 set
		String memail = req.getParameter("memail");
		String memail1= req.getParameter("memail1");
		memail = memail.concat("@").concat(memail1);
		mvo.setMemail(memail);
		
		// 우편번호
		mvo.setMzonecode(req.getParameter("mzonecode"));
		
		// 도로명주소
		String mroadaddress = req.getParameter("mroadaddress");
		String mroadaddressdetail = req.getParameter("mroadaddressdetail");
		mroadaddress = mroadaddress.concat("@").concat(mroadaddressdetail);
		mvo.setMroadaddress(mroadaddress);
		
		// 지번주소
		mvo.setMjibunaddress(req.getParameter("mjibunaddress"));
		
		logger.info("수정할 객체 번호 mvo.getMnum() >>> :" + mvo.getMnum());
		
		int nCnt = springMemberService.memberUpdate(mvo);
		logger.info("정보 수정 완료 건수 nCnt >>> :" + nCnt);
		if(nCnt > 0) {
			System.out.println("수정 완료!");
			return "mem/springMemUpdate";
		} else {
			System.out.println("수정 실패!");
			return "mem/springMemSelectAll"; // 회원 전체 조회 페이지로
		}
	}
	
	// 회원 정보 삭제하기
	@PostMapping("memDelete")
	public String memDelete(HttpServletRequest req,SpringMemberVO mvo, Model model) {
		logger.info("SpringMemberController.memDelete() 진입 >>> :");

		logger.info("삭제 대상 mvo.getMnum() >>> :" + mvo.getMnum());
		int nCnt = springMemberService.memberDelete(mvo);
		logger.info("삭제 건 수 nCnt >>> : " + nCnt);
		if(nCnt > 0) {
			System.out.println("삭제 성공!");
			return "mem/springMemDelete";
		} else {
			System.out.println("삭제 실패!");
			return "mem/springMemSelectAll"; // 회원 전체 조회 페이지로
		}
	}
	
	// 아이디 중복 체크하기 : why method type : Post?
	@PostMapping("memIdCheck")
	public Object memIdCheck (SpringMemberVO mvo) {
		logger.info("SpringMemberController.memIdCheck() 진입 >>> :");
		logger.info("체크할 아이디 mvo.getMid() >>> : " + mvo.getMid());
		
		// memerIdCheck의 로직은 
		// 파라미터로 보낸 아이디와 일치 하는 것이 있으면 "1"
		// 일치하는 것이 없으면 "0"을 리턴.
		List<SpringMemberVO> list = springMemberService.memberIdCheck(mvo);
		
		String msg = "";
		
		if(list.size() == 0) {
			msg = "ID_YES";
			return msg;
		} else {
			msg = "ID_NO";
			return msg;
		}
		
	}
}