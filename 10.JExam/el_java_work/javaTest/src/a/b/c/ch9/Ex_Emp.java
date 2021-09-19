package a.b.c.ch9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Ex_Emp {

	// ���ȭ
	private static final String ORCL_DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String ORCL_URL = "jdbc:oracle:thin:@localhost:1521:orclKOSMO00";
	private static final String ORCL_ID = "scott";;
	private static final String ORCL_PW = "tiger";

	// ������ ���ȭ
	private static final String emp_query = "SELECT * FROM EMP";

	// ������ : �ν��Ͻ���, DB�� �ٷ� ����� �� �ֵ��� �ڵ�, ����� ������ �� ������ ����ó��.
	public Ex_Emp() {
		try {
			Class.forName(Ex_Emp.ORCL_DRIVER);

		} catch (Exception e) {
			System.out.println("DB������ ������ �߻��߽��ϴ� : " + e.getMessage());
		}
	}

	// �Լ�

	public ArrayList empSelect() {

		Connection conn = null;
		Statement stmt = null;
		ResultSet rsRs = null;
		ArrayList aList = null;

		try {
			conn = DriverManager.getConnection(ORCL_URL, ORCL_ID, ORCL_PW);
			stmt = conn.createStatement();
			rsRs = stmt.executeQuery(emp_query);

			if (rsRs != null) {
				aList = new ArrayList();

				while (rsRs.next()) {

					Ex_EmpVO evo = new Ex_EmpVO();

					evo.setEmpno(rsRs.getString("EMPNO"));
					evo.setEname(rsRs.getString("ENAME"));
					evo.setJob(rsRs.getString("JOB"));
					evo.setMgr(rsRs.getString("MGR"));
					evo.setHiredate(rsRs.getString("HIREDATE"));
					evo.setSal(rsRs.getString("SAL"));
					evo.setComm(rsRs.getString("COMM"));
					evo.setDeptno(rsRs.getString("DEPTNO"));

					aList.add(evo); // 1���� row�� evo ��ü���·� �迭�� �߰��ȴ�.
				}
			}
		} catch (Exception e) {
			System.out.println("�����͸� �������� ���� ������ �߻��ؽ�� : " + e.getMessage());
		}

		return aList;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ex_Emp exe = new Ex_Emp();
		ArrayList aList = exe.empSelect();
		System.out.println("aList�� �������? : " + aList.size());

		if (aList.size() > 0) {
			for (int i = 0; i < aList.size(); i++) {
				Ex_EmpVO evo = (Ex_EmpVO) aList.get(i);
				System.out.print(evo.getEmpno() + " : ");
				System.out.print(evo.getEname() + " : ");
				System.out.print(evo.getJob() + " : ");
				System.out.print(evo.getMgr() + " : ");
				System.out.print(evo.getHiredate() + " : ");
				System.out.print(evo.getSal() + " : ");
				System.out.print(evo.getComm() + " : ");
				System.out.println(evo.getDeptno());
			}
		}
	}
}