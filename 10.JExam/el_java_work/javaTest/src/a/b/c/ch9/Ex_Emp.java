package a.b.c.ch9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Ex_Emp {

	// 상수화
	private static final String ORCL_DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String ORCL_URL = "jdbc:oracle:thin:@localhost:1521:orclKOSMO00";
	private static final String ORCL_ID = "scott";;
	private static final String ORCL_PW = "tiger";

	// 쿼리문 상수화
	private static final String emp_query = "SELECT * FROM EMP";

	// 생성자 : 인스턴스시, DB에 바로 연결될 수 있도록 코딩, 연결시 에러날 수 있으니 예외처리.
	public Ex_Emp() {
		try {
			Class.forName(Ex_Emp.ORCL_DRIVER);

		} catch (Exception e) {
			System.out.println("DB연동시 에러가 발생했습니당 : " + e.getMessage());
		}
	}

	// 함수

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

					aList.add(evo); // 1줄의 row가 evo 객체상태로 배열에 추가된다.
				}
			}
		} catch (Exception e) {
			System.out.println("데이터를 가져오는 동안 문제가 발생해써용 : " + e.getMessage());
		}

		return aList;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ex_Emp exe = new Ex_Emp();
		ArrayList aList = exe.empSelect();
		System.out.println("aList의 사이즈는? : " + aList.size());

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