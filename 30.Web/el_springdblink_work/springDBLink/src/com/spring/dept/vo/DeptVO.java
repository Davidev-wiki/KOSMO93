package com.spring.dept.vo;

public class DeptVO {
	
	// 데이터 변수 선언
	private String deptid;
	private String deptname;
	private String depttel;

	
	// 생성자
	public DeptVO() {
	
	}

	
	// 생성자 오버로딩
	public DeptVO(String deptid, String deptname, String depttel) {

		this.deptid = deptid;
		this.deptname = deptname;
		this.depttel = depttel;
	}

	
	// getter() & setter()
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
