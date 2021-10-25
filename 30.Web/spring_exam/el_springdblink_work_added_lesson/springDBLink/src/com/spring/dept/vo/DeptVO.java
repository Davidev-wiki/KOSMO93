/*
CREATE TABLE DEPARTMENT(
    DEPT_ID VARCHAR2(10) NOT NULL
   ,DEPT_NAME VARCHAR2(25) NOT NULL
   ,DEPT_TEL VARCHAR2(12)
);


CREATE TABLE LESSON(
    NO NUMBER PRIMARY KEY
   ,L_NUM VARCHAR2(20) NOT NULL
   ,L_NAME VARCHAR2(100) NOT NULL
);

CREATE SEQUENCE LESSON_SEQ
START WITH 1
MAXVALUE 999999
MINVALUE 1
NOCYCLE
CACHE 20
NOORDER;
 */
package com.spring.dept.vo;

public class DeptVO {

	private String deptid;
	private String deptname;
	private String depttel;
	
	public DeptVO() {
		
	}
	
	public DeptVO(String deptid, String deptname, String depttel) {
		
		this.deptid = deptid;
		this.deptname = deptname;
		this.depttel = depttel;
	}


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
