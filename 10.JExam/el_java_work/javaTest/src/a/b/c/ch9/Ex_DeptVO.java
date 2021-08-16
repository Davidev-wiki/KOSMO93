package a.b.c.ch9;

public class Ex_DeptVO {

	private String deptno;
	private String dname;
	private String loc;
	
	public Ex_DeptVO() {
		
	}
	
	public Ex_DeptVO(String deptno, String dname, String loc) {
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
		
	}
	
	//getter ()
	public String getDeptno() {
		return deptno;
	}

	public String getDname() {
		return dname;
	}

	public String getLoc() {
		return loc;
	}

	//setter()
	public void setDeptno(String deptno) {
		this.deptno = deptno;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	
	
	
}
