package com.dbEx;
/*
 * 적용순서 1~6단계 (매우매우매우 중요하다!)
 * 
 * 		1단계
 *				import java.sql.*;
 * 
 * 		2단계
 *				특정 Driver를 검색
 * 				oracle : thin Driver 사용
 * 				      oracle.jdbc.driver.OracleDriver
 * 
 * 				Class.forName("oracle.jdbc.driver.OracleDriver");
 * 
 * 		3단계
 * 				DB연결
 * 		Connection conn = DriverManager.getConnection(jdbc:oracle:thin:@localhost:1521:sid(orcl), scott, tiger); 
 * 		
 * 		url,	→ jdbc:oracle:thin:@localhost:1521:sid(orcl)  
 * 		id,		→ scott
 * 		pw	→ tiger
 * 		
 * 		4단계 : Query문 작성
 * 		
 * 		정적
 * 		Statement Class(정적) : sql쿼리문을 데이터베이스로 전송하고 실행 결과를 반환한다
 * 			Statement stmt = conn.createStatement();
 * 
 * 		동적
 * 		preparedStatement Class(동적)
 * 			preparedStatement pstmt = conn.prepareStatement(Query);
 * 
 * 		5단계 : 결과를 저장
 * 		(정적)
 * 		ResultSet rs = stmt.executeQuery(query); // select
 * 		ResultSet rs = stmt.executeUpdate(query); // insert, update, delete
 * 
 * 		(동적)
 * 		ResultSet rs = pstmt.executeQuery(query); // select
 * 		ResultSet rs = pstmt.executeUpdate(query); // insert, update, delete
 * 
 * 		6단계
 * 			사용후 반드시 close()한다.
 * 
 * 
 */

import java.sql.*; // 1단계 

public class JdbcEx01_connectionAndinsert {
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
			String sql = "insert into department values(203, '제어계측공학과', 200, '7호관')"; // 학과번호, 학과, 단과대번호, 위치

			// 5단계 Query문을 실행해서 결과를 저장
			// select를 제외한 모든 것들은 executeUpdate
			int result = stmt.executeUpdate(sql); // insert, update, delete
			System.out.println(result + " 개의 행이 추가되었습니다.");

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
