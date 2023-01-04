package com.project;

import java.sql.*;

public class DBUtil {

	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() throws SQLException {
		final String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		final String id = "scott";
		final String pw = "tiger";

		return DriverManager.getConnection(url, id, pw);
	}

	public static void main(String[] args) {
		Connection con = null;
		try {
			con = DBUtil.getConnection();
			// System.out.println("DB연결 성공!");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
	}
}
