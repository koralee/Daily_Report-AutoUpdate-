package com.dbEx;

import java.sql.*;

public class JdbcEx04_Select {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		/*
		 * select문으로 실행한 결과를 저장한 집합체 데이터를 추출할 수 있는 메소드릴 가지고 있는 객체가 ResultSet
		 * 
		 */
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
			// System.out.println("DataBase 연결 성공 !!!!! ");

			// 4단계 Query문 작성
			// Statement 객체를 생성(얻기)
			stmt = conn.createStatement();

			// Query문 작성
			String sql = "select deptno, dname, college,loc from department"; // 학과번호, 학과, 단과대번호, 위치

			// 5단계 Query문을 실행해서 결과를 저장
			// select 일때는 executeQuery
			rs = stmt.executeQuery(sql);

			/*
			 * rs 객체로 부터 Data를 추출한다.
			 * 
			 * rs 객체에 제공하는 메소드를 이용함. rs의 next()메소드는 커서를 다음 행으로 이동시킴 이동된 위치에 행이 존재하면 true,
			 * 없으면 false를 반환함
			 * 
			 * rs.next() 값이 참인동안 rs으로 부터 Data를 추출함.
			 * 
			 */
			while (rs.next()) { // 다음 행(==레코트)이 있으면 true / 없으면 false
				// 커서가 위치한 행(LOW)의 각각의 열(Column)에서 값을 추출함.
				// getXXX(컬럼의 위치), getXXX(컬럼이름)을 사용하여 열값을 추출함.

				int i = rs.getInt(1); // 만약 열의 이름으로 하겠다면 int i = rs.getInt("deptno");
				String s1 = rs.getString(2); // or re.getString("dname");
				int j = rs.getInt("college");
				String s2 = rs.getString("loc");

				System.out.println(i + "\t" + s1 + "\t" + j + "\t" + s2);
			}

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
			try {
				if (rs != null)
					// 6단계
					rs.close();
			} catch (SQLException ss) {
				ss.printStackTrace();
			}
		}

	}

}
