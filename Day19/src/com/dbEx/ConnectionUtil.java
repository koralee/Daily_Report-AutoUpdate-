package com.dbEx;

/*
 *	 공통되는 부분이므로 사용될 때마다 번거로움을 없애기 위해
 *  공통적으로 사용되는 부분을 ConnectionUtil 객체로 만들어버림!
 */
import java.sql.*;

public class ConnectionUtil {

	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() throws SQLException {
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "scott";
		String pw = "tiger";

		return DriverManager.getConnection(url, id, pw);
	}
}
