package com.dbEx;

//수정 : Update
import java.sql.*;

public class JdbcEx02_Update {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		try {
			// 2단계 jdbc 드라이버 메모리에 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 3단계
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
			// 또는
			/*
			 * String url = "jdbc:oracle:thin:@localhost:1521:orcl"; String id = "scott";
			 * String pw ="tiger"; conn = DriverManager.getConnection(url, id, pw);
			 */

			// url, → jdbc:oracle:thin:@localhost:1521:sid(orcl)
			// id, → scott
			// pw → tiger

			// DB연결 확인!
			System.out.println("DataBase 연결 성공 !!!!! ");

			// 4단계 Query문 작성
			// Statement 객체를 생성(얻기)
			stmt = conn.createStatement();

			// Query문 작성
			String sql = "update department set dname='컴퓨터공학과' where deptno = 203"; // 학과번호, 학과, 단과대번호, 위치

			// 5단계 Query문을 실행해서 결과를 저장
			// select를 제외한 모든 것들은 executeUpdate
			int result = stmt.executeUpdate(sql); // insert, update, delete
			System.out.println(result + " 개의 행이 수정되었습니다.");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException se) {
			se.printStackTrace();
		} finally {
			try {
				if (conn != null)
					// 6단계
					conn.close();
			} catch (SQLException ss) {
				ss.printStackTrace();
			}
			try {
				if (stmt != null)
					// 6단계
					stmt.close();
			} catch (SQLException ss) {
				ss.printStackTrace();
			}
		}
	}
}
