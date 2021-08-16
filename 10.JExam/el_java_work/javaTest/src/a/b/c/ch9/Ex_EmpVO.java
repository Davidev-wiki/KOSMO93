package a.b.c.ch9;

public class Ex_EmpVO {
	// 멤버변수
	private String empno; // private : 접근제한자
	private String ename;
	private String job;
	private String mgr;
	private String hiredate;
	private String sal;
	private String comm;
	private String deptno;

	// 생성자
	public Ex_EmpVO() {

	}

	// 호출시 변수에 값을 할당하는 생성자
	public Ex_EmpVO(String empno, String ename, String job, String mgr, String sal, String comm, String deptno) {

		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.mgr = mgr;
		this.sal = sal;
		this.comm = comm;
		this.deptno = deptno;
	}

	public String getEmpno() {
		return empno;
	}

	public String getEname() {
		return ename;
	}

	public String getJob() {
		return job;
	}

	public String getMgr() {
		return mgr;
	}

	public String getHiredate() {
		return hiredate;
	}

	public String getSal() {
		return sal;
	}

	public String getComm() {
		return comm;
	}

	public String getDeptno() {
		return deptno;
	}

	public void setEmpno(String empno) {
		this.empno = empno;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public void setMgr(String mgr) {
		this.mgr = mgr;
	}

	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}

	public void setSal(String sal) {
		this.sal = sal;
	}

	public void setComm(String comm) {
		this.comm = comm;
	}

	public void setDeptno(String deptno) {
		this.deptno = deptno;
	}


}
