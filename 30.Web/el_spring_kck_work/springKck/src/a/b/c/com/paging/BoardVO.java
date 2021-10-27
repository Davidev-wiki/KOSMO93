package a.b.c.com.paging;

public class BoardVO {
	
	private String mnum;
	private String mtitle;
	private String mname;
	private String memail;
	private String marea;
	private String mpass;
	private String mref; //원본 게시물 번호
	private String mstep; //같은 원본 게시물에 대한 답변글 내에서의 순서 
	private String mdepth; // 답변의 단계 (예, 원본=0, 원본의 답변=1, 답변의 답변=2, ...)
	private String mwriteday;
	private String mhits;
	
	private String pageSize;  // 페이지 사이즈
	private String groupSize; // 그룹 사이즈
	private String curPage;	  // 현재 페이지
	private String totalCoun; // 총 글 개수
	
	// 기본 생성자
	public BoardVO(){
		
	}

	// 생성자
	public BoardVO(String mnum, String mtitle, String mname, String memail, String marea, String mpass, String mref,
			String mstep, String mdepth, String mwriteday, String mhits) {
		this.mnum = mnum;
		this.mtitle = mtitle;
		this.mname = mname;
		this.memail = memail;
		this.marea = marea;
		this.mpass = mpass;
		this.mref = mref;
		this.mstep = mstep;
		this.mdepth = mdepth;
		this.mwriteday = mwriteday;
		this.mhits = mhits;
	}
	
	
	// getter() & setter()
	public String getMnum() {
		return mnum;
	}

	public void setMnum(String mnum) {
		this.mnum = mnum;
	}

	public String getMtitle() {
		return mtitle;
	}

	public void setMtitle(String mtitle) {
		this.mtitle = mtitle;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getMemail() {
		return memail;
	}

	public void setMemail(String memail) {
		this.memail = memail;
	}

	public String getMarea() {
		return marea;
	}

	public void setMarea(String marea) {
		this.marea = marea;
	}

	public String getMpass() {
		return mpass;
	}

	public void setMpass(String mpass) {
		this.mpass = mpass;
	}

	public String getMref() {
		return mref;
	}

	public void setMref(String mref) {
		this.mref = mref;
	}

	public String getMstep() {
		return mstep;
	}

	public void setMstep(String mstep) {
		this.mstep = mstep;
	}

	public String getMdepth() {
		return mdepth;
	}

	public void setMdepth(String mdepth) {
		this.mdepth = mdepth;
	}

	public String getMwriteday() {
		return mwriteday;
	}

	public void setMwriteday(String mwriteday) {
		this.mwriteday = mwriteday;
	}

	public String getMhits() {
		return mhits;
	}

	public void setMhits(String mhits) {
		this.mhits = mhits;
	}

	public String getPageSize() {
		return pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getGroupSize() {
		return groupSize;
	}

	public void setGroupSize(String groupSize) {
		this.groupSize = groupSize;
	}

	public String getCurPage() {
		return curPage;
	}

	public void setCurPage(String curPage) {
		this.curPage = curPage;
	}

	public String getTotalCoun() {
		return totalCoun;
	}

	public void setTotalCoun(String totalCoun) {
		this.totalCoun = totalCoun;
	}
	
}
