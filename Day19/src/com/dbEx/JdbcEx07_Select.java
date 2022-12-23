package com.dbEx;

import java.sql.*;

public class JdbcEx07_Select {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		// Query문 작성
					String sql = "select a.name, a.profno, a.position, b.dname "
							+ "from professor a, department b "
							+ "where a.deptno = b.deptno and a.deptno = ?";
	
		try {
			conn = ConnectionUtil.getConnection();
			pstmt = conn.prepareStatement(sql);

			 pstmt.setInt(1, 203);

			rs = pstmt.executeQuery();
		

			while (rs.next()) { // 다음 행(==레코트)이 있으면 true / 없으면 false
				// 커서가 위치한 행(LOW)의 각각의 열(Column)에서 값을 추출함.
				// getXXX(컬럼의 위치), getXXX(컬럼이름)을 사용하여 열값을 추출함.

				String s1 = rs.getString("name"); 
				int i = rs.getInt("profno");
				String s2 = rs. getString("dname");
				String s3 = rs. getString("position"); 

				System.out.println(s1 + "\t" + i + "\t" + s2 + "\t" + s3);
			}

		}  catch (SQLException se) {
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
				if (pstmt != null)
					// 6단계
					pstmt.close();
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
