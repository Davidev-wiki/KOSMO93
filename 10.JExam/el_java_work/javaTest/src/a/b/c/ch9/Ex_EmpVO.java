package a.b.c.ch9;

public class Ex_EmpVO {
	// �������
	private String empno; // private : ����������
	private String ename;
	private String job;
	private String mgr;
	private String hiredate;
	private String sal;
	private String comm;
	private String deptno;

	// ������
	public Ex_EmpVO() {

	}

	// ȣ��� ������ ���� �Ҵ��ϴ� ������
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
