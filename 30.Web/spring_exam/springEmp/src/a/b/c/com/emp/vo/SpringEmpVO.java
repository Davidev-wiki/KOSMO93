package a.b.c.com.emp.vo;

public class SpringEmpVO {

	private String empno;
	private String ename;
	private String hiredate;
	
	public SpringEmpVO() {
		
	}
	
	public SpringEmpVO(String empno, String ename, String hiredate) {		
		this.empno = empno;
		this.ename = ename;
		this.hiredate = hiredate;
	}
	
	public String getEmpno() {
		return empno;
	}
	public void setEmpno(String empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getHiredate() {
		return hiredate;
	}
	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
}
