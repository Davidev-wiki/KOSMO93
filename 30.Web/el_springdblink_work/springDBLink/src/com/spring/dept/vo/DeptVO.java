package com.spring.dept.vo;

public class DeptVO {
	
	private String deptid;
	private String deptname;
	private String depttel;
	
	// 예제에 생성자는 없다.
	// 혹시 몰라 만든다.
	public DeptVO(){
		
	}
	
	public DeptVO(String deptid, String deptname, String depttel){
		this.deptid = deptid;
		this.deptname = deptname;
		this.depttel = depttel;
				
	}
	
	//getter() & setter()
	public String getDeptid() {
		return deptid;
	}
	public void setDeptid(String deptid) {
		this.deptid = deptid;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public String getDepttel() {
		return depttel;
	}
	public void setDepttel(String depttel) {
		this.depttel = depttel;
	}
	
	
}
