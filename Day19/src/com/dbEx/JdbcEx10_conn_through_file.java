package com.dbEx;

import java.sql.*;
import java.io.*;
import java.util.*;

public class JdbcEx10_conn_through_file {

	public static void main(String[] args)throws SQLException, IOException {

		Properties pro = new  Properties();
		pro.load(new FileInputStream("src/department.properties"));
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = ConnectionUtil.getConnection();
			pstmt = con.prepareStatement(pro.getProperty("department_insert"));
			
			//바인딩 변수 설정값 대입
			pstmt.setInt(1, 100);
			pstmt.setString(2, "산업공학과");
			pstmt.setInt(3, 200);
			pstmt.setString(4, "5호관");
			
			//쿼리문 전송
			int result = pstmt.executeUpdate();
			System.out.println(result + "개의 행이 추가 되었습니다.");
			
			
			
		} catch (SQLException se) {
			se.printStackTrace();
		}finally {
			try {
				if (con != null)
					// 6단계
					con.close();
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
		}
	}

}
